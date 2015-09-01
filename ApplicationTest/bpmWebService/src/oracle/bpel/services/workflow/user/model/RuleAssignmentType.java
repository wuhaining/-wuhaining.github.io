
package oracle.bpel.services.workflow.user.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oracle.bpel.services.workflow.common.model.PrincipleRefType;


/**
 * <p>Java class for ruleAssignmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ruleAssignmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignee" type="{http://xmlns.oracle.com/bpel/workflow/common}principleRefType"/>
 *         &lt;element name="dynamicAssignmentFunction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ruleAssignmentType", propOrder = {
    "assignee",
    "dynamicAssignmentFunction"
})
public class RuleAssignmentType {

    @XmlElement(required = true)
    protected PrincipleRefType assignee;
    @XmlElement(required = true)
    protected String dynamicAssignmentFunction;

    /**
     * Gets the value of the assignee property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipleRefType }
     *     
     */
    public PrincipleRefType getAssignee() {
        return assignee;
    }

    /**
     * Sets the value of the assignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipleRefType }
     *     
     */
    public void setAssignee(PrincipleRefType value) {
        this.assignee = value;
    }

    /**
     * Gets the value of the dynamicAssignmentFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicAssignmentFunction() {
        return dynamicAssignmentFunction;
    }

    /**
     * Sets the value of the dynamicAssignmentFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicAssignmentFunction(String value) {
        this.dynamicAssignmentFunction = value;
    }

}
