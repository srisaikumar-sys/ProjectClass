package org.program;

public class Reverse {
	public static void main(String[] args) {
		int a = 123;
		int c = 0;

		while (a > 0) {

			int b = a % 10;

			a = a / 10;
			c = (c * 10) + b;

		}

		System.out.println(c);

	}

}
