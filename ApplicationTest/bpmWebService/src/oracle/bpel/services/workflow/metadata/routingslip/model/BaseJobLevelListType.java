
package oracle.bpel.services.workflow.metadata.routingslip.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseJobLevelListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseJobLevelListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="atmost" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}numberOfLevelsType" minOccurs="0"/>
 *           &lt;element name="atleast" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}numberOfLevelsType" minOccurs="0"/>
 *           &lt;element name="startingPoint" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}hierarchyPrincipalType" minOccurs="0"/>
 *           &lt;element name="uptoApprover" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}hierarchyPrincipalType" minOccurs="0"/>
 *           &lt;element name="includeApprovers" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}includeApproversType" minOccurs="0"/>
 *           &lt;element name="extend" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}extendType" minOccurs="0"/>
 *           &lt;element name="truncate" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}truncateType" minOccurs="0"/>
 *           &lt;element name="autoAction" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}autoActionType" minOccurs="0"/>
 *           &lt;element name="responseType" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}responseType" minOccurs="0"/>
 *           &lt;element name="ruleName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="ruleset" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}rulesetType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseJobLevelListType", propOrder = {
    "atmost",
    "atleast",
    "startingPoint",
    "uptoApprover",
    "includeApprovers",
    "extend",
    "truncate",
    "autoAction",
    "responseType",
    "ruleName",
    "ruleset"
})
@XmlSeeAlso({
    JobLevelListType.class,
    PositionListType.class
})
public class BaseJobLevelListType {

    protected NumberOfLevelsType atmost;
    protected NumberOfLevelsType atleast;
    protected HierarchyPrincipalType startingPoint;
    protected HierarchyPrincipalType uptoApprover;
    protected IncludeApproversType includeApprovers;
    protected ExtendType extend;
    protected TruncateType truncate;
    protected AutoActionType autoAction;
    protected ResponseType responseType;
    protected List<String> ruleName;
    protected RulesetType ruleset;

    /**
     * Gets the value of the atmost property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfLevelsType }
     *     
     */
    public NumberOfLevelsType getAtmost() {
        return atmost;
    }

    /**
     * Sets the value of the atmost property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfLevelsType }
     *     
     */
    public void setAtmost(NumberOfLevelsType value) {
        this.atmost = value;
    }

    /**
     * Gets the value of the atleast property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfLevelsType }
     *     
     */
    public NumberOfLevelsType getAtleast() {
        return atleast;
    }

    /**
     * Sets the value of the atleast property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfLevelsType }
     *     
     */
    public void setAtleast(NumberOfLevelsType value) {
        this.atleast = value;
    }

    /**
     * Gets the value of the startingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchyPrincipalType }
     *     
     */
    public HierarchyPrincipalType getStartingPoint() {
        return startingPoint;
    }

    /**
     * Sets the value of the startingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchyPrincipalType }
     *     
     */
    public void setStartingPoint(HierarchyPrincipalType value) {
        this.startingPoint = value;
    }

    /**
     * Gets the value of the uptoApprover property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchyPrincipalType }
     *     
     */
    public HierarchyPrincipalType getUptoApprover() {
        return uptoApprover;
    }

    /**
     * Sets the value of the uptoApprover property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchyPrincipalType }
     *     
     */
    public void setUptoApprover(HierarchyPrincipalType value) {
        this.uptoApprover = value;
    }

    /**
     * Gets the value of the includeApprovers property.
     * 
     * @return
     *     possible object is
     *     {@link IncludeApproversType }
     *     
     */
    public IncludeApproversType getIncludeApprovers() {
        return includeApprovers;
    }

    /**
     * Sets the value of the includeApprovers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludeApproversType }
     *     
     */
    public void setIncludeApprovers(IncludeApproversType value) {
        this.includeApprovers = value;
    }

    /**
     * Gets the value of the extend property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendType }
     *     
     */
    public ExtendType getExtend() {
        return extend;
    }

    /**
     * Sets the value of the extend property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendType }
     *     
     */
    public void setExtend(ExtendType value) {
        this.extend = value;
    }

    /**
     * Gets the value of the truncate property.
     * 
     * @return
     *     possible object is
     *     {@link TruncateType }
     *     
     */
    public TruncateType getTruncate() {
        return truncate;
    }

    /**
     * Sets the value of the truncate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TruncateType }
     *     
     */
    public void setTruncate(TruncateType value) {
        this.truncate = value;
    }

    /**
     * Gets the value of the autoAction property.
     * 
     * @return
     *     possible object is
     *     {@link AutoActionType }
     *     
     */
    public AutoActionType getAutoAction() {
        return autoAction;
    }

    /**
     * Sets the value of the autoAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoActionType }
     *     
     */
    public void setAutoAction(AutoActionType value) {
        this.autoAction = value;
    }

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType }
     *     
     */
    public ResponseType getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *     
     */
    public void setResponseType(ResponseType value) {
        this.responseType = value;
    }

    /**
     * Gets the value of the ruleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRuleName() {
        if (ruleName == null) {
            ruleName = new ArrayList<String>();
        }
        return this.ruleName;
    }

    /**
     * Gets the value of the ruleset property.
     * 
     * @return
     *     possible object is
     *     {@link RulesetType }
     *     
     */
    public RulesetType getRuleset() {
        return ruleset;
    }

    /**
     * Sets the value of the ruleset property.
     * 
     * @param value
     *     allowed object is
     *     {@link RulesetType }
     *     
     */
    public void setRuleset(RulesetType value) {
        this.ruleset = value;
    }

}
