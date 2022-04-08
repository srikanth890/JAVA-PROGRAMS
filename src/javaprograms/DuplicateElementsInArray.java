package javaprograms;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 2, 3, 4, 5, 3, 6 };
		boolean flag = true;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j] + "Duplicate numbers");
					flag = true;
				}
			}

		}
		if (flag == false) {
			System.out.println("duplicate numbers not found");
		}

	}

}
