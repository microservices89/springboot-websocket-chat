package com.example.websocketdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
@EnableJms
@SpringBootApplication
public class WebsocketDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsocketDemoApplication.class, args);
	}
}
