package com.gwz.crowdfunding.service.act;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class AtcrowdfundingActivitiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtcrowdfundingActivitiServiceApplication.class, args);
	}
}
