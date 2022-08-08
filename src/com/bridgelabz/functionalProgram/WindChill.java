package com.bridgelabz.functionalProgram;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Temperature (in Fahrenheit) : ");
        double t = scanner.nextDouble();
        System.out.print("Enter Wind Speed (in miles per hour) : ");
        double v = scanner.nextDouble();
        if (t >= 50) {
            if (v <= 3 || v >= 120) {
                double windChill = 35.74 + (0.6215 * t) + (((0.4275 * t) - 35.75) * Math.pow(v, 0.16));
                System.out.println("The WindChill value is : " + windChill);
            }
            else {
                System.out.println("The WindSpeed is not in Range");
            }
        }
        else {
            System.out.println("Enter Valid Temperature or Wind Speed");
        }
    }
}
