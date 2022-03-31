package Object;

class Object_RT{
    Object obj;
}

/*                                                     public class Object

    Class Object is the root of the class hierarchy. Every class has Object as a superclass. All objects, including arrays,
        implement the methods of this class.

    An object

        is a class instance or an array.

    The reference values (often just references)

        are pointers to these objects, and a special null reference, which refers o no object.

    A class instance is explicitly created by
        a class instance creation expression (§15.9).

    An array is explicitly created by
        an array creation expression (§15.10.1).

    A new class instance is implicitly created when
        the string concatenation operator + (§15.18.1) is used in a non-constant expression (§15.28), resulting in a
        new object of type String (§4.3.3).
    A new array object is implicitly created when an array initializer expression (§10.6) is evaluated; this can occur
        when a class or interface is initialized (§12.4), when a new instance of a class is created (§15.9), or when a
        local variable declaration statement is executed (§14.4).
    New objects of the types

        Boolean,
        Byte,
        Short,
        Character,
        Integer,
        Long,
        Float,
        Double

    may be implicitly created by boxing conversion (§5.1.7).

                                                              NOTE

            * The class Object is a superclass (§8.1.4) of all other classes.
            * Objects are stored in Heap memory.
            * An object that does not have any reference is always eligible for garbage collection.
            * All class and array types inherit (§8.4.8) the methods of class Object, which are summarized as follows:

                          - The method clone
                                is used to make a duplicate of an object.

                          - The method equals
                                defines a notion of object equality, which is based on value, not reference, comparison.

                          - The method finalize
                                is run just before an object is destroyed (§12.6).

                          - The method getClass
                                returns the Class object that represents the class of the object.

                           - The method hashCode
                                 is very useful, together with the method equals, in hashtables such as java.util.HashMap.

                           - The methods

                                 wait,
                                 notify,
                                 notifyAll

                  are used in concurrent programming using threads (§17.2).

                           - The method toString
                                 returns a String representation of the object.

            * A Class object exists for each reference type. It can be used, for example, to discover the fully qualified
                  name of a class, its members, its immediate superclass, and any interfaces that it implements.

            * The type of a method invocation expression of getClass is Class<? extends |T|>, where T is the class or interface
                  that was searched for getClass (§15.12.1) and |T| denotes the erasure of T (§4.6).

            * A class method that is declared synchronized (§8.4.3.6) synchronizes on the monitor associated with the Class
                  object of the class.

  */

class Frog {
    private int id;
    public String name;

    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }

 //   @Override
//    public String toString () {
//         return "Hello " + id + " with name " + name;
//     }
    // better use StringBuilder



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
      //  return sb.toString();

        return String.format("%d: %s", id, name);
    }
}

public class Object_ {
    public static void main(String[] args) {

                                                // toString() method

        Frog frog1 = new Frog(55,"Jane");
        Frog frog2 = new Frog(62,"Freddy");
        System.out.println(frog1);
        System.out.println(frog2);


    }


}
