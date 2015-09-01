
package oracle.bpel.services.workflow.metadata.routingslip.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for globalConfigurationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="globalConfigurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identityContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskOwner" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}resourceType" minOccurs="0"/>
 *         &lt;element name="expirationDuration" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}expirationDurationType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="escalationPolicy" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}escalationPolicyType"/>
 *           &lt;element name="renewalPolicy" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}renewalPolicyType"/>
 *         &lt;/choice>
 *         &lt;element name="earlyCompletion" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}earlyCompletionType" minOccurs="0"/>
 *         &lt;element name="onTaskAssignedCallback" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}callbackType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onTaskCompletedCallback" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}callbackType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onTaskUpdatedCallback" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}callbackType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onSubTaskUpdatedCallback" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}callbackType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onStageCompleteCallback" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}callbackType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="overrideNotificationPropertyFunction" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}callbackType" minOccurs="0"/>
 *         &lt;element name="escalationFunction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dueDateDuration" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}dueDateDurationType" minOccurs="0"/>
 *         &lt;element name="aggregation" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}aggregationType" minOccurs="0"/>
 *         &lt;element name="escalationParameter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sharePayloadConfiguration" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}sharePayloadConfigurationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "globalConfigurationType", propOrder = {
    "identityContext",
    "applicationContext",
    "owner",
    "taskOwner",
    "expirationDuration",
    "escalationPolicy",
    "renewalPolicy",
    "earlyCompletion",
    "onTaskAssignedCallback",
    "onTaskCompletedCallback",
    "onTaskUpdatedCallback",
    "onSubTaskUpdatedCallback",
    "onStageCompleteCallback",
    "overrideNotificationPropertyFunction",
    "escalationFunction",
    "dueDateDuration",
    "aggregation",
    "escalationParameter",
    "sharePayloadConfiguration"
})
public class GlobalConfigurationType {

    protected String identityContext;
    protected String applicationContext;
    protected String owner;
    protected ResourceType taskOwner;
    protected ExpirationDurationType expirationDuration;
    protected EscalationPolicyType escalationPolicy;
    protected RenewalPolicyType renewalPolicy;
    protected EarlyCompletionType earlyCompletion;
    protected List<CallbackType> onTaskAssignedCallback;
    protected List<CallbackType> onTaskCompletedCallback;
    protected List<CallbackType> onTaskUpdatedCallback;
    protected List<CallbackType> onSubTaskUpdatedCallback;
    protected List<CallbackType> onStageCompleteCallback;
    protected CallbackType overrideNotificationPropertyFunction;
    protected String escalationFunction;
    protected DueDateDurationType dueDateDuration;
    protected AggregationType aggregation;
    protected String escalationParameter;
    protected SharePayloadConfigurationType sharePayloadConfiguration;

    /**
     * Gets the value of the identityContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityContext() {
        return identityContext;
    }

    /**
     * Sets the value of the identityContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityContext(String value) {
        this.identityContext = value;
    }

    /**
     * Gets the value of the applicationContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationContext() {
        return applicationContext;
    }

    /**
     * Sets the value of the applicationContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationContext(String value) {
        this.applicationContext = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the taskOwner property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceType }
     *     
     */
    public ResourceType getTaskOwner() {
        return taskOwner;
    }

    /**
     * Sets the value of the taskOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceType }
     *     
     */
    public void setTaskOwner(ResourceType value) {
        this.taskOwner = value;
    }

    /**
     * Gets the value of the expirationDuration property.
     * 
     * @return
     *     possible object is
     *     {@link ExpirationDurationType }
     *     
     */
    public ExpirationDurationType getExpirationDuration() {
        return expirationDuration;
    }

    /**
     * Sets the value of the expirationDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpirationDurationType }
     *     
     */
    public void setExpirationDuration(ExpirationDurationType value) {
        this.expirationDuration = value;
    }

    /**
     * Gets the value of the escalationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link EscalationPolicyType }
     *     
     */
    public EscalationPolicyType getEscalationPolicy() {
        return escalationPolicy;
    }

    /**
     * Sets the value of the escalationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscalationPolicyType }
     *     
     */
    public void setEscalationPolicy(EscalationPolicyType value) {
        this.escalationPolicy = value;
    }

    /**
     * Gets the value of the renewalPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link RenewalPolicyType }
     *     
     */
    public RenewalPolicyType getRenewalPolicy() {
        return renewalPolicy;
    }

    /**
     * Sets the value of the renewalPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenewalPolicyType }
     *     
     */
    public void setRenewalPolicy(RenewalPolicyType value) {
        this.renewalPolicy = value;
    }

