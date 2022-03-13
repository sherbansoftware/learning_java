package Exceptions.Exception_Handling.Example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptHandle {

	public static void main(String[] args) {

		InputStreamReader ins = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ins);

		try {
			System.out.println("Please enter the first number...");
			int data1 = Integer.parseInt(br.readLine());
			System.out.println("Please enter the second number...");
			int data2 = Integer.parseInt(br.readLine());
			int result = data1 /data2;
			System.out.println("Result " + result);
		} catch (ArithmeticException arithEx) {
			System.out.println("Dividing by 0 is not allowed");
			System.out.println("The exception is " + arithEx);
		} catch (NumberFormatException nfe) {
			System.out.println("Number format exceptions has taken place...");
		} catch (IOException ioe) {
			System.out.println("IOException format exceptions has taken place...");
		} finally {
			System.out.println("Operations performed...");
		}
		System.out.println("End of the program...");
	}

}
