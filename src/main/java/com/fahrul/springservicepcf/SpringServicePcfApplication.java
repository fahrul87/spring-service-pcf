package com.fahrul.springservicepcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class SpringServicePcfApplication {
	
	@GetMapping("/")
	public String getMessage() {
		return "Welcome to Istimiwir";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringServicePcfApplication.class, args);
	}

}
