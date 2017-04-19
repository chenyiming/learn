package com.mybatis;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.mybatis.dao.ViewServerMapper;
import com.mybatis.model.ViewServer;
import com.mybatis.model.ViewServerExample;

@ContextConfiguration("/test-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class ViewServerTest {

	@Autowired
	private ViewServerMapper vs;

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	public void shouldListViewServer() {
		ViewServerExample example=new ViewServerExample();
		example.createCriteria().andNameEqualTo("Server1");
		 List<ViewServer> list=vs.selectByExample(example);
		 System.out.println(list.size());
		 for(ViewServer v:list){
			 System.out.println(v.toString());
		 }
		//Assert.assertEquals(DataInitializer.PERSON_COUNT, people.size());

	}

}
