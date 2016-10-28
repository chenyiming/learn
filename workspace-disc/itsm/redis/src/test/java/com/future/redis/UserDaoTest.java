package com.future.redis;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


@ContextConfiguration("/test-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoTest {
	@Autowired
	private UserDao userDao;

	@Before
	public void before() throws Exception {
	}

	@Test
	public void crud() {
		// -------------- Create ---------------
		String uid = "u123456";
		String address1 = "上海";
		User user = new User();
		user.setAddress(address1);
		user.setUid(uid);
		userDao.save(user);

		// ---------------Read ---------------
		user = userDao.read(uid);

		assertEquals(address1, user.getAddress());

		// --------------Update ------------
		String address2 = "北京";
		user.setAddress(address2);
		userDao.save(user);

		user = userDao.read(uid);

		assertEquals(address2, user.getAddress());

		// --------------Delete ------------
		userDao.delete(uid);
		user = userDao.read(uid);
		assertNull(user);
	}
}
