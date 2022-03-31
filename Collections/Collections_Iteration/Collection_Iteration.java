package Collections.Collections_Iteration;

// https://www.baeldung.com/foreach-java

/*                                           ways of iteration

    Iterator
    ListIterator
    Spliterator
    forEach

                                                   Foreach vs For-Loop

    From a simple point of view, both loops provide the same functionality: loop through elements in a collection.

    The main difference between them is that they are different iterators.

            * The enhanced for-loop is an external iterator,
            * whereas the new forEach method is internal.

                                                      Internal Iterator — forEach

    This type of iterator manages the iteration in the background and leaves the programmer to just code what is meant
        to be done with the elements of the collection.
    The iterator instead manages the iteration and makes sure to process the elements one-by-one.

        Let's see an example of an internal iterator:

            names.forEach(name -> System.out.println(name));

    In the forEach method above, we can see that the argument provided is a lambda expression. This means that the method
        only needs to know what is to be done, and all the work of iterating will be taken care of internally.

                                                    External Iterator — for-loop

    External iterators mix what and how the loop is to be done.
    Enumerations, Iterators and enhanced for-loop are all external iterators (remember the methods iterator(), next() or
        hasNext()?). In all these iterators, it's our job to specify how to perform iterations.

    Consider this familiar loop:

        for (String name : names) {
            System.out.println(name);
        }

    Although we are not explicitly invoking hasNext() or next() methods while iterating over the list, the underlying
        code that makes this iteration work uses these methods. This implies that the complexity of these operations is
        hidden from the programmer, but it still exists.

    Contrary to an internal iterator in which the collection does the iteration itself, here we require external code
          that takes every element out of the collection.

 */

public class Collection_Iteration {
}
