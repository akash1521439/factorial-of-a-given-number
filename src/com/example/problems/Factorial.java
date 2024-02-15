package com.example.problems;
//Write a program to find the factorial of a given number in Java.
public class Factorial {
    static int factorial(int number){
        int factorial = 1;
        for(int i = number;i>0;i--){
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args){
        int number = 7;
        System.out.println("Factorial of "+number+ " is: "+Factorial.factorial(number));
    }
}
