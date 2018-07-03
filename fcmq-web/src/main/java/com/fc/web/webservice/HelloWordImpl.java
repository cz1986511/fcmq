package com.fc.web.webservice;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

@WebService(endpointInterface = "com.fc.web.webservice.HelloWord", serviceName = "hello")
@Component("helloClass")
public class HelloWordImpl implements HelloWord
{

    @Override
    public String sayHi(String name)
    {
        return "hello word" + name;
    }

}
