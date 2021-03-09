package com.pmd47.homework;

public class Homework_4_3 {
    public static void main(String[] args) {
        
        double score = 53;

        if(score >= 80){
            System.out.println("A");
        }else if(score >= 70){
            System.out.println("B");
        }else if(score >= 60){
            System.out.println("C");
        }else if(score >= 50){
            System.out.println("D");
        }else if(score >= 40){
            System.out.println("F");
        }else{
            System.out.println("E");
        }
    }
}
