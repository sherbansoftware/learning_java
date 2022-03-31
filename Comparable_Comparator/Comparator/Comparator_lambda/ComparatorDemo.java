package Comparable_Comparator.Comparator.Comparator_lambda;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.*;
import java.util.stream.Collectors;

public class ComparatorDemo {

    public static void main(String[] args) {
        int[] array = {142, 55, 142, 75, 89};

        ArrayList<String> list = new ArrayList<>();
        list.add("Delhy");
        list.add("Colcata");
        list.add("Delhy");
        list.add("Colcata");
        list.add("Hyderabad");
        list.add("Colcata");

        //filter list
        List<String> strings = list.stream().filter(x -> x.contains("e")).distinct().sorted().collect(Collectors.toList());


        List<Person> listPerson = Person.createRoster();

//        //Comparator byAge using lambda------------------------------------------------------------------
//        Comparator<Person> ageComparator = (person1, person2) -> {
//            if (person1.getAge() < person2.getAge()) {
//                return -1;
//            } else if (person1.getAge() > person2.getAge()) {
//                return 1;
//            }
//            return 0;
//        };
//
//        //Comparator by name
//        Comparator<Person> nameComparator = new Comparator<Person>() {
//            @Override
//            public int compare(Person person1, Person person2) {
//                return person1.getName().compareTo(person2.getName());
//            }
//        };

        Collections.sort(listPerson, (p1,p2) -> p1.getName().compareTo(p2.getName()));
        // Collections.sort(listPerson, ageComparator);

//        ListIterator<Person> lItr = listPerson.listIterator();

//        while (lItr.hasNext()) {
//            System.out.println("Sorted name: " + lItr.next().getName() + " age: " + lItr.next().getAge());
//        }

        listPerson.forEach(e -> System.out.println("Name: " + e.getName()));

    }

    public static class Person {

        String name;
        LocalDate birthday;
        Sex gender;
        String emailAddress;

        public enum Sex {
            MALE, FEMALE
        }

        public Person() {
        }

        Person(String nameArg, LocalDate birthdayArg, Sex genderArg, String emailArg) {
            name = nameArg;
            birthday = birthdayArg;
            gender = genderArg;
            emailAddress = emailArg;
        }

        public int getAge() {
            return birthday.until(IsoChronology.INSTANCE.dateNow()).getYears();
        }

        public void printPerson() {
            System.out.println(name + ", " + this.getAge());
        }

        public Sex getGender() {
            return gender;
        }

        public String getName() {
            return name;
        }

        public String getEmailAddress() {
            return emailAddress;
        }

        public LocalDate getBirthday() {
            return birthday;
        }

        public static int compareByAge(Person a, Person b) {
            return a.birthday.compareTo(b.birthday);
        }

        public static List<Person> createRoster() {

            List<Person> roster = new ArrayList<>();
            roster.add(new Person("Fred", IsoChronology.INSTANCE.date(1980, 6, 20), Person.Sex.MALE, "fred@example.com"));
            roster.add(new Person("Jane", IsoChronology.INSTANCE.date(1990, 7, 15), Person.Sex.FEMALE, "jane@example.com"));
            roster.add(new Person("George", IsoChronology.INSTANCE.date(1991, 8, 13), Person.Sex.MALE, "george@example.com"));
            roster.add(new Person("Bob", IsoChronology.INSTANCE.date(2000, 9, 12), Person.Sex.MALE, "bob@example.com"));
            roster.add(new Person("Bob", IsoChronology.INSTANCE.date(1995, 9, 12), Person.Sex.MALE, "bob@example.com"));
            roster.add(new Person("Bob", IsoChronology.INSTANCE.date(1995, 9, 12), Person.Sex.MALE, "bob@example.com"));

            return roster;
        }


    }
}
