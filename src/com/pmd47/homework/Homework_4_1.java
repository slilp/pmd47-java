package com.pmd47.homework;

public class Homework_4_1 {
    public static void main(String[] args) {
        
        //1
        int score = 55 ;
        //a
        if(score >= 80) System.out.println("Good");
        //b
        if(score >= 50) System.out.println("normal");
        //c
        if(score < 50) System.out.println("fail");

        //2
        boolean isHandSome = true;
        //a
        if(score >= 80 || isHandSome){
            System.out.println("Good");
        }else if(score >= 50){
            System.out.println("normal");
        }else if(score < 50){
            System.out.println("fail");
        }


    }
}
