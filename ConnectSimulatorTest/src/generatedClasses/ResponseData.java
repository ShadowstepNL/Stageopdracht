//
// This file was generatedClasses by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.04 at 01:41:22 PM CEST 
//


package generatedClasses;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionHostCode" type="{}TransactionHostResponseCode"/>
 *         &lt;element name="paymentServiceInterface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processorDetails" type="{}ProcessorDetails" minOccurs="0"/>
 *         &lt;element name="paymentServiceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentServiceMerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentServiceTransactionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentServiceTransactionCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentServiceTransactionNRDecimal" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="paymentServiceTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentServiceTransactionTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceState" type="{}DeviceState" minOccurs="0"/>
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
@XmlType(name = "responseData", propOrder = {
    "transactionHostCode",
    "paymentServiceInterface",
    "paymentServiceCode",
    "processorCode",
    "processorDetails",
    "paymentServiceDescription",
    "paymentServiceMerchantId",
    "paymentServiceTransactionAmount",
    "paymentServiceTransactionCurrency",
    "paymentServiceTransactionNRDecimal",
    "paymentServiceTransactionId",
    "paymentServiceTransactionTimestamp",
    "deviceState",
    "ticketData"
})
public class ResponseData {

    @XmlElement(required = true)
    protected TransactionHostResponseCode transactionHostCode;
    protected String paymentServiceInterface;
    protected String paymentServiceCode;
    protected String processorCode;
    protected ProcessorDetails processorDetails;
    protected String paymentServiceDescription;
    protected String paymentServiceMerchantId;
    protected String paymentServiceTransactionAmount;
    protected String paymentServiceTransactionCurrency;
    protected BigInteger paymentServiceTransactionNRDecimal;
    protected String paymentServiceTransactionId;
    protected String paymentServiceTransactionTimestamp;
    protected DeviceState deviceState;
    protected List<TicketData> ticketData;

    /**
     * Gets the value of the transactionHostCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionHostResponseCode }
     *     
     */
    public TransactionHostResponseCode getTransactionHostCode() {
        return transactionHostCode;
    }

    /**
     * Sets the value of the transactionHostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionHostResponseCode }
     *     
     */
    public void setTransactionHostCode(TransactionHostResponseCode value) {
        this.transactionHostCode = value;
    }

    /**
     * Gets the value of the paymentServiceInterface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentServiceInterface() {
        return paymentServiceInterface;
    }

    /**
     * Sets the value of the paymentServiceInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentServiceInterface(String value) {
        this.paymentServiceInterface = value;
    }

    /**
     * Gets the value of the paymentServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentServiceCode() {
        return paymentServiceCode;
    }

    /**
     * Sets the value of the paymentServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentServiceCode(String value) {
        this.paymentServiceCode = value;
    }

    /**
     * Gets the value of the processorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorCode() {
        return processorCode;
    }

    /**
     * Sets the value of the processorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorCode(String value) {
        this.processorCode = value;
    }

    /**
     * Gets the value of the processorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessorDetails }
     *     
     */
    public ProcessorDetails getProcessorDetails() {
        return processorDetails;
    }

    /**
     * Sets the value of the processorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessorDetails }
     *     
     */
    public void setProcessorDetails(ProcessorDetails value) {
        this.processorDetails = value;
    }

    /**
     * Gets the value of the paymentServiceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentServiceDescription() {
        return paymentServiceDescription;
    }

    /**
     * Sets the value of the paymentServiceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentServiceDescription(String value) {
        this.paymentServiceDescription = value;
    }

    /**
     * Gets the value of the paymentServiceMerchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentServiceMerchantId() {
        return paymentServiceMerchantId;
    }

    /**
     * Sets the value of the paymentServiceMerchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentServiceMerchantId(String value) {
        this.paymentServiceMerchantId = value;
    }

    /**
     * Gets the value of the paymentServiceTransactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentServiceTransactionAmount() {
        return paymentServiceTransactionAmount;
    }

    /**
     * Sets the value of the paymentServiceTransactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentServiceTransactionAmount(String value) {
        this.paymentServiceTransactionAmount = value;
    }

    /**
     * Gets the value of the paymentServiceTransactionCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentServiceTransactionCurrency() {
        return paymentServiceTransactionCurrency;
    }

    /**
     * Sets the value of the paymentServiceTransactionCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentServiceTransactionCurrency(String value) {
        this.paymentServiceTransactionCurrency = value;
    }

    /**
     * Gets the value of the paymentServiceTransactionNRDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaymentServiceTransactionNRDecimal() {
        return paymentServiceTransactionNRDecimal;
    }

    /**
     * Sets the value of the paymentServiceTransactionNRDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaymentServiceTransactionNRDecimal(BigInteger value) {
        this.paymentServiceTransactionNRDecimal = value;
    }

    /**
     * Gets the value of the paymentServiceTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentServiceTransactionId() {
        return paymentServiceTransactionId;
    }

    /**
     * Sets the value of the paymentServiceTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentServiceTransactionId(String value) {
        this.paymentServiceTransactionId = value;
    }

    /**
     * Gets the value of the paymentServiceTransactionTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentServiceTransactionTimestamp() {
        return paymentServiceTransactionTimestamp;
    }

    /**
     * Sets the value of the paymentServiceTransactionTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentServiceTransactionTimestamp(String value) {
        this.paymentServiceTransactionTimestamp = value;
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
