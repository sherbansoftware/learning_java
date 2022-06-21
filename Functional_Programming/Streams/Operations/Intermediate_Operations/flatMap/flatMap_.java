package Functional_Programming.Streams.Operations.Intermediate_Operations.flatMap;

// https://www.udemy.com/course/functional-programming-in-java-using-lambdas-and-streams/learn/lecture/26956322#search

//  https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html


/*                                                       flatMap


    ○ Returns a stream consisting of the results of

                   * replacing each element of this stream

                   * with the contents of a mapped stream

                   * produced by applying the provided mapping function to each element.

    ○ Flat Map, as the name suggests, involves two steps.

                   * One is MAP, which performs a transformation

                   * and the other one is flattening, which essentially flattens the transformation.

    ○ We know about map operation, which performs transformation.

      That is, it takes an input object and transforms it into another object.

    ○ flatMap comes into play when the transformation involves

                   * transforming into a list of objects.

    ○ Flattening operation would involve

                   * taking the results of each of the transformation

                   * and sending them to the output stream,

                             - thus producing a STREAM OF ITEM

                      rather than stream of list of items, as in the case of Simple Map.

    ○ So it's just taking those values and then sending it to the stream.

                    * So this way we have flattened the results of that transformation.


                                                     map
    ○ order    ->   [item1, item2]

    ○ T -> R              -- o -> o.items()



                                                      flatMap


    ○ T -> stream(R)      --  O -> items().stream()

     Stream <List<Item>>

 */

public class flatMap_ {
}
