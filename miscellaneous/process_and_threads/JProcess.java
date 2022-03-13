package miscellaneous.process_and_threads;

import java.io.IOException;
import java.util.Scanner;

public class JProcess {

	public static void main(String[] args) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\Notepad++\\notepad++.exe","simpleFile");
		Process process =pb.start();

		Scanner scan =new Scanner(process.getInputStream());
		
		while(scan.hasNext()) {
			
		System.out.println("Ls process:" + scan.next());	
		}
		scan.close();
		
	}
}
