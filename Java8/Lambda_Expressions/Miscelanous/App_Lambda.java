package Java8.Lambda_Expressions.Miscelanous;

import Comparable_Comparator.Comparator_lambda.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App_Lambda {

	public static void main(String[] args) {

		List<Person> roster = Person.createRoster();

		// RosterTest.printPersonsOlderThan(roster, 20);
		// RosterTest.printPersonsWithinAgeRange(roster, 18, 45);
		/*
		 * CheckPerson tester = new CheckPerson() { public boolean test(Person p) {
		 * return p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <=
		 * 20; } };
		 */
		/*
		 * RosterTest.printPersons(roster, p -> p.getGender() == Person.Sex.MALE &&
		 * p.getAge() >= 18 && p.getAge() <= 25);
		 */

		/*
		 * RosterTest.processPersonsWithFunction(roster, p -> p.getGender() ==
		 * Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25, p ->
		 * p.getEmailAddress(), email -> System.out.println(email));
		 */
		/*
		RosterTest.processPersons(roster, p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25,
				p -> p.printPerson());

		roster.stream().filter(p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25)
				.map(p -> p.getEmailAddress()).forEach(email -> System.out.println(email));
		double average = roster.stream().filter(p -> p.getGender() == Person.Sex.MALE).mapToInt(Person::getAge)
				.average().getAsDouble();
		System.out.printf("Males's medium age is: %.1f years.\n", average);
		List<String> namesOfMaleMembersCollect = roster.stream().filter(p -> p.getGender() == Person.Sex.MALE)
				.map(p -> p.getName()).sorted().collect(Collectors.toList());
		System.out.println(namesOfMaleMembersCollect);*/
		
		Comparator<Person> nameComparator = (h1, h2) -> h1.getName().compareTo(h2.getName());
		Map<Person.Sex, List<Person>> byAge =
			        roster
			        .stream()
			        .sorted(nameComparator)
			        .collect(Collectors.groupingBy(Person::getGender));
		
		for(Map.Entry<Person.Sex, List<Person>> es:byAge.entrySet()) {
			
		
			System.out.println(es.getKey() + " " + es.getValue());
		}
		
		
	     
		/*Map<Person.Sex, List<String>> namesByGender =
			    roster
			        .stream()
			        .sorted(nameComparator)
			        .collect(
			            Collectors.groupingBy(
			                Person::getGender,                      
			                Collectors.mapping(
			                    Person::getName,
			                    Collectors.toList())));
		
		System.out.println(namesByGender);*/
	}
}
