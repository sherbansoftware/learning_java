package util.concurent.concurent_interfaces.BlockingQueue.BlockingQueue_is_Implemented_by.LinkedTransferQueue.LinkedTransferQueue_Example;

// Java Program Demonstrate LinkedTransferQueue

import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueueDemo {
    public static void main(String[] args) throws InterruptedException {

        // create object of LinkedTransferQueue
        // using LinkedTransferQueue() constructor
        LinkedTransferQueue<Integer> LTQ
                = new LinkedTransferQueue<Integer>();

        // Add numbers to end of LinkedTransferQueue
        LTQ.add(7855642);
        LTQ.add(35658786);
        LTQ.add(5278367);
        LTQ.add(74381793);

        // print Queue
        System.out.println("Linked Transfer Queue1: " + LTQ);

        // create object of LinkedTransferQueue
        // using LinkedTransferQueue(Collection c)
        // constructor
        LinkedTransferQueue<Integer> LTQ2
                = new LinkedTransferQueue<Integer>(LTQ);

        // print Queue
        System.out.println("Linked Transfer Queue2: " + LTQ2);
    }
}

