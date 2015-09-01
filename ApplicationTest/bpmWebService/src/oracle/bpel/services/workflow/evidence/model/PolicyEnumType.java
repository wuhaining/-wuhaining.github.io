
package oracle.bpel.services.workflow.evidence.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PolicyEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PASSWORD"/>
 *     &lt;enumeration value="CERTIFICATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PolicyEnumType")
@XmlEnum
public enum PolicyEnumType {

    PASSWORD,
    CERTIFICATE;

    public String value() {
        return name();
    }

    public static PolicyEnumType fromValue(String v) {
        return valueOf(v);
    }

}
