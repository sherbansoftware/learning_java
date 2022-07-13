package Exceptions.Exception_Handling.Example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class Read_First_Line {
	private static Logger logg = LoggerFactory.getLogger(Read_First_Line.class);

	static void readFirstLineFromFile(String path) {
		File readFile = new File(path);
		String fileName = readFile.getName();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String str = br.readLine();
			System.out.println(str);

		} catch (FileNotFoundException e) {
			logg.error("File {} not found!.\nPlease check if it's spelled correct.", fileName);
			// e.printStackTrace();
		} catch (IOException e) {
			logg.error(e.getMessage(), e);
			// e.printStackTrace();
		}

	}
}
