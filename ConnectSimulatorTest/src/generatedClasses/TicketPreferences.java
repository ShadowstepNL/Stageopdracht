//
// This file was generatedClasses by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.04 at 01:41:22 PM CEST 
//


package generatedClasses;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketPreferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketPreferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="printOrigin" type="{}PrintOrigin"/>
 *         &lt;element name="paperWidth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="encryptionParameters" type="{}EncryptionParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketPreferences", propOrder = {
    "printOrigin",
    "paperWidth",
    "encryptionParameters"
})
public class TicketPreferences {

    @XmlElement(required = true)
    protected PrintOrigin printOrigin;
    protected BigInteger paperWidth;
    protected EncryptionParameters encryptionParameters;

    /**
     * Gets the value of the printOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link PrintOrigin }
     *     
     */
    public PrintOrigin getPrintOrigin() {
        return printOrigin;
    }

    /**
     * Sets the value of the printOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintOrigin }
     *     
     */
    public void setPrintOrigin(PrintOrigin value) {
        this.printOrigin = value;
    }

    /**
     * Gets the value of the paperWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaperWidth() {
        return paperWidth;
    }

    /**
     * Sets the value of the paperWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaperWidth(BigInteger value) {
        this.paperWidth = value;
    }

    /**
     * Gets the value of the encryptionParameters property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionParameters }
     *     
     */
    public EncryptionParameters getEncryptionParameters() {
        return encryptionParameters;
    }

    /**
     * Sets the value of the encryptionParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionParameters }
     *     
     */
    public void setEncryptionParameters(EncryptionParameters value) {
        this.encryptionParameters = value;
    }

}
