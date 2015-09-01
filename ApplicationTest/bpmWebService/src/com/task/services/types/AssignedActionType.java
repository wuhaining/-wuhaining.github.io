
package com.task.services.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignedActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="assignedActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REINITIATE"/>
 *     &lt;enumeration value="INITIATE"/>
 *     &lt;enumeration value="OUTCOME_UPDATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "assignedActionType")
@XmlEnum
public enum AssignedActionType {

    REINITIATE,
    INITIATE,
    OUTCOME_UPDATED;

    public String value() {
        return name();
    }

    public static AssignedActionType fromValue(String v) {
        return valueOf(v);
    }

}
