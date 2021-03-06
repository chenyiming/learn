package com.future.dconf.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import com.future.dconf.utils.EnvUtil;

/**
 * 
 * @author libinsong1204@gmail.com
 *
 */
public class ProfileApplicationContextInitializer implements
		ApplicationContextInitializer<ConfigurableApplicationContext> {

	private static final Logger _logger = LoggerFactory.getLogger(ProfileApplicationContextInitializer.class);

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		String profile = EnvUtil.getSpringProfile();
		applicationContext.getEnvironment().setActiveProfiles(profile.split(","));
		_logger.info("Active spring profile: {}", profile);
	}

}