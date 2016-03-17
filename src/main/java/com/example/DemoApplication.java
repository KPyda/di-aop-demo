package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		Performance performanceImpl = (Performance)context.getBean("performanceImpl");
//		try {
//			performanceImpl.perform();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

	@Bean
	CommandLineRunner run(Performance performance) {
		return  args -> {
			try {
				performance.perform();
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
	}

}
