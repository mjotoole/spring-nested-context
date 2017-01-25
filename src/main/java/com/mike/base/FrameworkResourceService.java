package com.mike.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class FrameworkResourceService {
	@Autowired
	@Value("${framework.version}")
	private String frameworkVersion;

	public String getFrameworkVersion() {
		return this.frameworkVersion;
	}

}
