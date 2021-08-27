package com.qa.demo;

public class Example {

	public static void main(String[] args) {

		System.out.println(addNumbers(10, 10));
		
		System.out.println(printMessage("Hello"));

	}

	private static String printMessage(String message) {
		return message;
		
	}

	private static int addNumbers(int num1, int num2) {
		return num1+num2;
		
	}

}
