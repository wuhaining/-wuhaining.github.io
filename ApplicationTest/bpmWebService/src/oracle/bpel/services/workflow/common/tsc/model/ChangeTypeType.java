
package oracle.bpel.services.workflow.common.tsc.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changeTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="changeTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CRU"/>
 *     &lt;enumeration value="DEL"/>
 *     &lt;enumeration value="COA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "changeTypeType")
@XmlEnum
public enum ChangeTypeType {

    CRU,
    DEL,
    COA;

    public String value() {
        return name();
    }

    public static ChangeTypeType fromValue(String v) {
        return valueOf(v);
    }

}
