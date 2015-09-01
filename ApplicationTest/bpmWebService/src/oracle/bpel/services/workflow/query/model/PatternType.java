
package oracle.bpel.services.workflow.query.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for patternType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="patternType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Fyi"/>
 *     &lt;enumeration value="ManagementChain"/>
 *     &lt;enumeration value="Parallel"/>
 *     &lt;enumeration value="Participant"/>
 *     &lt;enumeration value="Sequence"/>
 *     &lt;enumeration value="SequentialParticipant"/>
 *     &lt;enumeration value="Stage"/>
 *     &lt;enumeration value="TODO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "patternType")
@XmlEnum
public enum PatternType {

    @XmlEnumValue("Fyi")
    FYI("Fyi"),
    @XmlEnumValue("ManagementChain")
    MANAGEMENT_CHAIN("ManagementChain"),
    @XmlEnumValue("Parallel")
    PARALLEL("Parallel"),
    @XmlEnumValue("Participant")
    PARTICIPANT("Participant"),
    @XmlEnumValue("Sequence")
    SEQUENCE("Sequence"),
    @XmlEnumValue("SequentialParticipant")
    SEQUENTIAL_PARTICIPANT("SequentialParticipant"),
    @XmlEnumValue("Stage")
    STAGE("Stage"),
    TODO("TODO");
    private final String value;

    PatternType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PatternType fromValue(String v) {
        for (PatternType c: PatternType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
