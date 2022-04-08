package javaprograms;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };

		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println(sum1);
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		int misNumber = sum2-sum1;
		System.out.println("missing number:" + misNumber);

	}

}
