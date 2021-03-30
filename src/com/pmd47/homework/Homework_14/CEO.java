package Homework_14;

public class CEO extends Employee {

	public CEO(String firstnameInput , String lastnameInput , int salaryInput) {
		super(firstnameInput,lastnameInput,salaryInput);
	}
	
	@Override
	public int getSalary() {
		return super.getSalary() * 2 ;
	}
	

	public void seminar() {
		System.out.println("I have seminar");
	}
	
	public void hire() {
		System.out.println("you has been hired!");
	}
	
	public void golf() {
		System.out.println("I playing golf.");
	}
	
	public void fire() {
		System.out.println("you has been fired!");
	}
	
	
	public  void work() {
		seminar();
		hire();
		golf();
		fire();
	}
	
}
