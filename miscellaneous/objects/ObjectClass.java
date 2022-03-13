package miscellaneous.objects;

/*
 * An object is a class instance or an array  The reference values (often just references) are pointers to these objects, and a
special null reference, which refers to no object.
ATest.A class instance is explicitly created by a class instance creation expression (�15.9).
An array is explicitly created by an array creation expression (�15.10.1).
ATest.A new class instance is implicitly created when the string concatenation operator +
(�15.18.1) is used in a non-constant expression (�15.28), resulting in a new object
of type String (�4.3.3).
ATest.A new array object is implicitly created when an array initializer expression (�10.6)
is evaluated; this can occur when a class or interface is initialized (�12.4), when
a new instance of a class is created (�15.9), or when a local variable declaration
statement is executed (�14.4).
New objects of the types Boolean, Byte, Short, Character, Integer, Long, Float,
and Double may be implicitly created by boxing conversion (�5.1.7).

 * */
 

public class ObjectClass {

	public static void main(String[] args) {
		/*
		 * ATest.A Point is explicitly created using newInstance:
		 */
		Points p = null;
		try {
			p = (Points) Class.forName("miscellaneous.objects.Points").newInstance();
					// System.out.println(Points.origin);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		

	}
}
