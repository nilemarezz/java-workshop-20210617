package com.nile.hellorest;

import com.nile.hellorest.employee.Demo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloRestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(HelloRestApplication.class, args);
		String[] objects = context.getBeanDefinitionNames();
//		for (String object : objects) {
//			System.out.println(object);
//		}
//		int count = context.getBeanDefinitionCount();
//		System.out.println("Total=" + count);
//
//		Demo demo1 = context.getBean(Demo.class);
//		demo1.setName("From demo 1");
//		Demo demo2 = context.getBean(Demo.class);
//		System.out.println("Demo1 =>" + demo1.getName());
//		System.out.println("Demo2 =>" + demo2.getName());
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
