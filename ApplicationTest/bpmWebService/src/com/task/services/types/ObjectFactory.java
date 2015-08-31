
package com.task.services.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.task.services.types package. 
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

    private final static QName _MergeAndUpdateTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "mergeAndUpdateTask");
    private final static QName _SuspendTimers_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "suspendTimers");
    private final static QName _ReleaseTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "releaseTask");
    private final static QName _UpdateOutcomeOfTasks_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "updateOutcomeOfTasks");
    private final static QName _CreateToDoTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "createToDoTask");
    private final static QName _ReinitiateTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "reinitiateTask");
    private final static QName _RouteTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "routeTask");
    private final static QName _ReevaluateTaskOutput_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "reevaluateTaskOutput");
    private final static QName _SetTaskSequenceChanges_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "setTaskSequenceChanges");
    private final static QName _RemoveAttachment_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "removeAttachment");
    private final static QName _PurgeTasks_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "purgeTasks");
    private final static QName _PurgeTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "purgeTask");
    private final static QName _GetApprovers_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "getApprovers");
    private final static QName _DeleteTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "deleteTask");
    private final static QName _OperationErroredFault_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "operationErroredFault");
    private final static QName _DecomposeTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "decomposeTask");
    private final static QName _RenewTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "renewTask");
    private final static QName _ReinitiateTaskResponse_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "reinitiateTaskResponse");
    private final static QName _SuspendTasks_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "suspendTasks");
    private final static QName _ReassignTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "reassignTask");
    private final static QName _UpdateTaskOutcome_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "updateTaskOutcome");
    private final static QName _AddComment_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "addComment");
    private final static QName _EscalateTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "escalateTask");
    private final static QName _RemoveDocument_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "removeDocument");
    private final static QName _BulkOperationOutput_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "bulkOperationOutput");
    private final static QName _ReleaseTasks_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "releaseTasks");
    private final static QName _GetFutureParticipants_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "getFutureParticipants");
    private final static QName _TaskAssignedMessage_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "taskAssignedMessage");
    private final static QName _ErrorTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "errorTask");
    private final static QName _DelegateTasks_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "delegateTasks");
    private final static QName _PurgeTaskOutput_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "purgeTaskOutput");
    private final static QName _InitiateTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "initiateTask");
    private final static QName _RequestInfoForTaskWithReapproval_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "requestInfoForTaskWithReapproval");
    private final static QName _GetUsersToRequestInfoForTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "getUsersToRequestInfoForTask");
    private final static QName _UpdatePriority_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "updatePriority");
    private final static QName _PrepareForRestartRootTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "prepareForRestartRootTask");
    private final static QName _ResumeTimers_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "resumeTimers");
    private final static QName _UpdatePriorityOfTasks_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "updatePriorityOfTasks");
    private final static QName _DelegateTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "delegateTask");
    private final static QName _AddCommentToTasks_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "addCommentToTasks");
    private final static QName _SetTaskSequenceChangesOutput_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "setTaskSequenceChangesOutput");
    private final static QName _RestartRootTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "restartRootTask");
    private final static QName _AddAttachment_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "addAttachment");
    private final static QName _StageCompleteMessage_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "stageCompleteMessage");
    private final static QName _DeleteTasks_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "deleteTasks");
    private final static QName _ResumeTasks_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "resumeTasks");
    private final static QName _SubmitInfoForTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "submitInfoForTask");
    private final static QName _OverrideRoutingSlip_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "overrideRoutingSlip");
    private final static QName _PushBackTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "pushBackTask");
    private final static QName _RequestInfoForTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "requestInfoForTask");
    private final static QName _SkipCurrentAssignment_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "skipCurrentAssignment");
    private final static QName _AddDocument_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "addDocument");
    private final static QName _UpdateTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "updateTask");
    private final static QName _SubTaskUpdatedMessage_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "subTaskUpdatedMessage");
    private final static QName _SuccessResponseOutput_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "successResponseOutput");
    private final static QName _InitiateTaskResponse_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "initiateTaskResponse");
    private final static QName _WithdrawTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "withdrawTask");
    private final static QName _WithdrawTasks_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "withdrawTasks");
    private final static QName _EscalateTasks_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "escalateTasks");
    private final static QName _AcquireTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "acquireTask");
    private final static QName _StaleObjectFault_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "staleObjectFault");
    private final static QName _AcquireTasks_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "acquireTasks");
    private final static QName _SuspendTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "suspendTask");
    private final static QName _ResumeTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "resumeTask");
    private final static QName _UpdateTaskOutcomeAndRoute_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "updateTaskOutcomeAndRoute");
    private final static QName _ReassignTasks_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "reassignTasks");
    private final static QName _ListOfUserIds_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "listOfUserIds");
    private final static QName _ReevaluateTask_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "reevaluateTask");
    private final static QName _TaskUpdatedMessage_QNAME = new QName("http://xmlns.oracle.com/bpel/workflow/taskService", "taskUpdatedMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.task.services.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DelegateTasksType }
     * 
     */
    public DelegateTasksType createDelegateTasksType() {
        return new DelegateTasksType();
    }

    /**
     * Create an instance of {@link TaskServiceContextTaskTaskIdBaseType }
     * 
     */
    public TaskServiceContextTaskTaskIdBaseType createTaskServiceContextTaskTaskIdBaseType() {
        return new TaskServiceContextTaskTaskIdBaseType();
    }

    /**
     * Create an instance of {@link TaskAssignedMessageType }
     * 
     */
    public TaskAssignedMessageType createTaskAssignedMessageType() {
        return new TaskAssignedMessageType();
    }

    /**
     * Create an instance of {@link InitiateTaskType }
     * 
     */
    public InitiateTaskType createInitiateTaskType() {
        return new InitiateTaskType();
    }

    /**
     * Create an instance of {@link RequestInfoForTaskType }
     * 
     */
    public RequestInfoForTaskType createRequestInfoForTaskType() {
        return new RequestInfoForTaskType();
    }

    /**
     * Create an instance of {@link RemoveDocumentType }
     * 
     */
    public RemoveDocumentType createRemoveDocumentType() {
        return new RemoveDocumentType();
    }

    /**
     * Create an instance of {@link UpdateTaskOutcomeType }
     * 
     */
    public UpdateTaskOutcomeType createUpdateTaskOutcomeType() {
        return new UpdateTaskOutcomeType();
    }

    /**
     * Create an instance of {@link AddCommentType }
     * 
     */
    public AddCommentType createAddCommentType() {
        return new AddCommentType();
    }

    /**
     * Create an instance of {@link TaskIdsType }
     * 
     */
    public TaskIdsType createTaskIdsType() {
        return new TaskIdsType();
    }

    /**
     * Create an instance of {@link DecomposeTaskType }
     * 
     */
    public DecomposeTaskType createDecomposeTaskType() {
        return new DecomposeTaskType();
    }

    /**
     * Create an instance of {@link RenewTaskType }
     * 
     */
    public RenewTaskType createRenewTaskType() {
        return new RenewTaskType();
    }

    /**
     * Create an instance of {@link FaultMessageType }
     * 
     */
    public FaultMessageType createFaultMessageType() {
        return new FaultMessageType();
    }

    /**
     * Create an instance of {@link ReassignTaskType }
     * 
     */
    public ReassignTaskType createReassignTaskType() {
        return new ReassignTaskType();
    }

    /**
     * Create an instance of {@link TaskServiceContextTaskBaseType }
     * 
     */
    public TaskServiceContextTaskBaseType createTaskServiceContextTaskBaseType() {
        return new TaskServiceContextTaskBaseType();
    }

    /**
     * Create an instance of {@link RouteTaskType }
     * 
     */
    public RouteTaskType createRouteTaskType() {
        return new RouteTaskType();
    }

    /**
     * Create an instance of {@link UpdateOutcomeOfTasks }
     * 
     */
    public UpdateOutcomeOfTasks createUpdateOutcomeOfTasks() {
        return new UpdateOutcomeOfTasks();
    }

    /**
     * Create an instance of {@link CreateToDoTaskType }
     * 
     */
    public CreateToDoTaskType createCreateToDoTaskType() {
        return new CreateToDoTaskType();
    }

    /**
     * Create an instance of {@link RemoveAttachmentType }
     * 
     */
    public RemoveAttachmentType createRemoveAttachmentType() {
        return new RemoveAttachmentType();
    }

    /**
     * Create an instance of {@link SetTaskSequenceChangesType }
     * 
     */
    public SetTaskSequenceChangesType createSetTaskSequenceChangesType() {
        return new SetTaskSequenceChangesType();
    }

    /**
     * Create an instance of {@link UpdateTaskOutcomeAndRouteType }
     * 
     */
    public UpdateTaskOutcomeAndRouteType createUpdateTaskOutcomeAndRouteType() {
        return new UpdateTaskOutcomeAndRouteType();
    }

    /**
     * Create an instance of {@link TaskUpdatedMessageType }
     * 
     */
    public TaskUpdatedMessageType createTaskUpdatedMessageType() {
        return new TaskUpdatedMessageType();
    }

    /**
     * Create an instance of {@link ListOfUserIdsType }
     * 
     */
    public ListOfUserIdsType createListOfUserIdsType() {
        return new ListOfUserIdsType();
    }

    /**
     * Create an instance of {@link ReevaluateTaskType }
     * 
     */
    public ReevaluateTaskType createReevaluateTaskType() {
        return new ReevaluateTaskType();
    }

    /**
     * Create an instance of {@link ReassignTasksType }
     * 
     */
    public ReassignTasksType createReassignTasksType() {
        return new ReassignTasksType();
    }

    /**
     * Create an instance of {@link OverrideRoutingSlipType }
     * 
     */
    public OverrideRoutingSlipType createOverrideRoutingSlipType() {
        return new OverrideRoutingSlipType();
    }

    /**
     * Create an instance of {@link AddDocumentType }
     * 
     */
    public AddDocumentType createAddDocumentType() {
        return new AddDocumentType();
    }

    /**
     * Create an instance of {@link SubTaskUpdatedMessageType }
     * 
     */
    public SubTaskUpdatedMessageType createSubTaskUpdatedMessageType() {
        return new SubTaskUpdatedMessageType();
    }

    /**
     * Create an instance of {@link StageCompleteMessageType }
     * 
     */
    public StageCompleteMessageType createStageCompleteMessageType() {
        return new StageCompleteMessageType();
    }

    /**
     * Create an instance of {@link PriorityIdsListType }
     * 
     */
    public PriorityIdsListType createPriorityIdsListType() {
        return new PriorityIdsListType();
    }

    /**
     * Create an instance of {@link PriorityIdsType }
     * 
     */
    public PriorityIdsType createPriorityIdsType() {
        return new PriorityIdsType();
    }

    /**
     * Create an instance of {@link RestartRootTaskType }
     * 
     */
    public RestartRootTaskType createRestartRootTaskType() {
        return new RestartRootTaskType();
    }

    /**
     * Create an instance of {@link AddCommentToTasks }
     * 
     */
    public AddCommentToTasks createAddCommentToTasks() {
        return new AddCommentToTasks();
    }

    /**
     * Create an instance of {@link AddAttachmentType }
     * 
     */
    public AddAttachmentType createAddAttachmentType() {
        return new AddAttachmentType();
    }

    /**
     * Create an instance of {@link DelegateTaskType }
     * 
     */
    public DelegateTaskType createDelegateTaskType() {
        return new DelegateTaskType();
    }

    /**
     * Create an instance of {@link TaskAssigneeType }
     * 
     */
    public TaskAssigneeType createTaskAssigneeType() {
        return new TaskAssigneeType();
    }

    /**
     * Create an instance of {@link TaskAssigneesType }
     * 
     */
    public TaskAssigneesType createTaskAssigneesType() {
        return new TaskAssigneesType();
    }

    /**
     * Create an instance of {@link RestartContextType }
     * 
     */
    public RestartContextType createRestartContextType() {
        return new RestartContextType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceContextTaskBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "mergeAndUpdateTask")
    public JAXBElement<TaskServiceContextTaskBaseType> createMergeAndUpdateTask(TaskServiceContextTaskBaseType value) {
        return new JAXBElement<TaskServiceContextTaskBaseType>(_MergeAndUpdateTask_QNAME, TaskServiceContextTaskBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceContextTaskTaskIdBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "suspendTimers")
    public JAXBElement<TaskServiceContextTaskTaskIdBaseType> createSuspendTimers(TaskServiceContextTaskTaskIdBaseType value) {
        return new JAXBElement<TaskServiceContextTaskTaskIdBaseType>(_SuspendTimers_QNAME, TaskServiceContextTaskTaskIdBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceContextTaskTaskIdBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "releaseTask")
    public JAXBElement<TaskServiceContextTaskTaskIdBaseType> createReleaseTask(TaskServiceContextTaskTaskIdBaseType value) {
        return new JAXBElement<TaskServiceContextTaskTaskIdBaseType>(_ReleaseTask_QNAME, TaskServiceContextTaskTaskIdBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOutcomeOfTasks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "updateOutcomeOfTasks")
    public JAXBElement<UpdateOutcomeOfTasks> createUpdateOutcomeOfTasks(UpdateOutcomeOfTasks value) {
        return new JAXBElement<UpdateOutcomeOfTasks>(_UpdateOutcomeOfTasks_QNAME, UpdateOutcomeOfTasks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateToDoTaskType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "createToDoTask")
    public JAXBElement<CreateToDoTaskType> createCreateToDoTask(CreateToDoTaskType value) {
        return new JAXBElement<CreateToDoTaskType>(_CreateToDoTask_QNAME, CreateToDoTaskType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitiateTaskType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "reinitiateTask")
    public JAXBElement<InitiateTaskType> createReinitiateTask(InitiateTaskType value) {
        return new JAXBElement<InitiateTaskType>(_ReinitiateTask_QNAME, InitiateTaskType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteTaskType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "routeTask")
    public JAXBElement<RouteTaskType> createRouteTask(RouteTaskType value) {
        return new JAXBElement<RouteTaskType>(_RouteTask_QNAME, RouteTaskType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "reevaluateTaskOutput")
    public JAXBElement<Boolean> createReevaluateTaskOutput(Boolean value) {
        return new JAXBElement<Boolean>(_ReevaluateTaskOutput_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetTaskSequenceChangesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "setTaskSequenceChanges")
    public JAXBElement<SetTaskSequenceChangesType> createSetTaskSequenceChanges(SetTaskSequenceChangesType value) {
        return new JAXBElement<SetTaskSequenceChangesType>(_SetTaskSequenceChanges_QNAME, SetTaskSequenceChangesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "removeAttachment")
    public JAXBElement<RemoveAttachmentType> createRemoveAttachment(RemoveAttachmentType value) {
        return new JAXBElement<RemoveAttachmentType>(_RemoveAttachment_QNAME, RemoveAttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskIdsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "purgeTasks")
    public JAXBElement<TaskIdsType> createPurgeTasks(TaskIdsType value) {
        return new JAXBElement<TaskIdsType>(_PurgeTasks_QNAME, TaskIdsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceContextTaskTaskIdBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "purgeTask")
    public JAXBElement<TaskServiceContextTaskTaskIdBaseType> createPurgeTask(TaskServiceContextTaskTaskIdBaseType value) {
        return new JAXBElement<TaskServiceContextTaskTaskIdBaseType>(_PurgeTask_QNAME, TaskServiceContextTaskTaskIdBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceContextTaskTaskIdBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "getApprovers")
    public JAXBElement<TaskServiceContextTaskTaskIdBaseType> createGetApprovers(TaskServiceContextTaskTaskIdBaseType value) {
        return new JAXBElement<TaskServiceContextTaskTaskIdBaseType>(_GetApprovers_QNAME, TaskServiceContextTaskTaskIdBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceContextTaskTaskIdBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "deleteTask")
    public JAXBElement<TaskServiceContextTaskTaskIdBaseType> createDeleteTask(TaskServiceContextTaskTaskIdBaseType value) {
        return new JAXBElement<TaskServiceContextTaskTaskIdBaseType>(_DeleteTask_QNAME, TaskServiceContextTaskTaskIdBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "operationErroredFault")
    public JAXBElement<FaultMessageType> createOperationErroredFault(FaultMessageType value) {
        return new JAXBElement<FaultMessageType>(_OperationErroredFault_QNAME, FaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecomposeTaskType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "decomposeTask")
    public JAXBElement<DecomposeTaskType> createDecomposeTask(DecomposeTaskType value) {
        return new JAXBElement<DecomposeTaskType>(_DecomposeTask_QNAME, DecomposeTaskType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenewTaskType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "renewTask")
    public JAXBElement<RenewTaskType> createRenewTask(RenewTaskType value) {
        return new JAXBElement<RenewTaskType>(_RenewTask_QNAME, RenewTaskType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceContextTaskBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "reinitiateTaskResponse")
    public JAXBElement<TaskServiceContextTaskBaseType> createReinitiateTaskResponse(TaskServiceContextTaskBaseType value) {
        return new JAXBElement<TaskServiceContextTaskBaseType>(_ReinitiateTaskResponse_QNAME, TaskServiceContextTaskBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskIdsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "suspendTasks")
    public JAXBElement<TaskIdsType> createSuspendTasks(TaskIdsType value) {
        return new JAXBElement<TaskIdsType>(_SuspendTasks_QNAME, TaskIdsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReassignTaskType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "reassignTask")
    public JAXBElement<ReassignTaskType> createReassignTask(ReassignTaskType value) {
        return new JAXBElement<ReassignTaskType>(_ReassignTask_QNAME, ReassignTaskType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTaskOutcomeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "updateTaskOutcome")
    public JAXBElement<UpdateTaskOutcomeType> createUpdateTaskOutcome(UpdateTaskOutcomeType value) {
        return new JAXBElement<UpdateTaskOutcomeType>(_UpdateTaskOutcome_QNAME, UpdateTaskOutcomeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCommentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "addComment")
    public JAXBElement<AddCommentType> createAddComment(AddCommentType value) {
        return new JAXBElement<AddCommentType>(_AddComment_QNAME, AddCommentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceContextTaskTaskIdBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "escalateTask")
    public JAXBElement<TaskServiceContextTaskTaskIdBaseType> createEscalateTask(TaskServiceContextTaskTaskIdBaseType value) {
        return new JAXBElement<TaskServiceContextTaskTaskIdBaseType>(_EscalateTask_QNAME, TaskServiceContextTaskTaskIdBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "removeDocument")
    public JAXBElement<RemoveDocumentType> createRemoveDocument(RemoveDocumentType value) {
        return new JAXBElement<RemoveDocumentType>(_RemoveDocument_QNAME, RemoveDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "bulkOperationOutput")
    public JAXBElement<Boolean> createBulkOperationOutput(Boolean value) {
        return new JAXBElement<Boolean>(_BulkOperationOutput_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskIdsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "releaseTasks")
    public JAXBElement<TaskIdsType> createReleaseTasks(TaskIdsType value) {
        return new JAXBElement<TaskIdsType>(_ReleaseTasks_QNAME, TaskIdsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceContextTaskTaskIdBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "getFutureParticipants")
    public JAXBElement<TaskServiceContextTaskTaskIdBaseType> createGetFutureParticipants(TaskServiceContextTaskTaskIdBaseType value) {
        return new JAXBElement<TaskServiceContextTaskTaskIdBaseType>(_GetFutureParticipants_QNAME, TaskServiceContextTaskTaskIdBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskAssignedMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "taskAssignedMessage")
    public JAXBElement<TaskAssignedMessageType> createTaskAssignedMessage(TaskAssignedMessageType value) {
        return new JAXBElement<TaskAssignedMessageType>(_TaskAssignedMessage_QNAME, TaskAssignedMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceContextTaskTaskIdBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "errorTask")
    public JAXBElement<TaskServiceContextTaskTaskIdBaseType> createErrorTask(TaskServiceContextTaskTaskIdBaseType value) {
        return new JAXBElement<TaskServiceContextTaskTaskIdBaseType>(_ErrorTask_QNAME, TaskServiceContextTaskTaskIdBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelegateTasksType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "delegateTasks")
    public JAXBElement<DelegateTasksType> createDelegateTasks(DelegateTasksType value) {
        return new JAXBElement<DelegateTasksType>(_DelegateTasks_QNAME, DelegateTasksType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "purgeTaskOutput")
    public JAXBElement<Boolean> createPurgeTaskOutput(Boolean value) {
        return new JAXBElement<Boolean>(_PurgeTaskOutput_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitiateTaskType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "initiateTask")
    public JAXBElement<InitiateTaskType> createInitiateTask(InitiateTaskType value) {
        return new JAXBElement<InitiateTaskType>(_InitiateTask_QNAME, InitiateTaskType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestInfoForTaskType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "requestInfoForTaskWithReapproval")
    public JAXBElement<RequestInfoForTaskType> createRequestInfoForTaskWithReapproval(RequestInfoForTaskType value) {
        return new JAXBElement<RequestInfoForTaskType>(_RequestInfoForTaskWithReapproval_QNAME, RequestInfoForTaskType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceContextTaskTaskIdBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "getUsersToRequestInfoForTask")
    public JAXBElement<TaskServiceContextTaskTaskIdBaseType> createGetUsersToRequestInfoForTask(TaskServiceContextTaskTaskIdBaseType value) {
        return new JAXBElement<TaskServiceContextTaskTaskIdBaseType>(_GetUsersToRequestInfoForTask_QNAME, TaskServiceContextTaskTaskIdBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriorityIdsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "updatePriority")
    public JAXBElement<PriorityIdsType> createUpdatePriority(PriorityIdsType value) {
        return new JAXBElement<PriorityIdsType>(_UpdatePriority_QNAME, PriorityIdsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestartRootTaskType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "prepareForRestartRootTask")
    public JAXBElement<RestartRootTaskType> createPrepareForRestartRootTask(RestartRootTaskType value) {
        return new JAXBElement<RestartRootTaskType>(_PrepareForRestartRootTask_QNAME, RestartRootTaskType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceContextTaskTaskIdBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "resumeTimers")
    public JAXBElement<TaskServiceContextTaskTaskIdBaseType> createResumeTimers(TaskServiceContextTaskTaskIdBaseType value) {
        return new JAXBElement<TaskServiceContextTaskTaskIdBaseType>(_ResumeTimers_QNAME, TaskServiceContextTaskTaskIdBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriorityIdsListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "updatePriorityOfTasks")
    public JAXBElement<PriorityIdsListType> createUpdatePriorityOfTasks(PriorityIdsListType value) {
        return new JAXBElement<PriorityIdsListType>(_UpdatePriorityOfTasks_QNAME, PriorityIdsListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelegateTaskType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "delegateTask")
    public JAXBElement<DelegateTaskType> createDelegateTask(DelegateTaskType value) {
        return new JAXBElement<DelegateTaskType>(_DelegateTask_QNAME, DelegateTaskType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCommentToTasks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "addCommentToTasks")
    public JAXBElement<AddCommentToTasks> createAddCommentToTasks(AddCommentToTasks value) {
        return new JAXBElement<AddCommentToTasks>(_AddCommentToTasks_QNAME, AddCommentToTasks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "setTaskSequenceChangesOutput")
    public JAXBElement<Integer> createSetTaskSequenceChangesOutput(Integer value) {
        return new JAXBElement<Integer>(_SetTaskSequenceChangesOutput_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestartRootTaskType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "restartRootTask")
    public JAXBElement<RestartRootTaskType> createRestartRootTask(RestartRootTaskType value) {
        return new JAXBElement<RestartRootTaskType>(_RestartRootTask_QNAME, RestartRootTaskType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "addAttachment")
    public JAXBElement<AddAttachmentType> createAddAttachment(AddAttachmentType value) {
        return new JAXBElement<AddAttachmentType>(_AddAttachment_QNAME, AddAttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StageCompleteMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "stageCompleteMessage")
    public JAXBElement<StageCompleteMessageType> createStageCompleteMessage(StageCompleteMessageType value) {
        return new JAXBElement<StageCompleteMessageType>(_StageCompleteMessage_QNAME, StageCompleteMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskIdsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "deleteTasks")
    public JAXBElement<TaskIdsType> createDeleteTasks(TaskIdsType value) {
        return new JAXBElement<TaskIdsType>(_DeleteTasks_QNAME, TaskIdsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskIdsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "resumeTasks")
    public JAXBElement<TaskIdsType> createResumeTasks(TaskIdsType value) {
        return new JAXBElement<TaskIdsType>(_ResumeTasks_QNAME, TaskIdsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceContextTaskBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "submitInfoForTask")
    public JAXBElement<TaskServiceContextTaskBaseType> createSubmitInfoForTask(TaskServiceContextTaskBaseType value) {
        return new JAXBElement<TaskServiceContextTaskBaseType>(_SubmitInfoForTask_QNAME, TaskServiceContextTaskBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OverrideRoutingSlipType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "overrideRoutingSlip")
    public JAXBElement<OverrideRoutingSlipType> createOverrideRoutingSlip(OverrideRoutingSlipType value) {
        return new JAXBElement<OverrideRoutingSlipType>(_OverrideRoutingSlip_QNAME, OverrideRoutingSlipType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceContextTaskTaskIdBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "pushBackTask")
    public JAXBElement<TaskServiceContextTaskTaskIdBaseType> createPushBackTask(TaskServiceContextTaskTaskIdBaseType value) {
        return new JAXBElement<TaskServiceContextTaskTaskIdBaseType>(_PushBackTask_QNAME, TaskServiceContextTaskTaskIdBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestInfoForTaskType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "requestInfoForTask")
    public JAXBElement<RequestInfoForTaskType> createRequestInfoForTask(RequestInfoForTaskType value) {
        return new JAXBElement<RequestInfoForTaskType>(_RequestInfoForTask_QNAME, RequestInfoForTaskType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceContextTaskBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "skipCurrentAssignment")
    public JAXBElement<TaskServiceContextTaskBaseType> createSkipCurrentAssignment(TaskServiceContextTaskBaseType value) {
        return new JAXBElement<TaskServiceContextTaskBaseType>(_SkipCurrentAssignment_QNAME, TaskServiceContextTaskBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "addDocument")
    public JAXBElement<AddDocumentType> createAddDocument(AddDocumentType value) {
        return new JAXBElement<AddDocumentType>(_AddDocument_QNAME, AddDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceContextTaskBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "updateTask")
    public JAXBElement<TaskServiceContextTaskBaseType> createUpdateTask(TaskServiceContextTaskBaseType value) {
        return new JAXBElement<TaskServiceContextTaskBaseType>(_UpdateTask_QNAME, TaskServiceContextTaskBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubTaskUpdatedMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "subTaskUpdatedMessage")
    public JAXBElement<SubTaskUpdatedMessageType> createSubTaskUpdatedMessage(SubTaskUpdatedMessageType value) {
        return new JAXBElement<SubTaskUpdatedMessageType>(_SubTaskUpdatedMessage_QNAME, SubTaskUpdatedMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "successResponseOutput")
    public JAXBElement<String> createSuccessResponseOutput(String value) {
        return new JAXBElement<String>(_SuccessResponseOutput_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceContextTaskBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "initiateTaskResponse")
    public JAXBElement<TaskServiceContextTaskBaseType> createInitiateTaskResponse(TaskServiceContextTaskBaseType value) {
        return new JAXBElement<TaskServiceContextTaskBaseType>(_InitiateTaskResponse_QNAME, TaskServiceContextTaskBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceContextTaskTaskIdBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "withdrawTask")
    public JAXBElement<TaskServiceContextTaskTaskIdBaseType> createWithdrawTask(TaskServiceContextTaskTaskIdBaseType value) {
        return new JAXBElement<TaskServiceContextTaskTaskIdBaseType>(_WithdrawTask_QNAME, TaskServiceContextTaskTaskIdBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskIdsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "withdrawTasks")
    public JAXBElement<TaskIdsType> createWithdrawTasks(TaskIdsType value) {
        return new JAXBElement<TaskIdsType>(_WithdrawTasks_QNAME, TaskIdsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskIdsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "escalateTasks")
    public JAXBElement<TaskIdsType> createEscalateTasks(TaskIdsType value) {
        return new JAXBElement<TaskIdsType>(_EscalateTasks_QNAME, TaskIdsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceContextTaskTaskIdBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "acquireTask")
    public JAXBElement<TaskServiceContextTaskTaskIdBaseType> createAcquireTask(TaskServiceContextTaskTaskIdBaseType value) {
        return new JAXBElement<TaskServiceContextTaskTaskIdBaseType>(_AcquireTask_QNAME, TaskServiceContextTaskTaskIdBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "staleObjectFault")
    public JAXBElement<FaultMessageType> createStaleObjectFault(FaultMessageType value) {
        return new JAXBElement<FaultMessageType>(_StaleObjectFault_QNAME, FaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskIdsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "acquireTasks")
    public JAXBElement<TaskIdsType> createAcquireTasks(TaskIdsType value) {
        return new JAXBElement<TaskIdsType>(_AcquireTasks_QNAME, TaskIdsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceContextTaskTaskIdBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "suspendTask")
    public JAXBElement<TaskServiceContextTaskTaskIdBaseType> createSuspendTask(TaskServiceContextTaskTaskIdBaseType value) {
        return new JAXBElement<TaskServiceContextTaskTaskIdBaseType>(_SuspendTask_QNAME, TaskServiceContextTaskTaskIdBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceContextTaskTaskIdBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "resumeTask")
    public JAXBElement<TaskServiceContextTaskTaskIdBaseType> createResumeTask(TaskServiceContextTaskTaskIdBaseType value) {
        return new JAXBElement<TaskServiceContextTaskTaskIdBaseType>(_ResumeTask_QNAME, TaskServiceContextTaskTaskIdBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTaskOutcomeAndRouteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "updateTaskOutcomeAndRoute")
    public JAXBElement<UpdateTaskOutcomeAndRouteType> createUpdateTaskOutcomeAndRoute(UpdateTaskOutcomeAndRouteType value) {
        return new JAXBElement<UpdateTaskOutcomeAndRouteType>(_UpdateTaskOutcomeAndRoute_QNAME, UpdateTaskOutcomeAndRouteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReassignTasksType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "reassignTasks")
    public JAXBElement<ReassignTasksType> createReassignTasks(ReassignTasksType value) {
        return new JAXBElement<ReassignTasksType>(_ReassignTasks_QNAME, ReassignTasksType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfUserIdsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "listOfUserIds")
    public JAXBElement<ListOfUserIdsType> createListOfUserIds(ListOfUserIdsType value) {
        return new JAXBElement<ListOfUserIdsType>(_ListOfUserIds_QNAME, ListOfUserIdsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReevaluateTaskType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "reevaluateTask")
    public JAXBElement<ReevaluateTaskType> createReevaluateTask(ReevaluateTaskType value) {
        return new JAXBElement<ReevaluateTaskType>(_ReevaluateTask_QNAME, ReevaluateTaskType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskUpdatedMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/bpel/workflow/taskService", name = "taskUpdatedMessage")
    public JAXBElement<TaskUpdatedMessageType> createTaskUpdatedMessage(TaskUpdatedMessageType value) {
        return new JAXBElement<TaskUpdatedMessageType>(_TaskUpdatedMessage_QNAME, TaskUpdatedMessageType.class, null, value);
    }

}
