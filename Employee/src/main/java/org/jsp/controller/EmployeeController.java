package org.jsp.controller;

import org.jsp.dao.EmployeeDao;
import org.jsp.dto.Employee;

public class EmployeeController {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(167);
		employee.setName("miller");
		employee.setAdd("US");
		employee.setSal(2300.0);
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.save(employee);
	}
}