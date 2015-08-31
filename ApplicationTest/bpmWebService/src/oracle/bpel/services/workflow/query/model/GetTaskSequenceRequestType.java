
package oracle.bpel.services.workflow.query.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oracle.bpel.services.workflow.common.model.WorkflowContextType;
import oracle.bpel.services.workflow.task.model.Task;


/**
 * <p>Java class for getTaskSequenceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTaskSequenceRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/common}workflowContext" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/task}task"/>
 *           &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="taskDisplayColumns" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}displayColumnType" minOccurs="0"/>
 *         &lt;element name="taskSequenceTypes" type="{http://xmlns.oracle.com/bpel/workflow/taskQueryService}taskSequenceTypesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="taskSequenceBuilderContext" type="{http://xmlns.oracle.com/bpel/workflow/taskQueryService}taskSequenceBuilderContextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fetchTaskSequenceForRootTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTaskSequenceRequestType", propOrder = {
    "workflowContext",
    "task",
    "taskId",
    "taskDisplayColumns",
    "taskSequenceTypes",
    "taskSequenceBuilderContext",
    "fetchTaskSequenceForRootTask"
})
public class GetTaskSequenceRequestType {

    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/common")
    protected WorkflowContextType workflowContext;
    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/task")
    protected Task task;
    protected String taskId;
    protected DisplayColumnType taskDisplayColumns;
    protected List<TaskSequenceTypesType> taskSequenceTypes;
    protected List<TaskSequenceBuilderContextType> taskSequenceBuilderContext;
    protected Boolean fetchTaskSequenceForRootTask;

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
     * Gets the value of the task property.
     * 
     * @return
     *     possible object is
     *     {@link Task }
     *     
     */
    public Task getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     * 
     * @param value
     *     allowed object is
     *     {@link Task }
     *     
     */
    public void setTask(Task value) {
        this.task = value;
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
     * Gets the value of the taskDisplayColumns property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayColumnType }
     *     
     */
    public DisplayColumnType getTaskDisplayColumns() {
        return taskDisplayColumns;
    }

    /**
     * Sets the value of the taskDisplayColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayColumnType }
     *     
     */
    public void setTaskDisplayColumns(DisplayColumnType value) {
        this.taskDisplayColumns = value;
    }

    /**
     * Gets the value of the taskSequenceTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskSequenceTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskSequenceTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskSequenceTypesType }
     * 
     * 
     */
    public List<TaskSequenceTypesType> getTaskSequenceTypes() {
        if (taskSequenceTypes == null) {
            taskSequenceTypes = new ArrayList<TaskSequenceTypesType>();
        }
        return this.taskSequenceTypes;
    }

    /**
     * Gets the value of the taskSequenceBuilderContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskSequenceBuilderContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskSequenceBuilderContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskSequenceBuilderContextType }
     * 
     * 
     */
    public List<TaskSequenceBuilderContextType> getTaskSequenceBuilderContext() {
        if (taskSequenceBuilderContext == null) {
            taskSequenceBuilderContext = new ArrayList<TaskSequenceBuilderContextType>();
        }
        return this.taskSequenceBuilderContext;
    }

    /**
     * Gets the value of the fetchTaskSequenceForRootTask property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchTaskSequenceForRootTask() {
        return fetchTaskSequenceForRootTask;
    }

    /**
     * Sets the value of the fetchTaskSequenceForRootTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchTaskSequenceForRootTask(Boolean value) {
        this.fetchTaskSequenceForRootTask = value;
    }

}
