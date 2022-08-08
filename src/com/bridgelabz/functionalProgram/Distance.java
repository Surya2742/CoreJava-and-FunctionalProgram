package com.bridgelabz.functionalProgram;

import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X Point : ");
        int X = scanner.nextInt();
        System.out.print("Enter Y Point : ");
        int Y = scanner.nextInt();
        double distance = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
        System.out.println("The Euclidean distance is :" + distance);
    }

}
