package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        int val;
        int factor = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value");
        val = scanner.nextInt();
        while (val > 1) {
            if (val % factor == 0) {
                System.out.println(factor);
                val = val / factor;
            } else
                factor++;

        }
    }
}
