package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        double answer = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number");
        int val = scanner.nextInt();
        for (int i = 1; i <= val; i++){
            answer = answer + (double) 1/i;

        }
        System.out.println(answer);

    }
}
