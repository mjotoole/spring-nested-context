package com.mike.application;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationController.class);
    
    @Autowired
    private ApplicationResourceService service;

    @RequestMapping("/infos")
    public Map<String, String> info() {
        Map<String, String> info = service.getApplicationInfo();
        LOGGER.info("INFO CONTROLLER");
        return info;
    }
}