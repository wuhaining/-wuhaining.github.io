package task.util;

import com.task.services.StaleObjectFaultMessage;
import com.task.services.TaskService_Service;
import com.task.services.TaskService;
import com.task.services.WorkflowErrorMessage;

import com.taskQuery.services.TaskQueryService_Service;
import com.taskQuery.services.TaskQueryService;

import com.task.services.types.UpdateTaskOutcomeType;
import com.task.services.types.TaskServiceContextTaskBaseType;

import oracle.bpel.services.workflow.common.model.WorkflowContextType;
import oracle.bpel.services.workflow.task.model.Task;

import java.util.Map;
import java.util.HashMap;

public class BpmUpdate {
    public BpmUpdate() {
        super();
    }
    public static TaskService_Service taskService_Service = new TaskService_Service();
    public static TaskService taskService = taskService_Service.getTaskServicePort();
    public static TaskQueryService_Service taskQueryService_Service = new TaskQueryService_Service();
    public static TaskQueryService taskQueryService = taskQueryService_Service.getTaskQueryServicePort();
    /**
     * function:updateWorkFlow
     * 功能：Human Task 更新流程
     * 参数：Map 需要更新的数据taskId username token
     * 开发人员：伍海宁
     * 修改时间：
     * */
     public static boolean updateWorkFlow(Map map){
             TaskServiceContextTaskBaseType taskServiceContextTaskBaseType = new TaskServiceContextTaskBaseType();
             UpdateTaskOutcomeType updateTaskOutcomeType = new UpdateTaskOutcomeType();
             WorkflowContextType workflowContextType = BpmUtils.getWorkflowContextTypeByToken(map);
             //查询要更新的task
             Task oldTask;
             oldTask = BpmUtils.queryTaskByTaskId(taskQueryService, map);
             //oldTask = BpmUtils.queryTaskByTaskNumber(taskQueryService, map);
             if(oldTask != null){
                     //update【根据业务需求设置需求的数据】
                     if(map.containsKey("datas")){
                             oldTask.getSystemMessageAttributes().setTextAttribute1(map.get("datas").toString());
                         }
                     
                     if(map.containsKey("approver")){
                             oldTask.getSystemMessageAttributes().setTextAttribute2(map.get("approver").toString());
                         }
                     taskServiceContextTaskBaseType.setTask(oldTask);
                     taskServiceContextTaskBaseType.setWorkflowContext(workflowContextType);
                     
                     Task task_update1;
             try {
                 task_update1 = taskService.updateTask(taskServiceContextTaskBaseType);
             } catch (WorkflowErrorMessage e) {
                 e.printStackTrace();
                 return false;
             } catch (StaleObjectFaultMessage e) {
                 e.printStackTrace();
                 return false;
             }
             updateTaskOutcomeType.setOutcome(map.get("FLAG").toString());
             updateTaskOutcomeType.setTask(oldTask);
             updateTaskOutcomeType.setTaskId(oldTask.getSystemAttributes().getTaskId());
             updateTaskOutcomeType.setWorkflowContext(workflowContextType);
             
             Task task_update2;
             try {
                 //System.out.println("--------update开始-------------");
                 task_update2 = taskService.updateTaskOutcome(updateTaskOutcomeType);
                 ///System.out.println("--------update结束-------------");                 
                 return true;
             } catch (WorkflowErrorMessage e) {
                 e.printStackTrace();
                 return false;
             } catch (StaleObjectFaultMessage e) {
                 e.printStackTrace();
                 return false;
             }
         }
             else{
                 return false;
                 }
             
             
         }
    
    
}
