
package oracle.bpel.services.workflow.metadata.routingslip.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for multipleListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multipleListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="resourceList" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}resourceListType"/>
 *         &lt;element name="managementChain" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}managementChainListType"/>
 *         &lt;element name="supervisory" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}supervisoryListType"/>
 *         &lt;element name="jobLevel" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}jobLevelListType"/>
 *         &lt;element name="position" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}positionListType"/>
 *         &lt;element name="approvalGroup" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}approvalGroupListType"/>
 *         &lt;element name="logicalPeopleGroup" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}logicalPeopleGroupListType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multipleListType", propOrder = {
    "resourceListOrManagementChainOrSupervisory"
})
public class MultipleListType {

    @XmlElements({
        @XmlElement(name = "jobLevel", type = JobLevelListType.class),
        @XmlElement(name = "managementChain", type = ManagementChainListType.class),
        @XmlElement(name = "position", type = PositionListType.class),
        @XmlElement(name = "resourceList", type = ResourceListType.class),
        @XmlElement(name = "approvalGroup", type = ApprovalGroupListType.class),
        @XmlElement(name = "logicalPeopleGroup", type = LogicalPeopleGroupListType.class),
        @XmlElement(name = "supervisory", type = SupervisoryListType.class)
    })
    protected List<Object> resourceListOrManagementChainOrSupervisory;

    /**
     * Gets the value of the resourceListOrManagementChainOrSupervisory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceListOrManagementChainOrSupervisory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceListOrManagementChainOrSupervisory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobLevelListType }
     * {@link ManagementChainListType }
     * {@link PositionListType }
     * {@link ResourceListType }
     * {@link ApprovalGroupListType }
     * {@link LogicalPeopleGroupListType }
     * {@link SupervisoryListType }
     * 
     * 
     */
    public List<Object> getResourceListOrManagementChainOrSupervisory() {
        if (resourceListOrManagementChainOrSupervisory == null) {
            resourceListOrManagementChainOrSupervisory = new ArrayList<Object>();
        }
        return this.resourceListOrManagementChainOrSupervisory;
    }

}
