package Concepts.Binding.Early_Binding;

// https://techvidvan.com/tutorials/static-and-dynamic-binding-in-java-differences-and-examples/#:~:text=Binding%20means%20an%20association%20of,Static%20Binding%20or%20early%20binding.


/*                                     Static Binding or Early Binding


    ○ in Java refers to a process where the compiler determines

                   * the type of object

                   * and resolves the method during the compile-time.

    ○ Generally, the compiler binds the

                  * overloaded methods using static binding.

    ○ There is a fact that the binding of

                 * static,

                 * private,

                 * and final

         methods are always done during compile-time using static-binding.

    ○ The reason for the binding of private, final and static methods during the compile-time is that

                 * the compiler determines the type of the class at the compile-time

                 * and therefore we can not override them during the runtime.

     ○ Another reason is that

                  * the static binding of methods provides better performance than the runtime binding.

        The compiler becomes aware of these methods and understands that method overriding is not possible with such methods.

    These methods can only be accessed by the object of the local class. Therefore the binding of these methods always
        takes place during compilation.


 */



    class Person
    {
        public static void speak()
        {
            System.out.println("Person speaks");
        }
    }
    class Teacher extends Person
    {
        public static void speak()
        {
            System.out.println("Teacher speaks");
        }
    }
    public class Early_Binding
    {
        public static void main( String args[])
        {
            // Reference is of Person type and object is Teacher type
            Person obj = new Teacher();
            obj.speak();
            //Reference and object both are of Person type.
            Person obj2 = new Person();
            obj2.speak();
        }
    }


