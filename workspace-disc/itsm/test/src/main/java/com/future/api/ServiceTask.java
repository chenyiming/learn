package com.future.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.future.dao.IPersonDao;
import com.future.model.Person;

public class ServiceTask {

	@Autowired
	private IPersonDao personDao;

	public Person find(Long id) {
		return personDao.find(id);
	}

	public List<Person> getPeople() {
		return personDao.getPeople();
	}

	public Person save(Person person) {
		return personDao.save(person);
	}
	
	
}
