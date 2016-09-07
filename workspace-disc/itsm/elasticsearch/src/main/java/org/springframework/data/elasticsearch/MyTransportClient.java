package org.springframework.data.elasticsearch;

import org.elasticsearch.ElasticsearchException;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.settings.Settings.Builder;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.elasticsearch.client.TransportClientFactoryBean;

public class MyTransportClient extends TransportClient {
	private static final Logger logger = LoggerFactory.getLogger(MyTransportClient.class);

	public MyTransportClient() throws ElasticsearchException {
		   TransportAddress address = new InetSocketTransportAddress("192.168.13.123", 9300);
	        System.out.println(address);
	        this.addTransportAddress(address);
	}
	
	public MyTransportClient(String hostname,int port) throws ElasticsearchException {
		   TransportAddress address = new InetSocketTransportAddress(hostname, port);
	        System.out.println(address);
	        this.addTransportAddress(address);
	        logger.info("create client :"+hostname+":"+port);
	}
	

	public MyTransportClient(Settings settings) {
		super(settings);
		// TODO Auto-generated constructor stub
	}

	public MyTransportClient(Builder settings) {
		super(settings);
		// TODO Auto-generated constructor stub
	}

	public MyTransportClient(Builder settings, boolean loadConfigSettings)
			throws ElasticsearchException {
		super(settings, loadConfigSettings);
		// TODO Auto-generated constructor stub
	}

	public MyTransportClient(Settings pSettings, boolean loadConfigSettings)
			throws ElasticsearchException {
		super(pSettings, loadConfigSettings);
		// TODO Auto-generated constructor stub
	}

}
