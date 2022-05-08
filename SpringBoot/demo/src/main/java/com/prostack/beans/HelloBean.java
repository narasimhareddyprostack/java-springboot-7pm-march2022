package com.prostack.beans;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
	public void sayHello() {
		System.out.println("Hello World! Welcome to Spring Boot");
	}
}
