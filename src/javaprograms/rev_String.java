package javaprograms;

import java.util.Scanner;

public class rev_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String a = sc.next();
		rev_String obj = new rev_String();
		obj.reverseofString(a);

	}

	public void reverseofString(String s) {

		System.out.println("Before  reverse String:" + s);
		char[] ch = s.toCharArray();
		String rev = "";
		for (int i = s.length()-1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		System.out.println("reverse of a String:" + rev);
	}

}
