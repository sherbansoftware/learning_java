package Object.hashCode;

// https://www.baeldung.com/java-equals-hashcode-contracts

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Object.html

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Object.html#hashCode()


/**                                                      hashCode
 *

    ○ Returns a hash code value for the object.

                   * This method is supported for the benefit of hash tables

            such as those provided by java.util.HashMap.


                                         The general contract of  hashCode is:


    ○ Whenever it is invoked on the same object more than once during an execution of a Java application,

                   * the hashCode method must consistently return the same integer,

            provided no information used in  equals comparisons on the object is modified.

    ○ This integer need not remain consistent

                    * from one execution of an application

                    * to another execution of the same application.

    ○ If two objects are equal according to the  equals(Object) method,

                    * then calling the hashCode method on each of the two objects

             must produce the SAME integer result.

    ○ It is not required that if

                   * two objects are UNEQUAL according to the java.lang.Object #equals(java.lang.Object) method,

                   * then calling the  hashCode method on each of the two objects must produce DISTINCT integer results.

    ○ However, the programmer should be aware that producing distinct integer results for unequal objects may improve
          the performance of hash tables.

    ○ As much as is reasonably practical, the hashCode method defined by class  Object does

                  * return distinct integers for distinct objects.

     ○ (This is typically implemented by converting

                  * the internal address of the object into an integer,

           but this implementation technique is not required by the Java&trade; programming language.)
 *
 * @return  a hash code value for this object.
 * @see     java.lang.Object#equals(java.lang.Object)
 * @see     java.lang.System#identityHashCode
 */


public class hashCode_ {

}

