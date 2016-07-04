/**
 * 
 */
package com.quoioln.calculator;

/**
 * @author vpquoi
 *
 */
public class Calculator {
	public static double add(double a, double b) {
		return a + b;
	}
	
	public double subtract(double a, double b) {
		return a - b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}
	
	public double divide(double a, double b) {
		if (b == 0.0) {
			throw new ArithmeticException();
		}
		return a / b;
	}
}
