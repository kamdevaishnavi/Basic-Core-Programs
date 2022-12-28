package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int val;
        int Head = 0;
        int HeadPercentage;
        int TailPercentage;
        int Tails = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to toss coin");
        val = scanner.nextInt();
        for (int i = 1; i <= val; i++) {
            if (Math.random() < 0.5)
//                System.out.println("Head");
                Head++;
            else
//            System.out.println("Tails");
                Tails++;
        }
        System.out.println("Head count is " +Head);
        System.out.println("Tails count is " +Tails);
        HeadPercentage = Head * 100 / val;
        TailPercentage = Tails * 100 / val;
        System.out.println("Percentage of Head = " + HeadPercentage);
        System.out.println("Percentage of Tals = " + TailPercentage);
    }
}
