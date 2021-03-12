package com.pmd47.homework;

public class Homework_7 {

    public static void main(String[] args) {
        String String1 = "You and Me";
        String String2 = " you and me ";

        //1
        System.out.println(String1.equals(String2));
        
        //2
        System.out.println(String1.contains("You"));
        
        //3
        System.out.println(String1.length());
        
        //4
        System.out.println(String1.substring(4,String1.length()));

        //5
        System.out.println(String2.trim());
        
        //6
        System.out.println(String1.toUpperCase());
        
        //7
        System.out.println(String2.trim().toUpperCase());
        
        
    }
}
