package com.qa.demo;

public class ArraysExercise {
	public static void main(String[] args) {

		int[] tenArray = new int[10];
		
		tenArray[0] = 1;
		tenArray[1] = 2;
		tenArray[2] = 3;
		tenArray[3] = 4;
		tenArray[4] = 5;
		tenArray[5] = 6;
		tenArray[6] = 7;
		tenArray[7] = 8;
		tenArray[8] = 9;
		tenArray[9] = 10;
				
		
//
//		for (int i : tenArray) {
//			System.out.println(i);
//		}

		int[] ints = new int[5];

		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i] = i);
		}

		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i] = i * 10);
		}
	}
}


