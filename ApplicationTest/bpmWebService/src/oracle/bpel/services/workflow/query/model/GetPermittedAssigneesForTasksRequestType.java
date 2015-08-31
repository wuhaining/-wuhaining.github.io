
package oracle.bpel.services.workflow.query.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oracle.bpel.services.workflow.common.model.WorkflowContextType;


/**
 * <p>Java class for getPermittedAssigneesForTasksRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPermittedAssigneesForTasksRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/common}workflowContext" minOccurs="0"/>
 *         &lt;element name="taskIds" type="{http://xmlns.oracle.com/bpel/workflow/taskQueryService}taskIdsType"/>
 *         &lt;element name="operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="participantType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filter" type="{http://xmlns.oracle.com/bpel/workflow/taskQueryService}FilterType" minOccurs="0"/>
 *         &lt;element name="appRoleNamePattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPermittedAssigneesForTasksRequestType", propOrder = {
    "workflowContext",
    "taskIds",
    "operation",
    "participantType",
    "filter",
    "appRoleNamePattern",
    "appId"
})
public class GetPermittedAssigneesForTasksRequestType {

    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/common")
    protected WorkflowContextType workflowContext;
    @XmlElement(required = true)
    protected TaskIdsType taskIds;
    @XmlElement(required = true)
    protected String operation;
    @XmlElement(required = true)
    protected String participantType;
    protected FilterType filter;
    protected String appRoleNamePattern;
    protected String appId;

    /**
     * Gets the value of the workflowContext property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowContextType }
     *     
     */
    public WorkflowContextType getWorkflowContext() {
        return workflowContext;
    }

    /**
     * Sets the value of the workflowContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowContextType }
     *     
     */
    public void setWorkflowContext(WorkflowContextType value) {
        this.workflowContext = value;
    }

    /**
     * Gets the value of the taskIds property.
     * 
     * @return
     *     possible object is
     *     {@link TaskIdsType }
     *     
     */
    public TaskIdsType getTaskIds() {
        return taskIds;
    }

    /**
     * Sets the value of the taskIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskIdsType }
     *     
     */
    public void setTaskIds(TaskIdsType value) {
        this.taskIds = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the participantType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantType() {
        return participantType;
    }

    /**
     * Sets the value of the participantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantType(String value) {
        this.participantType = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setFilter(FilterType value) {
        this.filter = value;
    }

    /**
     * Gets the value of the appRoleNamePattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppRoleNamePattern() {
        return appRoleNamePattern;
    }

    /**
     * Sets the value of the appRoleNamePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppRoleNamePattern(String value) {
        this.appRoleNamePattern = value;
    }

    /**
     * Gets the value of the appId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppId(String value) {
        this.appId = value;
    }

}
