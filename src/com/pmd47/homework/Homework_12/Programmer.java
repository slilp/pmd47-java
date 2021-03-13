package com.pmd47.homework.Homework_12;

public class Programmer extends Employee {

	public Programmer(String firstnameInput , String lastnameInput , int salaryInput) {
		super(firstnameInput,lastnameInput,salaryInput);
	}
	
	public Programmer() {
		super("Anonymous","Anonymous",25000);
	}
	
	public Programmer(String firstnameInput , String lastnameInput) {
		super(firstnameInput,lastnameInput,50000);
	}
	
	public void createWebsite(String template,String titleName) {
		System.out.println("Creating website with template : "+ template + " title name : " + titleName);
	}
	
	public void installWindows(String version,String productKey) {
		System.out.println("Instaling window with version : "+ version + " key : " + productKey);
	}
	
	@Override
	public int getSalary() {
		return super.getSalary() + 5000 ;
	}
}
