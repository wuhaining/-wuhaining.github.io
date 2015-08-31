
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for forwardingRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="forwardingRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="decisionServiceComponent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ruleset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "forwardingRulesType", propOrder = {
    "decisionServiceComponent",
    "ruleset"
})
public class ForwardingRulesType {

    @XmlElement(required = true)
    protected String decisionServiceComponent;
    protected String ruleset;

    /**
     * Gets the value of the decisionServiceComponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionServiceComponent() {
        return decisionServiceComponent;
    }

    /**
     * Sets the value of the decisionServiceComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionServiceComponent(String value) {
        this.decisionServiceComponent = value;
    }

    /**
     * Gets the value of the ruleset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleset() {
        return ruleset;
    }

    /**
     * Sets the value of the ruleset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleset(String value) {
        this.ruleset = value;
    }

}
