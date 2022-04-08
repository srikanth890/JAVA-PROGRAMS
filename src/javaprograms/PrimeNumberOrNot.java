package javaprograms;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter  Number:");

		int num = sc.nextInt();
		sc.close();
		int count = 0;
		if (num > 1) {

			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("It is a Prime Number");
			} else {
				System.out.println("It is not a prime Number");
			}

		} else {
			System.out.println(num + " it is not a prime number");
		}

	}

}
