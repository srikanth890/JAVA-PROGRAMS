package javaprograms;

public class RemovejunkorSpecialCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "djndoj !%^&&**(";

		String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);

	}

}
