package com.qa.demo;

public class Calculator {

	public static double result;

	public static void main(String[] args) {

		System.out.println(add(5, 6));
		System.out.println(sub(20, 11));
		System.out.println(mul(5, 6));
		System.out.println(div(10, 2));
	}

	public static double add(double firstNumber, double secondNumber) {

		result = firstNumber + secondNumber;

		return result;
	}

	public static double sub(double firstNumber, double secondNumber) {

		result = firstNumber - secondNumber;

		return result;
	}

	public static double mul(double firstNumber, double secondNumber) {

		result = firstNumber * secondNumber;
		return result;
	}

	public static double div(double firstNumber, double secondNumber) {

		result = firstNumber / secondNumber;
		return result;

	}
}
