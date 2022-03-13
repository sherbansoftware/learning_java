package Loggers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {

	private static Logger logg = LoggerFactory.getLogger(MyFileWriter.class);

	FileWriter fw;

	public void write(String data) {

		File writeFile = new File("Chrys.txt");
		String fileName = writeFile.getName();
		try {
			fw = new FileWriter(writeFile);
			fw.write(data);
			String str = data.substring(0, 20);
			logg.info("Adding text: {}", str + "...");
		} catch (IOException e) {
			logg.error("File {} not found at path specified!", fileName);
		} finally {
			try {
				fw.close();
			} catch (Exception e) {
				System.out.println("Connection not opened!");
			}

		}
	}
}
