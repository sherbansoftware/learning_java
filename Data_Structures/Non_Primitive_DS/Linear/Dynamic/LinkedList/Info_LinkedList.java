package Data_Structures.Non_Primitive_DS.Linear.Dynamic.LinkedList;

// https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html

/*

                                                           Linked List:

    Linked list is a linear data structure which is used to maintain a list in the memory.
    It can be seen as the collection of nodes stored at non-contiguous memory locations.
    Each node of the list contains a pointer to its adjacent node.

                                                 Characteristics of LinkedList:

    A linked list is a collection of objects known as a node where node consists of two parts:

                * data
                * and address.

    Linked list elements can be stored anywhere in the memory or randomly stored.
    The Linked list works with dynamic memory. Here, dynamic memory means that the memory size can be changed at the run
        time according to our requirements.
    Linked list elements are dependent on each other. As each node contains the address of the next node so to access the
        next node, we need to access its previous node.
    Linked list takes less time while performing any operation like

                * insertion,
                * deletion, etc.

     Accessing an element in a linked list is slower as it starts traversing from the first element of the linked list.
     In the case of a linked list, memory is allocated at run time.
     Memory Address utilization is efficient in the case of a linked list as the memory can be allocated or deallocated
         at the run time according to our requirement.


                                                  Types of linked List

               1. Singly Linked List
               2. Circular Linked List
               3. Doubly Linked List

                                Linked list provides the following two advantages over arrays:

               1) Dynamic size
               2) Ease of insertion/deletion

                                              Linked lists have the following drawbacks:

                1) Random access is not allowed.We have to access elements sequentially starting from the first node.
                       So we cannot do a binary search with linked lists.
                2) Extra memory space for a pointer is required with each element of the list.
                3) Arrays have better cache locality that can make a pretty big difference in performance.

                           Important differences between ArrayList and LinkedList method.

 No.              Key                    ArrayList                                          LinkedList

1       Internal             ArrayList internally uses a  dynamic           LinkedList uses Doubly Linked List to
     Implementation              array to store its elements.                   store its elements.


2    Manipulation             ArrayList is slow as array                  LinkedList is faster being node based as
                               manipulation is slower.                       not much bit shifting required.

3   Implementation        ArrayList implements only List.                LinkedList implements List as well as Queue.
                                                                             It can acts as a queue as well.

4     Access              ArrayList is faster in storing                 LinkedList is faster in manipulation of data.
                              and accessing data.

5     Retrieving                 Best choice                                         Not recommended
       operation

                                                        NOTE

            * Accept heterogeneous objects
            * Can contain duplicate elements.
            * Allow any number of null values
            * Maintains insertion order.
            * Is non synchronized (thread safe)
            * Manipulation is fast because no shifting needs to occur.
            * Can be used as a list, stack or queue.
            * Head of the LinkedList only contains the Address of the First element of the List.
            * The Last element of the LinkedList contains null in the pointer part of the node because it is the end
                  of the List, so it doesn't point to anything

                       - First node of the list :  head

                       - The last node of the list :  tail

                  and has null at it's next reference

              * Time complexity

                        - add() – appends an element to the end of the list. It only updates a tail, and therefore,
                              it's O(1) constant-time complexity.
                        - add(index, element) – on average runs in O(n) time
                        - get() – searching for an element takes O(n) time.
                        - remove(element) – to remove an element, we first need to find it. This operation is O(n).
                        - remove(index) – to remove an element by index, we first need to follow the links from the
                              beginning; therefore, the overall complexity is O(n).
                        - contains() – also has O(n) time complexity



*/