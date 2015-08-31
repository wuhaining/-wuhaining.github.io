
package oracle.bpel.services.workflow.query.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignmentFilterEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="assignmentFilterEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="My"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="My+Group"/>
 *     &lt;enumeration value="My+Group+All"/>
 *     &lt;enumeration value="Reportees"/>
 *     &lt;enumeration value="Creator"/>
 *     &lt;enumeration value="Owner"/>
 *     &lt;enumeration value="Previous"/>
 *     &lt;enumeration value="Admin"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "assignmentFilterEnum", namespace = "http://xmlns.oracle.com/bpel/workflow/taskQuery")
@XmlEnum
public enum AssignmentFilterEnum {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("My")
    MY("My"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("My+Group")
    MY_GROUP("My+Group"),
    @XmlEnumValue("My+Group+All")
    MY_GROUP_ALL("My+Group+All"),
    @XmlEnumValue("Reportees")
    REPORTEES("Reportees"),
    @XmlEnumValue("Creator")
    CREATOR("Creator"),
    @XmlEnumValue("Owner")
    OWNER("Owner"),
    @XmlEnumValue("Previous")
    PREVIOUS("Previous"),
    @XmlEnumValue("Admin")
    ADMIN("Admin");
    private final String value;

    AssignmentFilterEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssignmentFilterEnum fromValue(String v) {
        for (AssignmentFilterEnum c: AssignmentFilterEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
