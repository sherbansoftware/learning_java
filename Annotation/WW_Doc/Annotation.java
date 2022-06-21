package Annotation.WW_Doc;

//https://docs.oracle.com/javase/tutorial/java/annotations/index.html

/*                                                  Annotations

    - a form of metadata, provide data about a program that is not part of the program itself. Annotations
        have no direct effect on the operation of the code they annotate.
    - is a marker which associates information with a program construct,but has no effect at run time.


    An annotation denotes a specific invocation of an annotation type(�9.6)and usually provides values for the elements
        of that type.

 Annotations have a number of uses, among them:

     •Information for the compiler •Annotations can be used by the compiler to detect errors or suppress warnings.
     •Compile-time and deployment-time processing •Software tools can process annotation information to generate code,
         XML files, and so forth.
     •Runtime processing •Some annotations are available to be examined at runtime.

 The Format of an Annotation:-------------------------------------------------------------------------------------------

      •Simplest form:

         @Entity

     The at sign character (@) indicates to the compiler that what follows is an annotation. In the following example
     the annotation's name is Override:

        @Override
        void mySuperMethod() { ... }
     The annotation can include elements, which can be named or unnamed, and there are values for those elements:

        @Author(
            name = "Benjamin Franklin",
            date = "3/27/2003"
                )
        class MyClass() { ... }
               or

         @SuppressWarnings(value = "unchecked")
         void myMethod() { ... }

     •If there is just one element named value, then the name can be omitted, as in:

          @SuppressWarnings("unchecked")
          void myMethod() { ... }

          If the annotation has no elements, then the parentheses can be omitted, as shown in the previous
              @Override example.

      •Multiple annotations on the same declaration:

           @Author(name = "Jane Doe")
           @EBook
           class MyClass { ... }

      •If the annotations have the same type, then this is called a repeating annotation:

           @Author(name = "Jane Doe")
           @Author(name = "John Smith")
           class MyClass { ... }


     The annotation type can be one of the types that are defined in the java.lang or java.lang.annotation packages of
     the Java SE API. In the previous examples, Override and SuppressWarnings are predefined Java annotations.
     It is also possible to define your own annotation type. The Author and Ebook annotations in the previous example
     are custom annotation types.

 Where Annotations Can Be Used -----------------------------------------------------------------------------------------

     •declarations of classes
     •fields
     •methods
     •other program elements

   When used on a declaration, each annotation often appears, by convention, on its own line.

 As of the Java SE 8 release, annotations can also be applied to the use of types.
 Here are some examples:

     •Class instance creation expression:

          new @Interned MyObject();

     •Type cast:

          myString = (@NonNull String) str;

      •implements clause:

          class UnmodifiableList<T> implements
              @Readonly List<@Readonly T> { ... }

       •Thrown exception declaration:

           void monitorTemperature() throws
                @Critical TemperatureException { ... }

     This form of annotation is called a type annotation.

 Declaring an Annotation Type

     Many annotations replace comments in code.   ( incomplete )

 Predefined Annotation Types ---------------------------------------------------------------------------------------

     •Annotation Types Used by the Java Language

              @Deprecated
              @Override
              @SuppressWarnings
              @SafeVarargs
              @FunctionalInterface

     •Annotations That Apply to Other Annotations (meta-annotation)

          1. @Retention annotation specifies how the marked annotation is stored:

                 •RetentionPolicy.SOURCE
                       •The marked annotation is retained only in the source level and is ignored  by the compiler.
                 •RetentionPolicy.CLASS
                        •The marked annotation is retained by the compiler at compile time, but is ignored by the
                          java Virtual Machine (JVM).
                  •RetentionPolicy.RUNTIME •The marked annotation is retained by the JVM so it can be used by the
                          runtime environment.

          2. @Documented annotation
                 indicates that whenever the specified annotation is used those elements should be documented
                 using the Javadoc tool. (By default, annotations are not included in Javadoc.)For more information,
                 see the Javadoc tools page.

          3. @Target annotation
                 marks another annotation to restrict what kind of Java elements the annotation can be applied to.
                 ATest.A target annotation specifies one of the following element types as its value:

                    •ElementType.ANNOTATION_TYPE can be applied to an annotation type.
                    •ElementType.CONSTRUCTOR can be applied to a constructor.
                    •ElementType.FIELD can be applied to a field or property.
                    •ElementType.LOCAL_VARIABLE can be applied to a local variable.
                    •ElementType.METHOD can be applied to a method-level annotation.
                    •ElementType.PACKAGE can be applied to a package declaration.
                    •ElementType.PARAMETER can be applied to the parameters of a method.
                    •ElementType.TYPE can be applied to any element of a class.

            4. @Inherited annotation
                   indicates that the annotation type can be inherited from the super class. (This is not true by
                   default.) When the user queries the annotation type and the class has no annotation for this type,
                   the class' superclass is queried for the annotation type. This annotation applies only to class declarations.

            5. @Repeatable annotation
                   introduced in Java SE 8, indicates that the marked annotation can be applied more than once to the
                   same declaration or type use. For more information, see Repeating Annotations.



                                             Type Annotations and Pluggable Type Systems

        Before the Java SE 8release,annotations could only be applied to declarations.As of the Java SE 8release,
        annotations can also be applied to any type use.This means that annotations can be used anywhere you use a type.
        A few examples of where types are used are

class instance creation expressions(new),casts,implements clauses,and throws clauses.This form of annotation is called
        a type annotation and several examples are provided in Annotations Basics.

        Type annotations were created to support improved analysis of Java programs way of ensuring stronger type
        checking.The Java SE 8release does not provide a type checking framework,but it allows you to write(or download)a
        type checking framework that is implemented as one or more pluggable modules that are used in conjunction with
        the Java compiler.

        For example,you want to ensure that a particular variable in your program is never assigned to null;you want to
        avoid triggering a NullPointerException.You can write a custom plug-in to check for this.You would then modify
        your code to annotate that particular variable,indicating that it is never assigned to null.The variable
        declaration might look like this:

@NonNull String str;
        When you compile the code,including the NonNull module at the command line,the compiler prints a warning if it
        detects a potential problem,allowing you to modify the code to avoid the error.After you correct the code to
        remove all warnings,this particular error will not occur when the program runs.

        You can use multiple type-checking modules where each module checks for a different kind of error.In this way,
        you can build on top of the Java type system,adding specific checks when and where you want them.

        With the judicious use of type annotations and the presence of pluggable type checkers,you can write code that
        is stronger and less prone to error.

        In many cases,you do not have to write your own type checking modules.There are third parties who have done the
        work for you.For example,you might want to take advantage of the Checker Framework created by the University of
        Washington.This framework includes a NonNull module,as well as a regular expression module,and a mutex lock module.
        For more information,see the Checker Framework.

*/

public @interface Annotation {
}
