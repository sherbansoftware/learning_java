package Annotation.Annotations.Where_Annotations_May_Appear;

/*                                           Where Annotations May Appear

        A declaration annotation:

            is an annotation that applies to a declaration,and whose own type is applicable in the declaration context
            represented by that declaration.

        A type annotation:
            is an annotation that applies to a type(or any part of a type),and whose own type is applicable in type contexts.

        For example,given the field declaration:

    @Foo int f;
        @Foo is a declaration annotation on f if Foo is meta-annotated by@Target(ElementType.FIELD),and a type annotation
            on int if Foo is meta-annotated by@Target(ElementType.TYPE_USE).It is possible for@Foo to be both a declaration
            annotation and a type annotation simultaneously.

        Type annotations can apply to an array type or any component type thereof(§10.1).For example,assuming that A,B,and
            C are annotation types meta-annotated with@Target(ElementType.TYPE_USE),then given the field declaration:

        @C int@A []@B []f;
        @A applies to the array type int[][],@B applies to its component type int[],and@C applies to the element type int.

        An important property of this syntax is that,in two declarations that differ only in the number of array levels,
            the annotations to the left of the type refer to the same type.For example,@C applies to the type int in all
            of the following declarations:

        @C int f;
        @C int[]f;
        @C int[][]f;

        It is customary,though not required,to write declaration annotations before all other modifiers,and type annotations
            immediately before the type to which they apply.

        It is possible for an annotation to appear:

             at a syntactic location in a program where it could plausibly apply to a declaration,or a type,or both.

                 This can happen in any of the five declaration contexts where modifiers immediately precede the type of
                 the declared entity:

            Method declarations(including elements of annotation types)

            Constructor declarations

            Field declarations(including enum constants)

            Formal and exception parameter declarations

            Local variable declarations(including loop variables of for statements and resource variables of try-with-resources statements)



        The grammar of the Java programming language unambiguously treats annotations at these locations as modifiers for
            a declaration(§8.3),but that is purely a syntactic matter.Whether an annotation applies to a declaration or to t
            he type of the declared entity-and thus,whether the annotation is a declaration annotation or a type annotation-depends
            on the applicability of the annotation's type:

                If the annotation's type is applicable in the declaration context corresponding to the declaration, and
                    not in type contexts, then the annotation is deemed to apply only to the declaration.

                If the annotation's type is applicable in type contexts, and not in the declaration context corresponding
                    to the declaration, then the annotation is deemed to apply only to the type which is closest to the annotation.

                If the annotation's type is applicable in the declaration context corresponding to the declaration and in
                    type contexts, then the annotation is deemed to apply to both the declaration and the type which is
                    closest to the annotation.

                In the second and third cases above,the type which is closest to the annotation is the type written in
                    source code for the declared entity;if that type is an array type,then the element type is deemed to
                    be closest to the annotation.

        For example,in the field declaration@Foo public static String f;,the type which is closest to@Foo is String.(If
            the type of the field declaration had been written as java.lang.String,then java.lang.String would be the type
            closest to@Foo,and later rules would prohibit a type annotation from applying to the package name java.)In the
            generic method declaration@Foo<T> int[]m(){...},the type written for the declared entity is int[],so@Foo applies
            to the element type int.

        Local variable declarations are similar to formal parameter declarations of lambda expressions,in that both allow
            declaration annotations and type annotations in source code,but only the type annotations can be stored in the
            class file.

        There are two special cases involving method/constructor declarations:

            If an annotation appears before a constructor declaration and is deemed to apply to the type which is closest
                to the annotation,that type is the type of the newly constructed object.The type of the newly constructed
                object is the fully qualified name of the type immediately enclosing the constructor declaration.Within
                that fully qualified name,the annotation applies to the simple type name indicated by the constructor
                declaration.

            If an annotation appears before a void method declaration and is deemed to apply only to the type which is
               closest to the annotation,a compile-time error occurs.

            It is a compile-time error if an annotation of type T is syntactically a modifier for:

               a package declaration,but T is not applicable to package declarations.

               a class,interface,or enum declaration,but T is not applicable to type declarations or type contexts;
                   or an annotation type declaration,but T is not applicable to annotation type declarations or type
                   declarations or type contexts.

               a method declaration(including an element of an annotation type),but T is not applicable to method
                   declarations or type contexts.

               a constructor declaration,but T is not applicable to constructor declarations or type contexts.

               a type parameter declaration of a generic class,interface,method,or constructor,but T is not applicable to
                   type parameter declarations or type contexts.

              a field declaration(including an enum constant),but T is not applicable to field declarations or type contexts.

              a formal or exception parameter declaration,but T is not applicable to either formal and exception parameter
                  declarations or type contexts.

              a receiver parameter,but T is not applicable to type contexts.

              a local variable declaration(including a loop variable of a for statement or a resource variable of a
                  try-with-resources statement),but T is not applicable to local variable declarations or type contexts.

        Note that most of the clauses above mention"... or type contexts",because even if an annotation does not apply to t
            he declaration,it may still apply to the type of the declared entity.

        A type annotation is admissible if both of the following are true:

            The simple name to which the annotation is closest is classified as a TypeName,not a PackageName.

            If the simple name to which the annotation is closest is followed by"."and another TypeName-that is,the annotation
                appears as@Foo T.U-then U denotes an inner class of T.

        The intuition behind the second clause is that if Outer.this is legal in a nested  class enclosed by Outer,then
            Outer may be annotated because it represents the type of some object at run time.On the other hand,if Outer.
            this is not legal-because the class where it appears has no enclosing instance of Outer at run time -then
            Outer may not be annotated because it is logically just a name,akin to components of a package name in a fully
            qualified type name.

        For example,in the following program,it is not possible to write A.this in the body of B,as B has no lexically
            enclosing instances(8.5.1).Therefore,it is not possible to apply@Foo to A in the type A.B,because A is
            logically just a name,not a type.


                @Target(ElementType.TYPE_USE)
                @interface Foo {
                }

class Test {
    class A {
        static class B {
        }
    }

    @Foo
    A.B x;  // Illegal
}

    On the
    other hand, in
    the following program,it is possible to write C.this in the body of D.Therefore,it is possible to apply@Foo to C in the type C.D,because C represents the type of some object at run time.


@Target(ElementType.TYPE_USE)
@interface Foo {
}

class Test {
    static class C {
        class D {
        }
    }

    @Foo
    C.D x;  // Legal
}

Finally,note that the second clause looks only one level deeper in a qualified type.This is because a

static class may only be nested in a top level

class or another static nested class.It is not possible to write a nest like:


@Target(ElementType.TYPE_USE)
@interface Foo {
}

class Test {
    class E {
        class F {
            static class G {
            }
        }
    }

    @Foo
    E.F.G x;
}

Assume for a moment that the nest was legal.In the type of field x,E and F would logically be names qualifying G,as E.F.this would be illegal in the body of G.Then,@Foo should not be legal next to E.Technically,however,@Foo would be admissible next to E because the next deepest term F denotes an inner class; but this is moot as the

class nest is illegal in the first place.

        It is a compile-time error if an annotation of type T applies to the outermost level of a type in a type context,and T is not applicable in type contexts or the declaration context(if any)which occupies the same syntactic location.

        It is a compile-time error if an annotation of type T applies to a part of a type(that is,not the outermost level)in a type context,and T is not applicable in type contexts.

        It is a compile-time error if an annotation of type T applies to a type(or any part of a type)in a type context,and T is applicable in type contexts,and the annotation is not admissible.

        For example,assume an annotation type TA which is meta-annotated with just@Target(ElementType.TYPE_USE).The terms@TA java.lang.Object and java.@TA lang.Object are illegal because the simple name to which@TA is closest is classified as a package name.On the other hand,java.lang.@TA Object is legal.

        Note that the illegal terms are illegal"everywhere".The ban on annotating package names applies broadly:to locations which are solely type contexts,such as class ...extends@TA java.lang.Object{...},and to locations which are both declaration and type contexts,such as@TA java.lang.Object f;.(There are no locations which are solely declaration contexts where a package name could be annotated,as class,package,and type parameter declarations use only simple names.)


 */