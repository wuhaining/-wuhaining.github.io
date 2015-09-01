
package oracle.bpel.services.workflow.query.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatorEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatorEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQUAL"/>
 *     &lt;enumeration value="NOTEQ"/>
 *     &lt;enumeration value="LESS"/>
 *     &lt;enumeration value="MORE"/>
 *     &lt;enumeration value="MOREEQ"/>
 *     &lt;enumeration value="EQLESS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperatorEnumType")
@XmlEnum
public enum OperatorEnumType {

    EQUAL,
    NOTEQ,
    LESS,
    MORE,
    MOREEQ,
    EQLESS;

    public String value() {
        return name();
    }

    public static OperatorEnumType fromValue(String v) {
        return valueOf(v);
    }

}
