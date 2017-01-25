package com.mike.application;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.mike.base.FrameworkResourceService;

public class ApplicationResourceService {
	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationResourceService.class);
	private final FrameworkResourceService frameworkResourceService;

	@Value("${application.name:notset}")
	private String applicationName;

	public ApplicationResourceService(FrameworkResourceService frameworkResourceService) {
		LOGGER.info("Creating application resource service");
		this.frameworkResourceService = frameworkResourceService;
	}

	public Map<String, String> getApplicationInfo() {
		Map<String, String> map = new HashMap<>();
		map.put("framework_version", frameworkResourceService.getFrameworkVersion());
		map.put("application_version", "1");
		map.put("application_name", applicationName);
		return map;
	}

}
