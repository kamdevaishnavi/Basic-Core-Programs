package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class CalculateDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for x and y");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        float distance = (float) Math.sqrt( x * x + y * y );
        System.out.println("distance of line x and y:" +distance);
    }
}
