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
 * <p>Java class for SystemMessageCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SystemMessageCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEVICE_DISCONNECTED"/>
 *     &lt;enumeration value="DEVICE_CONNECTED"/>
 *     &lt;enumeration value="MINITIX_OFFLINE"/>
 *     &lt;enumeration value="MINITIX_ONLINE"/>
 *     &lt;enumeration value="TXHOST_ERROR"/>
 *     &lt;enumeration value="MESSAGE_UNKNOWN"/>
 *     &lt;enumeration value="NO_DEVICES_CONNECTED"/>
 *     &lt;enumeration value="CARD_UNEXPECTED"/>
 *     &lt;enumeration value="CARD_UNKNOWN"/>
 *     &lt;enumeration value="DEVICE_STATE"/>
 *     &lt;enumeration value="REPORT"/>
 *     &lt;enumeration value="DEVICE_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SystemMessageCode")
@XmlEnum
public enum SystemMessageCode {

    DEVICE_DISCONNECTED,
    DEVICE_CONNECTED,
    MINITIX_OFFLINE,
    MINITIX_ONLINE,
    TXHOST_ERROR,
    MESSAGE_UNKNOWN,
    NO_DEVICES_CONNECTED,
    CARD_UNEXPECTED,
    CARD_UNKNOWN,
    DEVICE_STATE,
    REPORT,
    DEVICE_ERROR;

    public String value() {
        return name();
    }

    public static SystemMessageCode fromValue(String v) {
        return valueOf(v);
    }

}
