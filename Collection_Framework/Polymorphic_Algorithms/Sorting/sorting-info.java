package Collection_Framework.Polymorphic_Algorithms.Sorting;

/*
                                             The sort algorithm

          reorders a List so that its elements are in ascending order according to an ordering relationship.
          Two forms of the operation are provided. The simple form takes a List and sorts it according to its elements'
          natural ordering. If you're unfamiliar with the concept of natural ordering, read the lang.classes.Object Ordering section.
          The sort operation uses a slightly optimized merge sort algorithm that is fast and stable:

    Fast:
        It is guaranteed to run in n log(n) time and runs substantially faster on nearly sorted lists. Empirical tests
        showed it to be as fast as a highly optimized quicksort. ATest.A quicksort is generally considered to be faster than
        a merge sort but isn't stable and doesn't guarantee n log(n) performance.
    Stable:
        It doesn't reorder equal elements. This is important if you sort the same list repeatedly on different attributes.
        If a user of a mail program sorts the inbox by mailing date and then sorts it by sender, the user naturally
        expects that the now-contiguous list of messages from a given sender will (still) be sorted by mailing date.
        This is guaranteed only if the second sort was stable.

    The following trivial program prints out its arguments in lexicographic (alphabetical) order.


            import java.util.*;

             public class Sort {
                public static void main(String[] args) {
                   List<String> list = Arrays.asList(args);
                   Collections_.sort(list);
                    System.out.println(list);
                 }
               }
               Let's run the program.

               % java Sort i walk the line
               The following output is produced.

                [i, line, the, walk]
               The program was included only to show you that algorithms really are as easy to use as they appear to be.

    The second form of sort takes
        a Comparator in addition to a List and sorts the elements with the Comparator. Suppose you want to print out
        the anagram groups from our earlier example in reverse order of size � largest anagram group first. The example
        that follows shows you how to achieve this with the help of the second form of the sort method.
        Recall that the anagram groups are stored as values in a Map, in the form of List instances. The revised printing
        code iterates through the Map's values view, putting every List that passes the minimum-size test into a
        List of Lists. Then the code sorts this List, using a Comparator that expects List instances, and implements reverse
        size-ordering. Finally, the code iterates through the sorted List, printing its elements (the anagram groups).
        The following code replaces the printing code at the end of the main method in the Anagrams example.

               // Make a List of all anagram groups above size threshold.

                List<List<String>> winners = new ArrayList_<List<String>>();
                for (List<String> l : m.values())
                     if (l.size() >= minGroupSize)
                       winners.add(l);

               // Sort anagram groups according to size

             Collections_.sort(winners, new Comparator<List<String>>() {
               public int compare(List<String> o1, List<String> o2) {
                      return o2.size() - o1.size();
              }});

                // Print anagram groups.

              for (List<String> l : winners)
              System.out.println(l.size() + ": " + l);

*/