
package oracle.bpel.services.workflow.metadata.routingslip.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="globalConfiguration" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}globalConfigurationType" minOccurs="0"/>
 *         &lt;element name="assignmentService" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}assignmentServiceType" minOccurs="0"/>
 *         &lt;element name="participants" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}participantsType" minOccurs="0"/>
 *         &lt;element name="onErrorParticipant" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}onErrorParticipantType" minOccurs="0"/>
 *         &lt;element name="notification" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}notificationType" minOccurs="0"/>
 *         &lt;element name="reviewer" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}reviewerType" minOccurs="0"/>
 *         &lt;element name="forwardingRules" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}forwardingRulesType" minOccurs="0"/>
 *         &lt;element name="systemParameters" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}systemParametersType" minOccurs="0"/>
 *         &lt;element name="restrictedAssignmentCallback" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}restrictedAssignmentCallbackType" minOccurs="0"/>
 *         &lt;element name="excludedParticipants" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}excludedParticipantsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numberOfTimesModified" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="taskId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="systemAttributeCurrentAssignmentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="releaseVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "globalConfiguration",
    "assignmentService",
    "participants",
    "onErrorParticipant",
    "notification",
    "reviewer",
    "forwardingRules",
    "systemParameters",
    "restrictedAssignmentCallback",
    "excludedParticipants"
})
@XmlRootElement(name = "routingSlip")
public class RoutingSlip {

    protected GlobalConfigurationType globalConfiguration;
    protected AssignmentServiceType assignmentService;
    protected ParticipantsType participants;
    protected OnErrorParticipantType onErrorParticipant;
    protected NotificationType notification;
    protected ReviewerType reviewer;
    protected ForwardingRulesType forwardingRules;
    protected SystemParametersType systemParameters;
    protected RestrictedAssignmentCallbackType restrictedAssignmentCallback;
    protected ExcludedParticipantsType excludedParticipants;
    @XmlAttribute
    protected String targetNamespace;
    @XmlAttribute
    protected BigInteger numberOfTimesModified;
    @XmlAttribute
    protected String taskId;
    @XmlAttribute
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemAttributeCurrentAssignmentTime;
    @XmlAttribute
    protected String releaseVersion;

    /**
     * Gets the value of the globalConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalConfigurationType }
     *     
     */
    public GlobalConfigurationType getGlobalConfiguration() {
        return globalConfiguration;
    }

    /**
     * Sets the value of the globalConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalConfigurationType }
     *     
     */
    public void setGlobalConfiguration(GlobalConfigurationType value) {
        this.globalConfiguration = value;
    }

    /**
     * Gets the value of the assignmentService property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentServiceType }
     *     
     */
    public AssignmentServiceType getAssignmentService() {
        return assignmentService;
    }

    /**
     * Sets the value of the assignmentService property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentServiceType }
     *     
     */
    public void setAssignmentService(AssignmentServiceType value) {
        this.assignmentService = value;
    }

    /**
     * Gets the value of the participants property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantsType }
     *     
     */
    public ParticipantsType getParticipants() {
        return participants;
    }

    /**
     * Sets the value of the participants property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantsType }
     *     
     */
    public void setParticipants(ParticipantsType value) {
        this.participants = value;
    }

    /**
     * Gets the value of the onErrorParticipant property.
     * 
     * @return
     *     possible object is
     *     {@link OnErrorParticipantType }
     *     
     */
    public OnErrorParticipantType getOnErrorParticipant() {
        return onErrorParticipant;
    }

    /**
     * Sets the value of the onErrorParticipant property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnErrorParticipantType }
     *     
     */
    public void setOnErrorParticipant(OnErrorParticipantType value) {
        this.onErrorParticipant = value;
    }

    /**
     * Gets the value of the notification property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationType }
     *     
     */
    public NotificationType getNotification() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationType }
     *     
     */
    public void setNotification(NotificationType value) {
        this.notification = value;
    }

    /**
     * Gets the value of the reviewer property.
     * 
     * @return
     *     possible object is
     *     {@link ReviewerType }
     *     
     */
    public ReviewerType getReviewer() {
        return reviewer;
    }

    /**
     * Sets the value of the reviewer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewerType }
     *     
     */
    public void setReviewer(ReviewerType value) {
        this.reviewer = value;
    }

    /**
     * Gets the value of the forwardingRules property.
     * 
     * @return
     *     possible object is
     *     {@link ForwardingRulesType }
     *     
     */
    public ForwardingRulesType getForwardingRules() {
        return forwardingRules;
    }

    /**
     * Sets the value of the forwardingRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForwardingRulesType }
     *     
     */
    public void setForwardingRules(ForwardingRulesType value) {
        this.forwardingRules = value;
    }

    /**
     * Gets the value of the systemParameters property.
     * 
     * @return
     *     possible object is
     *     {@link SystemParametersType }
     *     
     */
    public SystemParametersType getSystemParameters() {
        return systemParameters;
    }

    /**
     * Sets the value of the systemParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemParametersType }
     *     
     */
    public void setSystemParameters(SystemParametersType value) {
        this.systemParameters = value;
    }

    /**
     * Gets the value of the restrictedAssignmentCallback property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedAssignmentCallbackType }
     *     
     */
    public RestrictedAssignmentCallbackType getRestrictedAssignmentCallback() {
        return restrictedAssignmentCallback;
    }

    /**
     * Sets the value of the restrictedAssignmentCallback property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedAssignmentCallbackType }
     *     
     */
    public void setRestrictedAssignmentCallback(RestrictedAssignmentCallbackType value) {
        this.restrictedAssignmentCallback = value;
    }

    /**
     * Gets the value of the excludedParticipants property.
     * 
     * @return
     *     possible object is
     *     {@link ExcludedParticipantsType }
     *     
     */
    public ExcludedParticipantsType getExcludedParticipants() {
        return excludedParticipants;
    }

    /**
     * Sets the value of the excludedParticipants property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcludedParticipantsType }
     *     
     */
    public void setExcludedParticipants(ExcludedParticipantsType value) {
        this.excludedParticipants = value;
    }

    /**
     * Gets the value of the targetNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetNamespace() {
        return targetNamespace;
    }

    /**
     * Sets the value of the targetNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetNamespace(String value) {
        this.targetNamespace = value;
    }

    /**
     * Gets the value of the numberOfTimesModified property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfTimesModified() {
        return numberOfTimesModified;
    }

    /**
     * Sets the value of the numberOfTimesModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfTimesModified(BigInteger value) {
        this.numberOfTimesModified = value;
    }

    /**
     * Gets the value of the taskId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskId(String value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the systemAttributeCurrentAssignmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSystemAttributeCurrentAssignmentTime() {
        return systemAttributeCurrentAssignmentTime;
    }

    /**
     * Sets the value of the systemAttributeCurrentAssignmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSystemAttributeCurrentAssignmentTime(XMLGregorianCalendar value) {
        this.systemAttributeCurrentAssignmentTime = value;
    }

    /**
     * Gets the value of the releaseVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseVersion() {
        return releaseVersion;
    }

    /**
     * Sets the value of the releaseVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseVersion(String value) {
        this.releaseVersion = value;
    }

}
