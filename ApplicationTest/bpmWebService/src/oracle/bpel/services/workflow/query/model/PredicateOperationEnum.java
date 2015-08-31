
package oracle.bpel.services.workflow.query.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for predicateOperationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="predicateOperationEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQ"/>
 *     &lt;enumeration value="NEQ"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="GTE"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="LTE"/>
 *     &lt;enumeration value="LIKE"/>
 *     &lt;enumeration value="NOT_LIKE"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="NOT_IN"/>
 *     &lt;enumeration value="CONTAINS"/>
 *     &lt;enumeration value="NOT_CONTAINS"/>
 *     &lt;enumeration value="BEGINS"/>
 *     &lt;enumeration value="NOT_BEGINS"/>
 *     &lt;enumeration value="ENDS"/>
 *     &lt;enumeration value="NOT_ENDS"/>
 *     &lt;enumeration value="BEFORE"/>
 *     &lt;enumeration value="AFTER"/>
 *     &lt;enumeration value="ON"/>
 *     &lt;enumeration value="NEXT_N_DAYS"/>
 *     &lt;enumeration value="LAST_N_DAYS"/>
 *     &lt;enumeration value="IS_IN_FUTURE"/>
 *     &lt;enumeration value="IS_IN_PAST"/>
 *     &lt;enumeration value="IS_NULL"/>
 *     &lt;enumeration value="IS_NOT_NULL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "predicateOperationEnum", namespace = "http://xmlns.oracle.com/bpel/workflow/taskQuery")
@XmlEnum
public enum PredicateOperationEnum {

    EQ,
    NEQ,
    GT,
    GTE,
    LT,
    LTE,
    LIKE,
    NOT_LIKE,
    IN,
    NOT_IN,
    CONTAINS,
    NOT_CONTAINS,
    BEGINS,
    NOT_BEGINS,
    ENDS,
    NOT_ENDS,
    BEFORE,
    AFTER,
    ON,
    NEXT_N_DAYS,
    LAST_N_DAYS,
    IS_IN_FUTURE,
    IS_IN_PAST,
    IS_NULL,
    IS_NOT_NULL;

    public String value() {
        return name();
    }

    public static PredicateOperationEnum fromValue(String v) {
        return valueOf(v);
    }

}
