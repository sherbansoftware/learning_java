package Miscelanous.Miscelanous;


import Comparable_Comparator.Comparator.Comparator_lambda.ComparatorDemo;

import java.util.*;
import java.util.function.Supplier;



public class MethodReferencesTest {
     
    // The method transferElements copies elements from one collection to
    // another
   
    public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>>
        DEST transferElements(
            SOURCE sourceCollection,
            Supplier<DEST> collectionFactory) {
         
            DEST result = collectionFactory.get();
            for (T t : sourceCollection) {
                result.add(t);
            }
            return result;
    }  
       
    public static void main(String... args) {
 
        List<ComparatorDemo.Person> roster = ComparatorDemo.Person.createRoster();
 
        for (ComparatorDemo.Person p : roster) {
            p.printPerson();
        }
      
         
        ComparatorDemo.Person[] rosterAsArray =
            roster.toArray(new ComparatorDemo.Person[roster.size()]);
         
        class PersonAgeComparator
            implements Comparator<ComparatorDemo.Person> {
            public int compare(ComparatorDemo.Person a, ComparatorDemo.Person b) {
                return a.getBirthday().compareTo(b.getBirthday());
            }
        }
         
        // Without method reference
        Arrays.sort(rosterAsArray, new PersonAgeComparator());
         
        // With lambda expression
        Arrays.sort(rosterAsArray,
            (ComparatorDemo.Person a, ComparatorDemo.Person b) -> {
                return a.getBirthday().compareTo(b.getBirthday());
            }
        );
         
        // With method reference
        Arrays.sort(rosterAsArray, ComparatorDemo.Person::compareByAge);
         
        // Reference to an instance method of a particular object
        class ComparisonProvider {
            public int compareByName(ComparatorDemo.Person a,
                                     ComparatorDemo.Person b) {
                return a.getName().compareTo(b.getName());
            }
         
            public int compareByAge(ComparatorDemo.Person a,
                                    ComparatorDemo.Person b) {
                return a.getBirthday().compareTo(b.getBirthday());
            }
        }
        ComparisonProvider myComparisonProvider = new ComparisonProvider();
        Arrays.sort(rosterAsArray, myComparisonProvider::compareByName);
         
        // Reference to an instance method
        // of an arbitrary object of a particular type
         
        String[] stringArray = { "Barbara", "James", "Mary", "John",
            "Patricia", "Robert", "Michael", "Linda" };
        Arrays.sort(stringArray, String::compareToIgnoreCase);
 
        Set<ComparatorDemo.Person> rosterSetLambda =
            transferElements(roster, () -> { return new HashSet<>(); });
         
        Set<ComparatorDemo.Person> rosterSet = transferElements(
            roster, HashSet::new);
        System.out.println("Printing rosterSet:");
        rosterSet.stream().forEach(p -> p.printPerson());
    }
}
