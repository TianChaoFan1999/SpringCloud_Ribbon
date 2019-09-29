package com.tcf.cloud.eureka.client.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo1")
public class ClientController {
	
	@RequestMapping("/service.do")
	public String service(String param)
	{
		System.out.println(param);
		
		return "Service is Send";
	}
	
	@RequestMapping("/servicePost.do")
	public Object servicePost(@RequestBody Map<String,Object> paramMap)
	{
		System.out.println(paramMap.get("name")!=null?paramMap.get("name").toString():"");
		System.out.println(paramMap.get("age")!=null?paramMap.get("age").toString():"");
		
		Map<String,Object> dataMap=new HashMap<String,Object>();
		dataMap.put("success",true);
		
		return dataMap;
	}
	
}
