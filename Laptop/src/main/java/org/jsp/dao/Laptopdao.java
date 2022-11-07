package org.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.Laptop;

import com.mysql.cj.x.protobuf.MysqlxCrud.Find;

public class Laptopdao {
	public EntityManager getEntityManager()
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("laptop");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}
	
	public void save(Laptop laptop)
	{
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(laptop);
		entityTransaction.commit();
	}
	
	public Laptop findBy(int id)
	{
		    EntityManager entityManager = getEntityManager();
			return entityManager.find(Laptop.class,id);
	}
}
