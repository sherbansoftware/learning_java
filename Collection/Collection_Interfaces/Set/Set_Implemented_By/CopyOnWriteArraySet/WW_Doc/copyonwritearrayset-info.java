package Collection.Collection_Interfaces.Set.Set_Implemented_By.CopyOnWriteArraySet.WW_Doc;

/*                                        CopyOnWriteArraySet

    https://www.tutorialspoint.com/CopyOnWriteArraySet-Class-in-Java


    CopyOnWriteArraySet class uses CopyOnWriteArrayList internally for all of its operations and thus possesses the basic
        properties of CopyOnWriteArrayList.

            • CopyOnWriteArraySet is a thread-safe.

            • CopyOnWriteArraySet is to be used in Thread based environment where read operations are very frequent and
                update operations are rare.

            • Iterator_Interface of CopyOnWriteArraySet will never throw ConcurrentModificationException.

            • Any type of modification to CopyOnWriteArraySet will not reflect during iteration since the iterator was created.

     Set modification methods like remove, set and add are not supported in the iteration. This method will
         throw UnsupportedOperationException.

 */