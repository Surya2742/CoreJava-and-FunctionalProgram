package com.bridgelabz.basicCoreProgram;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner numValue = new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        int numOne = numValue.nextInt();
        int numTwo = numValue.nextInt();
        int numThree = numValue.nextInt();
        if(numOne >= numTwo && numOne > numThree) {
            System.out.println("Largest Number is :" + numOne);
        }
        else if(numTwo > numOne && numTwo >= numThree) {
            System.out.println("Largest Number is :" + numTwo);
        }
        else if(numThree >= numOne && numThree > numTwo) {
            System.out.println("Largest Number is :" + numThree);
        }
        else if(numOne == numTwo && numTwo == numThree) {
            System.out.println("All the Numbers are same");
        }
    }
}
