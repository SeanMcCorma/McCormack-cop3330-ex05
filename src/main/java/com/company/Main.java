package com.company;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sean McCormack
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String num1_string = scan.nextLine();
        int num1 = Integer.valueOf(num1_string);
        System.out.print("What is the second number? ");
        String num2_string = scan.nextLine();
        int num2 = Integer.valueOf(num2_string);
        int summation = num1+num2;
        int subtraction = num1-num2;
        int multiplication = num1*num2;
        int division = num1/num2;
        System.out.println(num1_string+" + "+num2_string+" = "+summation);
        System.out.println(num1_string+" - "+num2_string+" = "+subtraction);
        System.out.println(num1_string+" * "+num2_string+" = "+multiplication);
        System.out.println(num1_string+" / "+num2_string+" = "+division);

    }
}
