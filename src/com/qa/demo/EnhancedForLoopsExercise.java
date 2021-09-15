package com.qa.demo;

public class EnhancedForLoopsExercise {

	public static void main(String[] args) {

		String[] strings = { "Hello", "My", "Friends" };

//		for (String word : strings) {
//			System.out.println(word);
//		}

		int[] ints = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

//		for (int i : ints) {
//			System.out.println(i * i);
//		}

		for (int i : ints) {
			if (evenOrNot(i)) {
				System.out.println("Even: " +  i * i * i);
			} else {
				System.out.println("Odd: " + i * i);
			}
		}
	}

	public static boolean evenOrNot(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}



