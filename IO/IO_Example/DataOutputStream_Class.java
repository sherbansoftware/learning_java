package IO.IO_Example;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_Class {

	public static void main(String[] args) throws IOException {
		DataOutputStream_Class dOutputStream = new DataOutputStream_Class();
		dOutputStream.writePrimitiveData();
	}

	public void writePrimitiveData() throws IOException {
		DataOutputStream dos = null;
		FileOutputStream fos = null;
		File writeFile = new File("Chrys.txt");
		try {
			fos = new FileOutputStream(writeFile);
			dos = new DataOutputStream(fos);
			dos.writeInt(125);
			byte[] b = { 65, 54, 84, 1, 4, 1 };
			dos.write(b);
			dos.writeBoolean(true);
			dos.writeDouble(45.55);
			dos.writeUTF("Ma duc la plimbare!");

		} catch (IOException e) {

		} finally {
			if (dos != null) {
				dos.close();

			}

		}

	};
}
