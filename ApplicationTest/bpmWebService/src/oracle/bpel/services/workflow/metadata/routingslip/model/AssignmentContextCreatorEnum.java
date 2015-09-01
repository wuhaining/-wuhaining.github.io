
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignmentContextCreatorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="assignmentContextCreatorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SYSTEM"/>
 *     &lt;enumeration value="USER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "assignmentContextCreatorEnum")
@XmlEnum
public enum AssignmentContextCreatorEnum {

    SYSTEM,
    USER;

    public String value() {
        return name();
    }

    public static AssignmentContextCreatorEnum fromValue(String v) {
        return valueOf(v);
    }

}
