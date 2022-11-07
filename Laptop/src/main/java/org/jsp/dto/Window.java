package org.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Window {
	@Id
	private int model_number;
	private String generation;
	private String window;
	
	public int getModel_number() {
		return model_number;
	}
	public void setModel_number(int model_number) {
		this.model_number = model_number;
	}
	public String getGeneration() {
		return generation;
	}
	public void setGeneration(String generation) {
		this.generation = generation;
	}
	public String getWindow() {
		return window;
	}
	public void setWindow(String window) {
		this.window = window;
	}
	@Override
	public String toString() {
		return "Window [model_number=" + model_number + ", generation=" + generation + ", window=" + window + "]";
	}
	
}
