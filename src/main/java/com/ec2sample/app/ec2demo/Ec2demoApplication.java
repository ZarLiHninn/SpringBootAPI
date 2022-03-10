package com.ec2sample.app.ec2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Ec2demoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ec2demoApplication.class, args);
	}

}
