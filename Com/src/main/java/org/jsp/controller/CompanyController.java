package org.jsp.controller;
import org.jsp.dao.CompanyDao;
import org.jsp.dto.Company;

import java.util.*;

public class CompanyController {
	public static void main(String[] args) {
		CompanyDao companyDao = new CompanyDao();
		Company company = new Company();
		List<Company> c = companyDao.findAll();
		System.out.println(c);
	}
}