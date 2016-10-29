package com.future.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.future.model.Person;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PersonDao implements IPersonDao   {

	@PersistenceContext
	private EntityManager entityManager;
	
	/* (non-Javadoc)
	 * @see com.future.dao.IPersonDao#find(java.lang.Long)
	 */
	
	/* (non-Javadoc)
	 * @see com.future.dao.IPersonDao#find(java.lang.Long)
	 */
	@Override
	public Person find(Long id) {
		return entityManager.find(Person.class, id);
	}
	
	/* (non-Javadoc)
	 * @see com.future.dao.IPersonDao#getPeople()
	 */
	
	/* (non-Javadoc)
	 * @see com.future.dao.IPersonDao#getPeople()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Person> getPeople() {
		System.out.println("java.util.List<Person>------>");
		return entityManager.createQuery("select p from Person p").getResultList();
	}
	
	/* (non-Javadoc)
	 * @see com.future.dao.IPersonDao#save(com.future.model.Person)
	 */
	
	/* (non-Javadoc)
	 * @see com.future.dao.IPersonDao#save(com.future.model.Person)
	 */
	@Override
	@Transactional
	public Person save(Person person) {
		if (person.getId() == null) {
			entityManager.persist(person);
			return person;
		} else {
			return entityManager.merge(person);
		}		
	}	
	
}
