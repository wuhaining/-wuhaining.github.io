
package oracle.bpel.services.workflow.query.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskPredicateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taskPredicateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignmentFilter" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}assignmentFilterEnum" minOccurs="0"/>
 *         &lt;element name="keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="clause" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}predicateClauseType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="predicate" type="{http://xmlns.oracle.com/bpel/workflow/taskQuery}predicateType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskPredicateType", namespace = "http://xmlns.oracle.com/bpel/workflow/taskQuery", propOrder = {
    "assignmentFilter",
    "keywords",
    "clause",
    "predicate"
})
public class TaskPredicateType {

    protected AssignmentFilterEnum assignmentFilter;
    protected String keywords;
    protected List<PredicateClauseType> clause;
    protected PredicateType predicate;

    /**
     * Gets the value of the assignmentFilter property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentFilterEnum }
     *     
     */
    public AssignmentFilterEnum getAssignmentFilter() {
        return assignmentFilter;
    }

    /**
     * Sets the value of the assignmentFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentFilterEnum }
     *     
     */
    public void setAssignmentFilter(AssignmentFilterEnum value) {
        this.assignmentFilter = value;
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
     * Gets the value of the clause property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clause property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClause().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PredicateClauseType }
     * 
     * 
     */
    public List<PredicateClauseType> getClause() {
        if (clause == null) {
            clause = new ArrayList<PredicateClauseType>();
        }
        return this.clause;
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

}
