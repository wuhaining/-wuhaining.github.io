
package oracle.bpel.services.workflow.metadata.routingslip.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignmentPatternType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignmentPatternType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="patternParameter" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}systemParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="patternName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isGlobalPattern" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignmentPatternType", propOrder = {
    "patternParameter"
})
public class AssignmentPatternType {

    protected List<SystemParameterType> patternParameter;
    @XmlAttribute(required = true)
    protected String patternName;
    @XmlAttribute
    protected Boolean isGlobalPattern;

    /**
     * Gets the value of the patternParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patternParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatternParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemParameterType }
     * 
     * 
     */
    public List<SystemParameterType> getPatternParameter() {
        if (patternParameter == null) {
            patternParameter = new ArrayList<SystemParameterType>();
        }
        return this.patternParameter;
    }

    /**
     * Gets the value of the patternName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternName() {
        return patternName;
    }

    /**
     * Sets the value of the patternName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternName(String value) {
        this.patternName = value;
    }

    /**
     * Gets the value of the isGlobalPattern property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsGlobalPattern() {
        if (isGlobalPattern == null) {
            return false;
        } else {
            return isGlobalPattern;
        }
    }

    /**
     * Sets the value of the isGlobalPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGlobalPattern(Boolean value) {
        this.isGlobalPattern = value;
    }

}
