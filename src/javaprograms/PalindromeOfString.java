package javaprograms;

import java.util.Scanner;

public class PalindromeOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String:");

		String s = sc.next();
		String rev = "";
		int len = s.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
          
		if (s.equals(rev)) {
             System.out.println("palindrome");
		}
		else {
			System.out.println("not palindorme");
		}
	}
}
