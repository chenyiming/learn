/**
 * Copyright (c) 2013 by chenyiming.
 *
 * Test.java Create on 2013-7-11 下午4:48:04
 */
package com.future.dconf.client;
import javax.naming.ConfigurationException;

import com.future.dconf.client.PropertiesConfiguration;

/**
 *
 * @author <a href="mailto:">li.binsong</a>
 *
 */
public class Test {

	/**
	 * @param args
	 * @throws ConfigurationException
	 */
	public static void main(String[] args) throws Exception {
		PropertiesConfiguration config = new PropertiesConfiguration("192.168.1.108", 8283, "01", "development", "cmdb");
		config.addConfigurationListener(new ConfigurationListenerTest());
		System.out.println(config.getString("jdbc.url"));
		
		System.in.read();
	}

}
