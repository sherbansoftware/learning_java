package Collection_Framework.Collection_Classes.Priority_Queue.SimpleExample;

import java.util.*;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        //creating priorityQueue
        PriorityQueue pq = new PriorityQueue();
        //defaul size = 11
        //DNSO

        //creating priorityQueue with specified size
        PriorityQueue pq1 = new PriorityQueue(20);

        //creating priorityQueue with initial capacity and comparator object
        //PriorityQueue pq2 = new PriorityQueue(int initialCapacity,Comparator c);


        SortedSet s = new TreeSet();
        //creating priorityQueue equivalent to sortedSet s
        PriorityQueue pq3 = new PriorityQueue(s);

        List l = new ArrayList();
        //creating equivalent priorityQueue for any collection
        PriorityQueue pq4 = new PriorityQueue(l);

        PriorityQueue<Integer> newPQ = new PriorityQueue<>();

        newPQ.offer(24);
        newPQ.offer(15);
        newPQ.offer(9);
        newPQ.offer(45);

        System.out.println(newPQ);

        // This Comparator gives high priority to the biggest number.
        Comparator<Integer> reverseComparator = ((p1, p2) -> Integer.compare(p2, p1));

        PriorityQueue<Integer> descendingPQ = new PriorityQueue<>(20, reverseComparator);

        // 45 is the largest element.Our custom comparator gives priority to the highest number
        System.out.println(descendingPQ.peek());

    }

}

