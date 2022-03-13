package IO.IO_Example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderClass {
	public static void main(String[] args) throws IOException {

		BufferedReader br = null;
		String line;
		File readFile = new File("OutFile.txt");
		try {

			br = new BufferedReader(new FileReader(readFile));
			while ((line = br.readLine()) != null) {
				System.out.printf("%s%n",line);
			}
		} finally {
			if (br != null) {
				br.close();
			}
		}
	}
}
