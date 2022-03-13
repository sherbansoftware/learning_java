package Java.Data_Structures_in_Java.Non_Primitive_DS.Linear.Dynamic.LinkedList_;
/*

                                                           Linked List:

          Linked list is a linear data structure which is used to maintain a list in the memory.
          It can be seen as the collection of nodes stored at non-contiguous memory locations.
           Each node of the list contains a pointer to its adjacent node.

    Characteristics of LinkedList: -------------------------------------------------------------------------------------

              ATest.A linked list is a collection of objects known as a node where node consists of two parts:
                 data
                 and address.
              Linked list elements can be stored anywhere in the memory or randomly stored.
              The Linked list works with dynamic memory. Here, dynamic memory means that the memory size can be changed
                  at the run time according to our requirements.
              Linked list elements are dependent on each other. As each node contains the address of the next node so to
                  access the next node, we need to access its previous node.
              Linked list takes less time while performing any operation like insertion, deletion, etc.
                  Accessing an element in a linked list is slower as it starts traversing from the first element of the
                  linked list.
              In the case of a linked list, memory is allocated at run time.
                  Memory_Address utilization is efficient in the case of a linked list as the memory can be allocated or deallocated
              at the run time according to our requirement.

     Note:

              1. Head of the LinkedList only contains the Address of the First element of the List.
              2. The Last element of the LinkedList contains null in the pointer part of the node because it is the end
              of the List so it doesn't point to anything

              First node of the list :
                  head
             The last node of the list :
                 tail and has null at it's next reference

    It inherits the AbstractList class and implements List and Deque interfaces.

    The important points about Java LinkedList are: --------------------------------------------------------------------

              � Java LinkedList class can contain duplicate elements.
              � Java LinkedList class maintains insertion order.
              � Java LinkedList class is non synchronized.
              � In Java LinkedList class, manipulation is fast because no shifting needs to occur.
              � Java LinkedList class can be used as a list, stack or queue.

    Types of linked List: ----------------------------------------------------------------------------------------------

               1. Singly Linked List
               2. Circular Linked List
               3. Doubly Linked List

    Linked list provides the following two advantages over arrays: -----------------------------------------------------

               1) Dynamic size
               2) Ease of insertion/deletion

    Linked lists have following drawbacks: ----------------------------------------------------------------------------

                1) Random access is not allowed. We have to access elements sequentially starting from the first node.
                So we cannot do a binary search with linked lists.
                2) Extra memory space for a pointer is required with each element of the list.
                3) Arrays have better cache locality that can make a pretty big difference in performance.
*/