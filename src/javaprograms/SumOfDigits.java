package javaprograms;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number:");

		int num = sc.nextInt();
		sc.close();
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;

		}
		System.out.println("sum of digits of a number:" + sum);
	}

}
