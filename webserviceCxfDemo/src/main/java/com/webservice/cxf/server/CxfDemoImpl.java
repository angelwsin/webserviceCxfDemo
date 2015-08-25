package com.webservice.cxf.server;

import javax.jws.WebService;

@WebService(endpointInterface = "com.webservice.cxf.server.CxfDemo")
public class CxfDemoImpl implements CxfDemo{

	public String sayHello(String foo) {
		// TODO Auto-generated method stub
		return "hello "+foo;
	}

}
