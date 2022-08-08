package com.bridgelabz.basicCoreProgram;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        final int lowerLimit = 1000;
        final int upperLimit = 9999;
        Scanner yearValue = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int year = yearValue.nextInt();
        if (year >= lowerLimit && year <= upperLimit)
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                System.out.println(year + " is a Leap Year");
            else
                System.out.println(year + " is not a Leap Year");

        else
            System.out.println("Enter 4 Digit number for Year ");

    }
}
