
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for logicalPeopleGroupListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="logicalPeopleGroupListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lpgParameters" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}lpgParametersType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logicalPeopleGroupListType", propOrder = {
    "name",
    "lpgParameters"
})
public class LogicalPeopleGroupListType {

    @XmlElement(required = true)
    protected String name;
    protected LpgParametersType lpgParameters;

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
     * Gets the value of the lpgParameters property.
     * 
     * @return
     *     possible object is
     *     {@link LpgParametersType }
     *     
     */
    public LpgParametersType getLpgParameters() {
        return lpgParameters;
    }

    /**
     * Sets the value of the lpgParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link LpgParametersType }
     *     
     */
    public void setLpgParameters(LpgParametersType value) {
        this.lpgParameters = value;
    }

}
