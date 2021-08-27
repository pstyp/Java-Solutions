package com.qa.demo;

public class FlowCharts {

	public static void main(String[] args) {
		flowDecision(5, 6, true);
		flowDecisionProject(50);

	}

	public static void flowDecision(int first_number, int second_number, boolean bool) {

		if (bool) {

			int result = first_number + second_number;
			System.out.println(result);
		} else {

			int result = first_number * second_number;
			System.out.println(result);
		}

	}

	public static void flowDecisionProject(int A) {

		if (A > 2000) {

			System.out.println("A");

			if (A > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");

				if (A > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}

			}

		} else {

			System.out.println("1");

			if (A > 100) {
				System.out.println("3");
				if (A > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");

					if (A > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}

			} else {
				System.out.println("2");
			}
		}

	}
}
