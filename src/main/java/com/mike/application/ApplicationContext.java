package com.mike.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import com.mike.base.FrameworkResourceService;

@SpringBootApplication
@PropertySource("classpath:/application.properties")
public class ApplicationContext {
	
	@Bean
	public ApplicationResourceService applicationResourceService(FrameworkResourceService frameworkResourceService){
		return new ApplicationResourceService(frameworkResourceService);
	}

}
