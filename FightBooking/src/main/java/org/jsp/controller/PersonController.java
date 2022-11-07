package org.jsp.controller;

import java.util.*;

import org.jsp.dao.PersonDao;
import org.jsp.dto.Passport;
import org.jsp.dto.Person;

public class PersonController {

	public static void main(String[] args) {
		Passport passport = new Passport();
		Person person = new Person();
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		person.setId(ran.nextInt(100));
		System.out.println("Enter passenger name");
		person.setName(sc.nextLine());
		person.setMobile(ran.nextInt(100000000));
		passport.setId(ran.nextInt(100));
		System.out.println("Enter Address of person");
		passport.setAddress(sc.nextLine());
		System.out.println("Nationallity");
		passport.setNationality(sc.nextLine());
		person.setPassport(passport);
		PersonDao dao = new PersonDao();
		dao.save(person);
		System.out.println("Data stored in database");
	}
}
