package org.jsp.bike_wala;

import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Table;

@Entity
@Table
public class Bike {
	@Id
	private int id;
	private String name;
	private String color;
	private double price;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Bike bike = new Bike();
//		INSERTION
		bike.setId(11);
		bike.setName("ninja");
		bike.setColor("Green");
		bike.setPrice(400000.99);
		entityTransaction.begin();
	    entityManager.persist(bike);
	    entityTransaction.commit();
	    
//	    MODIFING
//	    bike.setId(102);
//		bike.setName("hero");
//		bike.setColor("blue");
//		bike.setPrice(85000);
//		entityTransaction.begin();
//	    entityManager.merge(bike);
//	    entityTransaction.commit();   
	    
	    //REMOVE
//	    entityTransaction.begin();
//	    Bike bike2 = entityManager.find(Bike.class, 101);
//	    entityManager.remove(102);
//	    entityTransaction.commit();
		
//		//FETCH
//		Query query = entityManager.createQuery("SELECT c FROM Bike c");
//		List<Bike> bikes = query.getResultList();
//		System.out.println(bikes);
    }

	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}
}
