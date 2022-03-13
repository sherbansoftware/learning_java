package Annotation.Annotations.Multiple_Annotations_of_the_Same_Type;

/*                                               Multiple Annotations of the Same Type

        It is a compile-time error if multiple annotations of the same type T appear in a declaration context or type
        context,unless T is repeatable(§9.6.3)and both T and the containing annotation type of T are applicable in the declaration context or type context(§9.6.4.1).

        It is customary,though not required,for multiple annotations of the same type to appear contiguously.

        If a declaration context or type context has multiple annotations of a repeatable annotation type T,then it is as if the context has no explicitly declared annotations of type T and one implicitly declared annotation of the containing annotation type of T.

        The implicitly declared annotation is called the container annotation,and the multiple annotations of type T which appeared in the context are called the base annotations.The elements of the(array-typed)value element of the container annotation are all the base annotations in the left-to-right order in which they appeared in the context.

        It is a compile-time error if,in a declaration context or type context,there are multiple annotations of a repeatable annotation type T and any annotations of the containing annotation type of T.

        In other words,it is not possible to repeat annotations where an annotation of the same type as their container also appears.This prohibits obtuse code like:


@Foo(0)
@Foo(1)
@FooContainer({@Foo(2)})
class A {
}

If this code was legal,then multiple levels of containment would be needed:first the annotations of type Foo would be contained by an implicitly declared container annotation of type FooContainer,then that annotation and the explicitly declared annotation of type FooContainer would be contained in yet another implicitly declared annotation.This complexity is undesirable in the judgment of the designers of the Java programming language.Another approach,treating the annotations of type Foo as if they had occurred alongside@Foo(2) in the explicit@FooContainer annotation,is undesirable because it could change how reflective programs interpret the@FooContainer annotation.

        It is a compile-time error if,in a declaration context or type context,there is one annotation of a repeatable annotation type T and multiple annotations of the containing annotation type of T.

        This rule is designed to allow the following code:


@Foo(1)
@FooContainer({@Foo(2)})
class A {
}

    With only
    one annotation
    of the
    repeatable annotation
    type Foo, no
    container annotation
    is implicitly declared,even if FooContainer is the containing annotation type of Foo.However,repeating the annotation of type FooContainer,as in:


@Foo(1)
@FooContainer({@Foo(2)})
@FooContainer({@Foo(3)})
class A {
}

    is prohibited, even if FooContainer is repeatable with a containing annotation type of its own.It is obtuse to repeat annotations which are themselves containers when an annotation of the underlying repeatable type is present.
    */
