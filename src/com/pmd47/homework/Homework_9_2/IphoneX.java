package com.pmd47.homework.Homework_9_2;

public class IphoneX extends Iphone{
	
	public String model = "X" ;


	public IphoneX(String number , String internetProvider) {
		super(number,internetProvider,"iPhone");

	}
	
	public void faceID() {
		System.out.println("Call method faceID");
	}

	
}
