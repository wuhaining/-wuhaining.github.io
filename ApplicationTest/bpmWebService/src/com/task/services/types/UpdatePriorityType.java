
package com.task.services.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePriorityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="updatePriorityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UPDATE"/>
 *     &lt;enumeration value="INCREMENT"/>
 *     &lt;enumeration value="DECREMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "updatePriorityType")
@XmlEnum
public enum UpdatePriorityType {

    UPDATE,
    INCREMENT,
    DECREMENT;

    public String value() {
        return name();
    }

    public static UpdatePriorityType fromValue(String v) {
        return valueOf(v);
    }

}
