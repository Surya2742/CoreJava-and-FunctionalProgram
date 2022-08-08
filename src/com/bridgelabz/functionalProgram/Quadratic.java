package com.bridgelabz.functionalProgram;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a,b,c Values  ");// a*x*x + b*x + c.
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        Double delta = Double.valueOf(((b * b) - (4 * a * c)));
        Double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        Double root2 = (-b - Math.sqrt(delta)) / (2 * a);
        if(Double.isNaN(root1) && Double.isNaN(root2)) {
            System.out.println("The value of two roots are Imaginary or Infinite");
        }
        else {
            System.out.println("The two roots of Equation are :" + root1 + " and " + root2);
        }
    }
}
