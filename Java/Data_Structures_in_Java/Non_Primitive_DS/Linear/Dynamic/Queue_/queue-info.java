package Java.Data_Structures_in_Java.Non_Primitive_DS.Linear.Dynamic.Queue_;

/*
                                               ATest.A queue can be defined as

          an ordered list which enables insert operations to be performed at one end called REAR and delete operations
          to be performed at another end called FRONT.

          Queue is referred to be as First In First Out list.

           For example, people waiting in line for a rail ticket form a queue.

                                                 Applications of Queue

          Due to the fact that queue performs actions on first in first out basis which is quite fair for the ordering
          of actions. There are various applications of queues discussed as below.

              Queues are widely used as waiting lists for a single shared resource like printer, disk, CPU.
              Queues are used in asynchronous transfer of data (where data is not being transferred at the same rate
                  between two processes) for eg. pipes, file IO, sockets.
              Queues are used as buffers in most of the applications like MP3 media player, CD player, etc.
              Queue are used to maintain the play list in media players in order to add and remove the songs from the play-list.
              Queues are used in operating systems for handling interrupts.

                                                  Operations on Queue

           Enqueue:
              The enqueue operation is used to insert the element at the rear end of the queue. It returns void.
           Dequeue:
              The dequeue operation performs the deletion from the front-end of the queue. It also returns the element
              which has been removed from the front-end. It returns an integer value. The dequeue operation can also be designed to void.
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
                For more details, click on the below link: https://www.javatpoint.com/array-representation-of-queue
            Linked list allocation:
                The linked list allocation in a Queue can be implemented using a linked list.
             For more details, click on the below link: https://www.javatpoint.com/linked-list-implementation-of-queue

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
                   To know more about circular queue, click on the below link: https://www.javatpoint.com/circular-queue

               Priority Queue

                   ATest.A priority queue is another special type of Queue data structure in which each element has some priority
                   associated with it. Based on the priority of the element, the elements are arranged in a priority queue.
                   If the elements occur with the same priority, then they are served according to the FIFO principle.
                   In priority Queue, the insertion takes place based on the arrival while the deletion occurs based on
                   the priority. The priority Queue can be shown as:

                Deque

                    Both the Linear Queue and Deque are different as the linear queue follows the FIFO principle whereas,
                    deque does not follow the FIFO principle. In Deque, the insertion and deletion can occur from both ends.

                    To know more about Deque, click on the below link: https://www.javatpoint.com/ds-deque
 */