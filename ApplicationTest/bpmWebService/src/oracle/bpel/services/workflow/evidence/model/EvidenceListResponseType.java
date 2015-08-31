
package oracle.bpel.services.workflow.evidence.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EvidenceListResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EvidenceListResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService}evidenceList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvidenceListResponseType", propOrder = {
    "evidenceList"
})
public class EvidenceListResponseType {

    @XmlElement(required = true)
    protected EvidenceListType evidenceList;

    /**
     * Gets the value of the evidenceList property.
     * 
     * @return
     *     possible object is
     *     {@link EvidenceListType }
     *     
     */
    public EvidenceListType getEvidenceList() {
        return evidenceList;
    }

    /**
     * Sets the value of the evidenceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvidenceListType }
     *     
     */
    public void setEvidenceList(EvidenceListType value) {
        this.evidenceList = value;
    }

}
