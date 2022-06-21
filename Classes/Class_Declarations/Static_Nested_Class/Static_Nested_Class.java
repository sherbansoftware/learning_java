package Classes.Class_Declarations.Static_Nested_Class;


/*                                            Static Nested Classes

        As with class methods and variables, a static nested class is associated with its outer class. And like static
            class methods, a static nested class cannot refer directly to instance variables or methods defined in its
            enclosing class: it can use them only through an object reference. Inner Class and Nested Static Class Example
            demonstrates this.

                              You instantiate a static nested class the same way as a top-level class:

        Static_Nested_Class staticNestedObject = new Static_Nested_Class();

                                          Why we Use static class in Java?

    In Java, the static keyword is primarily used for memory management.
        We can use the static keyword with

                * variables,
                * methods,
                * blocks,
                * classes.

        Using the static class is a way of grouping classes together. It is also used to access the primitive member of
            the enclosing class through the object reference. The static classes are loaded by the classloader at the
            time of the first usage only not when is enclosing class gets loaded.

                                                     NOTE

            * A static nested class interacts with the instance members of its outer class (and other classes) just like
                  any other top-level class. In effect, a static nested class is behaviorally a top-level class that has
                  been nested in another top-level class for packaging convenience. Inner Class and Nested Static Class
                  Example also demonstrates this.

             * You instantiate a static nested class the same way as a top-level class

             *  May be instantiated without instantiating its outer class.

             *  Can access only the static members of the outer class.

             * All static classes are nested classes but vice-versa is not true.

             * Non-static variable and instance methods cannot be accessed within the static class. If you try to access
                 a non-static reference from a static field, it throws an error: Cannot make a static reference to the
                 non-static field.

             * We can create static blocks, variables, and methods inside a static class.

             * A class may have multiple static classes.

             * We cannot access the static class if it is inside the static block.

             * There may be any number of static classes within a static class.


*/

public class Static_Nested_Class {

    String outerField = "Outer field";
    static String staticOuterField = "Static outer field";


      static class StaticNestedClass {

        void accessMembers(Static_Nested_Class outer) {
            // Compiler error: Cannot make a static reference to the non-static field outerField
            // System.out.println(outerField);
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }

}
