package com.gwz.crowdfunding.service.act.config;

import org.activiti.spring.SpringProcessEngineConfiguration;
import org.activiti.spring.boot.ProcessEngineConfigurationConfigurer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActConfig implements ProcessEngineConfigurationConfigurer {

	@Override
	public void configure(SpringProcessEngineConfiguration processEngineConfiguration) {
		processEngineConfiguration.setActivityFontName("楷体");
		processEngineConfiguration.setLabelFontName("楷体");
		processEngineConfiguration.setMailServerPort(25);
		
	}

}
