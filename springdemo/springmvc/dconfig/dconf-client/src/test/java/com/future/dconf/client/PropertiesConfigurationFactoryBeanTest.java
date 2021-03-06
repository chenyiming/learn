/**        
 * Copyright (c) 2013 by chenyiming.    
 */    
package com.future.dconf.client;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.future.dconf.client.PropertiesConfiguration;
import com.future.dconf.client.PropertiesConfigurationFactoryBean;
import com.future.dconf.client.event.ConfigurationEvent;
import com.future.dconf.client.event.ConfigurationListener;


/**
 * Create on @2013-8-26 @上午10:00:54 
 * @author 
 */
public class PropertiesConfigurationFactoryBeanTest {
	
	public static void main(String[] args) throws IOException {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		
		PropertiesConfiguration configuration = PropertiesConfigurationFactoryBean.getPropertiesConfiguration();
		

		configuration.addConfigurationListener(new ConfigurationListener() {
	        @Override
	        public void configurationChanged(ConfigurationEvent event) {
	                            //监听配置参数变化,监听不到?
	            System.out.println(event.getType().name() + " " + event.getPropertyName() + " " + event.getPropertyValue());
	        }
	    });
		
		System.in.read();
	}

}
