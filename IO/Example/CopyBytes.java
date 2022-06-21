package IO.Example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;
        File readFileName = new File("Chrys.txt");
        String rFileName = readFileName.getName();
        File wFileName = new File("OutFilen.txt");

        try {

            in = new FileInputStream(readFileName);
            out = new FileOutputStream(wFileName);
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            System.err.println("File " + rFileName + " is not found.");
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
