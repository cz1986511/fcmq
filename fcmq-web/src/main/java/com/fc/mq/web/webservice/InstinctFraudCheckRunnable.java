package com.fc.mq.web.webservice;

import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InstinctFraudCheckRunnable implements Runnable
{
    private Logger log = LoggerFactory.getLogger(InstinctFraudCheckRunnable.class);
    private InstinctFraudCheckService instinctFraudCheckService;

    public InstinctFraudCheckRunnable(InstinctFraudCheckService instinctFraudCheckService)
    {
        this.instinctFraudCheckService = instinctFraudCheckService;
    }

    @Override
    public void run()
    {
        int exitVaule = callShell();
        if (0 == exitVaule)
        {
            String inputXmlString = "";
            instinctFraudCheckService.getInstinctFraudCheckResult(inputXmlString);
        }
    }

    private int callShell()
    {
        int result = 1;
        String shellString = "/data/sh/test.sh";
        String args = "";
        try
        {
            String cmd = "sh " + shellString + " " + args;
            Process process = Runtime.getRuntime().exec(cmd);
            result = process.waitFor();
        }
        catch (Exception e)
        {
            log.error("InstinctFraudCheckRunnable is Exception:" + e.toString());
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
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
