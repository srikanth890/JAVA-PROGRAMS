package javaprograms;

public class OccurenceInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "My name is Srikanth Reddy";

		int total_len = s.length();
		int occurceoflength = s.replace("R", "").length();

		int occu = total_len - occurceoflength;

		System.out.println(occu);

	}

}
