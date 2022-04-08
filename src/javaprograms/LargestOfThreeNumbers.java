package javaprograms;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'a' value");
		int a = sc.nextInt();
		System.out.println("Enter 'b' value");
		int b = sc.nextInt();
		System.out.println("Enter 'c' value");
		int c = sc.nextInt();
		if (a > b) {
			if (a > c) {
				System.out.println(a + "is max number");
			} else {
				System.out.println(b + "is a max number");
			}
		} else {
			System.out.println(b + "is a max number");
		}

	}

}
