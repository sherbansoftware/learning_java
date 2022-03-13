package Collections_.Collections_Interfaces.List_.WW_Doc;

// https://www.codejava.net/java-core/collections/java-list-collection-tutorial-and-examples

/*                                               List collection

    List is a fundamental and widely-used collection type in the Java Collections_ Framework. Basically, a list collection
        stores elements by insertion order (either at the end or at a specific position in the list). A list maintains
        indices of its elements so it allows adding, retrieving, modifying, removing elements by an integer index (zero-based
        index; the first element is at 0-index, the second at 1-index, the third at 2-index, and so on).

   A list can store objects of any types. Primitive types are automatically converted to corresponding wrapper types, e.g.
       integer numbers are converted to Integer objects. It allows null and duplicate elements, and orders them by their
       insertion order (index).




      List are:

      Indexed

      Ordered

      Duplicate allowed


             Method                Running Time Complexity

             size( )                     O(1)
             isEmpty()                   O(1)
             get(i)O(1)                  O(1)
             set(i, e)                   O(n)
             add(i, e)                   O(n)
             remove(i)                   O(1)

                                  List Implementations

    List implementations are grouped into general-purpose and special-purpose implementations.

                              General-Purpose List Implementations

        There are two general-purpose List implementations

            — ArrayList_
            - LinkedList.

         Most of the time, you'll probably use ArrayList_, which offers constant-time positional access and is just plain
            fast. It does not have to allocate a node object for each element in the List, and it can take advantage of
            System.arraycopy when it has to move multiple elements at the same time. Think of ArrayList_ as Vector without t
            he synchronization overhead.

        If you frequently add elements to the beginning of the List or iterate over the List to delete elements from its
        interior, you should consider using LinkedList. These operations require constant-time in a LinkedList and
        linear-time in an ArrayList_. But you pay a big price in performance. Positional access requires linear-time in a
        LinkedList and constant-time in an ArrayList_. Furthermore, the constant factor for LinkedList is much worse.
        If you think you want to use a LinkedList, measure the performance of your application with both LinkedList and
        ArrayList_ before making your choice; ArrayList_ is usually faster.

       ArrayList_ has one tuning parameter — the initial capacity, which refers to the number of elements the ArrayList_
       can hold before it has to grow. LinkedList has no tuning parameters and seven optional operations, one of which
       is clone. The other six are addFirst, getFirst, removeFirst, addLast, getLast, and removeLast. LinkedList also
       implements the Queue interface.

                                  Special-Purpose List Implementations

        CopyOnWriteArrayList

            is a List implementation backed up by a copy-on-write array.
            This implementation is similar in nature to

       CopyOnWriteArraySet. No synchronization is necessary, even during iteration, and iterators are guaranteed never
       to throw ConcurrentModificationException. This implementation is well suited to maintaining event-handler lists,
       in which change is infrequent, and traversal is frequent and potentially time-consuming.

                                       If you need synchronization,


       a Vector will be slightly faster than an ArrayList_ synchronized with Collections_.synchronizedList.

        But Vector has loads of legacy operations, so be careful to always manipulate the Vector with the List interface
        or else you won't be able to replace the implementation at a later time.

     If your List is fixed in size — that is, you'll never use remove, add, or any of the bulk operations other than
     containsAll — you have a third option that's definitely worth considering.
     See Arrays.asList in the Convenience Implementations section for more information.

                                                       NOTE

            * An ordered collection (also known as a sequence).
            * A list can store objects of any types
            * lists typically allow duplicate elements.
            * allow null elements and orders them by their insertion order (index).
            * Primitive types are automatically converted to corresponding wrapper types, e.g. integer numbers are
                  converted to Integer


*/