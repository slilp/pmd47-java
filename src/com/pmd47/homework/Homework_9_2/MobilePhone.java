package com.pmd47.homework.Homework_9_2;

public class MobilePhone {

	public String number ;
	public String internetProvider ;
	public String brand ;

	
	public MobilePhone(String number , String internetProvider , String brand) {
		this.number = number ;
		this.internetProvider = internetProvider;
		this.brand = brand;
	}
	
	public void phoneCall(String telNumber) {
		System.out.println(number + " call to number " + telNumber);

	}
	
	public void sms() {
		System.out.println("Sending SMS");
	}
	
	public void internetSurfing() {
		System.out.println("InternetSurfing by " + internetProvider);
	}

}
