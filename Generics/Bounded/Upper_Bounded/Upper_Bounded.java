package Generics.Bounded.Upper_Bounded;

// https://docs.oracle.com/javase/tutorial/java/generics/bounded.html


/*                                   Upper  Bounded Type Parameters


    ○ There may be situations when you:

                   * want to RESTRICT the types parameters  to subtypes in a parameterized type.

          For example,

                  a method that operates on numbers might only want to accept instances of Number or its subclasses.
                  This is what bounded type parameters are for.

    ○ To declare an UPPER bounded type parameter,

                   * list the type parameter's name,

                   * followed by the extends keyword,

                   * followed by its upper bound classes and/or interface(s),

            which in this example is Number.

       Note that, in this context, extends is used in a general sense to mean either

                   * "extends" (as in classes)

                   * or "implements" (as in interfaces).


                                                Multiple Bounds


    ○ The preceding example illustrates the use of a type parameter with a single bound, but a type parameter can have
          multiple bounds:

                  *  <T extends B1 & B2 & B3>

    ○ A type variable with multiple bounds is a subtype of all the types listed in the bound.

    ○ If one of the bounds is a class,

                  * it must be specified first.

          For example:


                     class A { }

                     interface B {  }

                     interface C {  }


                      class D <T extends A & B & C> { }

     If bound A is not specified FIRST, you get a compile-time error.

                     class D <T extends B & A & C> {  }  // compile-time error

 */

//  Bounded Type Parameters


public class Upper_Bounded<T, D extends Number> {
    private T t;
    private D d;

    public void set(T t) {
        this.t = t;
    }

    public void set(D d) {
        this.d = d;
    }

    public T get() {
        return t;
    }

    public <U, Z extends Number> void inspect(U u, Z z) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("D: " + d.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
        System.out.println("Z: " + z.getClass().getName());
    }

    public static void main(String[] args) {
        Upper_Bounded<Integer, Double> nums = new Upper_Bounded<>();
        nums.set(6666);
        nums.set(12.6);
        nums.inspect(55L, 10.2d);
        //  integer.inspect("some text"); // error: this is still String!
    }

}

//  Multiple Bounds

class A { /* ... */
}

interface B { /* ... */
}

interface C { /* ... */
}

class D<T extends A & B & C> { /* ... */
}

// If bound A is not specified first, you get a compile-time error:

// class D <T extends B & A & C> { /* ... */ }  // compile-time error