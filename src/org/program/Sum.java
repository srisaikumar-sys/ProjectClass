 package org.program;

public class Sum {
	public static void main(String[] args) {
		/*
		 * int s=0; for (int i = 1; i <=100; i++) { if (i%2==0) { s=s+i; }
		 * 
		 * } System.out.println(s);
		 */

		int n = 12345;
		int sum = 0;
		while (n > 0) {
			int num = n % 10;
			sum = sum + num;
			n = n / 10;

		}
		System.out.println(sum);
	}

}
