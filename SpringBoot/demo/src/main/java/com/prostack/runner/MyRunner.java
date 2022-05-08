package com.prostack.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.prostack.beans.HelloBean;
import com.prostack.beans.Test;

@Component
public class MyRunner implements CommandLineRunner {
  
	@Autowired
	HelloBean bean;
	
	@Autowired
	Test t;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello,Good Evening");
		bean.sayHello();
		t.m1();
		t.m2();
	}

}
