package com.future.dao;

import java.util.List;

import com.future.model.Person;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration("/test-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class PersonDaoTest {

	@Autowired
	private IPersonDao personDao;

	
	@Before
	public void prepareData() {
	}

	@Test
	public void shouldSaveAPerson() {
		Person p = new Person();
		p.setFirstName("Andy");
		p.setLastName("Gibson");
		personDao.save(p);
		Long id = p.getId();
	}

	

	@Test
	public void shouldListPeople() {
		List<Person> people = personDao.getPeople();
		for(Person p:people){
			System.out.println("-----》  "+p);
		}
		//Assert.assertEquals(DataInitializer.PERSON_COUNT, people.size());

	}

}
