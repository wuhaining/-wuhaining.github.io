
package com.task.services.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oracle.bpel.services.workflow.common.model.WorkflowContextType;
import oracle.bpel.services.workflow.metadata.routingslip.model.RoutingSlip;
import oracle.bpel.services.workflow.task.model.DecomposeTaskInfoType;


/**
 * <p>Java class for decomposeTaskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="decomposeTaskType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/common}workflowContext" minOccurs="0"/>
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/routingSlip}routingSlip"/>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/task}decomposeTaskInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "decomposeTaskType", propOrder = {
    "workflowContext",
    "taskId",
    "routingSlip",
    "decomposeTaskInfo"
})
public class DecomposeTaskType {

    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/common")
    protected WorkflowContextType workflowContext;
    @XmlElement(required = true)
    protected String taskId;
    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/routingSlip", required = true)
    protected RoutingSlip routingSlip;
    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/task", required = true)
    protected DecomposeTaskInfoType decomposeTaskInfo;

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
     * Gets the value of the routingSlip property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingSlip }
     *     
     */
    public RoutingSlip getRoutingSlip() {
        return routingSlip;
    }

    /**
     * Sets the value of the routingSlip property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingSlip }
     *     
     */
    public void setRoutingSlip(RoutingSlip value) {
        this.routingSlip = value;
    }

    /**
     * Gets the value of the decomposeTaskInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DecomposeTaskInfoType }
     *     
     */
    public DecomposeTaskInfoType getDecomposeTaskInfo() {
        return decomposeTaskInfo;
    }

    /**
     * Sets the value of the decomposeTaskInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecomposeTaskInfoType }
     *     
     */
    public void setDecomposeTaskInfo(DecomposeTaskInfoType value) {
        this.decomposeTaskInfo = value;
    }

}
