package com.bridgelabz.basicCoreProgram;

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void swap(int numOne, int numTwo) {
        int temp = numOne;
        numOne = numTwo;
        numTwo = temp;
        System.out.println("After swap");
        System.out.println("Number 1 = " + numOne);
        System.out.println("Number 2 = " + numTwo);
    }

    public static void reverseNumber(int number) {
        int reverseNumber = 0;
        while(number != 0) {
            int temp = number%10;
            reverseNumber= (reverseNumber * 10) + temp;
            number=number/10;
        }
        System.out.println("The reverse Number of entered Value is : " + reverseNumber);
    }

    public static void main(String[] args) {
        Scanner Value = new Scanner(System.in);
        System.out.print("Enter Number 1 value : ");
        int numberOne = Value.nextInt();
        System.out.print("Enter Number 2 value : ");
        int numberTwo = Value.nextInt();
        System.out.println("Before Swap");
        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);
        swap(numberOne, numberTwo);
        reverseNumber(numberOne);
        reverseNumber(numberTwo);
    }

}
