package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Performance performanceImpl = (Performance)context.getBean("performanceImpl");
		performanceImpl.perform();
	}


}
