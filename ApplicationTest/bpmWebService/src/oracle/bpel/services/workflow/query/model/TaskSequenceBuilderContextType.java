
package oracle.bpel.services.workflow.query.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskSequenceBuilderContextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="taskSequenceBuilderContextType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STAGE"/>
 *     &lt;enumeration value="WORKFLOW_PATTERN"/>
 *     &lt;enumeration value="INCLUDE_SEQUENCE_FOR_SINGLE_CHILD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "taskSequenceBuilderContextType")
@XmlEnum
public enum TaskSequenceBuilderContextType {

    STAGE,
    WORKFLOW_PATTERN,
    INCLUDE_SEQUENCE_FOR_SINGLE_CHILD;

    public String value() {
        return name();
    }

    public static TaskSequenceBuilderContextType fromValue(String v) {
        return valueOf(v);
    }

}
