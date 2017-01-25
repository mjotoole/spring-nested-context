package com.mike.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Configuration
@PropertySource(name = "rootPropertySource", value = "classpath:/framework.properties")
public class FrameworkContext {
	
	
	@Bean
	public FrameworkResourceService frameworkResourceService(){
		return new FrameworkResourceService();
	}

}
