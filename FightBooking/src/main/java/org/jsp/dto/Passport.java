package org.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Passport {
	@Id 
	private int id;
	private String address;
	private String nationality;
	
	public int getId() { 
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return "Passport [id=" + id + ", address=" + address + ", nationality=" + nationality + "]";
	}
}
