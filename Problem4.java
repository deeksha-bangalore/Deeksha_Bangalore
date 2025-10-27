package com.test.screening;

import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers separated by space: ");
        String line = scanner.nextLine();

        String[] parts = line.trim().split("\\s+");
        List<Integer> inputList = new ArrayList<>();
        for (String part : parts) {
            inputList.add(Integer.parseInt(part));
        }

        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        for (int num : inputList) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }
        System.out.println("Output:");
        System.out.println(countMap);

        scanner.close();
    }
}