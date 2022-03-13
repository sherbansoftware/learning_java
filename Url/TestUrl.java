package Url;

import java.io.File;

public class TestUrl {

	public static void main(String[] args) {
	String link ="http://iiti.ac.in/people/~tanimad/JavaTheCompleteReference.pdf";
  
	File file= new File("C:\\eclipse-workspace\\JavaTheCompleteReference.pdf");
	
	new Thread(new Download(link,file)).start();
	
	}

}
