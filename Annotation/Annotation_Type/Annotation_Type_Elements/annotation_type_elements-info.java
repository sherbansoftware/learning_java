package Annotation.Annotation_Type.Annotation_Type_Elements;

/*                                      Annotation Type Elements

    The body of an annotation type may contain method declarations,each of which defines an element of the annotation type.
        An annotation type has no elements other than those defined by the methods it explicitly declares.

         AnnotationTypeBody:

                {{AnnotationTypeMemberDeclaration}}

        AnnotationTypeMemberDeclaration:

                AnnotationTypeElementDeclaration
                ConstantDeclaration
                ClassDeclaration
                InterfaceDeclaration

        AnnotationTypeElementDeclaration:

        {AnnotationTypeElementModifier}UnannType Identifier()[Dims][DefaultValue];
        AnnotationTypeElementModifier:
        (one of)
        Annotation public abstract

    By virtue of the AnnotationTypeElementDeclaration production,a method declaration in an annotation type declaration
        cannot have formal parameters,type parameters,or a throws clause.The following production from §4.3is shown here
        for convenience:

        Dims:
        {Annotation}[]{{Annotation}[]}

        By virtue of the AnnotationTypeElementModifier production,a method declaration in an annotation type declaration
            cannot be default or static.Thus,an annotation type cannot declare the same variety of methods as a normal
            interface type.Note that it is still possible for an annotation type to inherit a default method from its
            implicit superinterface,java.lang.annotation.Annotation,though no such default method exists as of Java SE 8.

        By convention,the only AnnotationTypeElementModifiers that should be present on an annotation type element are annotations.

        The return type of a method declared in an annotation type must be one of the following,
            or a compile-time error occurs:

                A primitive type

                String

                Class or an invocation of Class(§4.5)

                An enum type

       An annotation type

               An array type whose component type is one of the preceding types(§10.1).
               This rule precludes elements with nested array types,such as:

@interface Verboten {
    String[][] value();
}
    The declaration of a method that returns an array is allowed to place the bracket pair that denotes the array type after
        the empty formal parameter list.This syntax is supported for compatibility with early versions of the Java programming
        language.It is very strongly recommended that this syntax is not used in new code.

    It is a compile-time error if any method declared in an annotation type has a signature that is override-equivalent
        to that of any public or protected method declared in

    class Object or in the interface java.lang.annotation.Annotation.

        It is a compile-time error if an annotation type declaration T contains an element of type T,either directly or indirectly.

        For example,this is illegal:

@interface SelfRef {
    SelfRef value();
}
    and so is this:

@interface Ping {
    Pong value();
}

@interface Pong {
    Ping value();
}


       An annotation type with no elements is called a marker annotation type.

        An annotation type with one element is called a single-element annotation type.

        By convention,the name of the sole element in a single-element annotation type is value.Linguistic support for
            this convention is provided by single-element annotations(§9.7.3).

        Example 9.6.1-1.Annotation Type Declaration

        The following annotation type declaration defines an annotation type with several elements:

 *
 * Describes the "request-for-enhancement" (RFE)
 * that led to the presence of the annotated API element.
  
@interface RequestForEnhancement {
    int id();        // Unique ID number associated with RFE

    String synopsis();  // Synopsis of RFE

    String engineer();  // Name of engineer who implemented RFE

    String date();      // Date RFE was implemented
}

Example 9.6.1-2.Marker Annotation Type Declaration

        The following annotation type declaration defines a marker annotation type:

 *
 * An annotation with this type indicates that the
 * specification of the annotated API element is
 * preliminary and subject to change.
  
@interface Preliminary {
}

Example 9.6.1-3.Single-Element Annotation Type Declarations

        The convention that a single-element annotation type defines an element called value is illustrated in the
            following annotation type declaration:

 *
 * Associates a copyright notice with the annotated API element.
  
@interface Copyright {
    String value();
}
    The following
    annotation type
    declaration defines
    a single-element annotation type whose sole element has an array type:

 *
 * Associates a list of endorsers with the annotated class.
  
@interface Endorsers {
    String[] value();
}
    The following
    annotation type
    declaration shows
    a Class-typed element whose value is constrained by a bounded wildcard:

interface Formatter {
}

// Designates a formatter to pretty-print the annotated class
@interface PrettyPrinter {
    Class<? extends Formatter> value();
}
    The following
    annotation type
    declaration contains
    an element
    whose type
    is also
    an annotation type:

**
 * Indicates the author of the annotated program element.
 *
@interface Author {
    Name value();
}

 *
 * A person's name.  This annotation type is not designed
 * to be used directly to annotate program elements, but to
 * define elements of other annotation types.

@interface Name {
    String first();

    String last();
}
    The grammar for annotation type declarations permits other element declarations besides method declarations.For
        example,one might choose to declare a nested enum for use in conjunction with an annotation type:

@interface Quality {
    enum Level {BAD, INDIFFERENT, GOOD}

    Level value();
}
*/