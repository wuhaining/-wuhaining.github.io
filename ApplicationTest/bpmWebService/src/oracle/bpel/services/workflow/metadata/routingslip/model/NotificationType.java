
package oracle.bpel.services.workflow.metadata.routingslip.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import oracle.bpel.services.workflow.task.model.ScopeTypeEnum;


/**
 * <p>Java class for notificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reminder" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}reminderType" minOccurs="0"/>
 *         &lt;element name="action" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}actionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wordMLXSLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xslt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preferenceParameters" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}preferenceParametersType" minOccurs="0"/>
 *         &lt;element name="groupNotificationConfiguration" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}groupNotificationConfigurationTypeEnum" minOccurs="0"/>
 *         &lt;element name="commentScope" type="{http://xmlns.oracle.com/bpel/workflow/task}scopeTypeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="actionable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="oneNotificationPerUserPerAction" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="includeTaskAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="secureNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="hideWorklistUrlInEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationType", propOrder = {
    "reminder",
    "action",
    "wordMLXSLT",
    "xslt",
    "preferenceParameters",
    "groupNotificationConfiguration",
    "commentScope"
})
public class NotificationType {

    protected ReminderType reminder;
    protected List<ActionType> action;
    protected String wordMLXSLT;
    protected String xslt;
    protected PreferenceParametersType preferenceParameters;
    protected GroupNotificationConfigurationTypeEnum groupNotificationConfiguration;
    protected ScopeTypeEnum commentScope;
    @XmlAttribute(required = true)
    protected boolean actionable;
    @XmlAttribute
    protected Boolean oneNotificationPerUserPerAction;
    @XmlAttribute
    protected Boolean includeTaskAttachments;
    @XmlAttribute
    protected Boolean secureNotifications;
    @XmlAttribute
    protected Boolean hideWorklistUrlInEmail;

    /**
     * Gets the value of the reminder property.
     * 
     * @return
     *     possible object is
     *     {@link ReminderType }
     *     
     */
    public ReminderType getReminder() {
        return reminder;
    }

    /**
     * Sets the value of the reminder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReminderType }
     *     
     */
    public void setReminder(ReminderType value) {
        this.reminder = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the action property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionType }
     * 
     * 
     */
    public List<ActionType> getAction() {
        if (action == null) {
            action = new ArrayList<ActionType>();
        }
        return this.action;
    }

    /**
     * Gets the value of the wordMLXSLT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWordMLXSLT() {
        return wordMLXSLT;
    }

    /**
     * Sets the value of the wordMLXSLT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWordMLXSLT(String value) {
        this.wordMLXSLT = value;
    }

    /**
     * Gets the value of the xslt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXslt() {
        return xslt;
    }

    /**
     * Sets the value of the xslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXslt(String value) {
        this.xslt = value;
    }

    /**
     * Gets the value of the preferenceParameters property.
     * 
     * @return
     *     possible object is
     *     {@link PreferenceParametersType }
     *     
     */
    public PreferenceParametersType getPreferenceParameters() {
        return preferenceParameters;
    }

    /**
     * Sets the value of the preferenceParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferenceParametersType }
     *     
     */
    public void setPreferenceParameters(PreferenceParametersType value) {
        this.preferenceParameters = value;
    }

    /**
     * Gets the value of the groupNotificationConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link GroupNotificationConfigurationTypeEnum }
     *     
     */
    public GroupNotificationConfigurationTypeEnum getGroupNotificationConfiguration() {
        return groupNotificationConfiguration;
    }

    /**
     * Sets the value of the groupNotificationConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupNotificationConfigurationTypeEnum }
     *     
     */
    public void setGroupNotificationConfiguration(GroupNotificationConfigurationTypeEnum value) {
        this.groupNotificationConfiguration = value;
    }

    /**
     * Gets the value of the commentScope property.
     * 
     * @return
     *     possible object is
     *     {@link ScopeTypeEnum }
     *     
     */
    public ScopeTypeEnum getCommentScope() {
        return commentScope;
    }

    /**
     * Sets the value of the commentScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopeTypeEnum }
     *     
     */
    public void setCommentScope(ScopeTypeEnum value) {
        this.commentScope = value;
    }

    /**
     * Gets the value of the actionable property.
     * 
     */
    public boolean isActionable() {
        return actionable;
    }

    /**
     * Sets the value of the actionable property.
     * 
     */
    public void setActionable(boolean value) {
        this.actionable = value;
    }

    /**
     * Gets the value of the oneNotificationPerUserPerAction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOneNotificationPerUserPerAction() {
        if (oneNotificationPerUserPerAction == null) {
            return false;
        } else {
            return oneNotificationPerUserPerAction;
        }
    }

    /**
     * Sets the value of the oneNotificationPerUserPerAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneNotificationPerUserPerAction(Boolean value) {
        this.oneNotificationPerUserPerAction = value;
    }

    /**
     * Gets the value of the includeTaskAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTaskAttachments() {
        return includeTaskAttachments;
    }

    /**
     * Sets the value of the includeTaskAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTaskAttachments(Boolean value) {
        this.includeTaskAttachments = value;
    }

    /**
     * Gets the value of the secureNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecureNotifications() {
        return secureNotifications;
    }

    /**
     * Sets the value of the secureNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecureNotifications(Boolean value) {
        this.secureNotifications = value;
    }

    /**
     * Gets the value of the hideWorklistUrlInEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHideWorklistUrlInEmail() {
        if (hideWorklistUrlInEmail == null) {
            return false;
        } else {
            return hideWorklistUrlInEmail;
        }
    }

    /**
     * Sets the value of the hideWorklistUrlInEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideWorklistUrlInEmail(Boolean value) {
        this.hideWorklistUrlInEmail = value;
    }

}
