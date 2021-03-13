package com.pmd47.homework.Homework_12;

public class Day10 {
	public static void main(String[] args) {
		
		Employee emp = new Employee("PMD","47",50000);
		CEO ce = new CEO("CODING","THE FUTURE",50000);

		Programmer programmer1 = new Programmer("Tony" , "Stark" , 1000000);
		programmer1.hello();
		System.out.println(programmer1.getSalary());
		
		Programmer programmer2 = new Programmer();
		programmer2.hello();
		System.out.println(programmer2.getSalary());
		
		Programmer programmer3 = new Programmer("Elon","Musk");
		programmer3.hello();
		System.out.println(programmer3.getSalary());

	}
}
