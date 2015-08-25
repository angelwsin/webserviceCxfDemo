package com.test.cxf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.webservice.cxf.server.CxfDemo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext.xml")
public class CxfClientTest {
	   @Autowired
	   private CxfDemo cxfDemo;
	
	@Test
	  public void test(){
		System.out.println(cxfDemo.sayHello("美女"));
	  }

}
