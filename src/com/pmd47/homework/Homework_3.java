package com.pmd47.homework;


public class Homework_3 {

    public static void main(String[] args) {

        // 1
        int i = 20;
        // a
        i++;
        i++;
        i++;
        i++;
        i++;
        System.out.println(i);
        i = 20 ;
        // b
        --i;
        --i;
        --i;
        --i;
        --i;
        System.out.println(i);

        //2
        float f1 = 5.5f;
        float f2 = 5f;
        if((f1 == 5.5f) && (f2 == 5f)) System.out.println(true);

        //3
        char a = 'A';
        char b = 'B';

        if((a == 'A') || (b == 'C')) System.out.println(true);


    }
}
