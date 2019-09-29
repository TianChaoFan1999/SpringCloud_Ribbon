package com.tcf.cloud.eureka.client.demo.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/***
 * TODO TCF Eureka 提供者启动类
 * @author 71485
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.tcf.cloud.eureka.client.demo"})
@EnableEurekaClient
public class Application {

	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class,args);
	}
	
}
