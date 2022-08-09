package com.bridgelabz.basicCoreProgram;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner numberValue = new Scanner(System.in);
        System.out.print("Enter a Number to print power of 2 (1-31) : ");
        int number = numberValue.nextInt();
        if(number >= 0 && number < 31) {
            System.out.println((int) Math.pow(2, number));
            for(int i = 0; i <= number; i++) {
                System.out.println("2^" + i + "=" + (int) Math.pow(2, i));
            }
        }
        else {
            System.out.println("OVerflow an Interger");
        }
    }
}
