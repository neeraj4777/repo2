package com.del;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExceptionTest {
	
	public MyExceptionTest() {
		Scanner scan = new Scanner(System.in);
		try {
		System.out.println("Enter Numerator");
		int numerator = scan.nextInt();
		System.out.println("Enter Denominator");
		int denominator = scan.nextInt();
		int quotient = divide(numerator, denominator);
		System.out.println("Result: " + quotient);
	}
		catch (ArithmeticException e) {
			System.out.println("Denominator cannot be zero");
		}
		catch (InputMismatchException e) {
			System.out.println("Please enter whole numbers only");
		}
		finally {
			System.out.println("End of program");
		}
	}
	
	private int divide(int numerator, int denominator) {
		return numerator/denominator;
	}
	public static void main(String[] args) {
		new MyExceptionTest();
	}

}
