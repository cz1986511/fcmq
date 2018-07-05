package com.fc.mq.service.util;

public class InstinctFraudCheckUtil
{
    public static StringBuilder makeU2BXml()
    {
        StringBuilder xmlParams = new StringBuilder();
        xmlParams.append("<U2B>");
        for (int i = 1; i < 61; i++)
        {
            String nodeName = "User_Field" + i;
            xmlParams.append("<").append(nodeName).append(">");
            xmlParams.append("</").append(nodeName).append(">");
        }
        xmlParams.append("</U2B>");
        return xmlParams;
    }

    public static StringBuilder makeU2CXml()
    {
        StringBuilder xmlParams = new StringBuilder();
        xmlParams.append("<U2C>");
        for (int i = 1; i < 176; i++)
        {
            String nodeName = "User_Field" + i;
            xmlParams.append("<").append(nodeName).append(">");
            xmlParams.append("</").append(nodeName).append(">");
        }
        xmlParams.append("</U2C>");
        return xmlParams;
    }

    public static StringBuilder makeCBBXml()
    {
        StringBuilder xmlParams = new StringBuilder();
        xmlParams.append("<CBB>");
        xmlParams.append("<Surname>").append("</Surname>");
        xmlParams.append("<Home_Address1>").append("</Home_Address1>");
        xmlParams.append("<Home_Address2>").append("</Home_Address2>");
        xmlParams.append("<Home_Address3>").append("</Home_Address3>");
        xmlParams.append("<Home_Postcode>").append("</Home_Postcode>");
        xmlParams.append("<Home_Phone_Number>").append("</Home_Phone_Number>");
        xmlParams.append("<Mobile_Phone_Number>").append("</Mobile_Phone_Number>");
        for (int i = 1; i < 10; i++)
        {
            String nodeName = "User_Field" + i;
            xmlParams.append("<").append(nodeName).append(">");
            xmlParams.append("</").append(nodeName).append(">");
        }
        xmlParams.append("<User_Field21>").append("</User_Field21>");
        xmlParams.append("</CBB>");
        return xmlParams;
    }

    public static StringBuilder makeCBAXml()
    {
        StringBuilder xmlParams = new StringBuilder();
        xmlParams.append("<CBA>");
        xmlParams.append("<Surname>").append("</Surname>");
        for (int i = 1; i < 7; i++)
        {
            String nodeName = "Home_Address" + i;
            xmlParams.append("<").append(nodeName).append(">");
            xmlParams.append("</").append(nodeName).append(">");
        }
        xmlParams.append("<Company_Name>").append("</Company_Name>");
        for (int j = 1; j < 6; j++)
        {
            String nodeName = "User_Field" + j;
            xmlParams.append("<").append(nodeName).append(">");
            xmlParams.append("</").append(nodeName).append(">");
        }
        for (int k = 17; k < 27; k++)
        {
            String nodeName = "User_Field" + k;
            xmlParams.append("<").append(nodeName).append(">");
            xmlParams.append("</").append(nodeName).append(">");
        }
        xmlParams.append("</CBA>");
        return xmlParams;
    }

}