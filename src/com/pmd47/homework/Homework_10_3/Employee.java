package com.pmd47.homework.Homework_10_3;

public class Employee {
	
	public String firstname ;
	public String lastname ;
	private int salary ;
	
	public Employee(String firstnameInput , String lastnameInput , int salaryInput) {
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
		this.salary = salaryInput;
	}
	
	public void hello() {
		System.out.println("Hello " + this.firstname);
	}
	
	public int getSaraly() {
		return salary;
	}
	
}
