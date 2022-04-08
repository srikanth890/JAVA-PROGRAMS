package javaprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\Mobile Programming\\Desktop\\Programs.txt");

		boolean flag = f.canRead();
		System.out.println(flag);

		Scanner sc = new Scanner(f);

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

	}

}
