
package oracle.bpel.services.workflow.query.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import oracle.bpel.services.workflow.common.model.WorkflowContextType;


/**
 * <p>Java class for contextAndPredicateQueryRequestBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contextAndPredicateQueryRequestBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/common}workflowContext" minOccurs="0"/>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/taskQuery}taskPredicateQuery"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contextAndPredicateQueryRequestBaseType", propOrder = {
    "workflowContext",
    "taskPredicateQuery"
})
@XmlSeeAlso({
    TaskListRequestType.class
})
public class ContextAndPredicateQueryRequestBaseType {

    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/common")
    protected WorkflowContextType workflowContext;
    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/taskQuery", required = true)
    protected TaskPredicateQueryType taskPredicateQuery;

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
     * Gets the value of the taskPredicateQuery property.
     * 
     * @return
     *     possible object is
     *     {@link TaskPredicateQueryType }
     *     
     */
    public TaskPredicateQueryType getTaskPredicateQuery() {
        return taskPredicateQuery;
    }

    /**
     * Sets the value of the taskPredicateQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskPredicateQueryType }
     *     
     */
    public void setTaskPredicateQuery(TaskPredicateQueryType value) {
        this.taskPredicateQuery = value;
    }

}
