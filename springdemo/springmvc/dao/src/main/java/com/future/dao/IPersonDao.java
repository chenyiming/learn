package com.future.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.future.model.Person;

public interface IPersonDao {

	public abstract Person find(Long id);

	public abstract List<Person> getPeople();

	public abstract Person save(Person person);

}