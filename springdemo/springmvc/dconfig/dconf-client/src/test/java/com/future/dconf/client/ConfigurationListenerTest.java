/**        
 * Copyright (c) 2013 by chenyiming.    
 */    
package com.future.dconf.client;

import com.future.dconf.client.event.ConfigurationEvent;
import com.future.dconf.client.event.ConfigurationListener;

/**
 * Create on @2013-8-28 @下午10:05:12 
 * @author 
 */
public class ConfigurationListenerTest implements ConfigurationListener {

	@Override
	public void configurationChanged(ConfigurationEvent event) {
		System.out.println(event.getType().name() + " " + event.getPropertyName() + " " + event.getPropertyValue());
	}

}
