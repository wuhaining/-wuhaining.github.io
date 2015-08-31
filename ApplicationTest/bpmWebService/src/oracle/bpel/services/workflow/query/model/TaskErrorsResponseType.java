
package oracle.bpel.services.workflow.query.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oracle.bpel.services.workflow.task.error.model.TaskError;


/**
 * <p>Java class for taskErrorsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taskErrorsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/taskError}taskError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskErrorsResponseType", propOrder = {
    "taskError"
})
public class TaskErrorsResponseType {

    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/taskError")
    protected List<TaskError> taskError;

    /**
     * Gets the value of the taskError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskError }
     * 
     * 
     */
    public List<TaskError> getTaskError() {
        if (taskError == null) {
            taskError = new ArrayList<TaskError>();
        }
        return this.taskError;
    }

}
