package org.jsp.dao;

import java.util.List;

import javax.persistence.*;

import org.jsp.dto.Person;

public class PersonDao {
	
	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
	public EntityManager getEntityManager()
	{
	    entityManagerFactory = Persistence.createEntityManagerFactory("dev"); 
	    entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}
	public void save(Person person)
	{
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
	public Person findByID(int id)
	{
		entityManager = getEntityManager();
		Person record = entityManager.find(Person.class, id);
		return record;
	}
	public List<Person> find()
	{
		Query query = entityManager.createQuery("select c from Person c");
		List<Person> l = query.getResultList();
		return l;
	}
	public void deleteById(int id)
	{
		Person person = entityManager.find(Person.class, id);
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(person);
		entityTransaction.commit();
	}
}
