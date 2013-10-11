//
// This file was generatedClasses by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.04 at 01:41:22 PM CEST 
//


package generatedClasses;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketResponseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketResponseData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceState" type="{}DeviceState"/>
 *         &lt;element name="deviceResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketData" type="{}TicketData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketResponseData", propOrder = {
    "deviceState",
    "deviceResultCode",
    "ticketData"
})
public class TicketResponseData {

    @XmlElement(required = true)
    protected DeviceState deviceState;
    protected String deviceResultCode;
    protected List<TicketData> ticketData;

    /**
     * Gets the value of the deviceState property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceState }
     *     
     */
    public DeviceState getDeviceState() {
        return deviceState;
    }

    /**
     * Sets the value of the deviceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceState }
     *     
     */
    public void setDeviceState(DeviceState value) {
        this.deviceState = value;
    }

    /**
     * Gets the value of the deviceResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceResultCode() {
        return deviceResultCode;
    }

    /**
     * Sets the value of the deviceResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceResultCode(String value) {
        this.deviceResultCode = value;
    }

    /**
     * Gets the value of the ticketData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketData }
     * 
     * 
     */
    public List<TicketData> getTicketData() {
        if (ticketData == null) {
            ticketData = new ArrayList<TicketData>();
        }
        return this.ticketData;
    }

}
