package test;

import com.process.services.TestProcessPortType;
import com.process.services.TestProcessService;


public class StartTest {

    /**
     * @author 
     * @创建时间 2015-07-10
     * @功能 启动流程
     * @param String data
     *        String user
     * @return boolean
     * **/
    public static boolean getStart(String data,String user){
        boolean flag = false;
        try {
            TestProcessService testProcessService = new TestProcessService();
            TestProcessPortType testProcessPortType = testProcessService.getTestProcessPort();
            testProcessPortType.start(data, user);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    
    
    //测试
    public static void main(String[] args) {
        String data = "测试";
        String user = "weblogic";
        if(StartTest.getStart(data, user)){
            System.out.println("********启动成功********");
            }
        else{
            System.out.println("********启动失败********");
            }
        
    }
    
}
