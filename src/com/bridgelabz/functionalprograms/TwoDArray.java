package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int row = 0;
        int colm = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The number of rows");
        row = scanner.nextInt();
        System.out.println("Enter the number of columns");
        colm = scanner.nextInt();
        int [][] array = new int [row][colm];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                System.out.println("Enter the input position (" + row + "," + colm + ") ");
                array [i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < colm; i++) {
            for (int j = 0; j < colm; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }



    }
}
