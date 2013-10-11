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
 * <p>Java class for DisconnectReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisconnectReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DISCONNECT"/>
 *     &lt;enumeration value="SHUTDOWN"/>
 *     &lt;enumeration value="REBOOT"/>
 *     &lt;enumeration value="RECONNECT"/>
 *     &lt;enumeration value="BATTERY_EMPTY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisconnectReason")
@XmlEnum
public enum DisconnectReason {

    DISCONNECT,
    SHUTDOWN,
    REBOOT,
    RECONNECT,
    BATTERY_EMPTY;

    public String value() {
        return name();
    }

    public static DisconnectReason fromValue(String v) {
        return valueOf(v);
    }

}
