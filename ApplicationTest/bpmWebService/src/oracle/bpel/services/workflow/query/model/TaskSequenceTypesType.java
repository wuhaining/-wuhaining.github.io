
package oracle.bpel.services.workflow.query.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskSequenceTypesType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="taskSequenceTypesType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="PAST"/>
 *     &lt;enumeration value="APPROVERS"/>
 *     &lt;enumeration value="FUTURE"/>
 *     &lt;enumeration value="CURRENT"/>
 *     &lt;enumeration value="AGGREGATE"/>
 *     &lt;enumeration value="USERAPPROVALS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "taskSequenceTypesType")
@XmlEnum
public enum TaskSequenceTypesType {

    ALL,
    PAST,
    APPROVERS,
    FUTURE,
    CURRENT,
    AGGREGATE,
    USERAPPROVALS;

    public String value() {
        return name();
    }

    public static TaskSequenceTypesType fromValue(String v) {
        return valueOf(v);
    }

}
