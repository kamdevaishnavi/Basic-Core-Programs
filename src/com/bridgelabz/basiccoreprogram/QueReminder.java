package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class QueReminder {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter th value for num1 and num2");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        int Quotient = num1 / num2;
        int reminder = num1 % num2;
        System.out.println("Quotient is " +Quotient);
        System.out.println("reminder is " +reminder);
    }
}

