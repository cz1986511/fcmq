package com.fc.mq.web.webservice;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InstinctFraudCheckServiceImpl implements InstinctFraudCheckService
{

    // 接口地址
    private static String WSDL_URL = "http://localhost:8080/fcmq/webservice/webserviceHello";
    // 命名空间地址（上传接口方法所在命名空间）
    private static String NAMESPACE_URI = "http://webservice.web.fc.com/";

    private static Logger log = LoggerFactory.getLogger(InstinctFraudCheckServiceImpl.class);

    @Override
    public String getInstinctFraudCheckResult(String inputXmlString)
    {
        String result = "";
        try
        {
            Service service = new Service();
            service.createCall();
            Call call = (Call) service.createCall();
            call.setTargetEndpointAddress(new java.net.URL(WSDL_URL));
            call.setOperationName(new QName(NAMESPACE_URI, "sayHi"));
            call.addParameter("inputXMLString", org.apache.axis.Constants.XSD_STRING,
                ParameterMode.IN);
            call.setReturnType(org.apache.axis.Constants.XSD_STRING);
            result = (String) call.invoke(new Object[] { inputXmlString });
            System.out.println("Successful = " + result);
        }
        catch (Exception e)
        {
            log.error("getInstinctFraudCheckResult is Exception:" + e.toString());
        }
        return result;
    }

}
