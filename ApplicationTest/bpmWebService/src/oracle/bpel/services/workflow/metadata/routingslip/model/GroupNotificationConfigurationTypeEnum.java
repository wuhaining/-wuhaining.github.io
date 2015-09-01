
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for groupNotificationConfigurationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="groupNotificationConfigurationTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SEND_INDIVIDUAL_NOTIFICATION"/>
 *     &lt;enumeration value="SEND_SHARED_EMAIL_TO_ALL_GROUP_MEMBER_EMAILID"/>
 *     &lt;enumeration value="ADD_ALL_RECIPIENTS_IN_TO_LIST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "groupNotificationConfigurationTypeEnum")
@XmlEnum
public enum GroupNotificationConfigurationTypeEnum {

    SEND_INDIVIDUAL_NOTIFICATION,
    SEND_SHARED_EMAIL_TO_ALL_GROUP_MEMBER_EMAILID,
    ADD_ALL_RECIPIENTS_IN_TO_LIST;

    public String value() {
        return name();
    }

    public static GroupNotificationConfigurationTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
