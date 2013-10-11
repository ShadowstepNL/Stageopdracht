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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ticketType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="ticketHeader" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="ticketFooter" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketData", propOrder = {
    "ticketType",
    "ticket",
    "ticketHeader",
    "ticketFooter"
})
public class TicketData {

    @XmlElement(required = true)
    protected String ticketType;
    @XmlElement(required = true)
    protected byte[] ticket;
    protected byte[] ticketHeader;
    protected byte[] ticketFooter;

    /**
     * Gets the value of the ticketType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketType() {
        return ticketType;
    }

    /**
     * Sets the value of the ticketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketType(String value) {
        this.ticketType = value;
    }

    /**
     * Gets the value of the ticket property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTicket() {
        return ticket;
    }

    /**
     * Sets the value of the ticket property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTicket(byte[] value) {
        this.ticket = value;
    }

    /**
     * Gets the value of the ticketHeader property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTicketHeader() {
        return ticketHeader;
    }

    /**
     * Sets the value of the ticketHeader property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTicketHeader(byte[] value) {
        this.ticketHeader = value;
    }

    /**
     * Gets the value of the ticketFooter property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTicketFooter() {
        return ticketFooter;
    }

    /**
     * Sets the value of the ticketFooter property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTicketFooter(byte[] value) {
        this.ticketFooter = value;
    }

}
