
package com.task.services.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oracle.bpel.services.workflow.metadata.routingslip.model.ParticipantsType;


/**
 * <p>Java class for updateTaskOutcomeAndRouteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateTaskOutcomeAndRouteType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/bpel/workflow/taskService}updateTaskOutcomeType">
 *       &lt;sequence>
 *         &lt;element ref="{http://xmlns.oracle.com/bpel/workflow/routingSlip}participants"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateTaskOutcomeAndRouteType", propOrder = {
    "participants"
})
public class UpdateTaskOutcomeAndRouteType
    extends UpdateTaskOutcomeType
{

    @XmlElement(namespace = "http://xmlns.oracle.com/bpel/workflow/routingSlip", required = true)
    protected ParticipantsType participants;

    /**
     * Gets the value of the participants property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantsType }
     *     
     */
    public ParticipantsType getParticipants() {
        return participants;
    }

    /**
     * Sets the value of the participants property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantsType }
     *     
     */
    public void setParticipants(ParticipantsType value) {
        this.participants = value;
    }

}
