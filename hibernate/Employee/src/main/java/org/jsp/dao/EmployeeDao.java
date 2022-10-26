package org.jsp.dao;

import javax.persistence.*;

import org.jsp.dto.Employee;

public class EmployeeDao {
	public void save(Employee em)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(em);
		entityTransaction.commit();
	}
	public void remove(Employee em, String s)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employee emp = entityManager.find(Employee.class, s);
		entityTransaction.begin();
		entityManager.remove(emp);
		entityTransaction.commit();
	}
}