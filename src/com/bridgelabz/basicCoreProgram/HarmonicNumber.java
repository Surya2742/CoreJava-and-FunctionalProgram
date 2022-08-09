package com.bridgelabz.basicCoreProgram;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String args[]) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int valueOfN = value.nextInt();
        float sum = 0;
        System.out.print("The Harmonic series is follows : ");
        for (float i = 1; i <= valueOfN; i++) {
            sum = sum + 1 / i;
            System.out.print(1/i + " + ");
        }
        System.out.print("\nThe Harmonic series is follows : ");
        for (int i = 1; i <= valueOfN; i++) {
            System.out.print("1/" + i + " + ");
        }
        System.out.println("");
        System.out.println("Nth Harmonic Number is : " + sum);
    }
}
