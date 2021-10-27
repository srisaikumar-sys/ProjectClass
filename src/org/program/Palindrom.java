package org.program;

public class Palindrom {
	public static void main(String[] args) {
		int n = 1357531;
		int a=n;
		int rev = 0;
		while (n > 0) {
			int num = n % 10;
			rev = (rev * 10) + num;
			n = n / 10;

		}

		if (a == rev) {
			System.out.println(rev);
			System.out.println("It is Palindrom");

		} else {
			System.out.println("It is not Palindrom");
		}
	}

}
