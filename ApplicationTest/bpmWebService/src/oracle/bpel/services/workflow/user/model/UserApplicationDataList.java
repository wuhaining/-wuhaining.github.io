
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
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/userMetadata}userApplicationData" maxOccurs="unbounded" minOccurs="0"/>
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
    "userApplicationData"
})
@XmlRootElement(name = "userApplicationDataList")
public class UserApplicationDataList {

    protected List<UserApplicationDataType> userApplicationData;

    /**
     * Gets the value of the userApplicationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userApplicationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserApplicationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserApplicationDataType }
     * 
     * 
     */
    public List<UserApplicationDataType> getUserApplicationData() {
        if (userApplicationData == null) {
            userApplicationData = new ArrayList<UserApplicationDataType>();
        }
        return this.userApplicationData;
    }

}
