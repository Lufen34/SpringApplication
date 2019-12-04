package com.springapp.SpringApplication;

import com.springapp.SpringApplication.Test.Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext conf =  SpringApplication.run(Application.class, args);
		Test t = conf.getBean(Test.class);
		Test t2 = conf.getBean(Test.class);
		t.start();
		System.out.println(Test.getId());
		t2.start();
		System.out.println(Test.getId());
	}
}
