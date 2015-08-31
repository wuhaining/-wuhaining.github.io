
package oracle.bpel.services.workflow.task.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignmentContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignmentContextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://xmlns.oracle.com/bpel/workflow/task}assignmentContextTypeValueType"/>
 *         &lt;element name="type" type="{http://xmlns.oracle.com/bpel/workflow/task}assignmentContextCreatorEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignmentContextType", propOrder = {
    "name",
    "value",
    "type"
})
public class AssignmentContextType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected AssignmentContextTypeValueType value;
    @XmlElement(required = true)
    protected AssignmentContextCreatorEnum type;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentContextTypeValueType }
     *     
     */
    public AssignmentContextTypeValueType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentContextTypeValueType }
     *     
     */
    public void setValue(AssignmentContextTypeValueType value) {
        this.value = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentContextCreatorEnum }
     *     
     */
    public AssignmentContextCreatorEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentContextCreatorEnum }
     *     
     */
    public void setType(AssignmentContextCreatorEnum value) {
        this.type = value;
    }

}
