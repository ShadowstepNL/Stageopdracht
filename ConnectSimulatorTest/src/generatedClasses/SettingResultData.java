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
 * <p>Java class for SettingResultData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettingResultData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settingId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code" type="{}SettingResultCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettingResultData", propOrder = {
    "settingId",
    "code"
})
public class SettingResultData {

    @XmlElement(required = true)
    protected String settingId;
    @XmlElement(required = true)
    protected SettingResultCode code;

    /**
     * Gets the value of the settingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettingId() {
        return settingId;
    }

    /**
     * Sets the value of the settingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettingId(String value) {
        this.settingId = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link SettingResultCode }
     *     
     */
    public SettingResultCode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettingResultCode }
     *     
     */
    public void setCode(SettingResultCode value) {
        this.code = value;
    }

}
