package com.bridgelabz.functionalProgram;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sizeOfArray = new Scanner(System.in);
        System.out.print("Enter the value for M Rows: ");
        int m = sizeOfArray.nextInt();
        System.out.print("Enter the value for N Columns: ");
        int n = sizeOfArray.nextInt();
        int[][] Array = new int[m][n];
        PrintWriter pw = new PrintWriter("abc.txt");

        System.out.println("Enter the Array Elements for 2 Dimensional Array: ");
        for (int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.println("Enter the element value for Array [" + i + " , " + j + "]" );
                int arrayElementValue = sizeOfArray.nextInt();
                Array[i][j] = arrayElementValue;
                pw.print(Array[i][j] + " ");
            }
            pw.print("\n");
        }
        pw.close();
    }
}
