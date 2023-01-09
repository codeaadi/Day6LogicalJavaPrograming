package com.bridgelabz.day6;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Number To reversed: ");
            int num = scan.nextInt(), reversed = 0;
            System.out.println("Original Number: " + num);
            while(num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            System.out.println("Reversed Number: " + reversed);
        }
    }

