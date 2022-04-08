package javaprograms;

import java.util.Scanner;

public class CountNumberOFEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		sc.close();
		int ecount = 0, ocount = 0;
		while (num > 0) {
			int digit = num % 10;
			if (digit % 2 == 0) {
				ecount++;
			} else {
				ocount++;
			}
           num=num/10;
		}
		System.out.println("Even digits in a number:"+ecount);
		System.out.println("Odd digits in a nubmer:"+ocount);

	}

}
