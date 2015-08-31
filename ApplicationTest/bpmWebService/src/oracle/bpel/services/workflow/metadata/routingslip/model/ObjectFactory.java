
package oracle.bpel.services.workflow.metadata.routingslip.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oracle.bpel.services.workflow.metadata.routingslip.model package. 
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

    private final static QName _DynamicAssignment_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/routingSlip", "dynamicAssignment");
    private final static QName _Participants_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/routingSlip", "participants");
    private final static QName _List_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/routingSlip", "list");
    private final static QName _Resource_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/routingSlip", "resource");
    private final static QName _NotifyTypeAddress_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/routingSlip", "address");
    private final static QName _NotifyTypeGroup_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/routingSlip", "group");
    private final static QName _NotifyTypeUser_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/routingSlip", "user");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oracle.bpel.services.workflow.metadata.routingslip.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubstitutionRules }
     * 
     */
    public SubstitutionRules createSubstitutionRules() {
        return new SubstitutionRules();
    }

    /**
     * Create an instance of {@link SubstitutionRuleType }
     * 
     */
    public SubstitutionRuleType createSubstitutionRuleType() {
        return new SubstitutionRuleType();
    }

    /**
     * Create an instance of {@link ResourceType }
     * 
     */
    public ResourceType createResourceType() {
        return new ResourceType();
    }

    /**
     * Create an instance of {@link ListType }
     * 
     */
    public ListType createListType() {
        return new ListType();
    }

    /**
     * Create an instance of {@link RoutingSlip }
     * 
     */
    public RoutingSlip createRoutingSlip() {
        return new RoutingSlip();
    }

    /**
     * Create an instance of {@link GlobalConfigurationType }
     * 
     */
    public GlobalConfigurationType createGlobalConfigurationType() {
        return new GlobalConfigurationType();
    }

    /**
     * Create an instance of {@link AssignmentServiceType }
     * 
     */
    public AssignmentServiceType createAssignmentServiceType() {
        return new AssignmentServiceType();
    }

    /**
     * Create an instance of {@link ParticipantsType }
     * 
     */
    public ParticipantsType createParticipantsType() {
        return new ParticipantsType();
    }

    /**
     * Create an instance of {@link OnErrorParticipantType }
     * 
     */
    public OnErrorParticipantType createOnErrorParticipantType() {
        return new OnErrorParticipantType();
    }

    /**
     * Create an instance of {@link NotificationType }
     * 
     */
    public NotificationType createNotificationType() {
        return new NotificationType();
    }

    /**
     * Create an instance of {@link ReviewerType }
     * 
     */
    public ReviewerType createReviewerType() {
        return new ReviewerType();
    }

    /**
     * Create an instance of {@link ForwardingRulesType }
     * 
     */
    public ForwardingRulesType createForwardingRulesType() {
        return new ForwardingRulesType();
    }

    /**
     * Create an instance of {@link SystemParametersType }
     * 
     */
    public SystemParametersType createSystemParametersType() {
        return new SystemParametersType();
    }

    /**
     * Create an instance of {@link RestrictedAssignmentCallbackType }
     * 
     */
    public RestrictedAssignmentCallbackType createRestrictedAssignmentCallbackType() {
        return new RestrictedAssignmentCallbackType();
    }

    /**
     * Create an instance of {@link ExcludedParticipantsType }
     * 
     */
    public ExcludedParticipantsType createExcludedParticipantsType() {
        return new ExcludedParticipantsType();
    }

    /**
     * Create an instance of {@link Lists }
     * 
     */
    public Lists createLists() {
        return new Lists();
    }

    /**
     * Create an instance of {@link ResourceListType }
     * 
     */
    public ResourceListType createResourceListType() {
        return new ResourceListType();
    }

    /**
     * Create an instance of {@link ManagementChainListType }
     * 
     */
    public ManagementChainListType createManagementChainListType() {
        return new ManagementChainListType();
    }

    /**
     * Create an instance of {@link SupervisoryListType }
     * 
     */
    public SupervisoryListType createSupervisoryListType() {
        return new SupervisoryListType();
    }

    /**
     * Create an instance of {@link JobLevelListType }
     * 
     */
    public JobLevelListType createJobLevelListType() {
        return new JobLevelListType();
    }

    /**
     * Create an instance of {@link PositionListType }
     * 
     */
    public PositionListType createPositionListType() {
        return new PositionListType();
    }

    /**
     * Create an instance of {@link ApprovalGroupListType }
     * 
     */
    public ApprovalGroupListType createApprovalGroupListType() {
        return new ApprovalGroupListType();
    }

    /**
     * Create an instance of {@link RulesetType }
     * 
     */
    public RulesetType createRulesetType() {
        return new RulesetType();
    }

    /**
     * Create an instance of {@link LogicalPeopleGroupListType }
     * 
     */
    public LogicalPeopleGroupListType createLogicalPeopleGroupListType() {
        return new LogicalPeopleGroupListType();
    }

    /**
     * Create an instance of {@link DynamicAssignmentType }
     * 
     */
    public DynamicAssignmentType createDynamicAssignmentType() {
        return new DynamicAssignmentType();
    }

    /**
     * Create an instance of {@link ForEachType }
     * 
     */
    public ForEachType createForEachType() {
        return new ForEachType();
    }

    /**
     * Create an instance of {@link PagerType }
     * 
     */
    public PagerType createPagerType() {
        return new PagerType();
    }

    /**
     * Create an instance of {@link PropertiesType }
     * 
     */
    public PropertiesType createPropertiesType() {
        return new PropertiesType();
    }

    /**
     * Create an instance of {@link SmsType }
     * 
     */
    public SmsType createSmsType() {
        return new SmsType();
    }

    /**
     * Create an instance of {@link LpgParameterType }
     * 
     */
    public LpgParameterType createLpgParameterType() {
        return new LpgParameterType();
    }

    /**
     * Create an instance of {@link CallbackType }
     * 
     */
    public CallbackType createCallbackType() {
        return new CallbackType();
    }

    /**
     * Create an instance of {@link LpgParametersType }
     * 
     */
    public LpgParametersType createLpgParametersType() {
        return new LpgParametersType();
    }

    /**
     * Create an instance of {@link ManagementChainType }
     * 
     */
    public ManagementChainType createManagementChainType() {
        return new ManagementChainType();
    }

    /**
     * Create an instance of {@link NotifyType }
     * 
     */
    public NotifyType createNotifyType() {
        return new NotifyType();
    }

    /**
     * Create an instance of {@link ForEachCompletionConditionType }
     * 
     */
    public ForEachCompletionConditionType createForEachCompletionConditionType() {
        return new ForEachCompletionConditionType();
    }

    /**
     * Create an instance of {@link NumberOfLevelsType }
     * 
     */
    public NumberOfLevelsType createNumberOfLevelsType() {
        return new NumberOfLevelsType();
    }

    /**
     * Create an instance of {@link SequentialParticipantType }
     * 
     */
    public SequentialParticipantType createSequentialParticipantType() {
        return new SequentialParticipantType();
    }

    /**
     * Create an instance of {@link ReminderType }
     * 
     */
    public ReminderType createReminderType() {
        return new ReminderType();
    }

    /**
     * Create an instance of {@link VoiceType }
     * 
     */
    public VoiceType createVoiceType() {
        return new VoiceType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
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
     * Create an instance of {@link ParallelType }
     * 
     */
    public ParallelType createParallelType() {
        return new ParallelType();
    }

    /**
     * Create an instance of {@link PreferenceParameterType }
     * 
     */
    public PreferenceParameterType createPreferenceParameterType() {
        return new PreferenceParameterType();
    }

    /**
     * Create an instance of {@link EmailType }
     * 
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    /**
     * Create an instance of {@link StageType }
     * 
     */
    public StageType createStageType() {
        return new StageType();
    }

    /**
     * Create an instance of {@link HierarchyPrincipalType }
     * 
     */
    public HierarchyPrincipalType createHierarchyPrincipalType() {
        return new HierarchyPrincipalType();
    }

    /**
     * Create an instance of {@link TruncateType }
     * 
     */
    public TruncateType createTruncateType() {
        return new TruncateType();
    }

    /**
     * Create an instance of {@link BaseJobLevelListType }
     * 
     */
    public BaseJobLevelListType createBaseJobLevelListType() {
        return new BaseJobLevelListType();
    }

    /**
     * Create an instance of {@link EscalationPolicyType }
     * 
     */
    public EscalationPolicyType createEscalationPolicyType() {
        return new EscalationPolicyType();
    }

    /**
     * Create an instance of {@link OutcomePercentageType }
     * 
     */
    public OutcomePercentageType createOutcomePercentageType() {
        return new OutcomePercentageType();
    }

    /**
     * Create an instance of {@link RenewalPolicyType }
     * 
     */
    public RenewalPolicyType createRenewalPolicyType() {
        return new RenewalPolicyType();
    }

    /**
     * Create an instance of {@link AssignmentPatternType }
     * 
     */
    public AssignmentPatternType createAssignmentPatternType() {
        return new AssignmentPatternType();
    }

    /**
     * Create an instance of {@link RestrictedAssignmentCallbackPropertyType }
     * 
     */
    public RestrictedAssignmentCallbackPropertyType createRestrictedAssignmentCallbackPropertyType() {
        return new RestrictedAssignmentCallbackPropertyType();
    }

    /**
     * Create an instance of {@link ParameterType }
     * 
     */
    public ParameterType createParameterType() {
        return new ParameterType();
    }

    /**
     * Create an instance of {@link ParallelCompletionCriteriaType }
     * 
     */
    public ParallelCompletionCriteriaType createParallelCompletionCriteriaType() {
        return new ParallelCompletionCriteriaType();
    }

    /**
     * Create an instance of {@link AssignmentServicePropertyType }
     * 
     */
    public AssignmentServicePropertyType createAssignmentServicePropertyType() {
        return new AssignmentServicePropertyType();
    }

    /**
     * Create an instance of {@link EarlyCompletionType }
     * 
     */
    public EarlyCompletionType createEarlyCompletionType() {
        return new EarlyCompletionType();
    }

    /**
     * Create an instance of {@link AdhocType }
     * 
     */
    public AdhocType createAdhocType() {
        return new AdhocType();
    }

    /**
     * Create an instance of {@link SystemParameterType }
     * 
     */
    public SystemParameterType createSystemParameterType() {
        return new SystemParameterType();
    }

    /**
     * Create an instance of {@link AutoActionType }
     * 
     */
    public AutoActionType createAutoActionType() {
        return new AutoActionType();
    }

    /**
     * Create an instance of {@link ExtendType }
     * 
     */
    public ExtendType createExtendType() {
        return new ExtendType();
    }

    /**
     * Create an instance of {@link DueDateDurationType }
     * 
     */
    public DueDateDurationType createDueDateDurationType() {
        return new DueDateDurationType();
    }

    /**
     * Create an instance of {@link SharePayloadConfigurationType }
     * 
     */
    public SharePayloadConfigurationType createSharePayloadConfigurationType() {
        return new SharePayloadConfigurationType();
    }

    /**
     * Create an instance of {@link FaxType }
     * 
     */
    public FaxType createFaxType() {
        return new FaxType();
    }

    /**
     * Create an instance of {@link MultipleListType }
     * 
     */
    public MultipleListType createMultipleListType() {
        return new MultipleListType();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link FirstResponderType }
     * 
     */
    public FirstResponderType createFirstResponderType() {
        return new FirstResponderType();
    }

    /**
     * Create an instance of {@link PreferenceParametersType }
     * 
     */
    public PreferenceParametersType createPreferenceParametersType() {
        return new PreferenceParametersType();
    }

    /**
     * Create an instance of {@link FyiType }
     * 
     */
    public FyiType createFyiType() {
        return new FyiType();
    }

    /**
     * Create an instance of {@link ParticipantType }
     * 
     */
    public ParticipantType createParticipantType() {
        return new ParticipantType();
    }

    /**
     * Create an instance of {@link ExpirationDurationType }
     * 
     */
    public ExpirationDurationType createExpirationDurationType() {
        return new ExpirationDurationType();
    }

    /**
     * Create an instance of {@link GenericParticipantType }
     * 
     */
    public GenericParticipantType createGenericParticipantType() {
        return new GenericParticipantType();
    }

    /**
     * Create an instance of {@link AssignmentContextTypeValueType }
     * 
     */
    public AssignmentContextTypeValueType createAssignmentContextTypeValueType() {
        return new AssignmentContextTypeValueType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DynamicAssignmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/routingSlip", name = "dynamicAssignment")
    public JAXBElement<DynamicAssignmentType> createDynamicAssignment(DynamicAssignmentType value) {
        return new JAXBElement<DynamicAssignmentType>(_DynamicAssignment_QNAME, DynamicAssignmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipantsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/routingSlip", name = "participants")
    public JAXBElement<ParticipantsType> createParticipants(ParticipantsType value) {
        return new JAXBElement<ParticipantsType>(_Participants_QNAME, ParticipantsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/routingSlip", name = "list")
    public JAXBElement<ListType> createList(ListType value) {
        return new JAXBElement<ListType>(_List_QNAME, ListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/routingSlip", name = "resource")
    public JAXBElement<ResourceType> createResource(ResourceType value) {
        return new JAXBElement<ResourceType>(_Resource_QNAME, ResourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/routingSlip", name = "address", scope = NotifyType.class)
    public JAXBElement<AddressType> createNotifyTypeAddress(AddressType value) {
        return new JAXBElement<AddressType>(_NotifyTypeAddress_QNAME, AddressType.class, NotifyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/routingSlip", name = "group", scope = NotifyType.class)
    public JAXBElement<ParameterType> createNotifyTypeGroup(ParameterType value) {
        return new JAXBElement<ParameterType>(_NotifyTypeGroup_QNAME, ParameterType.class, NotifyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/routingSlip", name = "user", scope = NotifyType.class)
    public JAXBElement<ParameterType> createNotifyTypeUser(ParameterType value) {
        return new JAXBElement<ParameterType>(_NotifyTypeUser_QNAME, ParameterType.class, NotifyType.class, value);
    }

}
