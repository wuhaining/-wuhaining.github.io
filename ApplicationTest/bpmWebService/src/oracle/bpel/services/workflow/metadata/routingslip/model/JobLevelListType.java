
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobLevelListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jobLevelListType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpel/workflow/routingSlip}baseJobLevelListType">
 *       &lt;sequence>
 *         &lt;element name="includeAllAtSameLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobLevelListType", propOrder = {
    "includeAllAtSameLevel"
})
public class JobLevelListType
    extends BaseJobLevelListType
{

    protected Boolean includeAllAtSameLevel;

    /**
     * Gets the value of the includeAllAtSameLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAllAtSameLevel() {
        return includeAllAtSameLevel;
    }

    /**
     * Sets the value of the includeAllAtSameLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAllAtSameLevel(Boolean value) {
        this.includeAllAtSameLevel = value;
    }

}
