package miscellaneous.unsorted;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaLearnTest {

	public static void main(String[] args) {
		Map<String, Integer> histogram = new HashMap<>() ;
		histogram.put("Cow", 4);
		histogram.put("Dog", 6);
		double total = 0;
		for (int i : histogram.values())
		    total += i;
		for (Map.Entry<String, Integer> e : histogram.entrySet())
		    System.out.println(e.getKey() + " " + e.getValue() / total);
		
		System.out.println("Thread name " + Thread.currentThread().getName());
		
		Scanner scanner =new Scanner(System.in);
		scanner.nextLine();
		System.out.println("Cool");
		}
	
	}

	

