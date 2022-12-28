package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        double t, v;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The number of t and v");
        t = scanner.nextDouble();
        v = scanner.nextDouble();
        if (t > 0 && t <= 50 && v >= 3 && v <= 120) {
            double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
            System.out.println("National Weather Service defines the windchill: " + windChill);
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
