
package com.task.services.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oracle.bpel.services.workflow.task.model.Task;


/**
 * <p>Java class for stageCompleteMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stageCompleteMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="completedStageName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="completedStageOutcome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/task}task"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stageCompleteMessageType", propOrder = {
    "completedStageName",
    "completedStageOutcome",
    "task"
})
public class StageCompleteMessageType {

    @XmlElement(required = true)
    protected String completedStageName;
    @XmlElement(required = true)
    protected String completedStageOutcome;
    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/task", required = true)
    protected Task task;

    /**
     * Gets the value of the completedStageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletedStageName() {
        return completedStageName;
    }

    /**
     * Sets the value of the completedStageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletedStageName(String value) {
        this.completedStageName = value;
    }

    /**
     * Gets the value of the completedStageOutcome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletedStageOutcome() {
        return completedStageOutcome;
    }

    /**
     * Sets the value of the completedStageOutcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletedStageOutcome(String value) {
        this.completedStageOutcome = value;
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

}
