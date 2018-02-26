package com.zsc;

import com.zsc.ribbon.ServiceByAnnontationConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(defaultConfiguration = FeignClientsConfiguration.class)
//  通过注解的方式定义了一个针对service-by-annotation服务的负载均衡器
@RibbonClients(value = { @RibbonClient(name = "service-by-annotation", configuration = ServiceByAnnontationConfiguration.class) })
public class ZscServiceTwoApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZscServiceTwoApplication.class, args);
	}
}
