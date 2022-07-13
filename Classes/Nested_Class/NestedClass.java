package Classes.Nested_Class;

//https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html#:~:text=A%20nested%20class%20is%20a,members%20of%20the%20enclosing%20class.

/*                                            Nested class

    a class that is defined within another class is called a nested class

                                   There are two types of nested classes:

            1. non-static (inner class)

                    * Member inner class
                    * Anonymous inner class
                    * Local inner class

           2. static nested classes


class OuterClass {
    ...
    class InnerClass {
        ...
    }

    static class Static_Nested_Class {
        ...
    }
}

    A nested class is a member of its enclosing class.

            * Non-static nested classes (inner classes)
                have access to other members of the enclosing class, even if they are declared private.

            * Static nested classes do not have access to other members of the enclosing class.
                As a member of the OuterClass, a nested class can be declared

                    private,
                    public,
                    protected,
                    or package private.

            (Recall that outer classes can only be declared public or package private.)


                                                 Why Use Nested Classes?

    Compelling reasons for using nested classes include the following:

            * It is a way of logically grouping classes that are only used in one place: If a class is useful to only
                 one other class, then it is logical to embed it in that class and keep the two together. Nesting such
                 "helper classes" makes their package more streamlined.

             * It increases encapsulation: Consider two top-level classes, A and B, where B needs access to members of
                 A that would otherwise be declared private. By hiding class B within class A, A's members can be declared
                 private and B can access them. In addition, B itself can be hidden from the outside world.

            * It can lead to more readable and maintainable code: Nesting small classes within top-level classes places
                 the code closer to where it is used.

                                       Differences between Static and Non-static Nested Classes

    The following are major differences between static nested classes and inner classes.

            * A static nested class:

                  - may be instantiated without instantiating its outer class.
                  - can access only the static members of the outer class.

            * Inner classes

                  - can access both static and non-static members of the outer class.


                                       Advantage of java inner classes


        1) Nested classes represent a special type of relationship that is it can access all the members (data members and methods)
               of outer class including private.

        2) Nested classes are used to develop more readable and maintainable code because it logically group classes and
                interfaces in one place only.

        3) Code Optimization: It requires less code to write.



                                                NOTE

        *  Non-static nested classes (inner classes) have access to other members of the enclosing class,
               even if they are declared private.

        * Static nested classes do not have access to other members of the enclosing class.

 */

public class NestedClass {

    public int x = 0;

    public void getText() {

        System.out.println("This is Nested_Class's method");
    }

    class FirstLevel {

        public int x = 1;
        static final int V = 55;

        public FirstLevel(int n) {

            x = n;

        }

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            getText();
        }
    }

    static class Static_Nested_Class {
        int n = 2;
        static int st;

        static void staticShow() {

            System.out.println("Staticshow from static nested class");
        }

        void staticNestedClass(int n) {
            System.out.println("n= " + n);
            System.out.println("this.n = " + this.n);

            int snc = new NestedClass().x;
            new NestedClass().getText();
            System.out.println("Nested_Class.x = " + snc);
        }

    }
}