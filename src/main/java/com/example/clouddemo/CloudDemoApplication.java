package com.example.clouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CloudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudDemoApplication.class, args);
	}

}
