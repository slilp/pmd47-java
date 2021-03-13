package com.pmd47.homework.Homework_13_2;

public class Employee {

	public String firstname ;
	public String lastname ;
	private int salary ;
	public String position;
	
	public Employee(String firstnameInput , String lastnameInput , int salaryInput,String positionInput) {
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
		this.salary = salaryInput;
		this.position = positionInput;
	}
	
	
	public static void main(String[] args) {
			Employee em1 = new Employee("Tony", "Stark", 100000,"CEO");
			em1.checkPosition();
			Test();
	}
	
	public static void Test() {
		System.out.println("This is static method");
	}
	
	public void hello() {
		System.out.println("Hello " + this.firstname);
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void checkPosition() {
		System.out.println("My position is " + position);
	}
	
}
