package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1,num2,sum, product;

        System.out.println("Enter a number");
        num1=input.nextInt();

        System.out.println("Enter another number");
        num2=input.nextInt();

        sum = num1 + num2;
        product = num1 * num2;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product + "\n");

        Scanner input2 = new Scanner(System.in);

        int num3, sqrt;

        System.out.println("Enter a number to find the square root");
        num3=input2.nextInt();

        sqrt = num3 * num3;

        System.out.println("Square Root: " + sqrt);


    }
}
