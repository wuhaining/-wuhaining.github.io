package task.util;

import java.math.BigInteger;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


import com.task.services.TaskService_Service;
import com.task.services.TaskService;

import com.taskQuery.services.TaskQueryService_Service;
import com.taskQuery.services.TaskQueryService;
import com.taskQuery.services.WorkflowErrorMessage;

import oracle.adf.share.logging.ADFLogger;

import oracle.bpel.services.workflow.common.model.CredentialType;
import oracle.bpel.services.workflow.common.model.WorkflowContextType;
import oracle.bpel.services.workflow.query.model.AssignmentFilterEnum;
import oracle.bpel.services.workflow.query.model.ClauseType;
import oracle.bpel.services.workflow.query.model.ColumnType;
import oracle.bpel.services.workflow.query.model.CountTasksRequestType;
import oracle.bpel.services.workflow.query.model.DisplayColumnType;
import oracle.bpel.services.workflow.query.model.OrderingClauseType;
import oracle.bpel.services.workflow.query.model.PredicateClauseType;
import oracle.bpel.services.workflow.query.model.PredicateOperationEnum;
import oracle.bpel.services.workflow.query.model.PredicateType;
import oracle.bpel.services.workflow.query.model.SortOrderEnum;
import oracle.bpel.services.workflow.query.model.TaskDetailsByIdRequestType;
import oracle.bpel.services.workflow.query.model.TaskDetailsByNumberRequestType;
import oracle.bpel.services.workflow.query.model.TaskListRequestType;
import oracle.bpel.services.workflow.query.model.TaskListResponseType;
import oracle.bpel.services.workflow.query.model.TaskOptionalInfoEnum;
import oracle.bpel.services.workflow.query.model.TaskOptionalInfoType;
import oracle.bpel.services.workflow.query.model.TaskOrderingType;
import oracle.bpel.services.workflow.query.model.TaskPredicateQueryType;
import oracle.bpel.services.workflow.query.model.TaskPredicateType;
import oracle.bpel.services.workflow.query.model.ValueListType;
import oracle.bpel.services.workflow.task.model.Task;

public class BpmUtils {
    public BpmUtils() {
        super();
    }
    
    
    /**
     * function: authenticateContext 
     * @功能：登陆验证【确定在有操作者的状态下操作】
     * @param：TaskQueryService/Map  从Map中得到登陆用户与密码【从登陆的session中得到，页面上取得】
     * @author：
     * @修改时间：
     * */
//     public static WorkflowContextType authenticateContext(TaskQueryService taskQueryService,Map map){
//            String login = map.get("USERNAME").toString();
//            String password = map.get("PASSWORD").toString();
//            CredentialType credentialType = new CredentialType();
//            credentialType.setLogin(login);
//            credentialType.setPassword(password);
//            System.out.println("Authenticating...");
//            WorkflowContextType workflowContextType;
//        try {
//            workflowContextType = taskQueryService.authenticate(credentialType);
//        } catch (WorkflowErrorMessage e) {
//            e.printStackTrace();
//            System.out.println("认证失败！！！");
//            return null;
//        }
//            
//            System.out.println("Authenticated to TaskQueryService");
//            return workflowContextType;
//    }
    
    /**
     * 登陆验证【不需要密码，只使用username---从seeion中取得认证Token】
     * */
    //如果TOKEN失效，则使用初次Context
    public static WorkflowContextType  getWorkflowContextType(String username){
        CredentialType credential= new CredentialType();
        credential.setLogin("weblogic");
        credential.setPassword("12345678");
        credential.setOnBehalfOfUser(username);
        WorkflowContextType ctx= new WorkflowContextType();
        ctx.setCredential(credential);
        return ctx;
    }
    //第一次登陆需要做第一次的认证，认证成功后得到一个WorkflowContext
    public static WorkflowContextType  getWorkflowContextTypeAfterLogin(TaskQueryService taskQueryService,String username) throws WorkflowErrorMessage {
        CredentialType credential= new CredentialType();
        credential.setLogin("weblogic");
        credential.setPassword("12345678");
        credential.setOnBehalfOfUser(username);
        WorkflowContextType ctx=taskQueryService.authenticate(credential);
        return ctx;
    }
    //将WorkflowContext中的Token取出，用户可将该Token放入Session中
    public static String   getWorkflowContextToken(WorkflowContextType wct){
        return wct.getToken();
    }
    
