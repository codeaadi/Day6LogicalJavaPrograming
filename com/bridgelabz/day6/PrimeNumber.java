package com.bridgelabz.day6;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean isPrime = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                isPrime = true;
                break;
            }
        }

        if (!isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
