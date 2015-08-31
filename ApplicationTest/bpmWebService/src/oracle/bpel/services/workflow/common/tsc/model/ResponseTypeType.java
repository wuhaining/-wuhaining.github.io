
package oracle.bpel.services.workflow.common.tsc.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="responseTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REQUIRED"/>
 *     &lt;enumeration value="NREQUIRE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "responseTypeType")
@XmlEnum
public enum ResponseTypeType {

    REQUIRED,
    NREQUIRE;

    public String value() {
        return name();
    }

    public static ResponseTypeType fromValue(String v) {
        return valueOf(v);
    }

}
