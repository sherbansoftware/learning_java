package Comparable_Comparator;

// https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
// https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html

/*                                          Comparable and comparator

   A comparable object is capable of comparing itself with another object. The class itself must implements the
    java.lang.Comparable interface to compare its instances.

    Both are an interface that can be used to sort the elements of the collection. ...

    Comparator interface:-----------------------------------------------------------------------------------------------

                    sort collection using two objects provided to it

                     public int compare(Movie m1, Movie m2)
                            {
                                   return m1.getName().compareTo(m2.getName());
                             }


   Comparable interface: ----------------------------------------------------------------------------------------------

                      compares" this" refers to the one objects provided to it.

                      public int compareTo(lang.classes.Object compObj)
                      {
                       return this.obj.compareTo(compObj);
                       }

                                                   NOTE

           *  Comparable in Java is an object to compare itself with another object,
                  Comparable provides compareTo() method to sort elements in Java

           *  Comparator is an object for comparing different objects of different classes.
                  Comparator provides compare() method to sort elements in Java

           * if sorting of objects needs to be based on natural order then use Comparable whereas if you sorting needs
                 to be done on attributes of different objects, then use Comparator in Java.

           * If any class implements Comparable interface in Java then collection of that object either List or Array can
                 be sorted automatically by using Collections_Class.sort() or Arrays.sort() method and objects will be sorted
                 based on there natural order defined by CompareTo method.

     */
public class Comparable_Comparator {
}
