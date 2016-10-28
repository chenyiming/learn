package com.future.redis;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


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
	
	
	String uid = "u1234567";
	@Test
	public void testSave(){
		// -------------- Create ---------------
				
				String address1 = "上海当调用borrow Object方法时，是否进行有效性检查当调"
						+ "用borrow Object方法时，是否进行有效性检查当调用borrow Ob"
						+ "ject方法时，是否进行有效性检查当调用borrow Object方法时，是否"
						+ "进行有效性检查当调用borrow Object方法时，是否进行有效性检查当调用bo"
						+ "rrow Object方法时，是否进行有效性检查当调用borrow Object方法时，是否进行"
						+ "有效性检查当调用borrow Object方法时，是否进行有效性检查当调用borrow O"
						+ "bject方法时，是否进行有效性检查当调用borrow Object方法时，是否进行有效性"
						+ "检查当调用borrow Object方法时，是否进行有效性检查当调用borrow Object方法时，"
						+ "是否进行有效性检查当调用borrow Object方法时，是否进行有效性检查当调用borrow"
						+ " Object方法时"
						+ "，是否进行有效性检查当调用borrow Object方法时，是否进行有效性检查";
				User user = new User();
				user.setAddress(address1);
				user.setUid(uid);
				userDao.save(user);
	}
	
	@Test
	public void testRead(){
		User user = userDao.read(uid);
		System.out.println(user.getAddress());
	}
}
