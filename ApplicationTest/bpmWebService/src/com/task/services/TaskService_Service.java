package com.task.services;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebServiceClient(wsdlLocation="http://192.168.0.31:8103/integration/services/TaskService/TaskServicePort?WSDL",
  targetNamespace="http://xmlns.oracle.com/bpel/workflow/taskService",
  name="TaskService")
public class TaskService_Service
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("com.task.services.TaskService_Service");
      URL baseUrl = TaskService_Service.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            TaskService_Service.class.getResource("http://192.168.0.31:8103/integration/services/TaskService/TaskServicePort?WSDL");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "http://192.168.0.31:8103/integration/services/TaskService/TaskServicePort?WSDL");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "http://192.168.0.31:8103/integration/services/TaskService/TaskServicePort?WSDL");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using http://192.168.0.31:8103/integration/services/TaskService/TaskServicePort?WSDL",
          e);
    }
  }

  public TaskService_Service()
  {
    super(wsdlLocationURL,
          new QName("http://xmlns.oracle.com/bpel/workflow/taskService",
                    "TaskService"));
  }

  public TaskService_Service(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="TaskServicePort")
  public com.task.services.TaskService getTaskServicePort()
  {
    return (com.task.services.TaskService) super.getPort(new QName("http://xmlns.oracle.com/bpel/workflow/taskService",
                                                                   "TaskServicePort"),
                                                         com.task.services.TaskService.class);
  }

  @WebEndpoint(name="TaskServicePort")
  public com.task.services.TaskService getTaskServicePort(WebServiceFeature... features)
  {
    return (com.task.services.TaskService) super.getPort(new QName("http://xmlns.oracle.com/bpel/workflow/taskService",
                                                                   "TaskServicePort"),
                                                         com.task.services.TaskService.class,
                                                         features);
  }

  @WebEndpoint(name="TaskServicePortSAML")
  public com.task.services.TaskService getTaskServicePortSAML()
  {
    return (com.task.services.TaskService) super.getPort(new QName("http://xmlns.oracle.com/bpel/workflow/taskService",
                                                                   "TaskServicePortSAML"),
                                                         com.task.services.TaskService.class);
  }

  @WebEndpoint(name="TaskServicePortSAML")
  public com.task.services.TaskService getTaskServicePortSAML(WebServiceFeature... features)
  {
    return (com.task.services.TaskService) super.getPort(new QName("http://xmlns.oracle.com/bpel/workflow/taskService",
                                                                   "TaskServicePortSAML"),
                                                         com.task.services.TaskService.class,
                                                         features);
  }
}
