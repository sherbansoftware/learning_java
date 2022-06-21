package Collection.Collection_Interfaces.Queue;

import java.util.Collection;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

// https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html

/**                                                    Queue

    an ordered list which enables insert operations to be performed at one end called REAR and delete operations
        to be performed at another end called FRONT.
    Queue is referred to be as First In First Out list.(FIFO)
    For example, people waiting in line for a rail ticket form a queue.

                                                Applications of Queue

    Due to the fact that queue performs actions on first in first out basis which is quite fair for the ordering
        of actions. There are various applications of queues discussed as below.

                 * Queues are widely used as waiting lists for a single shared resource like printer, disk, CPU.
                 * Queues are used in asynchronous transfer of data (where data is not being transferred at the same
                       rate between two processes) for eg. pipes, file IO, sockets.
                 * Queues are used as buffers in most of the applications like MP3 media player, CD player, etc.
                 * Queue are used to maintain the play list in media players in order to add and remove the songs
                       from the play-list.
                 * Queues are used in operating systems for handling interrupts.

                                                   Operations on Queue

     Enqueue:

         The enqueue operation is used to insert the element at the rear end of the queue. It returns void.

     Dequeue:

         The dequeue operation performs the deletion from the front-end of the queue. It also returns the element
             which has been removed from the front-end. It returns an integer value. The dequeue operation can also be
             designed to void.

     Peek:

         This is the third operation that returns the element, which is pointed by the front pointer in the queue
             but does not delete it.

     Queue overflow (isfull):

         When the Queue is completely full, then it shows the overflow condition.

     Queue underflow (isempty):

         When the Queue is empty, i.e., no elements are in the Queue then it throws the underflow condition.

                                         There are two ways of implementing the Queue:

     Sequential allocation:

         The sequential allocation in a Queue can be implemented using an array.
         For more details, click on the below link:

             https://www.javatpoint.com/array-representation-of-queue

     Linked list allocation:

         The linked list allocation in a Queue can be implemented using a linked list.

         For more details, click on the below link:

             https://www.javatpoint.com/linked-list-implementation-of-queue

                                                            Types of Queue

 There are four types of Queues:

    Linear Queue

         In Linear Queue, an insertion takes place from one end while the deletion occurs from another end.
         The end at which the insertion takes place is known as the rear end, and the end at which the deletion
             takes place is known as front end. It strictly follows the FIFO rule.

    Circular Queue

         In Circular Queue, all the nodes are represented as circular. It is similar to the linear Queue except
             that the last element of the queue is connected to the first element.
         It is also known as Ring Buffer as all the ends are connected to another end.
         To know more about circular queue, click on the below link:

            https://www.javatpoint.com/circular-queue

    Priority Queue

         A priority queue is another special type of Queue data structure in which each element has some priority
             associated with it. Based on the priority of the element, the elements are arranged in a priority queue.
         If the elements occur with the same priority, then they are served according to the FIFO principle.
         In priority Queue, the insertion takes place based on the arrival while the deletion occurs based on
             the priority.The priority Queue can be shown as:

    Deque

         Both the Linear Queue and Deque are different as the linear queue follows the FIFO principle whereas,
             deque does not follow the FIFO principle. In Deque, the insertion and deletion can occur from both ends.
         To know more about Deque, click on the below link:

            https://www.javatpoint.com/ds-deque

     A collection designed for holding elements prior to processing .Besides basic {@link Collection Collection} operations,
        queues provide additional insertion, extraction, and inspection operations.Each of these methods exists in two forms:
 
                * one throws an exception if the operation fails,
                * the other returns a special value (either {@code null} or {@code false},
 * 
        depending on the operation).  The latter form of the insert operation is designed specifically for use with 
        capacity-restricted  {@code Queue} implementations; in most implementations, insert operations cannot fail.
 
                                                 Summary of Queue methods 
          
                * Throws exception 
                * Returns special value 

    Insert 
 
               *  add(e) 
               *  offer(e)
  
    Remove  
 
              * remove() 
              * poll()
 
    Examine  
 
              * element()
              * peek() 

    Queues typically, but do not necessarily, order elements in a FIFO (first-in-first-out) manner.Among the exceptions 
        are priority queues, which order elements according to a supplied comparator, or the elements' natural ordering,
        and LIFO queues (or stacks) which order the elements LIFO (last-in-first-out).
    Whatever the ordering used, the  head  of the queue is that element which would be removed by a call to {@link #remove() } 
        or {@link #poll()}.  In a FIFO queue, all new elements are inserted at the  tail  of the queue.
    Other kinds of queues may use different placement rules. Every {@code Queue} implementation must specify its ordering
        properties.

    The {@link #offer offer} method inserts an element if possible, otherwise returning {@code false}.This differs from
        the {@link Collection#add Collection.add} method, which can fail to add an element only by throwing an unchecked
        exception.
    The {@code offer} method is designed for use when failure is a normal, rather than exceptional occurrence, for example,
        in fixed-capacity (or bounded) queues.

    The {@link #remove()} and {@link #poll()} methods remove and return the head of the queue.
    Exactly which element is removed from the queue is a function of the queue's ordering policy, which differs from
        implementation to implementation. The {@code remove()} and {@code poll()} methods differ only in their behavior 
        when the queue is empty: the {@code remove()} method throws an exception, while the {@code poll()} method returns 
        {@code null}.
 
    The {@link #element()} and {@link #peek()} methods return, but do not remove, the head of the queue.

    The {@code Queue} interface does not define the  blocking queue methods ,which are common in concurrent programming.
        These methods,which wait for elements to appear or for space to become available, are  defined in the {@link
        java.util.concurrent.BlockingQueue} interface, which extends this interface.

    {@code Queue} implementations generally do not allow insertion of {@code null} elements, although some implementations,
        such as  {@link LinkedList}, do not prohibit insertion of {@code null}.
    Even in the implementations that permit it, {@code null} should  not be inserted into a {@code Queue}, as {@code null}
        is also  used as a special return value by the {@code poll} method to indicate that the queue contains no elements.

    {@code Queue} implementations generally do not define  element-based versions of methods {@code equals} and {@code hashCode}
        but instead inherit the identity based versions from class {@code lang.classes.Object}, because element-based
        equality is not always well-defined for queues with the same elements but different ordering properties.

                                                         NOTE

             * Queue represent a group of objects which is about to be processed
             * Queue is open at both ends and one end for insertion and front is for deletion of elements or object.
             * So these are six methods that are specific to the Queue interface and it also supports all the methods


 * @see Collection
 * @see LinkedList
 * @see PriorityQueue
 * @see java.util.concurrent.LinkedBlockingQueue
 * @see java.util.concurrent.BlockingQueue
 * @see java.util.concurrent.ArrayBlockingQueue
 * @see java.util.concurrent.LinkedBlockingQueue
 * @see java.util.concurrent.PriorityBlockingQueue
 * @since 1.5
 * @author Doug Lea
 * @param <E> the type of elements held in this collection
 */
