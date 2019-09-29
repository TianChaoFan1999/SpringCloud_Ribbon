package com.tcf.cloud.eureka.client.demo.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class DemoController {

	@Autowired
	private RestTemplate restTemplate;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("/service.do")
	public Map service(HttpServletRequest request)
	{
		//String param=request.getParameter("param");
		
		//TODO TCF 调用服务
		/*ResponseEntity<String> result=restTemplate.getForEntity(
				"http://eureka-client-demo1/demo1/service.do?param="+param,
				String.class);*/
		
		/*MultiValueMap<String,Object> paramMap=new LinkedMultiValueMap<String,Object>();
		paramMap.add("name","张三");
		paramMap.add("age",18);*/
		
		Map<String,Object> paramMap=new HashMap<String,Object>();
		paramMap.put("name","张三");
		paramMap.put("age",18);
		
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		
		HttpEntity<Map> entity=new HttpEntity<Map>(paramMap,headers);
		
		Object result=restTemplate.postForObject(
				"http://eureka-client-demo1/demo1/servicePost.do",
				entity,
				Object.class);
		
		Map<String,Object> resultMap=new HashMap<String,Object>();
		if(result!=null)
		{
			if(result instanceof Map)
			{
				resultMap=(Map<String,Object>)result;
			}
		}
		
		return resultMap;
	}
	
}
