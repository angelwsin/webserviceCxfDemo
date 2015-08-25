package com.webservice.cxf.server;

import javax.jws.WebService;

@WebService
public interface CxfDemo {
	public String sayHello(String foo);

}
