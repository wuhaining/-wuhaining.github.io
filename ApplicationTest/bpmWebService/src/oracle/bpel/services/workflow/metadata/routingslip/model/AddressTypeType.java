
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addressTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="addressTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="FAX"/>
 *     &lt;enumeration value="PAGER"/>
 *     &lt;enumeration value="PHONE"/>
 *     &lt;enumeration value="SMS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "addressTypeType")
@XmlEnum
public enum AddressTypeType {

    EMAIL,
    FAX,
    PAGER,
    PHONE,
    SMS;

    public String value() {
        return name();
    }

    public static AddressTypeType fromValue(String v) {
        return valueOf(v);
    }

}
