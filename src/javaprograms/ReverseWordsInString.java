package javaprograms;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "My Name is srikanth Reddy";

		String[] words = s.split(" ");

		int len = words.length;
		String rev = " ";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + words[i];
		}
		System.out.println("reverse of words:" + rev);

	}

}
