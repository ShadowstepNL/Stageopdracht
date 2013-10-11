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
 * <p>Java class for CashRegisterResponseCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CashRegisterResponseCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRINT_SUCCEEDED"/>
 *     &lt;enumeration value="PRINT_FAILED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CashRegisterResponseCode")
@XmlEnum
public enum CashRegisterResponseCode {

    PRINT_SUCCEEDED,
    PRINT_FAILED;

    public String value() {
        return name();
    }

    public static CashRegisterResponseCode fromValue(String v) {
        return valueOf(v);
    }

}
