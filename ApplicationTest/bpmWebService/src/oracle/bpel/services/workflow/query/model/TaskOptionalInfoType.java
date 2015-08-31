
package oracle.bpel.services.workflow.query.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskOptionalInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taskOptionalInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taskOptionalInfo" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}taskOptionalInfoEnum" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskOptionalInfoType", namespace = "http://xmlns.oracle.com/bpel/workflow/taskQuery", propOrder = {
    "taskOptionalInfo"
})
public class TaskOptionalInfoType {

    protected List<TaskOptionalInfoEnum> taskOptionalInfo;

    /**
     * Gets the value of the taskOptionalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskOptionalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskOptionalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskOptionalInfoEnum }
     * 
     * 
     */
    public List<TaskOptionalInfoEnum> getTaskOptionalInfo() {
        if (taskOptionalInfo == null) {
            taskOptionalInfo = new ArrayList<TaskOptionalInfoEnum>();
        }
        return this.taskOptionalInfo;
    }

}
