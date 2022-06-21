package Annotation.Annotations.Single_Element_Annotations;

/*                                 Single-Element Annotations


    A single-element annotation,is a shorthand designed for use with single-element annotation types(§9.6.1).

        SingleElementAnnotation:

            @TypeName(ElementValue)

    It is shorthand for the normal annotation:

            @TypeName(value = ElementValue)

    It is legal to use single-element annotations for annotation types with multiple elements,so long as one element is
        named value and all other elements have default values(§9.6.2).

        Example9.7.3-1.Single-Element Annotations
        The following annotations all use the single-element annotation types from §9.6.1.

        Here is an example of a single-element annotation:

           @Copyright("2002 Yoyodyne Propulsion Systems, Inc.")
           public class OscillationOverthruster { ...
          }

    Here is an exampleof an array-valued single-element annotation:


          @Endorsers({"Children", "Unscrupulous dentists"})
          public class Lollipop { ...
          }

    Here is an example of a single-element array-valued single-element annotation:(note that the curly braces are omitted)

         @Endorsers("Epicurus")
         public class Pleasure { ...
         }

    Here is an example of a single-element annotation with a Class-typed element whose value is constrained by a bounded
    wildcard.

        class GorgeousFormatter implements Formatter { ...
        }

        @PrettyPrinter(GorgeousFormatter.class)
        public class Petunia { ...
       }

        // Illegal; String is not a subtype of Formatter
        @PrettyPrinter(String.class)
        public class Begonia { ...
        }

    Here is an example with of a single-element annotation that contains a normal annotation:

        @Author(@Name(first = "Joe", last = "Hacker"))
        public class BitTwiddle { ...
        }

    Here is an example of a single-element annotation that uses an enum type defined inside the annotation type:

        @Quality(Quality.Level.GOOD)
        public class Karma { ...
        }

*/




