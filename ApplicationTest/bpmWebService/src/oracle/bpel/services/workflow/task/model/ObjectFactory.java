
package oracle.bpel.services.workflow.task.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oracle.bpel.services.workflow.task.model package. 
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

    private final static QName _KeyList_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/task", "keyList");
    private final static QName _Attachment_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/task", "attachment");
    private final static QName _Document_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/task", "document");
    private final static QName _DecomposeTaskInfo_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/task", "decomposeTaskInfo");
    private final static QName _CollectionTarget_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/task", "collectionTarget");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oracle.bpel.services.workflow.task.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CollectionTargetType }
     * 
     */
    public CollectionTargetType createCollectionTargetType() {
        return new CollectionTargetType();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link Task }
     * 
     */
    public Task createTask() {
        return new Task();
    }

    /**
     * Create an instance of {@link CommentType }
     * 
     */
    public CommentType createCommentType() {
        return new CommentType();
    }

    /**
     * Create an instance of {@link AttachmentType }
     * 
     */
    public AttachmentType createAttachmentType() {
        return new AttachmentType();
    }

    /**
     * Create an instance of {@link ProcessType }
     * 
     */
    public ProcessType createProcessType() {
        return new ProcessType();
    }

    /**
     * Create an instance of {@link SystemAttributesType }
     * 
     */
    public SystemAttributesType createSystemAttributesType() {
        return new SystemAttributesType();
    }

    /**
     * Create an instance of {@link SystemMessageAttributesType }
     * 
     */
    public SystemMessageAttributesType createSystemMessageAttributesType() {
        return new SystemMessageAttributesType();
    }

    /**
     * Create an instance of {@link CallbackType }
     * 
     */
    public CallbackType createCallbackType() {
        return new CallbackType();
    }

    /**
     * Create an instance of {@link ScaType }
     * 
     */
    public ScaType createScaType() {
        return new ScaType();
    }

    /**
     * Create an instance of {@link CustomAttributesType }
     * 
     */
    public CustomAttributesType createCustomAttributesType() {
        return new CustomAttributesType();
    }

    /**
     * Create an instance of {@link KeyListType }
     * 
     */
    public KeyListType createKeyListType() {
        return new KeyListType();
    }

    /**
     * Create an instance of {@link DecomposeTaskInfoType }
     * 
     */
    public DecomposeTaskInfoType createDecomposeTaskInfoType() {
        return new DecomposeTaskInfoType();
    }

    /**
     * Create an instance of {@link CollectionTargetActionType }
     * 
     */
    public CollectionTargetActionType createCollectionTargetActionType() {
        return new CollectionTargetActionType();
    }

    /**
     * Create an instance of {@link PreActionUserStepType }
     * 
     */
    public PreActionUserStepType createPreActionUserStepType() {
        return new PreActionUserStepType();
    }

    /**
     * Create an instance of {@link KeyType }
     * 
     */
    public KeyType createKeyType() {
        return new KeyType();
    }

    /**
     * Create an instance of {@link DisplayInfoType }
     * 
     */
    public DisplayInfoType createDisplayInfoType() {
        return new DisplayInfoType();
    }

    /**
     * Create an instance of {@link IdentityType }
     * 
     */
    public IdentityType createIdentityType() {
        return new IdentityType();
    }

    /**
     * Create an instance of {@link FlexfieldMappingType }
     * 
     */
    public FlexfieldMappingType createFlexfieldMappingType() {
        return new FlexfieldMappingType();
    }

    /**
     * Create an instance of {@link ShortHistoryTaskType }
     * 
     */
    public ShortHistoryTaskType createShortHistoryTaskType() {
        return new ShortHistoryTaskType();
    }

    /**
     * Create an instance of {@link UcmMetadataItemType }
     * 
     */
    public UcmMetadataItemType createUcmMetadataItemType() {
        return new UcmMetadataItemType();
    }

    /**
     * Create an instance of {@link ActionType }
     * 
     */
    public ActionType createActionType() {
        return new ActionType();
    }

    /**
     * Create an instance of {@link AssignmentContextType }
     * 
     */
    public AssignmentContextType createAssignmentContextType() {
        return new AssignmentContextType();
    }

    /**
     * Create an instance of {@link PreActionUserStepsType }
     * 
     */
    public PreActionUserStepsType createPreActionUserStepsType() {
        return new PreActionUserStepsType();
    }

    /**
     * Create an instance of {@link ShortHistoryType }
     * 
     */
    public ShortHistoryType createShortHistoryType() {
        return new ShortHistoryType();
    }

    /**
     * Create an instance of {@link AssignmentContextTypeValueType }
     * 
     */
    public AssignmentContextTypeValueType createAssignmentContextTypeValueType() {
        return new AssignmentContextTypeValueType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/task", name = "keyList")
    public JAXBElement<KeyListType> createKeyList(KeyListType value) {
        return new JAXBElement<KeyListType>(_KeyList_QNAME, KeyListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/task", name = "attachment")
    public JAXBElement<AttachmentType> createAttachment(AttachmentType value) {
        return new JAXBElement<AttachmentType>(_Attachment_QNAME, AttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/task", name = "document")
    public JAXBElement<DocumentType> createDocument(DocumentType value) {
        return new JAXBElement<DocumentType>(_Document_QNAME, DocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecomposeTaskInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/task", name = "decomposeTaskInfo")
    public JAXBElement<DecomposeTaskInfoType> createDecomposeTaskInfo(DecomposeTaskInfoType value) {
        return new JAXBElement<DecomposeTaskInfoType>(_DecomposeTaskInfo_QNAME, DecomposeTaskInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollectionTargetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/task", name = "collectionTarget")
    public JAXBElement<CollectionTargetType> createCollectionTarget(CollectionTargetType value) {
        return new JAXBElement<CollectionTargetType>(_CollectionTarget_QNAME, CollectionTargetType.class, null, value);
    }

}
