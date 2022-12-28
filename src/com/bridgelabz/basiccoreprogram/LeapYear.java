package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
//        int year;
        System.out.println("Enter The year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year > 999 && year <= 9999){
            if ((year % 4 == 0) && (year % 100 !=0) || (year % 400 == 0))
                System.out.println("Leap Year " +year);

            else{
                System.out.println("Not Leap Year " + year);
            }

        }else{
            System.out.println("Invalid input");
        }




    }
}

