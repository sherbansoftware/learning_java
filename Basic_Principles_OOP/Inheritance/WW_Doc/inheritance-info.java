package Basic_Principles_OOP.Inheritance.WW_Doc;


/*                                      Inheritance

     is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important
     part of OOPs (lang.classes.Object Oriented programming system).

     Inheritance represents the:

         *  relationship which is also known as a parent-child relationship

                                        Types of inheritance in java:  -- see inheritance_type.png image

          * single
          * multilevel
          * hierarchical.
          * hybrid  -- see hybrid_inheritance.png

                                         Why multiple inheritance is not supported in java?

        * To reduce the complexity and simplify the language, multiple inheritance is not supported in java.

                                          Terms used in Inheritance:

        * Class:
            A class is a group of objects which have common properties. It is a template or blueprint from which
            objects are created.
        * Sub Class/Child Class:
            Subclass is a class which inherits the other class. It is also called a derived class, extended class,or child class.
        * Super Class/Parent Class:
            Superclass is the class from where a subclass inherits the features. It is also called a base class or a parent class.
        * Reusability:
            As the name specifies, reusability is a mechanism which facilitates you to reuse the fields and methods of
            the existing class when you create a new class. You can use the same fields and methods already defined in
            the previous class.

                                          Why use inheritance in java :

        * For Method Overriding (so runtime polymorphism can be achieved).
        * For Code Reusability.

                                             Inheriting Constructors:

         A subclass inherits all the members (fields, methods, and nested classes) from its superclass.
         Constructors are not members, so they
             are not inherited by subclasses, --------------------------------------------------------------------------
             but the constructor of the superclass can be invoked from the subclass.

                                              Accessing Superclass Members:

        If a class is inheriting the properties of another class. And if the members of the superclass have the names
        same as the sub class, to differentiate these variables we use super keyword as shown below.

            * super.variable
            * super.method();

                                                Subclass Constructors:

        * Invocation of a superclass constructor must be the first line in the subclass constructor.
        * The syntax for calling a superclass constructor is

            super();
                or:
            super(parameter list);

       With super(), the superclass no-argument constructor is called. With super(parameter list), the superclass
       constructor with a matching parameter list is called.

                                                    Note:

        If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts
        a call to the no-argument constructor of the superclass. If the super class does not have a no-argument constructor
        you will get a compile-time error.
        lang.classes.Object does have such a constructor, so if lang.classes.Object is the only superclass, there is no problem.

    If a subclass constructor invokes a constructor of its superclass, either explicitly or implicitly,
        you might think that there will be a whole chain of constructors called, all the way back to the constructor of lang.classes.Object.
        In fact, this is the case. It is called constructor chaining, and you need to be aware of it when there is
        a long line of class descent.

                                                      Constructor Chaining

         Calling a constructor from the another constructor of same class is known as Constructor chaining.
         The real purpose of Constructor Chaining is that you can pass parameters through a bunch of different constructors,
         but only have the initialization done in a single place. This allows you to maintain your initializations from
         a single location, while providing multiple constructors to the user. If we don*t chain, and two different
         constructors require a specific parameter, you will have to initialize that parameter twice, and when the
         initialization changes, you*ll have to change it in every constructor, instead of just the one.

                                                           IMPORTANT:

        * As a rule, constructors with fewer arguments should call those with more
        * this() should always be the first statement in constructor otherwise you will get this error message

*/