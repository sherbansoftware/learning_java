package Concepts.Shallow_Copy;

//https://www.tutorialspoint.com/what-is-shallow-copy-explain-with-an-example-in-java

/*                                                       Shallow copy

    Whenever you try to create a copy of an object using the shallow copy, all fields of the original objects are copied
        exactly. But, if it contains any objects as fields then, only references to those objects are copied not the compete
        objects.
    This implies that, if you perform shallow copy on an object that contains any objects as fields, since only references
        are copied in a shallow copy, both the original and copied object points to the same reference internally and,
        if you do any changes to the data using the copied object, they are reflected in the original object too.

                                                                  NOTE

            * By default, the clone() method does a shallow copy

*/
public class Shallow_Copy {
}
