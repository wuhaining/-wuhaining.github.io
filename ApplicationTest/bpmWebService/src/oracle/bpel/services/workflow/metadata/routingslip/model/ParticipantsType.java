
package oracle.bpel.services.workflow.metadata.routingslip.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for participantsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="participantsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="participant" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}participantType"/>
 *           &lt;element name="sequentialParticipant" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}sequentialParticipantType"/>
 *           &lt;element name="adhoc" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}adhocType"/>
 *           &lt;element name="managementChain" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}managementChainType"/>
 *           &lt;element name="parallel" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}parallelType"/>
 *           &lt;element name="fyi" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}fyiType"/>
 *           &lt;element name="notify" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}notifyType"/>
 *           &lt;element name="stage" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}stageType"/>
 *           &lt;element name="forEach" type="{http://xmlns.oracle.com/bpel/workflow/routingSlip}forEachType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="isAdhocRoutingSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "participantsType", propOrder = {
    "participantOrSequentialParticipantOrAdhoc"
})
@XmlSeeAlso({
    ForEachType.class,
    StageType.class
})
public class ParticipantsType {

    @XmlElements({
        @XmlElement(name = "stage", type = StageType.class),
        @XmlElement(name = "notify", type = NotifyType.class),
        @XmlElement(name = "adhoc", type = AdhocType.class),
        @XmlElement(name = "sequentialParticipant", type = SequentialParticipantType.class),
        @XmlElement(name = "fyi", type = FyiType.class),
        @XmlElement(name = "parallel", type = ParallelType.class),
        @XmlElement(name = "managementChain", type = ManagementChainType.class),
        @XmlElement(name = "forEach", type = ForEachType.class),
        @XmlElement(name = "participant", type = ParticipantType.class)
    })
    protected List<Object> participantOrSequentialParticipantOrAdhoc;
    @XmlAttribute
    protected Boolean isAdhocRoutingSupported;

    /**
     * Gets the value of the participantOrSequentialParticipantOrAdhoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participantOrSequentialParticipantOrAdhoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipantOrSequentialParticipantOrAdhoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StageType }
     * {@link NotifyType }
     * {@link AdhocType }
     * {@link SequentialParticipantType }
     * {@link FyiType }
     * {@link ParallelType }
     * {@link ManagementChainType }
     * {@link ForEachType }
     * {@link ParticipantType }
     * 
     * 
     */
    public List<Object> getParticipantOrSequentialParticipantOrAdhoc() {
        if (participantOrSequentialParticipantOrAdhoc == null) {
            participantOrSequentialParticipantOrAdhoc = new ArrayList<Object>();
        }
        return this.participantOrSequentialParticipantOrAdhoc;
    }

    /**
     * Gets the value of the isAdhocRoutingSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdhocRoutingSupported() {
        return isAdhocRoutingSupported;
    }

    /**
     * Sets the value of the isAdhocRoutingSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdhocRoutingSupported(Boolean value) {
        this.isAdhocRoutingSupported = value;
    }

}
