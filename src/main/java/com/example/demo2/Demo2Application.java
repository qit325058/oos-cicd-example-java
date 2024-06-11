package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Demo2Application {

	@RequestMapping("/hello")
	public String hello() {
		return "Alibaba Spring Sample！";
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

}
