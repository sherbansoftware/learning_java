package Collections_.Collections_Interfaces.List_.List_Implemented_By.CopyOnWriteArrayList.WW_Doc;

/*    CopyOnWriteArrayList

     is a thread-safe variant of ArrayList_ where operations which can change the ArrayList_ (add, update, set methods)
         creates a clone of the underlying array.

     CopyOnWriteArrayList is to be used in a Thread based environment where read operations are very frequent and update
         operations are rare.

    Iterator_Interface of CopyOnWriteArrayList will never throw ConcurrentModificationException.

    Any type of modification to CopyOnWriteArrayList will not reflect during iteration since the iterator was created.

    List modification methods like remove, set and add are not supported in the iteration. This method will throw
        UnsupportedOperationException.

    null can be added to the list.



 */