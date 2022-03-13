package Comparable_Comparator.Comparator_lambda;

import java.util.*;
import java.util.stream.Collectors;

public class ComparatorDemo {

    public static void main(String[] args) {
        int[] array = {142, 55, 142, 75, 89};

        ArrayList<String> list = new ArrayList<> ();
        list.add ("Delhy");
        list.add ("Colcata");
        list.add ("Delhy");
        list.add ("Colcata");
        list.add ("Hyderabad");
        list.add ("Colcata");

        //filter list
        List<String> strings = list.stream ().filter (x -> x.contains ("e")).distinct ().sorted ().collect (Collectors.toList ());

        List<Person> listPerson = Person.createRoster ();

        //Comparator byAge using lambda------------------------------------------------------------------
        Comparator<Person> ageComparator = (person1, person2) -> {
            if (person1.getAge () < person2.getAge ()) {
                return -1;
            } else if (person1.getAge () > person2.getAge ()) {
                return 1;
            }
            return 0;
        };

        //Comparator by name
        Comparator<Person> nameComparator = new Comparator<Person> () {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.getName ().compareTo (person2.getName ());
            }
        };

        Collections.sort (listPerson, ageComparator);
        Collections.sort(listPerson,nameComparator);

        ListIterator<Person> lItr = listPerson.listIterator ();

        while (lItr.hasNext ()) {
            System.out.println (" " + lItr.next ().getAge ());
        }


    }

}
