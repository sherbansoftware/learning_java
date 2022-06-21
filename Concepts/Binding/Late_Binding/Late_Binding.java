package Concepts.Binding.Late_Binding;

/*                                   Dynamic Binding or Late Binding in Java


    ○ a process when the compiler resolves the method call binding during the execution of the program.


                                    Overriding is a perfect example of dynamic binding.


    ○ In overriding both parent and child classes have the same method


                         Differences between early and dynamic binding:


                    Early Binding	                                                   Late Binding


            It is a compile-time process	                                    It is a run-time process

       The method definition and method                                  The method definition and method
       call are linked during the compile time.	                     call are linked during the run time.

          Actual object is not used for binding.	                      Actual object is used for binding.

          For example: Method overloading	                                For example: Method overriding

            Program execution is faster	                                      Program execution is slower



 */

class Person {
    public void speak() {
        System.out.println("Person speaks");
    }
}

class Teacher extends Person {
    @Override
    public void speak() {
        System.out.println("Teacher speaks");
    }
}

public class Late_Binding {
    public static void main(String args[]) {
        //Reference and objects are of Person type.
        Person obj2 = new Person();
        obj2.speak();
        // Reference is of Person type and object is Teacher type
        Person obj = new Teacher();
        obj.speak();
    }
}