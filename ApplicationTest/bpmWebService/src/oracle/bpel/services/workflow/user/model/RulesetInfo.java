
package oracle.bpel.services.workflow.user.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="repositoryInfo" type="{http://xmlns.oracle.com/bpel/workflow/userMetadata}ruleRepositoryInfoType"/>
 *         &lt;element name="rulesetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "repositoryInfo",
    "rulesetName"
})
@XmlRootElement(name = "rulesetInfo")
public class RulesetInfo {

    @XmlElement(required = true)
    protected RuleRepositoryInfoType repositoryInfo;
    @XmlElement(required = true)
    protected String rulesetName;

    /**
     * Gets the value of the repositoryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RuleRepositoryInfoType }
     *     
     */
    public RuleRepositoryInfoType getRepositoryInfo() {
        return repositoryInfo;
    }

    /**
     * Sets the value of the repositoryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleRepositoryInfoType }
     *     
     */
    public void setRepositoryInfo(RuleRepositoryInfoType value) {
        this.repositoryInfo = value;
    }

    /**
     * Gets the value of the rulesetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRulesetName() {
        return rulesetName;
    }

    /**
     * Sets the value of the rulesetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRulesetName(String value) {
        this.rulesetName = value;
    }

}
