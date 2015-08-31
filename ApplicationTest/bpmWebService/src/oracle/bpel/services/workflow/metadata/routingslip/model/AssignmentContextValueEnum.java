
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignmentContextValueEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="assignmentContextValueEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RESOURCE"/>
 *     &lt;enumeration value="STATIC"/>
 *     &lt;enumeration value="XPATH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "assignmentContextValueEnum")
@XmlEnum
public enum AssignmentContextValueEnum {

    RESOURCE,
    STATIC,
    XPATH;

    public String value() {
        return name();
    }

    public static AssignmentContextValueEnum fromValue(String v) {
        return valueOf(v);
    }

}
