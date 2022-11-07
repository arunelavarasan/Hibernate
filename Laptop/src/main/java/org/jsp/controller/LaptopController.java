package org.jsp.controller;

import org.jsp.dao.Laptopdao;
import org.jsp.dto.*;

public class LaptopController {

	public static void main(String[] args) {
//		Window window = new Window();
//		Laptop laptop = new Laptop();
//		laptop.setId(57);
//		laptop.setName("LENOVO");
//		laptop.setPrice(76854.98);
//		window.setGeneration("i3 8th");
//		window.setModel_number(7687);
//		window.setWindow("window 11");
//		laptop.setWindow(window);
		Laptopdao laptopdao = new Laptopdao();
//		laptopdao.save(laptop);
		laptopdao.findBy(134);
	}
}
