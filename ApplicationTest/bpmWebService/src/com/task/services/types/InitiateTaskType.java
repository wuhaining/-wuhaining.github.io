
package com.task.services.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oracle.bpel.services.workflow.metadata.routingslip.model.RoutingSlip;
import oracle.bpel.services.workflow.task.model.Task;


/**
 * <p>Java class for initiateTaskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="initiateTaskType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/task}task"/>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/routingSlip}routingSlip" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "initiateTaskType", propOrder = {
    "task",
    "routingSlip"
})
public class InitiateTaskType {

    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/task", required = true)
    protected Task task;
    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/routingSlip")
    protected RoutingSlip routingSlip;

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

}
