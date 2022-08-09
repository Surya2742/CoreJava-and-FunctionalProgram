package com.bridgelabz.basicCoreProgram;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);
        System.out.print("Enter an Alphabet : ");
        char alphabet = letter.next().charAt(0);

        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' ||
                alphabet == 'o' || alphabet == 'u' || alphabet == 'A' ||
                alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {

            System.out.println(alphabet + " is vowel");
        }
        else {
            System.out.println(alphabet + " is consonant");
        }
    }
}
