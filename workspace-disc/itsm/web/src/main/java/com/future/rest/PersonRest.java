package com.future.rest;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.future.controller.PersonController;
import com.future.dao.IPersonDao;
import com.future.model.Person;
import com.future.shiro.entity.User;
import com.future.spider.SpiderService;

@RestController
@RequestMapping("/rest/person/")
public class PersonRest {
	private static final Logger logger = LoggerFactory
			.getLogger(PersonController.class);

	@Autowired
	private IPersonDao personDao;
	
	@Autowired
	private SpiderService spider;

	/*
	 * @RequestMapping("/greeting") public Person greeting(
	 * @RequestParam(value="id",required=false) Long id 
	 * ) { Person person = null; if (id == null) { person = new Person(); } else
	 * { person = personDao.find(id); }
	 * 
	 * 
	 * 
	 * return person; }
	 */

	@RequestMapping("/list")
	public List<Person> list() {
		return personDao.getPeople();
	}

	@RequestMapping("/get/{id}")
	public Person get(@PathVariable Long id) {
		Person person = null;
		if (id == null) {
			person = new Person();
		} else {
			person = personDao.find(id);
		}
		return person;
	}
	
	
	@RequestMapping("/spider")
	public String spider() {
		spider.query();
		return "spider";
	}
}
