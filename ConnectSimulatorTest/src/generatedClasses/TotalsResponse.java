//
// This file was generatedClasses by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.04 at 01:41:22 PM CEST 
//


package generatedClasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{}TransactionHostResponseCode"/>
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="deviceOrigin" type="{}Device"/>
 *         &lt;element name="ticketResponse" type="{}TicketResponseData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code",
    "timeStamp",
    "deviceOrigin",
    "ticketResponse"
})
@XmlRootElement(name = "TotalsResponse")
public class TotalsResponse {

    @XmlElement(required = true)
    protected TransactionHostResponseCode code;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlElement(required = true)
    protected Device deviceOrigin;
    protected TicketResponseData ticketResponse;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionHostResponseCode }
     *     
     */
    public TransactionHostResponseCode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionHostResponseCode }
     *     
     */
    public void setCode(TransactionHostResponseCode value) {
        this.code = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the deviceOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link Device }
     *     
     */
    public Device getDeviceOrigin() {
        return deviceOrigin;
    }

    /**
     * Sets the value of the deviceOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Device }
     *     
     */
    public void setDeviceOrigin(Device value) {
        this.deviceOrigin = value;
    }

    /**
     * Gets the value of the ticketResponse property.
     * 
     * @return
     *     possible object is
     *     {@link TicketResponseData }
     *     
     */
    public TicketResponseData getTicketResponse() {
        return ticketResponse;
    }

    /**
     * Sets the value of the ticketResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketResponseData }
     *     
     */
    public void setTicketResponse(TicketResponseData value) {
        this.ticketResponse = value;
    }

}
