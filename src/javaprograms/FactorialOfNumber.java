package javaprograms;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num = sc.nextInt();
		sc.close();
		int fact = 1;
		for (int i = num; i > 0; i--) {
			fact = fact * i;
		}
		System.out.println("factorial of a number:" + fact);
	}

}
