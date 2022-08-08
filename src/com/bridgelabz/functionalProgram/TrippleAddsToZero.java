package com.bridgelabz.functionalProgram;

import java.util.Scanner;

public class TrippleAddsToZero {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[43m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of an array : ");
        int sizeOfArray = scanner.nextInt();
        int array[] = new int[sizeOfArray];
        int c;
        int n = sizeOfArray;
        for(c=0; c<sizeOfArray; c++)
        {
            System.out.print("Enter element of array :");
            array[c] = scanner.nextInt();
        }
        int i, j, k;
        for (i = 0; i < n - 2; i++) {
            for (j = i + 1; j < n - 1; j++) {
                for (k = j + 1; k < n; k++) {
                    if (array[i]+array[j]+array[k] == 0) {
                        System.out.println(ANSI_YELLOW + "The Triplet Sum returning 0 : [" + array[i] + ", " + array[j] + ", " + array[k] + "]" + ANSI_RESET);
                    }
                    else {
                        System.out.println("Failed Triplet combinations : [" + array[i] + ", " + array[j] + ", " + array[k] + "]");
                    }
                }
            }
        }
    }

}

