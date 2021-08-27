package com.qa.demo;

public class Results {
	public static int physics;
	public static int chemistry;
	public static int biology;
	public static int total;
	public static double percentage;

	public static void main(String[] args) {
		method1(50, 60, 60);
		method2();
	}

	public static void method1(int phygrade, int chemgrade, int biograde) {

		physics = phygrade;
		chemistry = chemgrade;
		biology = biograde;

		total = physics + chemistry + biology;

		System.out.println("Your Physics Grade is: " + physics);

		System.out.println("Your Chemistry Grade is: " + chemistry);

		System.out.println("Your Biology Grade is: " + biology);

		System.out.println("Your Total Grade is: " + total);

	}

	public static void method2() {

		percentage = (total * 100) / 450;

		System.out.println("Your Total Percentage is: " + percentage + "%");

	}

}
