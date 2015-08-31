
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for relativeDateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="relativeDateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASSIGNED"/>
 *     &lt;enumeration value="EXPIRATION"/>
 *     &lt;enumeration value="DUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "relativeDateType")
@XmlEnum
public enum RelativeDateType {

    ASSIGNED,
    EXPIRATION,
    DUE;

    public String value() {
        return name();
    }

    public static RelativeDateType fromValue(String v) {
        return valueOf(v);
    }

}
