package com.bridgelabz.basicCoreProgram;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num = value.nextInt();
        if (num % 2 == 0)
            System.out.println("Number " + num + " is Even");
        else
            System.out.println("Number " + num + " is Odd");
    }
}
