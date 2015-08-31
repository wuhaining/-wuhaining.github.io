
package oracle.bpel.services.workflow.query.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oracle.bpel.services.workflow.common.model.WorkflowContextType;


/**
 * <p>Java class for queryDecomposedTasksRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryDecomposedTasksRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/common}workflowContext" minOccurs="0"/>
 *         &lt;element name="parentTaskId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayColumns" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}displayColumnType" minOccurs="0"/>
 *         &lt;element name="optionalInfo" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}taskOptionalInfoType" minOccurs="0"/>
 *         &lt;element name="keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="predicate" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}predicateType" minOccurs="0"/>
 *         &lt;element name="ordering" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}taskOrderingType" minOccurs="0"/>
 *         &lt;element name="startRow" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="endRow" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryDecomposedTasksRequestType", propOrder = {
    "workflowContext",
    "parentTaskId",
    "displayColumns",
    "optionalInfo",
    "keywords",
    "predicate",
    "ordering",
    "startRow",
    "endRow"
})
public class QueryDecomposedTasksRequestType {

    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/common")
    protected WorkflowContextType workflowContext;
    @XmlElement(required = true)
    protected String parentTaskId;
    protected DisplayColumnType displayColumns;
    protected TaskOptionalInfoType optionalInfo;
    protected String keywords;
    protected PredicateType predicate;
    protected TaskOrderingType ordering;
    @XmlElement(defaultValue = "0")
    protected BigInteger startRow;
    @XmlElement(defaultValue = "0")
    protected BigInteger endRow;

    /**
     * Gets the value of the workflowContext property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowContextType }
     *     
     */
    public WorkflowContextType getWorkflowContext() {
        return workflowContext;
    }

    /**
     * Sets the value of the workflowContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowContextType }
     *     
     */
    public void setWorkflowContext(WorkflowContextType value) {
        this.workflowContext = value;
    }

    /**
     * Gets the value of the parentTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentTaskId() {
        return parentTaskId;
    }

    /**
     * Sets the value of the parentTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentTaskId(String value) {
        this.parentTaskId = value;
    }

    /**
     * Gets the value of the displayColumns property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayColumnType }
     *     
     */
    public DisplayColumnType getDisplayColumns() {
        return displayColumns;
    }

    /**
     * Sets the value of the displayColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayColumnType }
     *     
     */
    public void setDisplayColumns(DisplayColumnType value) {
        this.displayColumns = value;
    }

    /**
     * Gets the value of the optionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaskOptionalInfoType }
     *     
     */
    public TaskOptionalInfoType getOptionalInfo() {
        return optionalInfo;
    }

    /**
     * Sets the value of the optionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskOptionalInfoType }
     *     
     */
    public void setOptionalInfo(TaskOptionalInfoType value) {
        this.optionalInfo = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywords(String value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the predicate property.
     * 
     * @return
     *     possible object is
     *     {@link PredicateType }
     *     
     */
    public PredicateType getPredicate() {
        return predicate;
    }

    /**
     * Sets the value of the predicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredicateType }
     *     
     */
    public void setPredicate(PredicateType value) {
        this.predicate = value;
    }

    /**
     * Gets the value of the ordering property.
     * 
     * @return
     *     possible object is
     *     {@link TaskOrderingType }
     *     
     */
    public TaskOrderingType getOrdering() {
        return ordering;
    }

    /**
     * Sets the value of the ordering property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskOrderingType }
     *     
     */
    public void setOrdering(TaskOrderingType value) {
        this.ordering = value;
    }

    /**
     * Gets the value of the startRow property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartRow() {
        return startRow;
    }

    /**
     * Sets the value of the startRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartRow(BigInteger value) {
        this.startRow = value;
    }

    /**
     * Gets the value of the endRow property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndRow() {
        return endRow;
    }

    /**
     * Sets the value of the endRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndRow(BigInteger value) {
        this.endRow = value;
    }

}
