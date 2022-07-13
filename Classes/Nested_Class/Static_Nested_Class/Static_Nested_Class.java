package Classes.Nested_Class.Static_Nested_Class;


/*                                            Static Nested Classes


    ○  As with class methods and variables, a static nested class is associated with its outer class.
       And like static class methods, a static nested class

                   * cannot refer directly to instance variables

                   * or methods defined in its enclosing class:

           it can use them only through an object reference.

    ○  Inner Class and Nested Static Class Example demonstrates this.


                              You instantiate a static nested class the same way as a top-level class:

        Static_Nested_Class staticNestedObject = new Static_Nested_Class();


                                          Why we Use static class in Java○ 


    ○ In Java, the static keyword is primarily used for memory management.
        We can use the static keyword with

                * variables,
                * methods,
                * blocks,
                * classes.

    ○ Using the static class is a way of grouping classes together. It is also used to access the primitive member of
            the enclosing class through the object reference. The static classes are loaded by the classloader at the
            time of the first usage only not when is enclosing class gets loaded.

                                                     NOTE

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

    private int outerClassInstanceVariable;
    private static int outerStaticVariable = 44;
    private static final int OUTER_CONST = 66;

    public static class StaticClass {
        private int StaticClassVariable;

        public int getStaticClassVariable() {
            return StaticClassVariable;
        }

        public void setStaticClassVariable(int StaticClassVariable) {
            this.StaticClassVariable = StaticClassVariable;
        }

        public void privateVariablesOfOuterClassAreNOTAvailable() {
            // outerClassInstanceVariable = 5; //COMPILE ERROR---------------------------------------------------------
            // static outerClassVariable and outerConstantVariable are accessible 
            System.out.println("outerClassVariable :" + StaticClassVariable);
            System.out.println("outerConstantVariable :" + OUTER_CONST);
        }
    }

    public static void main(String[] args) {
        // Static Nested Class can be created without needing to create its
        // parent. Without creating NestedClassesExample, we created
        // StaticClass
        Static_Nested_Class.StaticClass StaticClass1 = new Static_Nested_Class.StaticClass();
        StaticClass1.setStaticClassVariable(5);

        Static_Nested_Class.StaticClass StaticClass2 = new Static_Nested_Class.StaticClass();
        StaticClass2.setStaticClassVariable(10);

        // Static Nested Class member variables are not static. They can have
        // different values.
        System.out.println(StaticClass1.getStaticClassVariable()); // 5
        System.out.println(StaticClass2.getStaticClassVariable()); // 10

        Static_Nested_Class.StaticClass staticNestedObject = new Static_Nested_Class.StaticClass();
        staticNestedObject.privateVariablesOfOuterClassAreNOTAvailable();

    }
}    