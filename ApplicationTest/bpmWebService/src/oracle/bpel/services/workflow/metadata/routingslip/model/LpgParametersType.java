
package oracle.bpel.services.workflow.metadata.routingslip.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lpgParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lpgParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lpgParameter" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}lpgParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lpgParametersType", propOrder = {
    "lpgParameter"
})
public class LpgParametersType {

    protected List<LpgParameterType> lpgParameter;

    /**
     * Gets the value of the lpgParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lpgParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLpgParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LpgParameterType }
     * 
     * 
     */
    public List<LpgParameterType> getLpgParameter() {
        if (lpgParameter == null) {
            lpgParameter = new ArrayList<LpgParameterType>();
        }
        return this.lpgParameter;
    }

}
