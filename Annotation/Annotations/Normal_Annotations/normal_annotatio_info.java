package Annotation.Annotations.Normal_Annotations;

/*

    Normal Annotations
        A normal annotation specifies the name of an annotation type and optionally a list of comma-separated element-value
        pairs.Each pair contains an element value that is associated with an element of the annotation type(§9.6.1).


        NormalAnnotation:

            @TypeName([ElementValuePairList])

      ElementValuePairList:

        ElementValuePair{,ElementValuePair}
        ElementValuePair:
        Identifier=ElementValue
        ElementValue:
        ConditionalExpression
        ElementValueArrayInitializer
        Annotation
        ElementValueArrayInitializer:
        {[ElementValueList][,]}
        ElementValueList:
        ElementValue{,ElementValue}

        Note that the at-sign(@)is a token unto itself(§3.11).It is possible to put whitespace between it and the TypeName
            but this is discouraged as a matter of style.
        The TypeName specifies the annotation type corresponding to the annotation.The annotation is said to be"of"that type.
        It is a compile-time error if TypeName does not specify an annotation type that is accessible(§6.6)at the point
            where the annotation appears.
        The Identifier in an element-value pair must be the simple name of one of the elements(i.e.methods)of the annotation
            type,or a compile-time error occurs.
        The return type of this method defines the element type of the element-value pair.
        If the element type is an array type,then it is not required to use curly braces to specify the element value of
            the element-value pair.If the element value is not an ElementValueArrayInitializer,then an array value whose
            sole element is the element value is associated with the element.If the element value is an ElementValueArrayInitializer,
            then the array value represented by the ElementValueArrayInitializer is associated with the element.
        It is a compile-time error if the element type is not commensurate with the element value.An element type T is
            commensurate with an element value V if and only if one of the following is true:

               T is an array type E[],and either:
               If V is a ConditionalExpression or an Annotation,then V is commensurate with E;or
               If V is an ElementValueArrayInitializer,then each element value that V contains is commensurate with E.
               An ElementValueArrayInitializer is similar to a normal array initializer(§10.6),except that an
               ElementValueArrayInitializer may syntactically contain annotations as well as expressions and nested
               initializers.However,nested initializers are not semantically legal in an ElementValueArrayInitializer
               because they are never commensurate with array-typed elements in annotation type declarations(nested
               array types not permitted).
        T is not an array type,and the type of V is assignment compatible(§5.2)with T,and:

            If T is a primitive type or String,then V is a constant expression.
            If T is Class or an invocation of Class(§4.5),then V is a class literal
            If T is an enum type(§8.9),then V is an enum constant(§8.9.1).
        V is not null.
        Note that if T is not an array type or an annotation type,the element value must be a ConditionalExpression.
            The use of ConditionalExpression rather than a more general production like Expression is a syntactic trick
            to prevent assignment expressions as element values.Since an assignment expression is not a constant expression,
            it cannot be a commensurate element value for a primitive or String-typed element.

        Formally,it is invalid to speak of an ElementValue as FP-strict(§15.4)because it might be an annotation or a
            class literal.Still,we can speak informally of ElementValue as FP-strict when it is either a constant
            expression or an array of constant expressions or an annotation whose element values are(recursively)found
            to be constant expressions;after all,every constant expression is FP-strict.

        A normal annotation must contain an element-value pair for every element of the corresponding annotation type,
            except for those elements with default values,or a compile-time error occurs.
        A normal annotation may,but is not required to,contain element-value pairs for elements with default values.
        It is customary,though not required,that element-value pairs in an annotation are presented in the same order as
           the corresponding elements in the annotation type declaration.
        An annotation on an annotation type declaration is known as a meta-annotation.
        An annotation of type T may appear as a meta-annotation on the declaration of type T itself.More generally,
        circularities in the transitive closure of the"annotates"relation are permitted.

        For example,it is legal to annotate the declaration of an annotation type S with a meta-annotation of type T,and
        to annotate T's own declaration with a meta-annotation of type S. The pre-defined annotation types contain several
        such circularities.

        Example9.7.1-1.Normal Annotations
        Here is an example of a normal annotation using the annotation type from §9.6.1:


    @RequestForEnhancement(
            id = 2868724,
            synopsis = "Provide time-travel functionality",
            engineer = "Mr. Peabody",
            date = "4/1/2004"
    )
    public static void travelThroughTime(Date destination){...}

        Here is an example of a normal annotation that takes advantage of default values

    @RequestForEnhancement(
            id = 4561414,
            synopsis = "Balance the federal budget"
    )
    public static void balanceFederalBudget(){
            throw new UnsupportedOperationException("Not implemented");
            }

*/