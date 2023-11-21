package com.sachet.discoveryserveramazon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerAmazonApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerAmazonApplication.class, args);
	}

}
