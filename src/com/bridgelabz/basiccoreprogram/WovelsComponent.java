package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class WovelsComponent {
    public static void main(String[] args) {
        char character;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The alphabet");
        character = scanner.next().charAt(0);
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.println("character is vowel");
        } else {
            System.out.println("character is consonant");
        }
    }
}

