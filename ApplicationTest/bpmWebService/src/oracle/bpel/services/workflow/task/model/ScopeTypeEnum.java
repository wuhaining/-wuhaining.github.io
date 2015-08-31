
package oracle.bpel.services.workflow.task.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scopeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="scopeTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TASK"/>
 *     &lt;enumeration value="PARENT_TASK"/>
 *     &lt;enumeration value="BPM"/>
 *     &lt;enumeration value="CASE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "scopeTypeEnum")
@XmlEnum
public enum ScopeTypeEnum {

    TASK,
    PARENT_TASK,
    BPM,
    CASE;

    public String value() {
        return name();
    }

    public static ScopeTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
