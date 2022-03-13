package Exceptions.Exception_Handling.Example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListOfNumbers {

	private List<Integer> list;
	private static final int SIZE = 10;
	private static final Logger LOGGER = Logger.getLogger(ListOfNumbers.class.getName());

	public ListOfNumbers() {
		list = new ArrayList<Integer>(SIZE);
		for (int i = 0; i < SIZE; i++) {
			list.add(new Integer(i));
		}
	}

	public void writeList() {
		// The FileWriter constructor throws IOException, which must be caught.
		PrintWriter out = null;
		try {
			System.out.println("Entered try statement");
			out = new PrintWriter(new FileWriter("F:\\OutFile.txt"));
			for (int i = 0; i < SIZE; i++) {
				out.println("Value at: " + i + " = " + list.get(i));
			}
		} catch (IOException e) {
			// System.err.println("Caught IOException: " + e.getMessage());
			/*
			 * StackTraceElement elements[] = e.getStackTrace(); for (int i = 0, n =
			 * elements.length; i < n; i++) { System.err.println(elements[i].getFileName() +
			 * ":" + elements[i].getLineNumber() + ">> " + elements[i].getMethodName() +
			 * "()"); }
			 */
			// Logger
			// API------------------------------------------------------------------------------------------
			/*
			 * Logger logger = Logger.getLogger("exceptionhandling"); StackTraceElement
			 * elements[] = e.getStackTrace(); for (int i = 0, n = elements.length; i < n;
			 * i++) { logger.log(Level.WARNING, elements[i].getMethodName()); }
			 */
			
			LOGGER.log(Level.SEVERE, e.toString(), e);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Size not matches with: " + e.getMessage());
		} finally {
			if (out != null) {
				System.out.println("Closing PrintWriter");
				out.close();
			} else {
				System.out.println("PrintWriter not open");
			}
		}
	}
}
