
package oracle.bpel.services.workflow.task.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskActionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="taskActionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACQUIRE"/>
 *     &lt;enumeration value="ADHOC_ROUTE"/>
 *     &lt;enumeration value="AUTO_RELEASE"/>
 *     &lt;enumeration value="COMPLETE"/>
 *     &lt;enumeration value="DELEGATE"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="ESCALATE"/>
 *     &lt;enumeration value="EXPIRE"/>
 *     &lt;enumeration value="INFO_REQUEST"/>
 *     &lt;enumeration value="INFO_SUBMIT"/>
 *     &lt;enumeration value="INITIATE"/>
 *     &lt;enumeration value="OUTCOME_UPDATE"/>
 *     &lt;enumeration value="OUTCOME_UPDATE_ROUTE"/>
 *     &lt;enumeration value="OVERRIDE_ROUTING_SLIP"/>
 *     &lt;enumeration value="PUSH_BACK"/>
 *     &lt;enumeration value="REASSIGN"/>
 *     &lt;enumeration value="REINITIATE"/>
 *     &lt;enumeration value="RELEASE"/>
 *     &lt;enumeration value="RENEW"/>
 *     &lt;enumeration value="RESUME"/>
 *     &lt;enumeration value="SKIP_CURRENT_ASSIGNMENT"/>
 *     &lt;enumeration value="SUBTASK_OUTCOME_UPDATE"/>
 *     &lt;enumeration value="SUSPEND"/>
 *     &lt;enumeration value="UPDATE"/>
 *     &lt;enumeration value="WITHDRAW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "taskActionEnum")
@XmlEnum
public enum TaskActionEnum {

    ACQUIRE,
    ADHOC_ROUTE,
    AUTO_RELEASE,
    COMPLETE,
    DELEGATE,
    ERROR,
    ESCALATE,
    EXPIRE,
    INFO_REQUEST,
    INFO_SUBMIT,
    INITIATE,
    OUTCOME_UPDATE,
    OUTCOME_UPDATE_ROUTE,
    OVERRIDE_ROUTING_SLIP,
    PUSH_BACK,
    REASSIGN,
    REINITIATE,
    RELEASE,
    RENEW,
    RESUME,
    SKIP_CURRENT_ASSIGNMENT,
    SUBTASK_OUTCOME_UPDATE,
    SUSPEND,
    UPDATE,
    WITHDRAW;

    public String value() {
        return name();
    }

    public static TaskActionEnum fromValue(String v) {
        return valueOf(v);
    }

}
