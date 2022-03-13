package Url;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Download implements Runnable {

	String link;
	File out;

	public Download(String link, File out) {
		super();
		this.link = link;
		this.out = out;
	}

	@Override
	public void run() {
		try {
			URL url = new URL(link);
			HttpURLConnection http = (HttpURLConnection) url.openConnection();
			double fileSize = (double) http.getContentLengthLong();
			BufferedInputStream in = new BufferedInputStream(http.getInputStream());
			FileOutputStream fileOut = new FileOutputStream(this.out);
			BufferedOutputStream bos = new BufferedOutputStream(fileOut, 1024);
			byte[] buffer = new byte[1024];
			double downloaded = 0.00;
			int read = 0;
			double percentDownloadable = 0.00;
			while ((read = in.read(buffer, 0, 1024)) != -1) {
				bos.write(buffer, 0, read);
				downloaded += read;
				percentDownloadable = (downloaded * 100) / fileSize;
				String percent = String.format("%.2f", percentDownloadable);
				System.out.println("Downloaded " + percent + " % of a file");
			}
			bos.close();
			in.close();
			System.out.println("Download complete");

		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
