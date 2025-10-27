package com.test.screening;

import java.util.Scanner;

public class Problem1 {

	    public static double calculate(double a, double b, String operation) {
	        switch (operation.toLowerCase()) {
	            case "add": return a + b;
	            case "subtract": return a - b;
	            case "multiply": return a * b;
	            case "divide": return b != 0 ? a / b : Double.NaN;
	            default: throw new IllegalArgumentException("Invalid operation");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter first number (a): ");
	        double a = scanner.nextDouble();

	        System.out.print("Enter second number (b): ");
	        double b = scanner.nextDouble();

	        scanner.nextLine(); 
	        
	        System.out.print("Enter operation (add, subtract, multiply, divide): ");
	        String operation = scanner.nextLine();

	        try {
	            double result = calculate(a, b, operation);
	            System.out.println("Result: " + result);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }

	        scanner.close();
	}
}