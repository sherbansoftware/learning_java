package Concurency_Multithreading.Java7.New_Approaches.Copy_On_Write;



/*                                                 Copy on write


    ○ Important points about Copy on Write approach

                  * All values in collection are stored in an internal immutable (not-changeable) array.

                  * A new array is created if there is any modification to the collection.

    ○ Read operations are not synchronized.

                  * Only write operations are synchronized.

    ○ Copy on Write approach is used

                  * in scenarios where reads greatly out number write’s on a collection.

    ○ CopyOnWriteArrayList & CopyOnWriteArraySet

                  * are implementations of this approach.

    ○ Copy on Write collections are typically used in Subject

                  *  Observer scenarios,

                                 - where the observers very rarely change.

    ○ Most frequent operations would be

                  * iterating around the observers

                  * and notifying them.

Example : CopyOnWriteArrayList : public boolean add(E e)


 */


public class Copy_On_Write_ {
}
