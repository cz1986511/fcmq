package com.fc.mq.web.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface InstinctFraudCheck
{
    @WebMethod
    public String getInsCheckResult(@WebParam(name = "inputXMLString") String inputXMLString);

}
