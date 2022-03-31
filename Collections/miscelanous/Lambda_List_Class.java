package Collections.miscelanous;


import Comparable_Comparator.Comparator.Comparator_lambda.ComparatorDemo;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda_List_Class {

	public static void main(String[] args) {
		List<ComparatorDemo.Person> persons = ComparatorDemo.Person.createRoster();
		// persons.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));

		// Comparator<Person> comparator = (h1, h2) ->
		// h1.getName().compareTo(h2.getName());
		// persons.sort((h1, h2) -> h1.getName().compareTo(h2.getName()));
		Comparator<ComparatorDemo.Person> normal = Comparator.comparing(ComparatorDemo.Person::getName).thenComparing(ComparatorDemo.Person::getAge);
		Comparator<ComparatorDemo.Person> reversed = normal.reversed();
		List<ComparatorDemo.Person> processesList = persons.stream().sorted(normal).collect(Collectors.toList());
		Double processed = (double) persons.stream().mapToInt(ComparatorDemo.Person::getAge).average().orElse(0);
		Integer maxAge = persons.stream().mapToInt(ComparatorDemo.Person::getAge).max().orElse(0);
		int number = persons.size();
		for (ComparatorDemo.Person p : processesList) {
			System.out.println(p.getName() + " " + p.getAge());
		}
		System.out.printf("Total number of persons %d%n", number);
		System.out.printf("Average age is: %.2f years.%n", processed);
		System.out.printf("Maximun age is: %d years.", maxAge);
	}

}
