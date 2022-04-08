package javaprograms;

public class EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 15, 23, 46, 86, 23 };

		Extract(a);
	}

	public static void Extract(int[] d) {

		int leng = d.length;
		System.out.println("Even Numbers:");
		for (int i = 0; i < leng; i++) {
			if (d[i] % 2 == 0) {
				System.out.println(d[i]);
			}

		}
		System.out.println("Odd Numbers:");
		for (int j = 0; j < leng; j++) {
			if (d[j] % 2 != 0) {
				System.out.println(d[j]);
			}
		}

	}

}
