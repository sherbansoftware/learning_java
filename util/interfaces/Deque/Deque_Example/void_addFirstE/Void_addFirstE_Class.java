package util.interfaces.Deque.Deque_Example.void_addFirstE;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Inserts the specified element at the front of this deque if it is
 * possible to do so immediately without violating capacity restrictions,
 * throwing an {@code IllegalStateException} if no space is currently
 * available.
 * When using a capacity-restricted deque, it is generally
 * preferable to use method {@link_ #offerFirst}.
 *
 * @param_ e the element to add
 * @throws IllegalStateException if the element cannot be added at this
 * time due to capacity restrictions
 * @throws ClassCastException if the class of the specified element
 * prevents it from being added to this deque
 * @throws NullPointerException if the specified element is null and this
 * deque does not permit null elements
 * @throws IllegalArgumentException if some property of the specified
 * element prevents it from being added to this deque
 */
//    void addFirst(E e);

public class Void_addFirstE_Class {

    public static void main(String[] args) {

        // create an empty array deque with an initial capacity
        Deque<Integer> deque = new ArrayDeque<Integer>(5);

        // use add() method to add elements in the deque
        deque.add(25);
        deque.add(30);
        deque.add(35);

        // use addFirst() method to add element at the front of the deque
        deque.addFirst(10);
        deque.addFirst(15);
        deque.addFirst(20);//now, element 20 will be at the front

        // these elments will be added in continuation with deque.add(35)
        deque.add(45);
        deque.add(40);

        System.out.println(deque.size());

        // let us print all the elements available in deque
        for (Integer number : deque) {
            System.out.println("Number = " + number);
        }
    }
}

