
package oracle.bpel.services.workflow.common.tsc.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anchorTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="anchorTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="START_OF_TASK"/>
 *     &lt;enumeration value="START_STAGE"/>
 *     &lt;enumeration value="END_STAGE"/>
 *     &lt;enumeration value="BEFORE_ASSIGNEE"/>
 *     &lt;enumeration value="AFTER_ASSIGNEE"/>
 *     &lt;enumeration value="PARALLEL_TO_ASSIGNEE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "anchorTypeType")
@XmlEnum
public enum AnchorTypeType {

    START_OF_TASK,
    START_STAGE,
    END_STAGE,
    BEFORE_ASSIGNEE,
    AFTER_ASSIGNEE,
    PARALLEL_TO_ASSIGNEE;

    public String value() {
        return name();
    }

    public static AnchorTypeType fromValue(String v) {
        return valueOf(v);
    }

}
