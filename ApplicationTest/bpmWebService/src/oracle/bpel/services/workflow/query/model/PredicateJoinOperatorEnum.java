
package oracle.bpel.services.workflow.query.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for predicateJoinOperatorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="predicateJoinOperatorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AND"/>
 *     &lt;enumeration value="OR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "predicateJoinOperatorEnum", namespace = "http://xmlns.oracle.com/bpel/workflow/taskQuery")
@XmlEnum
public enum PredicateJoinOperatorEnum {

    AND,
    OR;

    public String value() {
        return name();
    }

    public static PredicateJoinOperatorEnum fromValue(String v) {
        return valueOf(v);
    }

}
