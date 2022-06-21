package Annotation.Annotation_Type.Defaults_for_Annotation_Type_Elements;

/*                        Defaults for Annotation Type Elements

        An annotation type element may have a default value, specified by following the element's (empty) parameter list
            with the keyword default and an ElementValue (§9.7.1).

        DefaultValue:

            default ElementValue

        It is a compile-time error if the type of the element is not commensurate (§9.7) with the default value specified.

        Default values are not compiled into annotations, but rather applied dynamically at the time annotations are read.
        Thus, changing a default value affects annotations even in classes that were compiled before the change was made
        (presuming these annotations lack an explicit value for the defaulted element).

        Example 9.6.2-1. Annotation Type Declaration With Default Values

        Here is a refinement of the RequestForEnhancement annotation type from §9.6.1:

        @interface RequestForEnhancementDefault {
            int    id();       // No default - must be specified in
            // each annotation
            String synopsis(); // No default - must be specified in
            // each annotation
            String engineer()  default "[unassigned]";
            String date()      default "[unimplemented]";
        }


 */