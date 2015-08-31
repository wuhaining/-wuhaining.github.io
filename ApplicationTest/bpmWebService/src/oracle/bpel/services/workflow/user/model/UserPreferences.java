
package oracle.bpel.services.workflow.user.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userPreference" type="{http://xmlns.oracle.com/bpel/workflow/userMetadata}userPreferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userPreference"
})
@XmlRootElement(name = "userPreferences")
public class UserPreferences {

    protected List<UserPreferenceType> userPreference;

    /**
     * Gets the value of the userPreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userPreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserPreferenceType }
     * 
     * 
     */
    public List<UserPreferenceType> getUserPreference() {
        if (userPreference == null) {
            userPreference = new ArrayList<UserPreferenceType>();
        }
        return this.userPreference;
    }

}
