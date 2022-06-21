package Collection.Collection_Classes.LinkedList.JDK_LinkList;

// https://www.geeksforgeeks.org/data-structures/linked-list/?ref=lbp
// https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html


/*                                                    LinkedList


    Linked List can be defined as collection of objects called nodes that are randomly stored in the memory.
    Like arrays, Linked List is a linear data structure.
    Unlike arrays, linked list elements are not stored at a contiguous location; the elements are linked using pointers.

                                            Linked lists can be of multiple types:

            * singly,
            * doubly,
            * circular linked list    - particular case of SinglyLinkList where tail has pointer to head so collection
                                            can start to be traversed from any point

                                          Arrays have the following limitations.

            * The size of the arrays is fixed:
                  So we must know the upper limit on the number of elements in advance. Also, generally, the allocated
                  memory is equal to the upper limit irrespective of the usage.
            * Inserting a new element in an array of elements is expensive because the room has to be created for the
                  new elements and to create room existing elements have to be shifted but in Linked list if we have the
                  head node then we can traverse to any node through it and insert new node at the required position.

                                                 Advantages of LinkedList over arrays

           * Dynamic size
           * Ease of insertion/deletion


                                                        Drawbacks:

            * Random access is not allowed. We have to access elements sequentially starting from the first node(head node).
                  So we cannot do binary search with linked lists efficiently with its default implementation.

            *  Extra memory space for a pointer is required with each element of the list.

            * Not cache friendly. Since array elements are contiguous locations, there is locality of reference which
                  is not there in case of linked lists.

                                                    Time complexity

   Operation               LinkedList                               Arraylist                             Preferred

Insert at last index	     O(1)                                         O(1)
                                                  (If array copy operation is Considered then O(N))       LinkedList

Insert at given index        O(N)                                       O(N)                              LinkedList

Search by value              O(N)                                        O(N)                              ArrayList

Get by index                 O(N)                                        O(1)                              ArrayList

Remove by value              O(N)                                        O(N)                              LinkedList

Remove by index              O(N)                                        O(N)                              LinkedList




                                                        NOTE

            * Linked list is slow to traverse
            * if you wanna ad or remove an item in the middle or beginning of the list anywhere other than near the end
                  use link list.



 */


import java.util.LinkedList;

public class LinkedList_ {
    LinkedList ll;

 }


