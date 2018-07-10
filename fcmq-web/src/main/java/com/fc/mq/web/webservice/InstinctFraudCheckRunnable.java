package com.fc.mq.web.webservice;

import java.io.InputStream;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InstinctFraudCheckRunnable implements Runnable
{
    private Logger log = LoggerFactory.getLogger(InstinctFraudCheckRunnable.class);
    private InstinctFraudCheckService instinctFraudCheckService;
    private Document document;
    private String loanId;

    public InstinctFraudCheckRunnable(InstinctFraudCheckService instinctFraudCheckService,
                                      Document document, String loanId)
    {
        this.instinctFraudCheckService = instinctFraudCheckService;
        this.document = document;
        this.loanId = loanId;
    }

    @Override
    public void run()
    {
        try
        {
            if (null != this.document && !StringUtils.isBlank(this.loanId))
            {
                int exitVaule = callShell(this.loanId);
                if (0 == exitVaule)
                {
                    Element applicationElement = document.getRootElement().element("Application");

                    String inputXmlString = "";
                    String insResult = instinctFraudCheckService
                        .getInstinctFraudCheckResult(inputXmlString);
                    if (!StringUtils.isBlank(insResult))
                    {
                        Element testEntity = DocumentHelper.createElement("Test");
                        testEntity.addEntity("Test_Id", "123456");
                        document.add(testEntity);
                    }
                }
            }
        }
        catch (Exception e)
        {
            log.error("InstinctFraudCheckRunnable is Exception:" + e.toString());
        }

    }

    private int callShell(String loanId)
    {
        int result = 1;
        String shellString = "/data/sh/test.sh";
        try
        {
            String cmd = "sh " + shellString + " " + loanId;
            Process process = Runtime.getRuntime().exec(cmd);
            result = process.waitFor();
        }
        catch (Exception e)
        {
            log.error("callShell is Exception:" + e.toString());
        }
        return result;
    }

    public static void main(String[] args)
    {
        String cmd = "/data/sh/test.bat";
        try
        {
            Process process = Runtime.getRuntime().exec(cmd);
            InputStream in = process.getInputStream();
            int c;
            while ((c = in.read()) != -1)
            {
                System.out.print((char) c);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
