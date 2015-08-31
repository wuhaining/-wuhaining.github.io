
package oracle.bpel.services.workflow.user.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ruleEngineEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ruleEngineEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ORACLE"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ruleEngineEnum")
@XmlEnum
public enum RuleEngineEnum {

    ORACLE,
    OTHER;

    public String value() {
        return name();
    }

    public static RuleEngineEnum fromValue(String v) {
        return valueOf(v);
    }

}
