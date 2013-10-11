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
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="deviceTarget" type="{}Device"/>
 *         &lt;element name="totalsType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ticketPreferences" type="{}TicketPreferences" minOccurs="0"/>
 *         &lt;element name="ecrLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "deviceTarget",
    "totalsType",
    "ticketPreferences",
    "ecrLanguage"
})
@XmlRootElement(name = "TotalsRequest")
public class TotalsRequest {

    @XmlElement(required = true)
    protected Device deviceTarget;
    @XmlElement(required = true)
    protected String totalsType;
    protected TicketPreferences ticketPreferences;
    protected String ecrLanguage;

    /**
     * Gets the value of the deviceTarget property.
     * 
     * @return
     *     possible object is
     *     {@link Device }
     *     
     */
    public Device getDeviceTarget() {
        return deviceTarget;
    }

    /**
     * Sets the value of the deviceTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Device }
     *     
     */
    public void setDeviceTarget(Device value) {
        this.deviceTarget = value;
    }

    /**
     * Gets the value of the totalsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalsType() {
        return totalsType;
    }

    /**
     * Sets the value of the totalsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalsType(String value) {
        this.totalsType = value;
    }

    /**
     * Gets the value of the ticketPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link TicketPreferences }
     *     
     */
    public TicketPreferences getTicketPreferences() {
        return ticketPreferences;
    }

    /**
     * Sets the value of the ticketPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketPreferences }
     *     
     */
    public void setTicketPreferences(TicketPreferences value) {
        this.ticketPreferences = value;
    }

    /**
     * Gets the value of the ecrLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcrLanguage() {
        return ecrLanguage;
    }

    /**
     * Sets the value of the ecrLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcrLanguage(String value) {
        this.ecrLanguage = value;
    }

}
