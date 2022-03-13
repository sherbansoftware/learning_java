package IO.IO_Example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBytes {
	public static void main(String[] args) throws IOException {

		// write file
		File file = new File("C:\\eclipse-workspace\\JavaLearne\\Chrys.txt");
		// String writeFilePath = file.getAbsolutePath();
		// System.out.println(writeFilePath);
		FileOutputStream out = null;
		String str = "yhcuqyuyqekuvh ";
		try {
			out = new FileOutputStream(file);
			byte[] b = str.getBytes();
			out.write(b);
		} catch (IOException e) {
			System.err.printf("File not found!", e);
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}
}
