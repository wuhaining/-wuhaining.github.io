
package com.task.services.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for delegateTaskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delegateTaskType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpel/workflow/taskService}taskServiceContextTaskTaskIdBaseType">
 *       &lt;sequence>
 *         &lt;element name="taskAssignees" type="{http://xmlns.oracle.com/bpel/workflow/taskService}taskAssigneesType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delegateTaskType", propOrder = {
    "taskAssignees"
})
public class DelegateTaskType
    extends TaskServiceContextTaskTaskIdBaseType
{

    @XmlElement(required = true)
    protected TaskAssigneesType taskAssignees;

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

}
