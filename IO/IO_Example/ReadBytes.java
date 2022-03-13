package IO.IO_Example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadBytes {
	public static void main(String[] args) throws IOException {

		FileInputStream in = null;
		File readFile = new File("Chrys.txt");
		String rfileName = readFile.getName();

		try {
			in = new FileInputStream(readFile);
			int c = 0;
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
			}

		} catch (IOException e) {
			System.err.println("File " + rfileName + " is not found.");
		} finally {
			if (in != null) {
				in.close();
			}
		}

	}
}
