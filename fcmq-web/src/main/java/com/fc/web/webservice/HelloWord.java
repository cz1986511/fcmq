package com.fc.web.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HelloWord
{
    @WebMethod
    public String sayHi(@WebParam(name = "inputXMLString") String inputXMLString);

}
