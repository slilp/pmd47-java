package com.pmd47.homework.Homework_10_3;

public class Test {
	public static void main(String[] args) {

		Employee[] someEmp = {
				new Employee("Tester 1" , "PMD47" , 40000),
				new Employee("Tester 2" , "java" , 30000),
				new Employee("Tester 3" , "coding the future" , 20000),
				new Employee("Tester 4" , "PMD47" , 100000),
				new Employee("Tester 5" , "eclipse" , 70000),
		};
		
		
		for(var item : someEmp) {

			item.hello();
			System.out.println(item.getSaraly());  
			
		}

	}
}
