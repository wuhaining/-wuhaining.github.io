
package oracle.bpel.services.workflow.query.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnaryOperatorEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnaryOperatorEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnaryOperatorEnumType")
@XmlEnum
public enum UnaryOperatorEnumType {

    NOT;

    public String value() {
        return name();
    }

    public static UnaryOperatorEnumType fromValue(String v) {
        return valueOf(v);
    }

}
