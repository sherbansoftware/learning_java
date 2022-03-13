package Java8.Method_References;

//https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html

/*                                          Method References

    There are four kinds of method references:

Kind	                                                                                Example

Reference to a static method	                                                    ContainingClass::staticMethodName

Reference to an instance method of a particular object	                            containingObject::instanceMethodName

Reference to an instance method of an arbitrary object of a particular type	        ContainingType::methodName

Reference to a constructor	ClassName::new

    Reference to a Static Method ---------------------------------------------------------------------------------------

        The method reference Person::compareByAge is a reference to a static method.

    Reference to an Instance Method of a Particular lang.classes.Object -------------------------------------------------------------
        The following is an example of a reference to an instance method of a particular object:

            class ComparisonProvider {
                public int compareByName(Person a, Person b) {
                    return a.getName().compareTo(b.getName());
                }

                public int compareByAge(Person a, Person b) {
                    return a.getBirthday().compareTo(b.getBirthday());
                }
                }

        ComparisonProvider myComparisonProvider = new ComparisonProvider();
        Arrays.sort(rosterAsArray, myComparisonProvider::compareByName);
        The method reference myComparisonProvider::compareByName invokes the method compareByName that is part of the
        object myComparisonProvider. The JRE infers the method type arguments, which in this case are (Person, Person).

    Reference to an Instance Method of an Arbitrary lang.classes.Object of a Particular Type ----------------------------------------

        The following is an example of a reference to an instance method of an arbitrary object of a particular type:

           String[] stringArray = { "Barbara", "James", "Mary", "John",
           "Patricia", "Robert", "Michael", "Linda" };
            Arrays.sort(stringArray, String::compareToIgnoreCase);
        The equivalent lambda expression for the method reference String::compareToIgnoreCase would have the formal
        parameter list (String a, String b), where a and b are arbitrary names used to better describe this example.
        The method reference would invoke the method a.compareToIgnoreCase(b).

    Reference to a Constructor -----------------------------------------------------------------------------------------

        You can reference a constructor in the same way as a static method by using the name new. The following method
        copies elements from one collection to another:

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



*/