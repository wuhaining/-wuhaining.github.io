
package oracle.bpel.services.workflow.user.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for xpathExpressionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xpathExpressionType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="assigneeType" use="required" type="{http://xmlns.oracle.com/bpel/workflow/userMetadata}ruleTypeEnum" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xpathExpressionType", propOrder = {
    "value"
})
public class XpathExpressionType {

    @XmlValue
    protected String value;
    @XmlAttribute(required = true)
    protected RuleTypeEnum assigneeType;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the assigneeType property.
     * 
     * @return
     *     possible object is
     *     {@link RuleTypeEnum }
     *     
     */
    public RuleTypeEnum getAssigneeType() {
        return assigneeType;
    }

    /**
     * Sets the value of the assigneeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleTypeEnum }
     *     
     */
    public void setAssigneeType(RuleTypeEnum value) {
        this.assigneeType = value;
    }

}
