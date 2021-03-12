package com.pmd47.homework;

public class Homework_8 {
    public static void main(String[] args) {
       
    	 int[][] myArr = {{11,22},{33,44},{55,66},{77,88}};

         //1
         for(int i = 0 ; i < myArr.length ; i++) {
         	for(int j = 0 ; j < myArr[i].length ; j++) 
         	{
         		System.out.println(myArr[i][j]);
         	}
         }
    
         
         //2
         int sum = 0 ;
         for(int i = 0 ; i < myArr.length ; i++) {
         	sum = sum + myArr[i][myArr[i].length-1];
         }
         System.out.println(sum);
         
    }
}
