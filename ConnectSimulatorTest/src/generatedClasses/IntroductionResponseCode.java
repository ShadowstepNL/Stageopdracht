//
// This file was generatedClasses by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.04 at 01:41:22 PM CEST 
//


package generatedClasses;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntroductionResponseCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IntroductionResponseCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CASH_REGISTER_NOT_CONFIGURED"/>
 *     &lt;enumeration value="UNSUPPORTED_PROTOCOL_VERSION"/>
 *     &lt;enumeration value="INTRODUCTION_ACKNOWLEDGED_OK"/>
 *     &lt;enumeration value="NO_DEVICE_CONNECTED"/>
 *     &lt;enumeration value="INVALID_MESSAGE_RECEIVED"/>
 *     &lt;enumeration value="CASH_REGISTER_ALREADY_CONNECTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntroductionResponseCode")
@XmlEnum
public enum IntroductionResponseCode {

    CASH_REGISTER_NOT_CONFIGURED,
    UNSUPPORTED_PROTOCOL_VERSION,
    INTRODUCTION_ACKNOWLEDGED_OK,
    NO_DEVICE_CONNECTED,
    INVALID_MESSAGE_RECEIVED,
    CASH_REGISTER_ALREADY_CONNECTED;

    public String value() {
        return name();
    }

    public static IntroductionResponseCode fromValue(String v) {
        return valueOf(v);
    }

}
