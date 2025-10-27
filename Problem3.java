package com.test.screening;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (x): ");
        int x = scanner.nextInt();

        int count = (x % 2 == 0) ? x - 1 : x;

        System.out.print("Output: ");
        for (int i = 0; i < count; i++) {
            System.out.print((2 * i + 1) + " ");
        }

        scanner.close();
    }
}