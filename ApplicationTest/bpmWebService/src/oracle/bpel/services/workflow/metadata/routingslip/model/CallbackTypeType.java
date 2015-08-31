
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for callbackTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="callbackTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PL_SQL"/>
 *     &lt;enumeration value="JAVA"/>
 *     &lt;enumeration value="EVENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "callbackTypeType")
@XmlEnum
public enum CallbackTypeType {

    PL_SQL,
    JAVA,
    EVENT;

    public String value() {
        return name();
    }

    public static CallbackTypeType fromValue(String v) {
        return valueOf(v);
    }

}
