package com.bridgelabz.basiccoreprogram;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A value check Even Or Odd");
        int val = scanner.nextInt();
        if (val % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}
