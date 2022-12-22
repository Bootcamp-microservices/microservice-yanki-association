package com.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceYankiAssociationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceYankiAssociationApplication.class, args);
	}

}
