package util.concurent.concurent_interfaces.BlockingDeque.BlockingDeque_Example;

// Java Program for BlockingDeque
import java.util.concurrent.*;
import java.util.*;

public class BlockingDequeExample {

    public static void main(String[] args) {

        // Instantiate an object using LinkedBlockingDeque named lbdq
        BlockingDeque<Integer> lbdq = new LinkedBlockingDeque<Integer>();

        // Add elements using add()
        lbdq.add(134);
        lbdq.add(245);
        lbdq.add(23);
        lbdq.add(122);
        lbdq.add(90);

        // Create an iterator to traverse the deque
        Iterator<Integer> lbdqIter = lbdq.iterator();

        // Print the elements of lbdq on to the console
        System.out.println("The LinkedBlockingDeque lbdq contains:");

        for(int i = 0; i<lbdq.size(); i++)
        {
            System.out.print(lbdqIter.next() + " ");
        }

        // Remove 23 and display appropriate message if the
        // operation is successful
        if(lbdq.remove(23))
        {
            System.out.println("\n\nThe element 23 has been removed");
        }
        else
        {
            System.out.println("\n\nNo such element was found");
        }

        // Print the elements of lbdq without using iterator
        System.out.println("\nThe LinkedBlockingDeque lbdq"+
                " after remove operation contains:");
        System.out.println(lbdq);
    }

}

