package util.concurent.concurent_interfaces.BlockingDeque.BlockingDeque_is_Implemented_by.LinkedBlockingDeque.LinkedBlockingDeque_Example;

// Java Program Demonstrate LinkedBlockingDeque

import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDequeDemo {
    public static void main(String[] args)
            throws InterruptedException
    {

        // create object of LinkedBlockingDeque
        // using LinkedBlockingDeque() constructor
        LinkedBlockingDeque<Integer> LBD
                = new LinkedBlockingDeque<Integer>();

        // Add numbers to end of LinkedBlockingDeque
        LBD.add(7855642);
        LBD.add(35658786);
        LBD.add(5278367);
        LBD.add(74381793);

        // print Dequee
        System.out.println("Linked Blocking Deque1: "
                + LBD);
        System.out.println("Size of Linked Blocking Deque1: "
                + LBD.size());

        // create object of LinkedBlockingDeque
        // using LinkedBlockingDeque(int capacity) constructor
        LinkedBlockingDeque<Integer> LBD1
                = new LinkedBlockingDeque<Integer>(3);

        // Add numbers to end of LinkedBlockingDeque
        LBD1.add(7855642);
        LBD1.add(35658786);
        LBD1.add(5278367);

        try {
            // adding the 4th element
            // will throw exception for Deque full
            LBD1.add(74381793);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        // print Dequee
        System.out.println("Linked Blocking Deque2: "
                + LBD1);
        System.out.println("Size of Linked Blocking Deque2: "
                + LBD1.size());

        // create object of LinkedBlockingDeque
        // using LinkedBlockingDeque(Collection c) constructor
        LinkedBlockingDeque<Integer> LBD2
                = new LinkedBlockingDeque<Integer>(LBD1);

        // print Dequee
        System.out.println("Linked Blocking Deque3: "
                + LBD2);
    }
}

