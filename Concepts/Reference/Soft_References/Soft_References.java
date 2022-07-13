package Concepts.Reference.Soft_References;

// https://www.baeldung.com/java-weakhashmap#2-soft-references

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ref/SoftReference.html

/*                                                 Soft References


    ○ Simply put, an object that has a SoftReference pointing to it

                  * won't be garbage collected until the JVM ABSOLUTELY needs memory.

    ○ Let's see how we can create a SoftReference in Java:

Integer prime = 1;
SoftReference<Integer> soft = new SoftReference<Integer>(prime);
prime = null;
The prime object has a strong reference pointing to it.


    ○ Next, we are wrapping prime strong reference into a soft reference.

      After making that strong reference null, a prime object is eligible for GC but will be collected only when JVM
          absolutely needs memory.



 */


import java.lang.ref.SoftReference;

public class Soft_References {
    public static void main(String[] args) {
        Integer prime = 1;
        SoftReference<Integer> soft = new SoftReference<Integer>(prime);
        prime = null;
      //  The prime object has a strong reference pointing to it.
      // Next, we are wrapping prime strong reference into a soft reference.
      // After making that strong reference null, a prime object is eligible for GC but will be collected only
      // when JVM absolutely needs memory.

    }

}
