package javaprograms;

import java.util.Arrays;

public class EqualityOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 1, 2, 3, 4, 5 };

		/*
		 * boolean status = Arrays.equals(a, b); if (status == true) {
		 * System.out.println("both arrays are equal"); } else {
		 * System.out.println("both arrays are not equal"); }
		 */
		boolean status = true;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					status = false;
				}
			}

		} else {
			status = false;
		}
		if (status) {
			System.out.println("both arrays are equal");
		} else {
			System.out.println("both arrays are not equal");
		}

	}

}
