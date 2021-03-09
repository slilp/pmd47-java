package com.pmd47.homework;

public class Homework_4_4 {
    public static void main(String[] args) {

        //Lab 6
        //1
        int i = 1 ;
        while(i <= 10){
            System.out.println(i);
            i++;
        }
        //2
        i = 1;
        int sum = 0 ;
        while(i <= 10){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
        //3
        i = 1;
        while(i <= 100){
            if(i%12==0){
                System.out.println(i);
            }
            i++;
        }
        //4
        int[] nums = {1,2,3,4,5};
        for (int j : nums) {
            System.out.println(j);
        }

        //Lab7
        //1
        int n = 20;
        do {
            System.out.println(n);
            n--;
        }while(n >= 1);
        //2
        // n = 20;
        // do {
        //     System.out.println(n);
        //     n--;
        // }while(n >= 1);

        //Lab8

        for(int count = 1 ; count <= 20 ; count++){
            if(count == 11){
                System.out.println(count);
                break;
            } 
        }

    }
}
