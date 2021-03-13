package com.pmd47.homework.Homework_12;

public class CEO extends Employee {

	public CEO(String firstnameInput , String lastnameInput , int salaryInput) {
		super(firstnameInput,lastnameInput,salaryInput);
	}
	
	@Override
	public int getSalary() {
		return super.getSalary() * 2 ;
	}
	
	public void hello() {
		System.out.println("Hi, nice to meet you. " + this.firstname + "!");
	}
	
	public void fire(Employee employee) {
		System.out.println(employee.firstname + " has been fired!");
	}
	
	
}
