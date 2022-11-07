package org.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class OS {
	@Id
	private int id;
	private String os;
	private String bit;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getBit() {
		return bit;
	}
	public void setBit(String bit) {
		this.bit = bit;
	}
	@Override
	public String toString() {
		return "OS [id=" + id + ", os=" + os + ", bit=" + bit + "]";
	}
}
