package Comparable_Comparator.Comparator_Multiple_Criteria;

/*

                      The double colon (::)

    operator, also known as method reference operator in Java, is used to call a method by referring to it with the help
    of its class directly. They behave exactly as the lambda expressions. The only difference it has from lambda
    expressions is that this uses direct reference to the method by name instead of providing a delegate to the method.

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAuthByNames {
    public static void main(String args[]) {
      	
        // List of objects of Author class
        ArrayList<Author> al = new ArrayList<Author> ();
        al.add (new Author ("Henry", "Miller", "Tropic of Cancer", 225));
        al.add (new Author ("Nalo", "Hopkinson", "Brown Girl in the Ring", 325));
        al.add (new Author ("Frank", "Miller", "300",564));
        al.add (new Author ("Deborah", "Hopkinson", "Sky Boys",685));
        al.add (new Author ("George R. R.", "Martin", "Song of Ice and Fire",554));

        //compare by pageNumber  lambda --------------------------------------------------------------------------------
//
              Comparator<Author> pn = (a1, a2) -> Integer.compare (a1.getPageNumber (),a2.getPageNumber ());
              Comparator<Author> reversePn = (a1, a2) -> Integer.compare (a2.getPageNumber (),a1.getPageNumber ());

        //compare by firstname  lambda ---------------------------------------------------------------------------------

//                Comparator<Author> normalOrder = (a1, a2) -> a1.firstName.compareTo(a2.firstName);
//                Comparator<Author> reverse = (a1, a2) -> a2.firstName.compareTo(a1.firstName);


        //comparing method by firstname  stream ------------------------------------------------------------------------

              // Comparator<Author> normal = Comparator.comparing (Author::getFirstName);


        //comparing method by firstname then lastName then book name----------------------------------------------------

             Comparator<Author> normal = Comparator.comparing (Author::getFirstName).thenComparing (Author::getLastName)
                 .thenComparing (Author::getBookName);
//
           List<Author> fn = al.stream ().sorted (pn).collect (Collectors.toList ());
//
//        for (Author str : fn) {
//            System.out.println (str.firstName + " " + str.lastName + " " + "Book: " + str.bookName + " Page numbers "
//                    + str.getPageNumber ());
//        }

         Collections.sort(al,pn);
         al.forEach (e -> System.out.println ("First name " + e.getFirstName () + " Page numbers " + e.pageNumber));
                
      //          al.stream().forEach(a -> System.out.println(a));
    }
}
