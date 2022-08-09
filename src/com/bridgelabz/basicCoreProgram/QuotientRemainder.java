package com.bridgelabz.basicCoreProgram;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner Int_Value = new Scanner(System.in);
        System.out.print("Enter a Dividend : ");
        int dividend = Int_Value.nextInt();
        System.out.print("Enter a Divider : ");
        int divider = Int_Value.nextInt();
        int quotient = dividend / divider;
        int remainder = dividend % divider;
        System.out.println("Quotient is " + quotient);
        System.out.println("Remainder is " + remainder);
    }
}
