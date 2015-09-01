
package com.task.services.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reevaluateTaskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reevaluateTaskType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpel/workflow/taskService}taskServiceContextTaskTaskIdBaseType">
 *       &lt;sequence>
 *         &lt;element name="taskAssignee" type="{http://xmlns.oracle.com/bpel/workflow/taskService}taskAssigneeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reevaluateTaskType", propOrder = {
    "taskAssignee"
})
public class ReevaluateTaskType
    extends TaskServiceContextTaskTaskIdBaseType
{

    @XmlElement(required = true)
    protected TaskAssigneeType taskAssignee;

    /**
     * Gets the value of the taskAssignee property.
     * 
     * @return
     *     possible object is
     *     {@link TaskAssigneeType }
     *     
     */
    public TaskAssigneeType getTaskAssignee() {
        return taskAssignee;
    }

    /**
     * Sets the value of the taskAssignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskAssigneeType }
     *     
     */
    public void setTaskAssignee(TaskAssigneeType value) {
        this.taskAssignee = value;
    }

}
