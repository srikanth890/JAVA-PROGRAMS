package javaprograms;

public class MAxAndMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 293, 45, 98, 15, 8 };
		int max = a[0], min = a[0];
		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
			} else {
				if (a[i] < min) {
					min = a[i];
				}

			}
		}
		System.out.println("maximum value:" + max);
//		for (int i = 0; i < a.length; i++) {
//
//			if (a[i] < min) {
//				min = a[i];
//			}
//		}
		System.out.println("minimum value:" + min);

	}

}
