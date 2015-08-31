
package com.task.services.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createToDoTaskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createToDoTaskType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpel/workflow/taskService}taskServiceContextTaskBaseType">
 *       &lt;sequence>
 *         &lt;element name="taskAssignees" type="{http://xmlns.oracle.com/bpel/workflow/taskService}taskAssigneesType"/>
 *         &lt;element name="parentTaskId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createToDoTaskType", propOrder = {
    "taskAssignees",
    "parentTaskId"
})
public class CreateToDoTaskType
    extends TaskServiceContextTaskBaseType
{

    @XmlElement(required = true)
    protected TaskAssigneesType taskAssignees;
    protected String parentTaskId;

    /**
     * Gets the value of the taskAssignees property.
     * 
     * @return
     *     possible object is
     *     {@link TaskAssigneesType }
     *     
     */
    public TaskAssigneesType getTaskAssignees() {
        return taskAssignees;
    }

    /**
     * Sets the value of the taskAssignees property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskAssigneesType }
     *     
     */
    public void setTaskAssignees(TaskAssigneesType value) {
        this.taskAssignees = value;
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

}
