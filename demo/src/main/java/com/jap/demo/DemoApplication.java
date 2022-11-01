package com.jap.demo;

import com.jap.demo.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {
	public static MessageService messageService;

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DemoApplication.class, args);
		messageService =context.getBean("messageService",MessageService.class);
		System.out.println(messageService.GoodDayToAll());
	}

}
