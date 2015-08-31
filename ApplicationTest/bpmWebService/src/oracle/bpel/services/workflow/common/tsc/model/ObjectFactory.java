
package oracle.bpel.services.workflow.common.tsc.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oracle.bpel.services.workflow.common.tsc.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TaskSequenceChange_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/common/tsc", "taskSequenceChange");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oracle.bpel.services.workflow.common.tsc.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TaskSequenceChangeList }
     * 
     */
    public TaskSequenceChangeList createTaskSequenceChangeList() {
        return new TaskSequenceChangeList();
    }

    /**
     * Create an instance of {@link TaskSequenceChangeType }
     * 
     */
    public TaskSequenceChangeType createTaskSequenceChangeType() {
        return new TaskSequenceChangeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskSequenceChangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/common/tsc", name = "taskSequenceChange")
    public JAXBElement<TaskSequenceChangeType> createTaskSequenceChange(TaskSequenceChangeType value) {
        return new JAXBElement<TaskSequenceChangeType>(_TaskSequenceChange_QNAME, TaskSequenceChangeType.class, null, value);
    }

}
