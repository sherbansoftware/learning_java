package Constructors.WW_Doc;

/*                                                A constructor

    is a block of codes similar to the method. It is called when an instance of the class is created.
    At the time of calling constructor, memory for the object is allocated in the memory.

    Constructor declarations look like method declarations—except that they use the name of the class
        and have no return type
    Constructor can be called from another constructor using keyword this which must be placed on first line on body constructor

                                                   SYNTAX

    ConstructorDeclaration:
        {ConstructorModifier} ConstructorDeclarator [Throws] ConstructorBody

    ConstructorDeclarator:
        [TypeParameters] SimpleTypeName ( [FormalParameterList] )

    SimpleTypeName:
        Identifier

                                                 Constructor Modifiers

    a constructor can be:

        * public
        * protected
        * private

    Unlike methods, a constructor CANNOT BE:

        * abstract,
        * static,
        * final,
        * native,
        * strictfp,
        * synchronized

    A constructor is not inherited, so there is no need to declare it final.

    An abstract constructor could never be implemented.

    A constructor is always invoked with respect to an object, so it makes no sense for a constructor to be static.

    There is no practical need for a constructor to be synchronized, because it would lock the object under construction,
        which is normally not made available to other threads until all constructors for the object have completed their work.

    The lack of native constructors is an arbitrary language design choice that makes it easy for an implementation of
        the Java Virtual Machine to verify that superclass constructors are always properly invoked during object creation.

    The inability to declare a constructor as strictfp (in contrast to a method (§8.4.3)) is an intentional language
        design choice; it effectively ensures that a constructor is FP-strict if and only if its class is FP-strict .


                                                 Types of Constructors

    There are three types of constructors:

        * Default,
        * No-arg constructor
        * Parameterized.

    If you do not implement any constructor in your class, Java compiler inserts a default constructor into your code
        on your behalf.

 */
