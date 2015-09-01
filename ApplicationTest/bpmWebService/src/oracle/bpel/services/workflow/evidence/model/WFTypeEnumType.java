
package oracle.bpel.services.workflow.evidence.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WFTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WFTypeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OWF"/>
 *     &lt;enumeration value="BPELWF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WFTypeEnumType")
@XmlEnum
public enum WFTypeEnumType {

    OWF,
    BPELWF;

    public String value() {
        return name();
    }

    public static WFTypeEnumType fromValue(String v) {
        return valueOf(v);
    }

}
