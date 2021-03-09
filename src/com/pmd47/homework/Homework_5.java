package com.pmd47.homework;

public class Homework_5 {
    public static void main(String[] args) {
        
        String word = "HELLO";

        iamNotReturn(word);

        System.out.println(iamReturn(word));

    }

    public static void iamNotReturn(String text){
        System.out.println(text);
    }

    public static String iamReturn(String text){
        return text;
    }

}