    /**
     * Gets the value of the earlyCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link EarlyCompletionType }
     *     
     */
    public EarlyCompletionType getEarlyCompletion() {
        return earlyCompletion;
    }

    /**
     * Sets the value of the earlyCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EarlyCompletionType }
     *     
     */
    public void setEarlyCompletion(EarlyCompletionType value) {
        this.earlyCompletion = value;
    }

    /**
     * Gets the value of the onTaskAssignedCallback property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onTaskAssignedCallback property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnTaskAssignedCallback().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallbackType }
     * 
     * 
     */
    public List<CallbackType> getOnTaskAssignedCallback() {
        if (onTaskAssignedCallback == null) {
            onTaskAssignedCallback = new ArrayList<CallbackType>();
        }
        return this.onTaskAssignedCallback;
    }

    /**
     * Gets the value of the onTaskCompletedCallback property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onTaskCompletedCallback property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnTaskCompletedCallback().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallbackType }
     * 
     * 
     */
    public List<CallbackType> getOnTaskCompletedCallback() {
        if (onTaskCompletedCallback == null) {
            onTaskCompletedCallback = new ArrayList<CallbackType>();
        }
        return this.onTaskCompletedCallback;
    }

    /**
     * Gets the value of the onTaskUpdatedCallback property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onTaskUpdatedCallback property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnTaskUpdatedCallback().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallbackType }
     * 
     * 
     */
    public List<CallbackType> getOnTaskUpdatedCallback() {
        if (onTaskUpdatedCallback == null) {
            onTaskUpdatedCallback = new ArrayList<CallbackType>();
        }
        return this.onTaskUpdatedCallback;
    }

    /**
     * Gets the value of the onSubTaskUpdatedCallback property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onSubTaskUpdatedCallback property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnSubTaskUpdatedCallback().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallbackType }
     * 
     * 
     */
    public List<CallbackType> getOnSubTaskUpdatedCallback() {
        if (onSubTaskUpdatedCallback == null) {
            onSubTaskUpdatedCallback = new ArrayList<CallbackType>();
        }
        return this.onSubTaskUpdatedCallback;
    }

    /**
     * Gets the value of the onStageCompleteCallback property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onStageCompleteCallback property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnStageCompleteCallback().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallbackType }
     * 
     * 
     */
    public List<CallbackType> getOnStageCompleteCallback() {
        if (onStageCompleteCallback == null) {
            onStageCompleteCallback = new ArrayList<CallbackType>();
        }
        return this.onStageCompleteCallback;
    }

    /**
     * Gets the value of the overrideNotificationPropertyFunction property.
     * 
     * @return
     *     possible object is
     *     {@link CallbackType }
     *     
     */
    public CallbackType getOverrideNotificationPropertyFunction() {
        return overrideNotificationPropertyFunction;
    }

    /**
     * Sets the value of the overrideNotificationPropertyFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallbackType }
     *     
     */
    public void setOverrideNotificationPropertyFunction(CallbackType value) {
        this.overrideNotificationPropertyFunction = value;
    }

    /**
     * Gets the value of the escalationFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscalationFunction() {
        return escalationFunction;
    }

    /**
     * Sets the value of the escalationFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscalationFunction(String value) {
        this.escalationFunction = value;
    }

    /**
     * Gets the value of the dueDateDuration property.
     * 
     * @return
     *     possible object is
     *     {@link DueDateDurationType }
     *     
     */
    public DueDateDurationType getDueDateDuration() {
        return dueDateDuration;
    }

    /**
     * Sets the value of the dueDateDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DueDateDurationType }
     *     
     */
    public void setDueDateDuration(DueDateDurationType value) {
        this.dueDateDuration = value;
    }

    /**
     * Gets the value of the aggregation property.
     * 
     * @return
     *     possible object is
     *     {@link AggregationType }
     *     
     */
    public AggregationType getAggregation() {
        return aggregation;
    }

    /**
     * Sets the value of the aggregation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationType }
     *     
     */
    public void setAggregation(AggregationType value) {
        this.aggregation = value;
    }

    /**
     * Gets the value of the escalationParameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscalationParameter() {
        return escalationParameter;
    }

    /**
     * Sets the value of the escalationParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscalationParameter(String value) {
        this.escalationParameter = value;
    }

    /**
     * Gets the value of the sharePayloadConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link SharePayloadConfigurationType }
     *     
     */
    public SharePayloadConfigurationType getSharePayloadConfiguration() {
        return sharePayloadConfiguration;
    }

    /**
     * Sets the value of the sharePayloadConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharePayloadConfigurationType }
     *     
     */
    public void setSharePayloadConfiguration(SharePayloadConfigurationType value) {
        this.sharePayloadConfiguration = value;
    }

}
