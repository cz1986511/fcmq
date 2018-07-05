package com.fc.mq.web.webservice;

import javax.jws.WebService;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Node;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@WebService(endpointInterface = "com.fc.web.webservice.InstinctFraudCheck", serviceName = "insCheck")
@Component("insCheckClass")
public class InstinctFraudCheckImpl implements InstinctFraudCheck
{
    private static Logger log = LoggerFactory.getLogger(InstinctFraudCheckImpl.class);

    @Autowired
    private InstinctFraudCheckService instinctFraudCheck;

    @Override
    public String getInsCheckResult(String inputXMLString)
    {

        System.out.println(inputXMLString);
        String result = "";
        if (StringUtils.isBlank(inputXMLString))
        {
            result = makeResult("1");
        }
        else
        {
            Document document = null;
            try
            {
                document = DocumentHelper.parseText(inputXMLString);
            }
            catch (Exception e)
            {
                log.error("getInsCheckResult is Exception:" + e.toString());
            }
            Node request = document.selectSingleNode("request").selectSingleNode("reqtype");
            result = makeResult("0");
        }
        return result;
    }

    private String makeResult(String type)
    {
        String result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><OutputSchema><Output><Code>";
        if ("0".equals(type))
        {
            result += "200</Code><Msg>success</Msg>";
        }
        else if ("1".equals(type))
        {
            result += "100</Code><Msg>params is error</Msg>";
        }
        result += "</Output></OutputSchema>";
        return result;
    }

}
