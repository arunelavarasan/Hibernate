package org.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.Mobile;
import org.jsp.dto.OS;

public class MobileDao {
	
	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
	public EntityManager getEntityManager()
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return  entityManager;
	}
	public void save(Mobile mobile)
	{
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityTransaction.commit();
	}
	public void update(Mobile mobile)
	{
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(mobile);
		entityTransaction.commit();
	}
	public void findById(int id)
	{
		entityManager = getEntityManager();
		Mobile m = entityManager.find(Mobile.class, id);
		if(m!=null)
		{
			System.out.println(m);
		}
		else {
			System.out.println("Data is not found");
		}
	}
	public void deleteById(int id)
	{
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		Mobile mobile = entityManager.find(Mobile.class, id);
		if(mobile!=null)
		{
			entityTransaction.begin();
			entityManager.remove(mobile);
			entityTransaction.commit();
		}
		else {
			System.out.println("Id is not found");
		}
	}
	public void deleteByOSId(int id)
	{
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		OS os = entityManager.find(OS.class, id);
		if(os!=null)
		{
			entityTransaction.begin();
			entityManager.remove(os);
			entityTransaction.commit();
		}
		else {
			System.out.println("Id is not found in OS table");
		}
	}
	public void saveOS(OS os)
	{
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(os);
		entityTransaction.commit();
	}
}