public interface Queue_<E> extends Collection<E> {
    /**
     * Inserts the specified element into this queue if it is possible to do so immediately without violating capacity
     * restrictions, returning {@code true} upon success and throwing an {@code IllegalStateException} if no space is
     * currently available.
     *
     * @param e the element to add
     * @return {@code true} (as specified by {@link Collection#add})
     * @throws IllegalStateException if the element cannot be added at this time due to capacity restrictions
     * @throws ClassCastException if the class of the specified element
     *         prevents it from being added to this queue
     * @throws NullPointerException if the specified element is null and
     *         this queue does not permit null elements
     * @throws IllegalArgumentException if some property of this element
     *         prevents it from being added to this queue
     */
    boolean add(E e);

    /**
     * Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
     * When using a capacity-restricted queue, this method is generally preferable to {@link #add}, which can fail to insert
     * an element only by throwing an exception.
     *
     * @param e the element to add
     * @return {@code true} if the element was added to this queue, else  {@code false}
     * @throws ClassCastException if the class of the specified element
     *         prevents it from being added to this queue
     * @throws NullPointerException if the specified element is null and
     *         this queue does not permit null elements
     * @throws IllegalArgumentException if some property of this element
     *         prevents it from being added to this queue
     */
    boolean offer(E e);

    /**
     * Retrieves and removes the head of this queue. This method differs from {@link #poll poll} only in that it throws
     * an exception if this queue is empty.
     *
     * @return the head of this queue
     * @throws NoSuchElementException if this queue is empty
     */
    E remove();

    /**
     * Retrieves and removes the head of this queue, or returns {@code null} if this queue is empty.
     *
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    E poll();

    /**
     * Retrieves, but does not remove, the head of this queue.This method differs from {@link #peek peek} only in that
     * it throws an exception if this queue is empty.
     *
     * @return the head of this queue
     * @throws NoSuchElementException if this queue is empty
     */
    E element();

    /**
     * Retrieves, but does not remove, the head of this queue, or returns {@code null} if this queue is empty.
     *
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    E peek();
}
