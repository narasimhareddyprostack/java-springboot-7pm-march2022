package com.prostack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prostack.bean.TestBean;

@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner{
	
	
	@Autowired
	TestBean tb;
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello,Good Evening");
		tb.sayHello();
	}

}
