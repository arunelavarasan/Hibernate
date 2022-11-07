package org.jsp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PC")
public class Laptop
{
	@Id
	@Column(name = "model_number")
	private int id;
	@Column(name = "laptop")
	private String name;
	@Column(name = "cost")
	private double price;
	@OneToOne(cascade = CascadeType.ALL)
	private Window window;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setWindow(Window window)
	{
		this.window = window;
	}
	public void getWindow()
	{
		this.getWindow();
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", price=" + price + ", window=" + 0 + "]";
	}
}