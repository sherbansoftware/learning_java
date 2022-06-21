package Miscelanous;

import java.util.ArrayList;


/*                                              Generics classes

    A class is generic if it declares one or more type variables.

    Type variables
        are known as the type parameters of the class. The type parameter section follows the class name and is delimited
        by angle brackets.



 */
public class Generics {

	static ArrayList multiplyNumbersBy2(ArrayList numbers) {
		ArrayList result = new ArrayList();

		for (int i = 0; i < numbers.size(); i++) {
			// TYPE CAST is required
			int value = (Integer) numbers.get(i);
			result.add(value * 2);
		}

		return result;
	}

	static void addElement(ArrayList something) {
		something.add(new String("lang/classes/String"));
	}

	public static void main(String[] args) {

		// Older code - Before Java 5
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(6);

		// javac gives warning because multiplyNumbersBy2(ArrayList_) is invoked
		// with a Specific ArrayList_<Integer>
		// and in the method multiplyNumbersBy2 an element is added to ArrayList_
		// com/rithus/generics/Generics.java uses unchecked or unsafe
		// operations.
		// Recompile with -Xlint:unchecked for details.

		System.out.println(multiplyNumbersBy2(numbers));// [10, 12]

		// javac gives warning because addElement(ArrayList_) is invoked with a
		// Specific ArrayList_<Integer>
		// and in the method addElement, an element is added to the list.
		// com/rithus/generics/Generics.java uses unchecked or unsafe
		// operations.
		addElement(numbers);

		// Throws runtime exception - java.lang.ClassCastException
		System.out.println(multiplyNumbersBy2(numbers));

		// New code - After

	}

	// javac -Xlint:unchecked com/rithus/generics/Generics.java
	// com/rithus/generics/Generics.java:14: warning: [unchecked]
	// unchecked call to add(E) as a member of the raw type java.util.ArrayList_
	// result.add(value * 2);
	// ^
	// com/rithus/generics/Generics.java:21: warning: [unchecked]
	// unchecked call to add(E) as a member of the raw type java.util.ArrayList_
	// something.add(new String("String"));
	// ^
	// 2 warnings

}
