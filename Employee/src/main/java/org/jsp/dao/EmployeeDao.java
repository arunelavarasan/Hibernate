package org.jsp.dao;

import javax.persistence.*;

import org.jsp.dto.Employee;

public class EmployeeDao {
	public void save(Employee employee)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		System.out.println("done");
		entityManager.persist(employee);
		entityTransaction.commit();
	}
	public void findById(int id)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee employee = entityManager.find(Employee.class, id);
		System.out.println(employee);
	}
	public void update(Employee employee)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
	}
	public void remove(Employee employee, String s)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employee emp = entityManager.find(Employee.class, s);
		entityTransaction.begin();
		entityManager.remove(employee);
		entityTransaction.commit();
	}
}