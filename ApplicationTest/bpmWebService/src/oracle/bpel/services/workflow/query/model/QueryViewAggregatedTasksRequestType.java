
package oracle.bpel.services.workflow.query.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oracle.bpel.services.workflow.common.model.WorkflowContextType;


/**
 * <p>Java class for queryViewAggregatedTasksRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryViewAggregatedTasksRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/common}workflowContext" minOccurs="0"/>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/taskQuery}viewTaskAggregateQuery"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryViewAggregatedTasksRequestType", propOrder = {
    "workflowContext",
    "viewTaskAggregateQuery"
})
public class QueryViewAggregatedTasksRequestType {

    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/common")
    protected WorkflowContextType workflowContext;
    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/taskQuery", required = true)
    protected ViewTaskAggregateQueryType viewTaskAggregateQuery;

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
     * Gets the value of the viewTaskAggregateQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ViewTaskAggregateQueryType }
     *     
     */
    public ViewTaskAggregateQueryType getViewTaskAggregateQuery() {
        return viewTaskAggregateQuery;
    }

    /**
     * Sets the value of the viewTaskAggregateQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewTaskAggregateQueryType }
     *     
     */
    public void setViewTaskAggregateQuery(ViewTaskAggregateQueryType value) {
        this.viewTaskAggregateQuery = value;
    }

}
