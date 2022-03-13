package Exceptions.Exception_Handling.Example;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchDemo {

	public static void fileAccess() {

		try {
			FileReader fr = new FileReader("someFile");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Run for sure");
		}
	}

	public static void main(String[] args) {
		TryCatchDemo.fileAccess();
	}

}
