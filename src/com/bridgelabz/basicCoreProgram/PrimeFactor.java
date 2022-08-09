package com.bridgelabz.basicCoreProgram;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner numValue = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = numValue.nextInt();
        int isPrime, counter1, counter2;
        for (counter1 = 2; (counter1) <= number; counter1++) {
            if (number % counter1 == 0) {
                isPrime = 1;
                for (counter2 = 2; counter2 < counter1; counter2++) {
                    if ((counter1 % counter2) == 0)
                        isPrime = 0;
                }
                if (isPrime == 1) {
                    System.out.println("Prime factor is :" + counter1);
                }
            }
        }
    }
}
