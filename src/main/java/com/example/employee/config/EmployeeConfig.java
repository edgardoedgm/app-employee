package com.example.employee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EmployeeConfig {
	
	@Bean("employeeRest")
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
		
	}

}
