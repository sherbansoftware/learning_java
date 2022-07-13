package Concepts.Fail_Safe;


import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/*                                           Fail-Safe systems

        don't abort an operation in the case of a failure.Such systems try to avoid raising failures as much as possible.


                                              Fail Safe Iterator

    The Fail Safe iterators are just opposite to Fail Fast iterators; unlike them,A fail-safe iterator does not throw any
        exceptions unless it can handle if the collection is modified during the iteration process. This can be done
        because they operate on the copy of the collection object instead of the original object.The structural changes
        performed on the original collection ignored by them and affect the copied collection, not the original collection.
        So, the original collection will be kept structurally unchanged.

     However, it is not necessary that a collection that does not use the Fail Fast iterator

             create a clone or copy of it

        in memory to avoid the ConcurrentModificationException. For example, the ConcurrentHashMap does not operate on a
        separate copy of an object, although it does not fail fast. Instead, it uses semantics that is specified by the
        specification as non-fail fast iteration.

    However, there is not any actual word written as Fail Safe in Java SE documentation; instead, the Fail Safe is termed
        as a non-Fail fast iterator.

 */
public class Fail_Safe_ {
    public static void main(String args[]) {
        CopyOnWriteArrayList<Integer> list
                = new CopyOnWriteArrayList<>(new Integer[]{1, 7, 9, 11});
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Integer i = (Integer) itr.next();
            System.out.println(i);
            if (i == 7)
                list.add(15); // It will not be printed
            //This means it has created a separate copy of the collection
        }

        System.out.println(list);
    }
}
