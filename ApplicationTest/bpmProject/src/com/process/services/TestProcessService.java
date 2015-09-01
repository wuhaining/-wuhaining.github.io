package com.process.services;

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

@WebServiceClient(wsdlLocation="http://192.168.0.31:8103/soa-infra/services/default/testBPM/TestProcess.service?WSDL",
  targetNamespace="http://xmlns.oracle.com/bpmn/bpmnProcess/TestProcess",
  name="TestProcess.service")
public class TestProcessService
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("com.process.services.TestProcessService");
      URL baseUrl = TestProcessService.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            TestProcessService.class.getResource("http://192.168.0.31:8103/soa-infra/services/default/testBPM/TestProcess.service?WSDL");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "http://192.168.0.31:8103/soa-infra/services/default/testBPM/TestProcess.service?WSDL");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "http://192.168.0.31:8103/soa-infra/services/default/testBPM/TestProcess.service?WSDL");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using http://192.168.0.31:8103/soa-infra/services/default/testBPM/TestProcess.service?WSDL",
          e);
    }
  }

  public TestProcessService()
  {
    super(wsdlLocationURL,
          new QName("http://xmlns.oracle.com/bpmn/bpmnProcess/TestProcess",
                    "TestProcess.service"));
  }

  public TestProcessService(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="TestProcessPort")
  public com.process.services.TestProcessPortType getTestProcessPort()
  {
    return (com.process.services.TestProcessPortType) super.getPort(new QName("http://xmlns.oracle.com/bpmn/bpmnProcess/TestProcess",
                                                                              "TestProcessPort"),
                                                                    com.process.services.TestProcessPortType.class);
  }

  @WebEndpoint(name="TestProcessPort")
  public com.process.services.TestProcessPortType getTestProcessPort(WebServiceFeature... features)
  {
    return (com.process.services.TestProcessPortType) super.getPort(new QName("http://xmlns.oracle.com/bpmn/bpmnProcess/TestProcess",
                                                                              "TestProcessPort"),
                                                                    com.process.services.TestProcessPortType.class,
                                                                    features);
  }
}
