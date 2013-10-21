package main;

import generatedClasses.*;

import javax.swing.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class Main extends JFrame {

    public static JButton btnIntroRequest;
    private static JButton btnKeepalive;
    private static JButton btnCardRequest;
    private static JButton btnPaymentRequest;
    private static JButton btnCancelRequest;
    private static JTextArea txtLog;

    public Main() {
        JFrame frame = new JFrame("Transaction host simulator client");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        btnIntroRequest = new JButton("Send IntroRequest");
        btnIntroRequest.setSize(50, 50);

        btnKeepalive = new JButton("Send Keepalive");
        btnKeepalive.setSize(50, 50);

        btnCardRequest = new JButton("Send CardRequest");
        btnCardRequest.setSize(50, 50);

        btnPaymentRequest = new JButton("Send PaymentRequest");
        btnPaymentRequest.setSize(50, 50);

        btnCancelRequest = new JButton("Send CancelRequest");
        btnCancelRequest.setSize(50, 50);

        txtLog = new JTextArea();
        txtLog.setSize(300, 300);
        txtLog.setEditable(false);
        txtLog.setText("LOG:");


        JPanel panel = new JPanel();
        panel.add(btnIntroRequest);
        panel.add(btnKeepalive);
        panel.add(btnCardRequest);
        panel.add(btnPaymentRequest);
        panel.add(btnCancelRequest);
        panel.add(txtLog);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);

        try {
            Socket socket = new Socket("localhost", 5557);
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            out.flush();
        } catch (IOException e) {
            //Throw some error
        }
    }

    public static Socket setSocket() {
        try {
            socket = new Socket("localhost", 5557);
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return socket;
    }

    static Socket socket = setSocket();
    static IntroductionRequest introReq = createIntroductionRequest();
    static CardRequest cardRequest = new CardRequest();
    static PaymentRequest paymentReq = createPaymentRequest();
    static KeepAlive keepalive = new KeepAlive();
    static CancelRequest cancelReq = new CancelRequest();

    public static void main(String[] args) {

        Main main = new Main();

        btnIntroRequest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    sendIntroductionRequest(socket);
                } catch (JAXBException e1) {
                    e1.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                } catch (IOException e1) {
                    e1.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
        });

        btnKeepalive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    sendKeepAlive(socket);
                } catch (JAXBException e1) {
                    e1.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                } catch (IOException e1) {
                    e1.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
        });

        btnCardRequest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    sendCardRequest(socket);
                } catch (JAXBException e1) {
                    e1.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                } catch (IOException e1) {
                    e1.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
        });

        btnPaymentRequest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    sendPaymentRequest(socket);
                } catch (JAXBException e1) {
                    e1.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                } catch (IOException e1) {
                    e1.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
        });

        btnCancelRequest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    sendCancelRequest(socket);
                } catch (JAXBException e1) {
                    e1.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                } catch (IOException e1) {
                    e1.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
        });
    }

    public static void sendIntroductionRequest(Socket socket) throws JAXBException, IOException {
        //Marshals the introductionRequest and sends it to the txHost
        marshal(introReq, socket.getOutputStream(), true);
        listenForResponse(socket.getInputStream(), "IntroductionResponse");
    }

    public static void sendKeepAlive(Socket socket) throws JAXBException, IOException {
        marshal(keepalive, socket.getOutputStream(), true);
        listenForResponse(socket.getInputStream(), "KeepAliveAcknowledge");
    }

    public static void sendCardRequest(Socket socket) throws JAXBException, IOException {
        marshal(cardRequest, socket.getOutputStream(), true);
        for (int i = 0; i < 3; i++) {
            listenForResponse(socket.getInputStream(), "CardResponse");
        }
    }

    public static void sendPaymentRequest(Socket socket) throws JAXBException, IOException {
        marshal(paymentReq, socket.getOutputStream(), true);
        for (int i = 0; i < 2; i++) {
            listenForResponse(socket.getInputStream(), "PaymentResponse");
        }
    }

    public static void sendCancelRequest(Socket socket) throws JAXBException, IOException {
        marshal(cancelReq, socket.getOutputStream(), true);
        listenForResponse(socket.getInputStream(), "CancelResponse");
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
        StringWriter stringWriter = new StringWriter();
        //Testing: Show marshalled XML output
        jaxbMarshaller.marshal(param, System.out);
        //Write the output to a log
        jaxbMarshaller.marshal(param, stringWriter);
        txtLog.append(stringWriter.toString());
    }

    public static Object unmarshel(String message, String kind) throws JAXBException {
        JAXBContext context;
        boolean unmarshalable = true;
        Unmarshaller unmarshaller = null;
        ByteArrayInputStream in = null;

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
        if (kind.equals("CancelResponse")) {
            context = JAXBContext.newInstance(CancelResponse.class);
        } else {
            context = null;
            unmarshalable = false;
        }
        if (unmarshalable) {
            unmarshaller = context.createUnmarshaller();

            in = new ByteArrayInputStream(message.getBytes());
        }
        return unmarshaller.unmarshal(in);
    }

    //To keep the connection with the txHost going, a btnKeepalive object must be sent every n seconds. In this case I used a 10 second interval
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
