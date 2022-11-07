package org.jsp.dto;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Company {
	@Id
	private int id;
	private String name;
	private String industry;
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
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public void set(int id,String name,String industry)
	{
		setId(id);
		setName(name);
		setIndustry(industry);
	}
	@Override
	public String toString() {
		return id + " " + name + " " + industry + "\n";
	}
}
