package Miscelanous.Method_References.ArbitraryInstance_Method_Reference;

import java.util.Arrays;
import java.util.List;
/*

Type                   	                   Syntax	                   Method Reference                Lambda expression

Reference to an instance method
of an arbitrary object          	  Class:instanceMethod	            String::toString	            s -> s.toString()
of a particular type*/


public class ArbitraryInstance_Method_Reference {
	
	
	 public static void main(String args[]) {

	        final List<Person> people = Arrays.asList(new Person("dan"), new Person("laura"));

	        // Method reference
	        people.forEach(Person::printName);

	        // Lambda expression
	        people.forEach(person -> person.printName());

	        // normal
	        for (final Person person : people) {
	            person.printName();
	        }
	    }
	    private static class Person {
	        private String name;
	        public Person(final String name) {
	            this.name = name;
	        }

	        public void printName() {
	            System.out.println(name);
	        }
	    }
	}