    //根据token是否存在，决定是否需要重新认证USERNAME/TOKEN
    public static WorkflowContextType getWorkflowContextTypeByToken(Map map){
            String username = map.get("USERNAME").toString();
            String token = map.get("TOKEN").toString();
            WorkflowContextType workflowContextType = new WorkflowContextType();
            if(token!=null&&!token.equals("")){
                    //System.out.println("----token存在------");
                    workflowContextType.setToken(token); 
                }
            else{
                    //System.out.println("----token不存在，重新认证------");
                    workflowContextType = getWorkflowContextType(username);
                }
            return workflowContextType;
        }
    
    
    /**
     * function: queryTaskByTaskId
     * @功能:根据taskId查询相关task
     * @param：TaskQueryService/Map  从Map中得到相关的taskId【从登陆的session中得到，页面上取得】USERNAME/TOKEN/TASKID
     * @author：
     * @修改时间：
     * */
    public static Task queryTaskByTaskId(TaskQueryService taskQueryService,Map map){ 
            String taskId = map.get("TASKID").toString(); 
            //WorkflowContextType workflowContextType = authenticateContext(taskQueryService,map);
            TaskDetailsByIdRequestType taskDetailsByIdRequestType = new TaskDetailsByIdRequestType();
            taskDetailsByIdRequestType.setTaskId(taskId);
            taskDetailsByIdRequestType.setWorkflowContext(getWorkflowContextTypeByToken(map));
            Task task;
        try {
            task = taskQueryService.getTaskDetailsById(taskDetailsByIdRequestType);
            //System.out.println("查询任务成功！！！");
            return task;
        } catch (WorkflowErrorMessage e) {
            e.printStackTrace();
            //System.out.println("查询任务失败！！！");
            return null;
        }
        
    }
    
    /**
     * function: queryTaskByTaskNumber
     * @功能:根据taskNumber查询相关task
     * @param：TaskQueryService/Map  从Map中得到相关的taskNumber【从登陆的session中得到，页面上取得】
     * @author：
     * @修改时间：
     * */
    public static Task queryTaskByTaskNumber(TaskQueryService taskQueryService,Map map){
            BigInteger taskNumber = new BigInteger(map.get("TASKNUMBER").toString());
            //WorkflowContextType workflowContextType = authenticateContext(taskQueryService,map);
            TaskDetailsByNumberRequestType taskDetailsByNumberRequestType = new TaskDetailsByNumberRequestType();
            taskDetailsByNumberRequestType.setTaskNumber(taskNumber);
            taskDetailsByNumberRequestType.setWorkflowContext(getWorkflowContextTypeByToken(map));
            Task task;
        try {
            task = taskQueryService.getTaskDetailsByNumber(taskDetailsByNumberRequestType);
            //System.out.println("查询任务成功！！！");
            return task;
        } catch (WorkflowErrorMessage e) {
            e.printStackTrace();
            //System.out.println("查询任务失败！！！");
            return null;
        }
    }
    
    
    
