package IO.IO_Example;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStream_Class {
	public static void main(String[] args) throws IOException {
		DataInputStream_Class dInputStream = new DataInputStream_Class();
		dInputStream.readPrimitiveData();
	}

	public void readPrimitiveData() throws IOException {
		DataInputStream dis = null;
		FileInputStream fis = null;
		File readFile = new File("Chrys.txt");
		try {
			fis = new FileInputStream(readFile);
			dis = new DataInputStream(fis);
			int intValue = dis.readInt();
			double doubleValue = dis.readDouble();
			boolean booleanValue = dis.readBoolean();

			System.out.printf("int value: %d%nboolean :%b%ndouble value: %5.2f%n", intValue, booleanValue, doubleValue);

		} finally {
			if (dis != null) {
				dis.close();

			}

		}

	};
}
