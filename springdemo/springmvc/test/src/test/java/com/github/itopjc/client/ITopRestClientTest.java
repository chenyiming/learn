package com.github.itopjc.client;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ITopRestClientTest {

	
	static	ITopRestClient client =null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		client=new ITopRestClient("11111111","admin","1.3","http://127.0.0.1:81/webservices/rest.php");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetObjects() {
		this.client.getObjects("Contact", "1");
	}

	@Test
	public void testGetRelate() {
		this.client.getRelate("Server", "1");
	}

}
