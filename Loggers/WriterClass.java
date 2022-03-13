package Loggers;

public class WriterClass {
	public static void main(String[] args) {
		MyFileWriter writer = new MyFileWriter();
		String string = "ATest.A lot of thing to talk about...";
		
		writer.write(string);
	}
}
