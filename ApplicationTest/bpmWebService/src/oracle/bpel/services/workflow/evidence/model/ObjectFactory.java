
package oracle.bpel.services.workflow.evidence.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oracle.bpel.services.workflow.evidence.model package. 
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

    private final static QName _EvidenceServiceError_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", "evidenceServiceError");
    private final static QName _EvidenceListResponse_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", "evidenceListResponse");
    private final static QName _Evidence_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", "evidence");
    private final static QName _EvidenceRequest_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", "evidenceRequest");
    private final static QName _ValidateEvidenceSignatureRequest_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", "validateEvidenceSignatureRequest");
    private final static QName _EvidenceResponse_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", "evidenceResponse");
    private final static QName _EvidenceList_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", "evidenceList");
    private final static QName _Certificate_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", "certificate");
    private final static QName _UploadCertificateRequest_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", "uploadCertificateRequest");
    private final static QName _CertificateRevoke_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", "certificateRevoke");
    private final static QName _CreateEvidenceRequest_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", "createEvidenceRequest");
    private final static QName _UpdateEvidenceRequest_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", "updateEvidenceRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oracle.bpel.services.workflow.evidence.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EvidenceType }
     * 
     */
    public EvidenceType createEvidenceType() {
        return new EvidenceType();
    }

    /**
     * Create an instance of {@link UpdateEvidenceRequestType }
     * 
     */
    public UpdateEvidenceRequestType createUpdateEvidenceRequestType() {
        return new UpdateEvidenceRequestType();
    }

    /**
     * Create an instance of {@link CertificateType }
     * 
     */
    public CertificateType createCertificateType() {
        return new CertificateType();
    }

    /**
     * Create an instance of {@link UploadCertificateRequestType }
     * 
     */
    public UploadCertificateRequestType createUploadCertificateRequestType() {
        return new UploadCertificateRequestType();
    }

    /**
     * Create an instance of {@link EvidenceRequestType }
     * 
     */
    public EvidenceRequestType createEvidenceRequestType() {
        return new EvidenceRequestType();
    }

    /**
     * Create an instance of {@link CertificateRevokeType }
     * 
     */
    public CertificateRevokeType createCertificateRevokeType() {
        return new CertificateRevokeType();
    }

    /**
     * Create an instance of {@link ValidateEvidenceSignatureRequestType }
     * 
     */
    public ValidateEvidenceSignatureRequestType createValidateEvidenceSignatureRequestType() {
        return new ValidateEvidenceSignatureRequestType();
    }

    /**
     * Create an instance of {@link EvidenceListType }
     * 
     */
    public EvidenceListType createEvidenceListType() {
        return new EvidenceListType();
    }

    /**
     * Create an instance of {@link EvidenceResponseType }
     * 
     */
    public EvidenceResponseType createEvidenceResponseType() {
        return new EvidenceResponseType();
    }

    /**
     * Create an instance of {@link TaskEvidenceServiceErrorType }
     * 
     */
    public TaskEvidenceServiceErrorType createTaskEvidenceServiceErrorType() {
        return new TaskEvidenceServiceErrorType();
    }

    /**
     * Create an instance of {@link EvidenceListResponseType }
     * 
     */
    public EvidenceListResponseType createEvidenceListResponseType() {
        return new EvidenceListResponseType();
    }

    /**
     * Create an instance of {@link CreateEvidenceRequestType }
     * 
     */
    public CreateEvidenceRequestType createCreateEvidenceRequestType() {
        return new CreateEvidenceRequestType();
    }

    /**
     * Create an instance of {@link UpdatableEvidenceAttributesType }
     * 
     */
    public UpdatableEvidenceAttributesType createUpdatableEvidenceAttributesType() {
        return new UpdatableEvidenceAttributesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskEvidenceServiceErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", name = "evidenceServiceError")
    public JAXBElement<TaskEvidenceServiceErrorType> createEvidenceServiceError(TaskEvidenceServiceErrorType value) {
        return new JAXBElement<TaskEvidenceServiceErrorType>(_EvidenceServiceError_QNAME, TaskEvidenceServiceErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvidenceListResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", name = "evidenceListResponse")
    public JAXBElement<EvidenceListResponseType> createEvidenceListResponse(EvidenceListResponseType value) {
        return new JAXBElement<EvidenceListResponseType>(_EvidenceListResponse_QNAME, EvidenceListResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvidenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", name = "evidence")
    public JAXBElement<EvidenceType> createEvidence(EvidenceType value) {
        return new JAXBElement<EvidenceType>(_Evidence_QNAME, EvidenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvidenceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", name = "evidenceRequest")
    public JAXBElement<EvidenceRequestType> createEvidenceRequest(EvidenceRequestType value) {
        return new JAXBElement<EvidenceRequestType>(_EvidenceRequest_QNAME, EvidenceRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateEvidenceSignatureRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", name = "validateEvidenceSignatureRequest")
    public JAXBElement<ValidateEvidenceSignatureRequestType> createValidateEvidenceSignatureRequest(ValidateEvidenceSignatureRequestType value) {
        return new JAXBElement<ValidateEvidenceSignatureRequestType>(_ValidateEvidenceSignatureRequest_QNAME, ValidateEvidenceSignatureRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvidenceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", name = "evidenceResponse")
    public JAXBElement<EvidenceResponseType> createEvidenceResponse(EvidenceResponseType value) {
        return new JAXBElement<EvidenceResponseType>(_EvidenceResponse_QNAME, EvidenceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvidenceListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", name = "evidenceList")
    public JAXBElement<EvidenceListType> createEvidenceList(EvidenceListType value) {
        return new JAXBElement<EvidenceListType>(_EvidenceList_QNAME, EvidenceListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", name = "certificate")
    public JAXBElement<CertificateType> createCertificate(CertificateType value) {
        return new JAXBElement<CertificateType>(_Certificate_QNAME, CertificateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadCertificateRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", name = "uploadCertificateRequest")
    public JAXBElement<UploadCertificateRequestType> createUploadCertificateRequest(UploadCertificateRequestType value) {
        return new JAXBElement<UploadCertificateRequestType>(_UploadCertificateRequest_QNAME, UploadCertificateRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateRevokeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", name = "certificateRevoke")
    public JAXBElement<CertificateRevokeType> createCertificateRevoke(CertificateRevokeType value) {
        return new JAXBElement<CertificateRevokeType>(_CertificateRevoke_QNAME, CertificateRevokeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEvidenceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", name = "createEvidenceRequest")
    public JAXBElement<CreateEvidenceRequestType> createCreateEvidenceRequest(CreateEvidenceRequestType value) {
        return new JAXBElement<CreateEvidenceRequestType>(_CreateEvidenceRequest_QNAME, CreateEvidenceRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEvidenceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService", name = "updateEvidenceRequest")
    public JAXBElement<UpdateEvidenceRequestType> createUpdateEvidenceRequest(UpdateEvidenceRequestType value) {
        return new JAXBElement<UpdateEvidenceRequestType>(_UpdateEvidenceRequest_QNAME, UpdateEvidenceRequestType.class, null, value);
    }

}
