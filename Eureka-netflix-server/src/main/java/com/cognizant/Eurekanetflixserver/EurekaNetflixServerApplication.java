package com.cognizant.Eurekanetflixserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurekaNetflixServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaNetflixServerApplication.class, args);
	}

}
