
package oracle.bpel.services.workflow.user.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for grantTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="grantTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SHARE_DATA"/>
 *     &lt;enumeration value="SHARE_DEFINITION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "grantTypeEnum")
@XmlEnum
public enum GrantTypeEnum {

    SHARE_DATA,
    SHARE_DEFINITION;

    public String value() {
        return name();
    }

    public static GrantTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
