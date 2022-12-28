package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a, b ,c");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println("Equation = + a * x * x + b * x + c");
        int delta = (b * b) - (4 * a * c);
        double Root1 = (float) (((b + Math.sqrt(delta)) / (2 * a)));
        double Root2 = (float) (((b - Math.sqrt(delta)) / (2 * a)));
        System.out.println("Equation of root Root1 = " + Root1 + " Root2 = " + Root2);
    }
}
