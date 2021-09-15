package com.qa.demo;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println(fizzBuzz(4));
		System.out.println(fizzBuzz(5));
	}

	public static String fizzBuzz(int input) {

		String fizzBuzz = Integer.toString(input);

		if (input % 3 == 0) {

			fizzBuzz = "Fizz";
			if (input % 5 == 0) {

				fizzBuzz = "FizzBuzz";
				return fizzBuzz;
			}

		}

		if (input % 5 == 0) {

			fizzBuzz = "Buzz";

		}

		return fizzBuzz;
	}

	public static String fizzBuzz2(int number) {
		if (number % 3 == 0) {
			if (number % 5 == 0) {
				return "fizzbuzz";
			} else {
				return "fizz";
			}
		} else if (number % 5 == 0) {
			return "buzz";
		}
		return String.valueOf(number);
	}

}