    /**
     * function: queryTaskListWithPages
     * @功能: 查询人物Task【分页】
     * @param：int currentPage--当前页
     *      int everyCountOfpage--每页多少条记录
     *      Map map
     * @author:
     * @修改时间：
     * */
    public static List<Task> queryTaskListWithPages(Map map,int currentPage,int everyCountOfpage){
            TaskQueryService_Service taskQueryService_Service = new TaskQueryService_Service();
            TaskQueryService taskQueryService = taskQueryService_Service.getTaskQueryServicePort();
            //WorkflowContextType workflowContextType = authenticateContext(taskQueryService,map);
            
            TaskListRequestType taskListRequestType = new TaskListRequestType();
            TaskPredicateQueryType taskPredicateQueryType = new TaskPredicateQueryType();
            
            //DisplayColumnType
            DisplayColumnType displayColumnType = new DisplayColumnType();
            List<String> queryColumns = displayColumnType.getDisplayColumn();
            queryColumns.add("TASKID");
            queryColumns.add("TASKNUMBER");
            queryColumns.add("TITLE");
            queryColumns.add("OUTCOME");
            queryColumns.add("TEXTATTRIBUTE1");
            queryColumns.add("TEXTATTRIBUTE2");
            
            //TaskPredicateType
            TaskPredicateType taskPredicateType = new TaskPredicateType();
            taskPredicateType.setAssignmentFilter(AssignmentFilterEnum.MY);
            taskPredicateType.setAssignmentFilter(AssignmentFilterEnum.MY_GROUP_ALL);
            PredicateType predicateType1 = new PredicateType();
            PredicateType predicateType2 = new PredicateType();
            predicateType1.setLhs(predicateType2);
            PredicateClauseType predicateClauseType = new PredicateClauseType();
            ClauseType clauseType = new ClauseType();
            ValueListType valueListType = new ValueListType();
            valueListType.getValue().add("ASSIGNED");
            valueListType.getValue().add("INFO_REQUESTED");
            valueListType.getValue().add("OUTCOME_UPDATED");
            clauseType.setValueList(valueListType);
            clauseType.setOperator(PredicateOperationEnum.IN);
            ColumnType columnType = new ColumnType();
            columnType.setTableName("WFTask");
            columnType.setColumnName("state");
            clauseType.setColumn(columnType);
            predicateType2.getClause().add(clauseType);
            taskPredicateType.setPredicate(predicateType2);
            
            //TaskOptionalInfoType
            TaskOptionalInfoType taskOptionalInfoType = new TaskOptionalInfoType();
            taskOptionalInfoType.getTaskOptionalInfo().add(TaskOptionalInfoEnum.ACTIONS);
            
            //TaskOrderingType
            TaskOrderingType taskOrderingType = new TaskOrderingType();
            OrderingClauseType orderingClauseType = new OrderingClauseType();
            orderingClauseType.setColumn("TEXTATTRIBUTE2");
            orderingClauseType.setSortOrder(SortOrderEnum.DESCENDING);
            taskOrderingType.getClause().add(orderingClauseType);
            
            //分页
            int startRow =(currentPage-1)*everyCountOfpage+1;//
            int endRow=currentPage*everyCountOfpage;//每页显示多少条记录
            
            //taskPredicateQueryType
            taskPredicateQueryType.setDisplayColumnList(displayColumnType);
            taskPredicateQueryType.setPredicate(taskPredicateType);
            taskPredicateQueryType.setOrdering(taskOrderingType);
            taskPredicateQueryType.setOptionalInfoList(taskOptionalInfoType);
            taskPredicateQueryType.setStartRow(BigInteger.valueOf(startRow));
            taskPredicateQueryType.setEndRow(BigInteger.valueOf(endRow));
            
            //taskListRequestType
            taskListRequestType.setTaskPredicateQuery(taskPredicateQueryType);
            taskListRequestType.setWorkflowContext(getWorkflowContextTypeByToken(map));
            
            //TaskListResponseType
            TaskListResponseType taskListResponseType;

        try {
            //System.out.println("-------查询开始----------");
            taskListResponseType = taskQueryService.queryTasks(taskListRequestType);
            //System.out.println("-------查询结束----------");
            List<Task> taskList = taskListResponseType.getTask();
            //System.out.println("每页显示多少条记录："+taskList.size()+"条");//查询出来的task的数量
            return taskList;
        } catch (WorkflowErrorMessage e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    
    /**
     * function: queryTaskCount
     * @功能: 获取当前用户总任务数
     * @param： Map map
     * @author:
     * @修改时间：
     * */
    public static int queryTaskCount(Map map){
            TaskQueryService_Service taskQueryService_Service = new TaskQueryService_Service();
            TaskQueryService taskQueryService = taskQueryService_Service.getTaskQueryServicePort();
            //WorkflowContextType workflowContextType = authenticateContext(taskQueryService,map);
            
            CountTasksRequestType countTasksRequestType = new CountTasksRequestType();
            TaskPredicateQueryType taskPredicateQueryType = new TaskPredicateQueryType();
            
            //DisplayColumnType 
            DisplayColumnType displayColumnType = new DisplayColumnType();
            List<String> queryColumns = displayColumnType.getDisplayColumn();
            queryColumns.add("TASKID");
            queryColumns.add("TASKNUMBER");
            queryColumns.add("TITLE");
            queryColumns.add("OUTCOME");
            queryColumns.add("TEXTATTRIBUTE1");
            queryColumns.add("TEXTATTRIBUTE2");
            //TaskPredicateType
            TaskPredicateType taskPredicateType = new TaskPredicateType();
            taskPredicateType.setAssignmentFilter(AssignmentFilterEnum.MY);//控制查询那些用户拥有task的数量【范围】
            //taskPredicateType.setAssignmentFilter(AssignmentFilterEnum.MY_GROUP);
            taskPredicateType.setAssignmentFilter(AssignmentFilterEnum.MY_GROUP_ALL);
            PredicateType predicateType1 = new PredicateType();
            PredicateType predicateType2 = new PredicateType();
            predicateType1.setLhs(predicateType2);
            ClauseType clauseType = new ClauseType();
            ValueListType valueListType = new ValueListType();
            //valueListType.getValue().add("COMPLETED");
            valueListType.getValue().add("ASSIGNED");
            valueListType.getValue().add("INFO_REQUESTED");
            valueListType.getValue().add("OUTCOME_UPDATED");
            clauseType.setValueList(valueListType);
            clauseType.setOperator(PredicateOperationEnum.IN);
            ColumnType columnType = new ColumnType();
            columnType.setTableName("WFTask");
            columnType.setColumnName("state");
            clauseType.setColumn(columnType);
            predicateType2.getClause().add(clauseType);
            taskPredicateType.setPredicate(predicateType2);
            
            //TaskOptionalInfoType
            TaskOptionalInfoType taskOptionalInfoType = new TaskOptionalInfoType();
            taskOptionalInfoType.getTaskOptionalInfo().add(TaskOptionalInfoEnum.ACTIONS);
            
            //TaskOrderingType
            TaskOrderingType taskOrderingType = new TaskOrderingType();
            OrderingClauseType orderingClauseType = new OrderingClauseType();
            orderingClauseType.setColumn("DATEATTRIBUTE1");
            taskOrderingType.getClause().add(orderingClauseType);
            
            //TaskPredicateQueryType
            taskPredicateQueryType.setDisplayColumnList(displayColumnType);
            taskPredicateQueryType.setOrdering(taskOrderingType);
            taskPredicateQueryType.setOptionalInfoList(taskOptionalInfoType);
            taskPredicateQueryType.setPredicate(taskPredicateType);
            
            //CountTasksRequestType
            countTasksRequestType.setPredicate(taskPredicateType);
            countTasksRequestType.setWorkflowContext(getWorkflowContextTypeByToken(map));
            
            int count=0;
            //taskQueryService
        try {
            //System.out.println("--------查询Task数量开始----------");
            count = taskQueryService.countTasks(countTasksRequestType);
            //System.out.println("--------查询Task数量结束----------");
            //System.out.println("Task数量"+count+"条");
            return count;
        } catch (WorkflowErrorMessage e) {
            e.printStackTrace();
            return count;
        }
    }
    
}
