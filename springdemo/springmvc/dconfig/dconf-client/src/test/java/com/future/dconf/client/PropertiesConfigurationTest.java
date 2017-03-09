/**        
 * Copyright (c) 2013 by chenyiming.    
 */    
package com.future.dconf.client;

import org.junit.Assert;
import org.junit.Test;

import com.future.dconf.client.ConfigurationRuntimeException;
import com.future.dconf.client.PropertiesConfiguration;

/**
 * Create on @2013-9-1 @下午9:38:08 
 * @author 
 */
public class PropertiesConfigurationTest {
	
	@Test
	public void testConfig() throws ConfigurationRuntimeException  {
		String config = "username = melin \r\n";
		config += "port=8000 \r\n";
		config += "reload=true \r\n";
		
		PropertiesConfiguration configuration = new PropertiesConfiguration();
		configuration.load(config);
		
		Assert.assertEquals("melin", configuration.getString("username"));
		Assert.assertEquals(8000, configuration.getInt("port"));
		Assert.assertTrue(configuration.getBoolean("reload"));
	}
	
	@Test
	public void testInterpolator() throws ConfigurationRuntimeException  {
		String config = "app.home = /tmp/home \r\n";
		config += "zk.home=${app.home}/zk \r\n";
		config += "hbase.home=${app.home}/hbase \r\n";
		
		PropertiesConfiguration configuration = new PropertiesConfiguration();
		configuration.load(config);
		
		Assert.assertEquals("/tmp/home", configuration.getString("app.home"));
		Assert.assertEquals("/tmp/home/zk", configuration.getString("zk.home"));
		Assert.assertEquals("/tmp/home/hbase", configuration.getString("hbase.home"));
	}

	@Test
	public void testSysProperties() throws ConfigurationRuntimeException  {
		String config = "javaVersion = ${sys:java.version} \r\n";
		
		PropertiesConfiguration configuration = new PropertiesConfiguration();
		configuration.load(config);
		
		Assert.assertEquals(System.getProperty("java.version"), configuration.getString("javaVersion"));
	}
	
	@Test
	public void testSysEvns() throws ConfigurationRuntimeException  {
		String config = "javaHome = ${env:JAVA_HOME}/lib \r\n";
		
		PropertiesConfiguration configuration = new PropertiesConfiguration();
		configuration.load(config);
		
		Assert.assertEquals(System.getenv("JAVA_HOME") + "/lib", configuration.getString("javaHome"));
	}
}
