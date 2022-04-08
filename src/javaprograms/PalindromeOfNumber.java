package javaprograms;

import java.util.Scanner;

public class PalindromeOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		int rev = 0;
		int temp = num;
		while (temp != 0) {
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;

		}
		if (num == rev) {
			System.out.println("given number is palindrome");
		} else {
			System.out.println("given number not a plaindorme");
		}

	}

}
