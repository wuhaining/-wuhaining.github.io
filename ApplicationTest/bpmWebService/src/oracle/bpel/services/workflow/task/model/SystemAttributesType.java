
package oracle.bpel.services.workflow.task.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for systemAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemAttributesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acquiredBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approvalDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="approvers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assignedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="assigneeGroups" type="{http://xmlns.oracle.com/bpel/workflow/task}identityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="assigneeUsers" type="{http://xmlns.oracle.com/bpel/workflow/task}identityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customActions" type="{http://xmlns.oracle.com/bpel/workflow/task}actionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="digitalSignatureRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="displayInfo" type="{http://xmlns.oracle.com/bpel/workflow/task}displayInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="elapsedTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expirationDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="fromUser" type="{http://xmlns.oracle.com/bpel/workflow/task}identityType" minOccurs="0"/>
 *         &lt;element name="hasSubTasks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="inShortHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isGroup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailStatus" type="{http://xmlns.oracle.com/bpel/workflow/task}mailStatusEnum" minOccurs="0"/>
 *         &lt;element name="numberOfTimesModified" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="originalAssigneeUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outcome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parallelOutcomeCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passwordRequiredOnUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pushbackSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secureNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="shortHistory" type="{http://xmlns.oracle.com/bpel/workflow/task}shortHistoryType" minOccurs="0"/>
 *         &lt;element name="state" type="{http://xmlns.oracle.com/bpel/workflow/task}stateEnum" minOccurs="0"/>
 *         &lt;element name="substate" type="{http://xmlns.oracle.com/bpel/workflow/task}substateEnum" minOccurs="0"/>
 *         &lt;element name="systemActions" type="{http://xmlns.oracle.com/bpel/workflow/task}actionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="systemString1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemString2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemString3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="updatedBy" type="{http://xmlns.oracle.com/bpel/workflow/task}identityType" minOccurs="0"/>
 *         &lt;element name="updatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="versionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskDefinitionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskDefinitionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workflowPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isTestTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="participantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="readByUsers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reviewers" type="{http://xmlns.oracle.com/bpel/workflow/task}identityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="assignees" type="{http://xmlns.oracle.com/bpel/workflow/task}identityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="taskGroupInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subTaskGroupInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentTaskVersion" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="agRootId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="agMileStonePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rootTaskId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentTaskId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemStringActions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="restrictedActions" type="{http://xmlns.oracle.com/bpel/workflow/task}actionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="updatedNotificationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assignmentContext" type="{http://xmlns.oracle.com/bpel/workflow/task}assignmentContextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/task}collectionTarget" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="preActionUserSteps" type="{http://xmlns.oracle.com/bpel/workflow/task}preActionUserStepsType" minOccurs="0"/>
 *         &lt;element name="aggregationTaskId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isTemplateTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="taskViewContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskNamespace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="componentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="thread" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="parentThread" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="step" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="visibilityRuleConditionValues" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isPartialTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="organizationalUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tenantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listBuilderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organizationalUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="swimlaneRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="excludedParticipants" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timersSuspended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tenantIdNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isDecomposedTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="formName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decomposedTaskGroupInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acquiredByDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalAssigneeUserDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approversDisplayNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemAttributesType", propOrder = {
    "accessKey",
    "acquiredBy",
    "approvalDuration",
    "approvers",
    "assignedDate",
    "assigneeGroups",
    "assigneeUsers",
    "createdDate",
    "customActions",
    "digitalSignatureRequired",
    "displayInfo",
    "elapsedTime",
    "endDate",
    "expirationDate",
    "expirationDuration",
    "fromUser",
    "hasSubTasks",
    "inShortHistory",
    "isGroup",
    "language",
    "mailStatus",
    "numberOfTimesModified",
    "originalAssigneeUser",
    "outcome",
    "parallelOutcomeCount",
    "passwordRequiredOnUpdate",
    "pushbackSequence",
    "secureNotifications",
    "shortHistory",
    "state",
    "substate",
    "systemActions",
    "systemString1",
    "systemString2",
    "systemString3",
    "taskGroupId",
    "taskId",
    "taskNumber",
    "updatedBy",
    "updatedDate",
    "version",
    "versionReason",
    "taskDefinitionId",
    "taskDefinitionName",
    "workflowPattern",
    "isTestTask",
    "participantName",
    "readByUsers",
    "reviewers",
    "assignees",
    "taskGroupInstanceId",
    "subTaskGroupInstanceId",
    "parentTaskVersion",
    "agRootId",
    "agMileStonePath",
    "rootTaskId",
    "parentTaskId",
    "systemStringActions",
    "restrictedActions",
    "updatedNotificationId",
    "stage",
    "assignmentContext",
    "collectionTarget",
    "preActionUserSteps",
    "aggregationTaskId",
    "isTemplateTask",
    "taskViewContext",
    "taskNamespace",
    "actionDisplayName",
    "timers",
    "componentType",
    "activityName",
    "activityId",
    "processDueDate",
    "thread",
    "parentThread",
    "step",
    "visibilityRuleConditionValues",
    "isPartialTask",
    "organizationalUnitId",
    "tenantId",
    "listBuilderId",
    "caseId",
    "organizationalUnitName",
    "swimlaneRole",
    "excludedParticipants",
    "timersSuspended",
    "tenantIdNumber",
    "isDecomposedTask",
    "formName",
    "decomposedTaskGroupInstanceId",
    "acquiredByDisplayName",
    "originalAssigneeUserDisplayName",
    "approversDisplayNames"
})
public class SystemAttributesType {

    protected String accessKey;
    protected String acquiredBy;
    protected Long approvalDuration;
    protected String approvers;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assignedDate;
    protected List<IdentityType> assigneeGroups;
    protected List<IdentityType> assigneeUsers;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected List<ActionType> customActions;
    protected Boolean digitalSignatureRequired;
    protected List<DisplayInfoType> displayInfo;
    protected Long elapsedTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    protected Duration expirationDuration;
    protected IdentityType fromUser;
    protected Boolean hasSubTasks;
    protected Boolean inShortHistory;
    protected Boolean isGroup;
    protected String language;
    protected MailStatusEnum mailStatus;
    protected BigInteger numberOfTimesModified;
    protected String originalAssigneeUser;
    protected String outcome;
    protected String parallelOutcomeCount;
    protected Boolean passwordRequiredOnUpdate;
    protected String pushbackSequence;
    protected Boolean secureNotifications;
    protected ShortHistoryType shortHistory;
    protected StateEnum state;
    protected SubstateEnum substate;
    protected List<ActionType> systemActions;
    protected String systemString1;
    protected String systemString2;
    protected String systemString3;
    protected String taskGroupId;
    protected String taskId;
    protected BigInteger taskNumber;
    protected IdentityType updatedBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;
    protected BigInteger version;
    protected String versionReason;
    protected String taskDefinitionId;
    protected String taskDefinitionName;
    protected String workflowPattern;
    protected Boolean isTestTask;
    protected String participantName;
    protected String readByUsers;
    protected List<IdentityType> reviewers;
    protected List<IdentityType> assignees;
    protected String taskGroupInstanceId;
    protected String subTaskGroupInstanceId;
    protected BigInteger parentTaskVersion;
    protected Long agRootId;
    protected String agMileStonePath;
    protected String rootTaskId;
    protected String parentTaskId;
    protected String systemStringActions;
    protected List<ActionType> restrictedActions;
    protected String updatedNotificationId;
    protected String stage;
    protected List<AssignmentContextType> assignmentContext;
    protected List<CollectionTargetType> collectionTarget;
    protected PreActionUserStepsType preActionUserSteps;
    protected String aggregationTaskId;
    protected Boolean isTemplateTask;
    protected String taskViewContext;
    protected String taskNamespace;
    protected String actionDisplayName;
    protected String timers;
    protected String componentType;
    protected String activityName;
    protected String activityId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar processDueDate;
    protected BigInteger thread;
    protected BigInteger parentThread;
    protected BigInteger step;
    protected String visibilityRuleConditionValues;
    protected Boolean isPartialTask;
    protected String organizationalUnitId;
    protected String tenantId;
    protected String listBuilderId;
    protected String caseId;
    protected String organizationalUnitName;
    protected String swimlaneRole;
    protected String excludedParticipants;
    @XmlElement(defaultValue = "false")
    protected Boolean timersSuspended;
    @XmlElement(defaultValue = "-1")
    protected Long tenantIdNumber;
    @XmlElement(defaultValue = "false")
    protected Boolean isDecomposedTask;
    protected String formName;
    protected String decomposedTaskGroupInstanceId;
    protected String acquiredByDisplayName;
    protected String originalAssigneeUserDisplayName;
    protected String approversDisplayNames;

    /**
     * Gets the value of the accessKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessKey() {
        return accessKey;
    }

    /**
     * Sets the value of the accessKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessKey(String value) {
        this.accessKey = value;
    }

    /**
     * Gets the value of the acquiredBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquiredBy() {
        return acquiredBy;
    }

    /**
     * Sets the value of the acquiredBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquiredBy(String value) {
        this.acquiredBy = value;
    }

    /**
     * Gets the value of the approvalDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApprovalDuration() {
        return approvalDuration;
    }

    /**
     * Sets the value of the approvalDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApprovalDuration(Long value) {
        this.approvalDuration = value;
    }

    /**
     * Gets the value of the approvers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovers() {
        return approvers;
    }

    /**
     * Sets the value of the approvers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovers(String value) {
        this.approvers = value;
    }

    /**
     * Gets the value of the assignedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssignedDate() {
        return assignedDate;
    }

    /**
     * Sets the value of the assignedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssignedDate(XMLGregorianCalendar value) {
        this.assignedDate = value;
    }

    /**
     * Gets the value of the assigneeGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assigneeGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssigneeGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityType }
     * 
     * 
     */
    public List<IdentityType> getAssigneeGroups() {
        if (assigneeGroups == null) {
            assigneeGroups = new ArrayList<IdentityType>();
        }
        return this.assigneeGroups;
    }

    /**
     * Gets the value of the assigneeUsers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assigneeUsers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssigneeUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityType }
     * 
     * 
     */
    public List<IdentityType> getAssigneeUsers() {
        if (assigneeUsers == null) {
            assigneeUsers = new ArrayList<IdentityType>();
        }
        return this.assigneeUsers;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the customActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionType }
     * 
     * 
     */
    public List<ActionType> getCustomActions() {
        if (customActions == null) {
            customActions = new ArrayList<ActionType>();
        }
        return this.customActions;
    }

    /**
     * Gets the value of the digitalSignatureRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDigitalSignatureRequired() {
        return digitalSignatureRequired;
    }

    /**
     * Sets the value of the digitalSignatureRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDigitalSignatureRequired(Boolean value) {
        this.digitalSignatureRequired = value;
    }

    /**
     * Gets the value of the displayInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayInfoType }
     * 
     * 
     */
    public List<DisplayInfoType> getDisplayInfo() {
        if (displayInfo == null) {
            displayInfo = new ArrayList<DisplayInfoType>();
        }
        return this.displayInfo;
    }

    /**
     * Gets the value of the elapsedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getElapsedTime() {
        return elapsedTime;
    }

    /**
     * Sets the value of the elapsedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setElapsedTime(Long value) {
        this.elapsedTime = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the expirationDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExpirationDuration() {
        return expirationDuration;
    }

    /**
     * Sets the value of the expirationDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExpirationDuration(Duration value) {
        this.expirationDuration = value;
    }

    /**
     * Gets the value of the fromUser property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityType }
     *     
     */
    public IdentityType getFromUser() {
        return fromUser;
    }

    /**
     * Sets the value of the fromUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityType }
     *     
     */
    public void setFromUser(IdentityType value) {
        this.fromUser = value;
    }

    /**
     * Gets the value of the hasSubTasks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasSubTasks() {
        return hasSubTasks;
    }

    /**
     * Sets the value of the hasSubTasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasSubTasks(Boolean value) {
        this.hasSubTasks = value;
    }

    /**
     * Gets the value of the inShortHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInShortHistory() {
        return inShortHistory;
    }

    /**
     * Sets the value of the inShortHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInShortHistory(Boolean value) {
        this.inShortHistory = value;
    }

    /**
     * Gets the value of the isGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGroup() {
        return isGroup;
    }

    /**
     * Sets the value of the isGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGroup(Boolean value) {
        this.isGroup = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the mailStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MailStatusEnum }
     *     
     */
    public MailStatusEnum getMailStatus() {
        return mailStatus;
    }

    /**
     * Sets the value of the mailStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailStatusEnum }
     *     
     */
    public void setMailStatus(MailStatusEnum value) {
        this.mailStatus = value;
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
     * Gets the value of the originalAssigneeUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalAssigneeUser() {
        return originalAssigneeUser;
    }

    /**
     * Sets the value of the originalAssigneeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalAssigneeUser(String value) {
        this.originalAssigneeUser = value;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutcome(String value) {
        this.outcome = value;
    }

    /**
     * Gets the value of the parallelOutcomeCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParallelOutcomeCount() {
        return parallelOutcomeCount;
    }

    /**
     * Sets the value of the parallelOutcomeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParallelOutcomeCount(String value) {
        this.parallelOutcomeCount = value;
    }

    /**
     * Gets the value of the passwordRequiredOnUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPasswordRequiredOnUpdate() {
        return passwordRequiredOnUpdate;
    }

    /**
     * Sets the value of the passwordRequiredOnUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPasswordRequiredOnUpdate(Boolean value) {
        this.passwordRequiredOnUpdate = value;
    }

    /**
     * Gets the value of the pushbackSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPushbackSequence() {
        return pushbackSequence;
    }

    /**
     * Sets the value of the pushbackSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPushbackSequence(String value) {
        this.pushbackSequence = value;
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
     * Gets the value of the shortHistory property.
     * 
     * @return
     *     possible object is
     *     {@link ShortHistoryType }
     *     
     */
    public ShortHistoryType getShortHistory() {
        return shortHistory;
    }

    /**
     * Sets the value of the shortHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortHistoryType }
     *     
     */
    public void setShortHistory(ShortHistoryType value) {
        this.shortHistory = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link StateEnum }
     *     
     */
    public StateEnum getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateEnum }
     *     
     */
    public void setState(StateEnum value) {
        this.state = value;
    }

    /**
     * Gets the value of the substate property.
     * 
     * @return
     *     possible object is
     *     {@link SubstateEnum }
     *     
     */
    public SubstateEnum getSubstate() {
        return substate;
    }

    /**
     * Sets the value of the substate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstateEnum }
     *     
     */
    public void setSubstate(SubstateEnum value) {
        this.substate = value;
    }

    /**
     * Gets the value of the systemActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionType }
     * 
     * 
     */
    public List<ActionType> getSystemActions() {
        if (systemActions == null) {
            systemActions = new ArrayList<ActionType>();
        }
        return this.systemActions;
    }

    /**
     * Gets the value of the systemString1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemString1() {
        return systemString1;
    }

    /**
     * Sets the value of the systemString1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemString1(String value) {
        this.systemString1 = value;
    }

    /**
     * Gets the value of the systemString2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemString2() {
        return systemString2;
    }

    /**
     * Sets the value of the systemString2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemString2(String value) {
        this.systemString2 = value;
    }

    /**
     * Gets the value of the systemString3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemString3() {
        return systemString3;
    }

    /**
     * Sets the value of the systemString3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemString3(String value) {
        this.systemString3 = value;
    }

    /**
     * Gets the value of the taskGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskGroupId() {
        return taskGroupId;
    }

    /**
     * Sets the value of the taskGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskGroupId(String value) {
        this.taskGroupId = value;
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
     * Gets the value of the taskNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaskNumber() {
        return taskNumber;
    }

    /**
     * Sets the value of the taskNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaskNumber(BigInteger value) {
        this.taskNumber = value;
    }

    /**
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityType }
     *     
     */
    public IdentityType getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityType }
     *     
     */
    public void setUpdatedBy(IdentityType value) {
        this.updatedBy = value;
    }

    /**
     * Gets the value of the updatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedDate(XMLGregorianCalendar value) {
        this.updatedDate = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

    /**
     * Gets the value of the versionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionReason() {
        return versionReason;
    }

    /**
     * Sets the value of the versionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionReason(String value) {
        this.versionReason = value;
    }

    /**
     * Gets the value of the taskDefinitionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskDefinitionId() {
        return taskDefinitionId;
    }

    /**
     * Sets the value of the taskDefinitionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskDefinitionId(String value) {
        this.taskDefinitionId = value;
    }

    /**
     * Gets the value of the taskDefinitionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskDefinitionName() {
        return taskDefinitionName;
    }

    /**
     * Sets the value of the taskDefinitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskDefinitionName(String value) {
        this.taskDefinitionName = value;
    }

    /**
     * Gets the value of the workflowPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowPattern() {
        return workflowPattern;
    }

    /**
     * Sets the value of the workflowPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowPattern(String value) {
        this.workflowPattern = value;
    }

    /**
     * Gets the value of the isTestTask property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTestTask() {
        return isTestTask;
    }

    /**
     * Sets the value of the isTestTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTestTask(Boolean value) {
        this.isTestTask = value;
    }

    /**
     * Gets the value of the participantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantName() {
        return participantName;
    }

    /**
     * Sets the value of the participantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantName(String value) {
        this.participantName = value;
    }

    /**
     * Gets the value of the readByUsers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadByUsers() {
        return readByUsers;
    }

    /**
     * Sets the value of the readByUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadByUsers(String value) {
        this.readByUsers = value;
    }

    /**
     * Gets the value of the reviewers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reviewers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReviewers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityType }
     * 
     * 
     */
    public List<IdentityType> getReviewers() {
        if (reviewers == null) {
            reviewers = new ArrayList<IdentityType>();
        }
        return this.reviewers;
    }

    /**
     * Gets the value of the assignees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityType }
     * 
     * 
     */
    public List<IdentityType> getAssignees() {
        if (assignees == null) {
            assignees = new ArrayList<IdentityType>();
        }
        return this.assignees;
    }

    /**
     * Gets the value of the taskGroupInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskGroupInstanceId() {
        return taskGroupInstanceId;
    }

    /**
     * Sets the value of the taskGroupInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskGroupInstanceId(String value) {
        this.taskGroupInstanceId = value;
    }

    /**
     * Gets the value of the subTaskGroupInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTaskGroupInstanceId() {
        return subTaskGroupInstanceId;
    }

    /**
     * Sets the value of the subTaskGroupInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTaskGroupInstanceId(String value) {
        this.subTaskGroupInstanceId = value;
    }

    /**
     * Gets the value of the parentTaskVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentTaskVersion() {
        return parentTaskVersion;
    }

    /**
     * Sets the value of the parentTaskVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentTaskVersion(BigInteger value) {
        this.parentTaskVersion = value;
    }

    /**
     * Gets the value of the agRootId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAgRootId() {
        return agRootId;
    }

    /**
     * Sets the value of the agRootId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAgRootId(Long value) {
        this.agRootId = value;
    }

    /**
     * Gets the value of the agMileStonePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgMileStonePath() {
        return agMileStonePath;
    }

    /**
     * Sets the value of the agMileStonePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgMileStonePath(String value) {
        this.agMileStonePath = value;
    }

    /**
     * Gets the value of the rootTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootTaskId() {
        return rootTaskId;
    }

    /**
     * Sets the value of the rootTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootTaskId(String value) {
        this.rootTaskId = value;
    }

    /**
     * Gets the value of the parentTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentTaskId() {
        return parentTaskId;
    }

    /**
     * Sets the value of the parentTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentTaskId(String value) {
        this.parentTaskId = value;
    }

    /**
     * Gets the value of the systemStringActions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemStringActions() {
        return systemStringActions;
    }

    /**
     * Sets the value of the systemStringActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemStringActions(String value) {
        this.systemStringActions = value;
    }

    /**
     * Gets the value of the restrictedActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictedActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictedActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionType }
     * 
     * 
     */
    public List<ActionType> getRestrictedActions() {
        if (restrictedActions == null) {
            restrictedActions = new ArrayList<ActionType>();
        }
        return this.restrictedActions;
    }

    /**
     * Gets the value of the updatedNotificationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedNotificationId() {
        return updatedNotificationId;
    }

    /**
     * Sets the value of the updatedNotificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedNotificationId(String value) {
        this.updatedNotificationId = value;
    }

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStage(String value) {
        this.stage = value;
    }

    /**
     * Gets the value of the assignmentContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignmentContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignmentContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssignmentContextType }
     * 
     * 
     */
    public List<AssignmentContextType> getAssignmentContext() {
        if (assignmentContext == null) {
            assignmentContext = new ArrayList<AssignmentContextType>();
        }
        return this.assignmentContext;
    }

    /**
     * Gets the value of the collectionTarget property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectionTarget property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectionTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectionTargetType }
     * 
     * 
     */
    public List<CollectionTargetType> getCollectionTarget() {
        if (collectionTarget == null) {
            collectionTarget = new ArrayList<CollectionTargetType>();
        }
        return this.collectionTarget;
    }

    /**
     * Gets the value of the preActionUserSteps property.
     * 
     * @return
     *     possible object is
     *     {@link PreActionUserStepsType }
     *     
     */
    public PreActionUserStepsType getPreActionUserSteps() {
        return preActionUserSteps;
    }

    /**
     * Sets the value of the preActionUserSteps property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreActionUserStepsType }
     *     
     */
    public void setPreActionUserSteps(PreActionUserStepsType value) {
        this.preActionUserSteps = value;
    }

    /**
     * Gets the value of the aggregationTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregationTaskId() {
        return aggregationTaskId;
    }

    /**
     * Sets the value of the aggregationTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregationTaskId(String value) {
        this.aggregationTaskId = value;
    }

    /**
     * Gets the value of the isTemplateTask property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTemplateTask() {
        return isTemplateTask;
    }

    /**
     * Sets the value of the isTemplateTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTemplateTask(Boolean value) {
        this.isTemplateTask = value;
    }

    /**
     * Gets the value of the taskViewContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskViewContext() {
        return taskViewContext;
    }

    /**
     * Sets the value of the taskViewContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskViewContext(String value) {
        this.taskViewContext = value;
    }

    /**
     * Gets the value of the taskNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskNamespace() {
        return taskNamespace;
    }

    /**
     * Sets the value of the taskNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskNamespace(String value) {
        this.taskNamespace = value;
    }

    /**
     * Gets the value of the actionDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionDisplayName() {
        return actionDisplayName;
    }

    /**
     * Sets the value of the actionDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionDisplayName(String value) {
        this.actionDisplayName = value;
    }

    /**
     * Gets the value of the timers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimers() {
        return timers;
    }

    /**
     * Sets the value of the timers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimers(String value) {
        this.timers = value;
    }

    /**
     * Gets the value of the componentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentType() {
        return componentType;
    }

    /**
     * Sets the value of the componentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentType(String value) {
        this.componentType = value;
    }

    /**
     * Gets the value of the activityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * Sets the value of the activityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityName(String value) {
        this.activityName = value;
    }

    /**
     * Gets the value of the activityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * Sets the value of the activityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityId(String value) {
        this.activityId = value;
    }

    /**
     * Gets the value of the processDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessDueDate() {
        return processDueDate;
    }

    /**
     * Sets the value of the processDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessDueDate(XMLGregorianCalendar value) {
        this.processDueDate = value;
    }

    /**
     * Gets the value of the thread property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getThread() {
        return thread;
    }

    /**
     * Sets the value of the thread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setThread(BigInteger value) {
        this.thread = value;
    }

    /**
     * Gets the value of the parentThread property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentThread() {
        return parentThread;
    }

    /**
     * Sets the value of the parentThread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentThread(BigInteger value) {
        this.parentThread = value;
    }

    /**
     * Gets the value of the step property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStep() {
        return step;
    }

    /**
     * Sets the value of the step property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStep(BigInteger value) {
        this.step = value;
    }

    /**
     * Gets the value of the visibilityRuleConditionValues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibilityRuleConditionValues() {
        return visibilityRuleConditionValues;
    }

    /**
     * Sets the value of the visibilityRuleConditionValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibilityRuleConditionValues(String value) {
        this.visibilityRuleConditionValues = value;
    }

    /**
     * Gets the value of the isPartialTask property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPartialTask() {
        return isPartialTask;
    }

    /**
     * Sets the value of the isPartialTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPartialTask(Boolean value) {
        this.isPartialTask = value;
    }

    /**
     * Gets the value of the organizationalUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationalUnitId() {
        return organizationalUnitId;
    }

    /**
     * Sets the value of the organizationalUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationalUnitId(String value) {
        this.organizationalUnitId = value;
    }

    /**
     * Gets the value of the tenantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * Sets the value of the tenantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenantId(String value) {
        this.tenantId = value;
    }

    /**
     * Gets the value of the listBuilderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListBuilderId() {
        return listBuilderId;
    }

    /**
     * Sets the value of the listBuilderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListBuilderId(String value) {
        this.listBuilderId = value;
    }

    /**
     * Gets the value of the caseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseId() {
        return caseId;
    }

    /**
     * Sets the value of the caseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseId(String value) {
        this.caseId = value;
    }

    /**
     * Gets the value of the organizationalUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationalUnitName() {
        return organizationalUnitName;
    }

    /**
     * Sets the value of the organizationalUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationalUnitName(String value) {
        this.organizationalUnitName = value;
    }

    /**
     * Gets the value of the swimlaneRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwimlaneRole() {
        return swimlaneRole;
    }

    /**
     * Sets the value of the swimlaneRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwimlaneRole(String value) {
        this.swimlaneRole = value;
    }

    /**
     * Gets the value of the excludedParticipants property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcludedParticipants() {
        return excludedParticipants;
    }

    /**
     * Sets the value of the excludedParticipants property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcludedParticipants(String value) {
        this.excludedParticipants = value;
    }

    /**
     * Gets the value of the timersSuspended property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimersSuspended() {
        return timersSuspended;
    }

    /**
     * Sets the value of the timersSuspended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimersSuspended(Boolean value) {
        this.timersSuspended = value;
    }

    /**
     * Gets the value of the tenantIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTenantIdNumber() {
        return tenantIdNumber;
    }

    /**
     * Sets the value of the tenantIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTenantIdNumber(Long value) {
        this.tenantIdNumber = value;
    }

    /**
     * Gets the value of the isDecomposedTask property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDecomposedTask() {
        return isDecomposedTask;
    }

    /**
     * Sets the value of the isDecomposedTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDecomposedTask(Boolean value) {
        this.isDecomposedTask = value;
    }

    /**
     * Gets the value of the formName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormName() {
        return formName;
    }

    /**
     * Sets the value of the formName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormName(String value) {
        this.formName = value;
    }

    /**
     * Gets the value of the decomposedTaskGroupInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecomposedTaskGroupInstanceId() {
        return decomposedTaskGroupInstanceId;
    }

    /**
     * Sets the value of the decomposedTaskGroupInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecomposedTaskGroupInstanceId(String value) {
        this.decomposedTaskGroupInstanceId = value;
    }

    /**
     * Gets the value of the acquiredByDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquiredByDisplayName() {
        return acquiredByDisplayName;
    }

    /**
     * Sets the value of the acquiredByDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquiredByDisplayName(String value) {
        this.acquiredByDisplayName = value;
    }

    /**
     * Gets the value of the originalAssigneeUserDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalAssigneeUserDisplayName() {
        return originalAssigneeUserDisplayName;
    }

    /**
     * Sets the value of the originalAssigneeUserDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalAssigneeUserDisplayName(String value) {
        this.originalAssigneeUserDisplayName = value;
    }

    /**
     * Gets the value of the approversDisplayNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproversDisplayNames() {
        return approversDisplayNames;
    }

    /**
     * Sets the value of the approversDisplayNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproversDisplayNames(String value) {
        this.approversDisplayNames = value;
    }

}
