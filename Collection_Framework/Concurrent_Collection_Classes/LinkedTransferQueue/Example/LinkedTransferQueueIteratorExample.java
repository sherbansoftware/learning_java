package Collection_Framework.Concurrent_Collection_Classes.LinkedTransferQueue.Example;// Java Program Demonstrate iterating
// over LinkedTransferQueue

import java.util.Iterator;
import java.util.concurrent.LinkedTransferQueue;

class LinkedTransferQueueIteratorExample {
	public static void main(String[] args)
	{

		// Initializing the queue
		LinkedTransferQueue<String> queue
			= new LinkedTransferQueue<String>();

		// Adding elements to this queue
		queue.add("Gfg");
		queue.add("is");
		queue.add("fun!!");

		// Returns an iterator over the elements
		Iterator<String> iterator = queue.iterator();

		// Printing the elements of the queue
		while (iterator.hasNext())
			System.out.print(iterator.next() + " ");
	}
}
