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
 * <p>Java class for ProgressStage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProgressStage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="WAIT_CARD"/>
 *     &lt;enumeration value="WAIT_CODE"/>
 *     &lt;enumeration value="WAIT_AMOUNT"/>
 *     &lt;enumeration value="WAIT_SERVICE"/>
 *     &lt;enumeration value="WAIT_SERVICE_AMOUNT"/>
 *     &lt;enumeration value="WAIT_TIP"/>
 *     &lt;enumeration value="TRANSACTION"/>
 *     &lt;enumeration value="WAIT_TRANSACTION_RESULT"/>
 *     &lt;enumeration value="FINISHED"/>
 *     &lt;enumeration value="WAIT_CARD_REMOVAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProgressStage")
@XmlEnum
public enum ProgressStage {

    NONE,
    WAIT_CARD,
    WAIT_CODE,
    WAIT_AMOUNT,
    WAIT_SERVICE,
    WAIT_SERVICE_AMOUNT,
    WAIT_TIP,
    TRANSACTION,
    WAIT_TRANSACTION_RESULT,
    FINISHED,
    WAIT_CARD_REMOVAL;

    public String value() {
        return name();
    }

    public static ProgressStage fromValue(String v) {
        return valueOf(v);
    }

}
