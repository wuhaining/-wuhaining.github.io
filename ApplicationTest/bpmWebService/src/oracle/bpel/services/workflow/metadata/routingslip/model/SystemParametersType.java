
package oracle.bpel.services.workflow.metadata.routingslip.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oracle.bpel.services.workflow.task.model.CollectionTargetType;


/**
 * <p>Java class for systemParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameter" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}systemParameterType" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/task}collectionTarget"/>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/routingSlip}substitutionRules"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemParametersType", propOrder = {
    "parameter",
    "collectionTarget",
    "substitutionRules"
})
public class SystemParametersType {

    @XmlElement(required = true)
    protected List<SystemParameterType> parameter;
    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/task", required = true)
    protected CollectionTargetType collectionTarget;
    @XmlElement(required = true)
    protected SubstitutionRules substitutionRules;

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemParameterType }
     * 
     * 
     */
    public List<SystemParameterType> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<SystemParameterType>();
        }
        return this.parameter;
    }

    /**
     * Gets the value of the collectionTarget property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionTargetType }
     *     
     */
    public CollectionTargetType getCollectionTarget() {
        return collectionTarget;
    }

    /**
     * Sets the value of the collectionTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionTargetType }
     *     
     */
    public void setCollectionTarget(CollectionTargetType value) {
        this.collectionTarget = value;
    }

    /**
     * Gets the value of the substitutionRules property.
     * 
     * @return
     *     possible object is
     *     {@link SubstitutionRules }
     *     
     */
    public SubstitutionRules getSubstitutionRules() {
        return substitutionRules;
    }

    /**
     * Sets the value of the substitutionRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstitutionRules }
     *     
     */
    public void setSubstitutionRules(SubstitutionRules value) {
        this.substitutionRules = value;
    }

}
