package Collections.Collections_Interfaces.List.Implemented_By.CopyOnWriteArrayList;

/*                                                 CopyOnWriteArrayList

     is a thread-safe variant of ArrayList where operations which can change the ArrayList_ (add, update, set methods)
         creates a clone of the underlying array.

     CopyOnWriteArrayList is to be used in a Thread based environment where read operations are very frequent and update
         operations are rare.

                                                            NOTE

            * Iterator Interface of CopyOnWriteArrayList will never throw ConcurrentModificationException.
            * Any type of modification to CopyOnWriteArrayList will not reflect during iteration since the iterator was
                  created.
            * List modification methods like remove, set and add are not supported in the iteration. This method will
                  throw UnsupportedOperationException.

            * null can be added to the list.


 */