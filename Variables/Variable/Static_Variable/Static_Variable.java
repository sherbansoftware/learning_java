package Variables.Variable.Static_Variable;

/*                                                   Static variable

   A static variable is common to all the instances (or objects) of the class because it is a class level variable. In
      other words you can say that only a single copy of static variable is created and shared among all the instances
      of the class. Memory_Address allocation for such variables only happens once when the class is loaded in the memory.

    Like variables, we can have:

         * static block,
         * static method
         * static class

                                                      SYNTAX

        static data_type variable_name;

                                                    Static variable initialization

    Static variables are initialized when class is loaded.
    Static variables are initialized before any object of that class is created.
    Static variables are initialized before any static method of the class executes.
    Default values for static and non-static variables are same.

                                            The Static keyword can be applied to

        Method
        Variable
        Class nested within another Class
        Initialization Block

                                                    What are used for

    * they didn't interact with instance variable
    * used to create  constant variable
 */

class Thing {
    public String name;
    public static String description = "Cool";
    public static int counter;

    {
        counter++;
    }

}

public class Static_Variable {
    public static void main(String[] args) {
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();
        Thing thing3 = new Thing();
        thing1.name = "Bob";
        thing2.name = "Sue";
        System.out.println(thing1.name);
        System.out.println(thing2.name);
//        System.out.println(thing1.counter);
//        System.out.println(thing2.counter);
        System.out.println(thing3.counter);
    }
}
