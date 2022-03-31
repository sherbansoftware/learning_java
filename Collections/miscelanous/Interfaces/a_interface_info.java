package Collections.miscelanous.Interfaces;
 /*                                                    Interface_Class

        The core collection interfaces encapsulate different types of collections.
        These interfaces allow collections to be manipulated independently of the details of their representation.
        Core collection interfaces are the foundation of the Java Collections_ Framework.

                                                 The core collection interfaces.

        Collection
            � the root of the collection hierarchy. ATest.A collection represents a group of objects known as its elements.
            The Collection interface is the least common denominator that all collections implement and is used to pass
            collections around and to manipulate them when maximum generality is desired. Some types of collections
            allow duplicate elements, and others do not. Some are ordered and others are unordered. The Java platform
            doesn't provide any direct implementations of this interface but provides implementations of more specific
            subinterfaces, such as Set and List. Also see The Collection Interface_Class section.
        Set
             � a collection that cannot contain duplicate elements. This interface models the mathematical set abstraction
             and is used to represent sets, such as the cards comprising a poker hand, the courses making up a student's
             schedule, or the processes running on a machine. See also The Set Interface_Class section.
        SortedSet
             � a Set that maintains its elements in ascending order. Several additional operations are provided to take advantage
              of the ordering. Sorted sets are used for naturally ordered sets, such as word lists and membership rolls.
        List
            � an ordered collection (sometimes called a sequence). Lists can contain duplicate elements. The user of a
            List generally has precise control over where in the list each element is inserted and can access elements by
             their integer index (position). If you've used Vector, you're familiar with the general flavor of List.
             Also see The List Interface_Class section.
        Queue
             � a collection used to hold multiple elements prior to processing. Besides basic Collection operations,
             a Queue provides additional insertion, extraction, and inspection operations.
             Queues typically, but do not necessarily, order elements in a FIFO (first-in, first-out) manner. Among the
             exceptions are priority queues, which order elements according to a supplied comparator or the elements' natural ordering.
             Whatever the ordering used, the head of the queue is the element that would be removed by a call to remove or poll.
             In a FIFO queue, all new elements are inserted at the tail of the queue. Other kinds of queues may use different
             placement rules. Every Queue implementation must specify its ordering properties. Also see The Queue Interface_Class section.
        Deque
              � a collection used to hold multiple elements prior to processing. Besides basic Collection operations, a Deque
              provides additional insertion, extraction, and inspection operations.
              Deques can be used both as FIFO (first-in, first-out) and LIFO (last-in, first-out). In a deque all new elements
              can be inserted, retrieved and removed at both ends. Also see The Deque Interface_Class section.

        Map
             � an object that maps keys to values. ATest.A Map cannot contain duplicate keys; each key can map to at most one value.
             If you've used Hashtable, you're already familiar with the basics of Map. Also see The Map Interface_Class section.
             The last two core collection interfaces are merely sorted versions of Set and Map:
        SortedMap
              � a Map that maintains its mappings in ascending key order. This is the Map analog of SortedSet. Sorted maps
               are used for naturally ordered collections of key/value pairs, such as dictionaries and telephone directories.
               Also see The SortedMap Interface_Class section.
        To understand how the sorted interfaces maintain the order of their elements, see the lang.classes.Object Ordering section.
  */