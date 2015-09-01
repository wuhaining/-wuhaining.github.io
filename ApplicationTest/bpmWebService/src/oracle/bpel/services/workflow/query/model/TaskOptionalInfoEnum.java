
package oracle.bpel.services.workflow.query.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskOptionalInfoEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="taskOptionalInfoEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Actions"/>
 *     &lt;enumeration value="GroupActions"/>
 *     &lt;enumeration value="CustomActions"/>
 *     &lt;enumeration value="Attachments"/>
 *     &lt;enumeration value="Comments"/>
 *     &lt;enumeration value="Payload"/>
 *     &lt;enumeration value="ShortHistory"/>
 *     &lt;enumeration value="TemplateTasks"/>
 *     &lt;enumeration value="ACTION_DISPLAY_NAME"/>
 *     &lt;enumeration value="TASK_VIEW_CONTEXT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "taskOptionalInfoEnum", namespace = "http://xmlns.oracle.com/bpel/workflow/taskQuery")
@XmlEnum
public enum TaskOptionalInfoEnum {

    @XmlEnumValue("Actions")
    ACTIONS("Actions"),
    @XmlEnumValue("GroupActions")
    GROUP_ACTIONS("GroupActions"),
    @XmlEnumValue("CustomActions")
    CUSTOM_ACTIONS("CustomActions"),
    @XmlEnumValue("Attachments")
    ATTACHMENTS("Attachments"),
    @XmlEnumValue("Comments")
    COMMENTS("Comments"),
    @XmlEnumValue("Payload")
    PAYLOAD("Payload"),
    @XmlEnumValue("ShortHistory")
    SHORT_HISTORY("ShortHistory"),
    @XmlEnumValue("TemplateTasks")
    TEMPLATE_TASKS("TemplateTasks"),
    ACTION_DISPLAY_NAME("ACTION_DISPLAY_NAME"),
    TASK_VIEW_CONTEXT("TASK_VIEW_CONTEXT");
    private final String value;

    TaskOptionalInfoEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskOptionalInfoEnum fromValue(String v) {
        for (TaskOptionalInfoEnum c: TaskOptionalInfoEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
