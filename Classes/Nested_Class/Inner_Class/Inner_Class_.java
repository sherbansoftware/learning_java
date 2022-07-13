package Classes.Nested_Class.Inner_Class;


/*                                              Inner class


    ○ The classes that are non-static and nested are called inner classes.


                                     There are two types of nested classes:


    ○ non-static (inner class):

                  * Member inner class
                  * Anonymous inner class
                  * Local inner class

    ○ Static nested classes:


                                            Advantage of java inner classes


    ○  Nested classes represent a special type of relationship that is

                   * it can access all the members (data members and methods) of outer class including private.

     ○  Nested classes are used to develop more READABLE and MAINTAINABLE code because

                   * it logically groups classes and interfaces in one place only.

    ○  Code Optimization:

                   * it requires less code to write.


                                                    NOTE


            * Inner class or nested class is a class that is

                          - declared inside the class or interface and is not static.

            * it can access all the members of the outer class, including private data members and methods.
                  It makes the program simple and concise.

            * We cannot create an instance of the inner class without creating an instance of the outer class.

            * We use inner classes to logically group classes and interfaces in one place to be more readable and maintainable.

            * Code Optimization: It requires less code to write.

*/

class OuterClass {

    private int outerClassInstanceVariable;
    private static int staticOuterClassVariable;

    public class InnerClass {
        private int innerClassVariable;

        public int getInnerClassVariable() {
            return innerClassVariable;
        }

        public void setInnerClassVariable(int innerClassVariable) {
            this.innerClassVariable = innerClassVariable;
        }

        public void privateVariablesOfOuterClassAreAvailable() {
            outerClassInstanceVariable = 5; // we can access the value and
            // change it

            System.out.println("Inner class ref is " + this);

            // Accessing outer class reference variable
            System.out.println("Outer class ref is " + OuterClass.this);

            // Access static outer class variable
            System.out.println("Outer static class variable: " + staticOuterClassVariable);


        }
    }

    public void createInnerClass() {
        // Just use the inner class name to create it
        InnerClass inner = new InnerClass();
    }

}

class InnerClass_Examples {
    public static void main(String[] args) {

        // COMPILER ERROR! You cannot create an inner class on its own.
        // InnerClass innerClass = new InnerClass();
        OuterClass example = new OuterClass();

        // To create an Inner Class you need an instance of Outer Class
        OuterClass.InnerClass innerClass = example.new InnerClass();
        innerClass.privateVariablesOfOuterClassAreAvailable();

    }
}