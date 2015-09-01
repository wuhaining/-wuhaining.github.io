
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recipientType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="recipientType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASSIGNEES"/>
 *     &lt;enumeration value="CREATOR"/>
 *     &lt;enumeration value="APPROVERS"/>
 *     &lt;enumeration value="OWNER"/>
 *     &lt;enumeration value="REVIEWERS"/>
 *     &lt;enumeration value="EMAILADDRESSES"/>
 *     &lt;enumeration value="EMAILADDRESSESXPATH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "recipientType")
@XmlEnum
public enum RecipientType {

    ASSIGNEES,
    CREATOR,
    APPROVERS,
    OWNER,
    REVIEWERS,
    EMAILADDRESSES,
    EMAILADDRESSESXPATH;

    public String value() {
        return name();
    }

    public static RecipientType fromValue(String v) {
        return valueOf(v);
    }

}
