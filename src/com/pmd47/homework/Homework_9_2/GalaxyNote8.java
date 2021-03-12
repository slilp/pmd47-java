package com.pmd47.homework.Homework_9_2;

public class GalaxyNote8 extends Samsung{
	
	public String model = "Galaxy Note 8" ;
	
	public GalaxyNote8(String number , String internetProvider) {
		super(number,internetProvider,"Samsung");
	}
	
	public void usePen() {
		System.out.println("Call method usePen");
	}
	
}
