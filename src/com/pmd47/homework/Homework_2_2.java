package com.pmd47.homework;

public class Homework_2_2 {

    public static void main(String[] args) {

        // 1
        bark();

        // 2

        // a
        float f1 = 5.5f;
        System.out.println(f1);
        int i1 = (int) f1;
        System.out.println(i1);

        // b
        int i2 = 10;
        System.out.println(i2);
        float f2 = (float) i2;
        System.out.println(f2);

        // c
        double d = 10.55;
        System.out.println(d);
        float f3 = (float) d;
        System.out.println(f3);

        // d
        char c = 'A';
        System.out.println(c);
        int i3 = (int) c;
        System.out.println(i3);

        // 3

        // final String hello ="Hello";
        // hello = "World";
        
    }

    public static void bark() {
        String dogName = "Bubu";
        System.out.println("The Dog name = " + dogName + " bark");
    }
}
