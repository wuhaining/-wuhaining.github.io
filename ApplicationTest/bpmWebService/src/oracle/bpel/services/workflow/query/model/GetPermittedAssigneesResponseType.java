
package oracle.bpel.services.workflow.query.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPermittedAssigneesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPermittedAssigneesResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="permittedAssignee" type="{http://xmlns.oracle.com/bpel/workflow/taskQueryService}taskAssigneeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="restricted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPermittedAssigneesResponseType", propOrder = {
    "permittedAssignee",
    "restricted"
})
public class GetPermittedAssigneesResponseType {

    protected List<TaskAssigneeType> permittedAssignee;
    @XmlElement(defaultValue = "false")
    protected boolean restricted;

    /**
     * Gets the value of the permittedAssignee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permittedAssignee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermittedAssignee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskAssigneeType }
     * 
     * 
     */
    public List<TaskAssigneeType> getPermittedAssignee() {
        if (permittedAssignee == null) {
            permittedAssignee = new ArrayList<TaskAssigneeType>();
        }
        return this.permittedAssignee;
    }

    /**
     * Gets the value of the restricted property.
     * 
     */
    public boolean isRestricted() {
        return restricted;
    }

    /**
     * Sets the value of the restricted property.
     * 
     */
    public void setRestricted(boolean value) {
        this.restricted = value;
    }

}
