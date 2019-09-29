package com.tcf.cloud.eureka.client.demo.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.tcf.cloud.eureka.client.demo"})
@EnableEurekaClient
public class Application {

	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class,args);
	}
	
	//TODO TCF 基于ribbon作为客户端负载均衡器，调用restTemplate基于REST协议通信
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
	
}
