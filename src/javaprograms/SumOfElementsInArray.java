package javaprograms;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 20, 30, 40, 50 };

		sum(a);

	}

	public static void sum(int[] n) {
		int sum = 0;
		int len = n.length;
		for (int i = 0; i < len; i++) {
			sum = sum + n[i];
		}
		System.out.println("sum of Array:" + sum);
	}

}
