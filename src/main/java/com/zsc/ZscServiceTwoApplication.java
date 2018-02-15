package com.zsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(defaultConfiguration = FeignClientsConfiguration.class)
public class ZscServiceTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZscServiceTwoApplication.class, args);
	}
}
