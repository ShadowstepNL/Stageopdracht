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
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code" type="{}TransactionHostResponseCode"/>
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="nfcId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loyaltyInfo" type="{}loyaltyData" minOccurs="0"/>
 *         &lt;element name="readerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "transactionId",
    "code",
    "timeStamp",
    "nfcId",
    "loyaltyInfo",
    "readerId",
    "customerId"
})
@XmlRootElement(name = "CardResponse")
public class CardResponse {

    @XmlElement(required = true)
    protected String transactionId;
    @XmlElement(required = true)
    protected TransactionHostResponseCode code;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    protected String nfcId;
    protected LoyaltyData loyaltyInfo;
    protected String readerId;
    protected String customerId;

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
     * Gets the value of the nfcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNfcId() {
        return nfcId;
    }

    /**
     * Sets the value of the nfcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNfcId(String value) {
        this.nfcId = value;
    }

    /**
     * Gets the value of the loyaltyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyData }
     *     
     */
    public LoyaltyData getLoyaltyInfo() {
        return loyaltyInfo;
    }

    /**
     * Sets the value of the loyaltyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyData }
     *     
     */
    public void setLoyaltyInfo(LoyaltyData value) {
        this.loyaltyInfo = value;
    }

    /**
     * Gets the value of the readerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReaderId() {
        return readerId;
    }

    /**
     * Sets the value of the readerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReaderId(String value) {
        this.readerId = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

}
