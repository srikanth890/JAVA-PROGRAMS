package javaprograms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataFromFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter file = new FileWriter("C:\\Users\\Mobile Programming\\Desktop\\bugs.txt");
		BufferedWriter bw = new BufferedWriter(file);

		bw.write("finance tracker");
		bw.write("Diet and Fitness Tracker");
		bw.write("period Tracker");

		System.out.println("finished");
		bw.close();

	}

}
