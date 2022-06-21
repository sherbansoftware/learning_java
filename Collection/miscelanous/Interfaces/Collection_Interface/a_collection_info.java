package Collection.miscelanous.Interfaces.Collection_Interface;
/*
                              Collection interface

    is the foundation upon which the collections framework is built.
    It declares the core methods that all collections will have.

                            Method & Description
1.boolean add(lang.classes.Object obj)-----------------------------------------------------------------------------------------------
    Adds obj to the invoking collection. Returns true if obj was added to the collection. Returns false if obj is already
    a member of the collection, or if the collection does not allow duplicates.
2. boolean addAll(Collection c)-----------------------------------------------------------------------------------------
    Adds all the elements of c to the invoking collection. Returns true if the operation succeeds
    (i.e., the elements were added). Otherwise, returns false.
3.void clear()----------------------------------------------------------------------------------------------------------
    Removes all elements from the invoking collection.
4.boolean contains(lang.classes.Object obj)------------------------------------------------------------------------------------------
    Returns true if obj is an element of the invoking collection. Otherwise, returns false.
5.boolean containsAll(Collection c)-------------------------------------------------------------------------------------
    Returns true if the invoking collection contains all elements of c. Otherwise, returns false.
6.boolean equals(lang.classes.Object obj)--------------------------------------------------------------------------------------------
    Returns true if the invoking collection and obj are equal. Otherwise, returns false.
7.int hashCode()--------------------------------------------------------------------------------------------------------
    Returns the hash code for the invoking collection.
8.boolean isEmpty()----------------------------------------------------------------------------------------------------
    Returns true if the invoking collection is empty. Otherwise, returns false.
9.Iterator_Interface iterator()---------------------------------------------------------------------------------------------------
    Returns an iterator for the invoking collection.
10.boolean remove(lang.classes.Object obj)-------------------------------------------------------------------------------------------
    Removes one instance of obj from the invoking collection. Returns true if the element was removed.
    Otherwise, returns false.
11.boolean removeAll(Collection c)--------------------------------------------------------------------------------------
    Removes all elements of c from the invoking collection. Returns true if the collection changed
    (i.e., elements were removed). Otherwise, returns false.
12.boolean retainAll(Collection c)--------------------------------------------------------------------------------------
    Removes all elements from the invoking collection except those in c.
    Returns true if the collection changed (i.e., elements were removed). Otherwise, returns false.
13.int size()-----------------------------------------------------------------------------------------------------------
    Returns the number of elements held in the invoking collection.
14.lang.classes.Object[] toArray()---------------------------------------------------------------------------------------------------
    Returns an array that contains all the elements stored in the invoking collection.
    The array elements are copies of the collection elements.
15.lang.classes.Object[] toArray(lang.classes.Object array[])-------------------------------------------------------------------------------------
    Returns an array containing only those collection elements whose type matches that of array.
* */