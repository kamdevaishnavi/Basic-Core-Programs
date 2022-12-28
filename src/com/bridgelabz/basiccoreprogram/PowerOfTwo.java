package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        int PowerOfTwo = 1;
//       int num = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        for(int i = 1; i <= num; i++){
            PowerOfTwo = 2 * PowerOfTwo;
            System.out.println(i+" power of 2 is " + PowerOfTwo);

        }




    }
}
