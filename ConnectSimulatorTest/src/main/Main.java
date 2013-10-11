package main;

import generatedClasses.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.math.BigDecimal;
import java.net.Socket;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created with IntelliJ IDEA.
 * User: kegr
 * Date: 26-9-13
 * Time: 11:49
 * To change this template use File | Settings | File Templates.
 */

//TODO Fout ondekt in IDD. Er MOET een Device zijn gekoppeld aan een PaymentRequest. Ook in V1 Protocol.

public class Main {

    public static void main(String[] args) {

        Socket socket;
        IntroductionRequest introReq = createIntroductionRequest();
        CardRequest cardRequest = new CardRequest();
        PaymentRequest paymentReq = createPaymentRequest();
        KeepAlive keepalive = new KeepAlive();
        CancelRequest cancelReq = new CancelRequest();

        try {
            socket = new Socket("localhost", 5557);
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            out.flush();

            //Marshals the introductionRequest and sends it to the txHost
            marshal(introReq, out, true);
            listenForResponse(in, "IntroductionResponse");

            //Initiate the keepAlive timer. New keepAlive object is sent every 10 seconds
            marshal(keepalive, out, true);
            listenForResponse(in, "KeepAliveAcknowledge");

            //Server is now running and will keep running untill the socket connection is closed. It is now time to send a
            //card request to the txHost. This will let the txHost know that I want to make a transaction
            marshal(cardRequest, out, true);
            //for (int i = 0; i < 3; i++) {
                //listenForResponse(in, "CardResponse");
            //}

            //Cancel the current transaction.
            marshal(cancelReq, out, true);

            //After the card is authenticated, send a paymentRequest. This
            marshal(paymentReq, out, true);
            listenForResponse(in, "PaymentResponse");
            listenForResponse(in, "PaymentResponse");

            keepAliveTimer(out);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        } finally {
            //closeSocket(socket);
        }
    }

    public static IntroductionRequest createIntroductionRequest() {
        IntroductionRequest introReq = new IntroductionRequest();
        introReq.setCashRegisterId("1337");
        introReq.setCashRegisterType("FIXED");
        introReq.setProtocolVersion("v1.0");
        return introReq;
    }

    public static PaymentRequest createPaymentRequest() {
        PaymentRequest paymentReq = new PaymentRequest();
        BigDecimal amount = new BigDecimal("3.37");
        Device device = createDevice();
        paymentReq.setDeviceTarget(device);
        paymentReq.setAmount(amount);
        return paymentReq;
    }

    public static Device createDevice() {
        Device device = new Device();
        DeviceType type = DeviceType.READER;
        device.setDeviceType(type);
        return device;
    }

    public static void listenForResponse(InputStream input, String kind) {
        StringBuilder response = new StringBuilder();
        int value;

        while (true) {
            try {
                value = input.read();
                if (value == -1) {
                } else if (value != 0) {
                    response.append((char) value);
                    continue;
                } else if (value == 0) {
                    //xml received
                    break;
                }
            } catch (IOException e) {
                System.out.println("End of stream reached");
            }
        }
        String received = response.toString();
        try {
            Object message = unmarshel(received, kind);
            marshal(message, null, false);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void closeSocket(Socket socket) {
        try {
            socket.getOutputStream().close();
            socket.getInputStream().close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //This method converts a java object to XML code and sends it to the socket.outputstream.
    //The object that is sent must be an existing java Class with @XML annotations.
    //Failing to do so causes exceptions.
    public static void marshal(Object param, OutputStream out, boolean sendToOutput) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(param.getClass());
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        if (sendToOutput) {
            try {
                jaxbMarshaller.marshal(param, out);
                out.write(0x00);
                out.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Testing: Show marshalled XML output
        jaxbMarshaller.marshal(param, System.out);
    }

    public static Object unmarshel(String message, String kind) throws JAXBException {
        JAXBContext context = null;
        if (kind.equals("IntroductionResponse")) {
            context = JAXBContext.newInstance(IntroductionResponse.class);
        }
        if (kind.equals("KeepAliveAcknowledge")) {
            context = JAXBContext.newInstance(KeepAliveAcknowledge.class);
        }
        if (kind.equals("CardResponse")) {
            context = JAXBContext.newInstance(CardResponse.class);
        }
        if (kind.equals("PaymentResponse")) {
            context = JAXBContext.newInstance(PaymentResponse.class);
        }

        Unmarshaller unmarshaller = context.createUnmarshaller();

        ByteArrayInputStream in = new ByteArrayInputStream(message.getBytes());
        return unmarshaller.unmarshal(in);
    }

    //To keep the connection with the txHost going, a keepAlive object must be sent every n seconds. In this case I used a 10 second interval
    public static void keepAliveTimer(final OutputStream out) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    sendKeepAlive(out);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, 0, 40000);//Amount of time the timer waits before running again. 40000 miliseconds / 40 seconds
    }

    public static void sendKeepAlive(OutputStream out) throws IOException {
        KeepAlive keepAlive = new KeepAlive();
        try {
            marshal(keepAlive, out, true);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}



