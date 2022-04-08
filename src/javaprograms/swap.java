package javaprograms;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap(10, 20);
	}

	public static void swap(int a, int b) {
		System.out.println("Before swapping:" + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swapping:" + a + " " + b);
	}

}
