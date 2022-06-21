package Functional_Programming.Streams.Operations.Terminal_Operations.Reduction.Collect.GroupingBy;

// https://www.udemy.com/course/functional-programming-in-java-using-lambdas-and-streams/learn/lecture/26606092#questions

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Collectors.html


/*                                            Grouping & Multilevel Groupings:



    ○ groupingBy()

                     * six Methods

                                  - https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Collectors.html


    ○ groupingBy() has a default collision resolution strategy.


    ○ with toMap(), we had to explicitly specify the collision resolution strategy.

                   * Map<Double, List<Book>> ratingsMap = treeMap.values().stream()
				     .collect(Collectors.toMap(Book::getRating, b -> Collections.singletonList(b), (l1, l2) -> { ArrayList<Book> l = new ArrayList<>(l1);
																				l.addAll(l2);
																				return l;}));

    ○ toMap() is good if we are:

                  * generating simple key value pairs

                  * and you are not expecting any collisions.

    ○ If you think there are going to be some collisions, then it

                  * is better to go get groupingBy

                  * and it is very simple implementation.

*/

public class GroupingBy {
}
