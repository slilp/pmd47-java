package com.pmd47.homework.Homework_9_2;

public class Iphone8 extends Iphone{
	
	public String model = "8" ;
	
	public Iphone8(String number , String internetProvider) {
		super(number,internetProvider,"iPhone");
	}
	
	public void touchID(){
		System.out.println("Call method touchID");
	}
	
}
