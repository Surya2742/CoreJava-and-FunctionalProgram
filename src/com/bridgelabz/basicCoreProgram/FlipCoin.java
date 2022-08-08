package com.bridgelabz.basicCoreProgram;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int headCounter = 0;
        int tailCounter = 0;
        int counter = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no. of times to perform Coin Flip : ");
        int input = scanner.nextInt();
        if (input > 0) {
            while (counter <= input) {
                counter++;
                double decisionOfFlip = Math.random();
                if (decisionOfFlip < 0.5)
                    tailCounter++;
                else
                    headCounter++;
            }
            System.out.println("No. of time Head comes : " + headCounter);
            System.out.println("No. of time Tails comes : " + tailCounter);
            float tailPercent = (float)tailCounter / input * 100;
            float headPercent = (float) headCounter / input * 100;
            System.out.println("Percent Head : " + headPercent + "%");
            System.out.println("Percent Tail : " + tailPercent + "%");
        }
        else
            System.out.println("Enter the positive number");
    }
}
