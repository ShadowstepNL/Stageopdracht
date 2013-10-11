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
 *         &lt;element name="type" type="{}CancelType" minOccurs="0"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceOrigin" type="{}Device" minOccurs="0"/>
 *         &lt;element name="deviceState" type="{}DeviceState" minOccurs="0"/>
 *         &lt;element name="deviceResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "type",
    "transactionId",
    "deviceOrigin",
    "deviceState",
    "deviceResultCode"
})
@XmlRootElement(name = "CancelResponse")
public class CancelResponse {

    @XmlElement(required = true)
    protected TransactionHostResponseCode code;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    protected CancelType type;
    protected String transactionId;
    protected Device deviceOrigin;
    protected DeviceState deviceState;
    protected String deviceResultCode;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CancelType }
     *     
     */
    public CancelType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelType }
     *     
     */
    public void setType(CancelType value) {
        this.type = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
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

}
