package com.mike;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.mike.application.ApplicationContext;
import com.mike.base.FrameworkContext;



@SpringBootApplication
public class SpringNestedContextApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder()
				.parent(FrameworkContext.class)
				.child(ApplicationContext.class);
		ConfigurableApplicationContext applicationContext = builder.run();

        applicationContext.setId("foo application");
        ((ConfigurableApplicationContext)applicationContext.getParent()).setId("appframework");
		
	}
}
