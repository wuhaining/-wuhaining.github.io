
package com.task.services.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="actionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REINITIATE"/>
 *     &lt;enumeration value="INITIATE"/>
 *     &lt;enumeration value="OUTCOME_UPDATED"/>
 *     &lt;enumeration value="ACQUIRED"/>
 *     &lt;enumeration value="AUTO_RELEASE"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="ERRORED"/>
 *     &lt;enumeration value="ESCALATED"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="INFO_REQUESTED"/>
 *     &lt;enumeration value="INFO_SUBMITTED"/>
 *     &lt;enumeration value="REASSIGNED"/>
 *     &lt;enumeration value="RELEASED"/>
 *     &lt;enumeration value="RENEWED"/>
 *     &lt;enumeration value="RESUMED"/>
 *     &lt;enumeration value="SUBTASK_OUTCOME_UPDATED"/>
 *     &lt;enumeration value="SUSPENDED"/>
 *     &lt;enumeration value="UPDATED"/>
 *     &lt;enumeration value="WITHDRAWN"/>
 *     &lt;enumeration value="SKIP_CURRENT_ASSIGNMENT"/>
 *     &lt;enumeration value="OVERRIDE_ROUTING_SLIP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "actionType")
@XmlEnum
public enum ActionType {

    REINITIATE,
    INITIATE,
    OUTCOME_UPDATED,
    ACQUIRED,
    AUTO_RELEASE,
    COMPLETED,
    ERRORED,
    ESCALATED,
    EXPIRED,
    INFO_REQUESTED,
    INFO_SUBMITTED,
    REASSIGNED,
    RELEASED,
    RENEWED,
    RESUMED,
    SUBTASK_OUTCOME_UPDATED,
    SUSPENDED,
    UPDATED,
    WITHDRAWN,
    SKIP_CURRENT_ASSIGNMENT,
    OVERRIDE_ROUTING_SLIP;

    public String value() {
        return name();
    }

    public static ActionType fromValue(String v) {
        return valueOf(v);
    }

}
