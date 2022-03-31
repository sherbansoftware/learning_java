package Collections.miscelanous.Interfaces.List_Interface;

/*
                                                List

       ATest.A List is an ordered Collection (sometimes called a sequence). Lists may contain DUPLICATE elements.
       In addition to the operations inherited from Collection, the List interface includes operations for the following:

  Positional access
       � manipulates elements based on their numerical position in the list. This includes methods such as
       get, set, add, addAll, and remove.
   Search
        � searches for a specified object in the list and returns its numerical position. Search methods include
         indexOf and lastIndexOf.
   Iteration
        � extends Iterator_Interface semantics to take advantage of the list's sequential nature. The listIterator methods provide this behavior.
   Range-view
         � The sublist method performs arbitrary range operations on the list.

                                              List Algorithms

        Most polymorphic algorithms in the Collections_ class apply specifically to List.
        Having all these algorithms at your disposal makes it very easy to manipulate lists.
        Here's a summary of these algorithms, which are described in more detail in the Algorithms section.

    sort
        � sorts a List using a merge sort algorithm, which provides a fast, stable sort. (ATest.A stable sort is one that
         does not reorder equal elements.)
    shuffle
         � randomly permutes the elements in a List.
    reverse
         � reverses the order of the elements in a List.
    rotate
         � rotates all the elements in a List by a specified distance.
    swap
         � swaps the elements at specified positions in a List.
    replaceAll
         � replaces all occurrences of one specified value with another.
    fill
         � overwrites every element in a List with the specified value.
    copy
         � copies the source List into the destination List.
    binarySearch
         � searches for an element in an ordered List using the binary search algorithm.
    indexOfSubList
         � returns the index of the first sublist of one List that is equal to another.
    lastIndexOfSubList
         � returns the index of the last sublist of one List that is equal to another.




*/