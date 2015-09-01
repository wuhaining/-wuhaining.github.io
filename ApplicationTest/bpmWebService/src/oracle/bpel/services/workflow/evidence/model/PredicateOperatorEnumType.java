
package oracle.bpel.services.workflow.evidence.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PredicateOperatorEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PredicateOperatorEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANY"/>
 *     &lt;enumeration value="ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PredicateOperatorEnumType")
@XmlEnum
public enum PredicateOperatorEnumType {

    ANY,
    ALL;

    public String value() {
        return name();
    }

    public static PredicateOperatorEnumType fromValue(String v) {
        return valueOf(v);
    }

}
