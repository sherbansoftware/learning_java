package Reflection.Field;

// https://www.udemy.com/course/java-reflection-master-class/learn/lecture/21298174#questions/15936422

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/reflect/Field.html


/*                                           Field

   ○  A Field provides information about, and dynamic access to, a single field of a class or an interface.
          The reflected field may be a class (static) field or an instance field.

    ○ A Field permits widening conversions to occur during a get or set access operation, but throws an
          IllegalArgumentException if a narrowing conversion would occur.


                                           Synthetic Fields


    ○ in addition to the fields we explicitly declared in a class in certain cases the java compiler

                   * generates artificial fields inside it

           for internal usage that we normally don't see unless we use reflection and discover those fields

                   * at runtime

    ○ such fields are compiler specific and in most cases

                   * we don't want to

                         - touch,
                         - modify
                         - or rely

                  on them and the way for us to find out if a particular field is synthetic is by checking
                  the a synthetic property of a given field


 */



public class Field {
}
