package Exceptions.Exception_Handling.Example;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample {

	public void readFile() throws FileNotFoundException {

		FileReader fr = new FileReader("TestFile");
	}

	public static void main(String[] args) {
		ThrowsExample th = new ThrowsExample();
		try {
			th.readFile();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End program...");
	}

}
