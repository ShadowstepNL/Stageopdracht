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
 * <p>Java class for TransactionHostResponseCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionHostResponseCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CARDREQUEST_ACKNOWLEDGED"/>
 *     &lt;enumeration value="CARD_PRESENTED"/>
 *     &lt;enumeration value="CARD_AUTHENTICATED"/>
 *     &lt;enumeration value="PAYMENTREQUEST_ACKNOWLEDGED"/>
 *     &lt;enumeration value="PAYMENT_SUCCEEDED"/>
 *     &lt;enumeration value="CARD_UNKNOWN"/>
 *     &lt;enumeration value="CARD_NOT_ACTIVE"/>
 *     &lt;enumeration value="CARD_EXPIRED"/>
 *     &lt;enumeration value="CARD_UNEXPECTED"/>
 *     &lt;enumeration value="SECURITY_ERROR"/>
 *     &lt;enumeration value="DEVICE_NOT_CONNECTED"/>
 *     &lt;enumeration value="OPERATION_CANCELLED"/>
 *     &lt;enumeration value="INSUFFICIENT_FUNDS"/>
 *     &lt;enumeration value="ACCOUNT_BLOCKED"/>
 *     &lt;enumeration value="TRANSACTION_ALREADY_RUNNING"/>
 *     &lt;enumeration value="AMOUNT_MISSING"/>
 *     &lt;enumeration value="AMOUNT_TOO_LOW"/>
 *     &lt;enumeration value="AMOUNT_TOO_HIGH"/>
 *     &lt;enumeration value="SERVICE_UNREACHABLE"/>
 *     &lt;enumeration value="CASH_REGISTER_NOT_INTRODUCED"/>
 *     &lt;enumeration value="INVALID_MESSAGE_RECEIVED"/>
 *     &lt;enumeration value="REQUEST_FAILED"/>
 *     &lt;enumeration value="TECHNICAL_ERROR"/>
 *     &lt;enumeration value="RESULT_UNKNOWN"/>
 *     &lt;enumeration value="REQUEST_ACKNOWLEDGED"/>
 *     &lt;enumeration value="REQUEST_SUCCEEDED"/>
 *     &lt;enumeration value="REQUEST_NOT_SUPPORTED"/>
 *     &lt;enumeration value="DEVICE_UNAVAILABLE"/>
 *     &lt;enumeration value="RESULT_UNAVAILABLE"/>
 *     &lt;enumeration value="INCORRECT_STATE"/>
 *     &lt;enumeration value="AMOUNT_INVALID"/>
 *     &lt;enumeration value="CURRENCY_INVALID"/>
 *     &lt;enumeration value="PRINT_REQUIRED"/>
 *     &lt;enumeration value="PRINT_FAILED"/>
 *     &lt;enumeration value="TICKET_PREF_MISSING"/>
 *     &lt;enumeration value="TRANSACTION_STILL_RUNNING"/>
 *     &lt;enumeration value="OPERATION_IN_PROGRESS"/>
 *     &lt;enumeration value="PAYMENT_FAILED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionHostResponseCode")
@XmlEnum
public enum TransactionHostResponseCode {

    CARDREQUEST_ACKNOWLEDGED,
    CARD_PRESENTED,
    CARD_AUTHENTICATED,
    PAYMENTREQUEST_ACKNOWLEDGED,
    PAYMENT_SUCCEEDED,
    CARD_UNKNOWN,
    CARD_NOT_ACTIVE,
    CARD_EXPIRED,
    CARD_UNEXPECTED,
    SECURITY_ERROR,
    DEVICE_NOT_CONNECTED,
    OPERATION_CANCELLED,
    INSUFFICIENT_FUNDS,
    ACCOUNT_BLOCKED,
    TRANSACTION_ALREADY_RUNNING,
    AMOUNT_MISSING,
    AMOUNT_TOO_LOW,
    AMOUNT_TOO_HIGH,
    SERVICE_UNREACHABLE,
    CASH_REGISTER_NOT_INTRODUCED,
    INVALID_MESSAGE_RECEIVED,
    REQUEST_FAILED,
    TECHNICAL_ERROR,
    RESULT_UNKNOWN,
    REQUEST_ACKNOWLEDGED,
    REQUEST_SUCCEEDED,
    REQUEST_NOT_SUPPORTED,
    DEVICE_UNAVAILABLE,
    RESULT_UNAVAILABLE,
    INCORRECT_STATE,
    AMOUNT_INVALID,
    CURRENCY_INVALID,
    PRINT_REQUIRED,
    PRINT_FAILED,
    TICKET_PREF_MISSING,
    TRANSACTION_STILL_RUNNING,
    OPERATION_IN_PROGRESS,
    PAYMENT_FAILED;

    public String value() {
        return name();
    }

    public static TransactionHostResponseCode fromValue(String v) {
        return valueOf(v);
    }

}
