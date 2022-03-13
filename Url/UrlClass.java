package Url;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlClass {
	
	public static void main(String[] args) {
	try {
	    URL myURL = new URL("http://example.com/");
	    URLConnection myURLConnection = myURL.openConnection();
	    myURLConnection.connect();
	} 
	catch (MalformedURLException me) { 
	    // new URL() failed
	    // ...
	} 
	catch (IOException ie) {   
	    // openConnection() failed
	    // ...
	}
}	
}
