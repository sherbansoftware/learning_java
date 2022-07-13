package Collection_Framework.Concurrent_Collection_Classes.ConcurrentLinkedDeque.Example;// Java Program to demonstrate ConcurrentLinkedDeque

import java.util.concurrent.*;

class ConcurrentLinkedDequeDemo {

	public static void main(String[] args)
	{
		// Create a ConcurrentLinkedDeque
		// using ConcurrentLinkedDeque()
		// constructor
		ConcurrentLinkedDeque<Integer>
			cld = new ConcurrentLinkedDeque<Integer>();
		
		// add element to the front
		// using addFirst() method
		cld.addFirst(12);
		cld.addFirst(70);
		cld.addFirst(1009);
		cld.addFirst(475);

		// Displaying the existing ConcurrentLinkedDeque
		System.out.println("ConcurrentLinkedDeque: "
						+ cld);

		// Create a ConcurrentLinkedDeque
		// using ConcurrentLinkedDeque(Collection c)
		// constructor
		ConcurrentLinkedDeque<Integer>
			cld1 = new ConcurrentLinkedDeque<Integer>(cld);

		// Displaying the existing ConcurrentLinkedDeque
		System.out.println("ConcurrentLinkedDeque1: "
						+ cld1);
	}
}
