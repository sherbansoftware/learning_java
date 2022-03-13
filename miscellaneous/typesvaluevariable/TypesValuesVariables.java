package miscellaneous.typesvaluevariable;

public class TypesValuesVariables {

	
	/*
	 * The types of the Java programming language are divided into two categories:
	 * primitive types and reference types. The primitive types (§4.2) are the
	 * boolean type and the numeric types. The numeric types are the integral types
	 * byte, short, int, long, and char, and the floating-point types float and
	 * double. The reference types (§4.3) are class types, interface types, and
	 * array types. There is also a special null type
	 * 
	 * The numeric types are the integral types and the floating-point types. The
	 * integral types are byte, short, int, and long, whose values are 8-bit,
	 * 16-bit, 32-bit and 64-bit signed two's-complement integers, respectively, and
	 * char, whose values are 16-bit unsigned integers representing UTF-16 code
	 * units (§3.1).
	 * 
	 * Integral Types and Values The values of the integral types are integers in
	 * the following ranges:
	 * • For byte, from -128 to 127, inclusive 
	 * • For short,from -32768 to 32767, inclusive
	 * • For int, from -2147483648 to 2147483647, inclusive 
	 * • For long, from -9223372036854775808 to 9223372036854775807,
	 * inclusive • For char, from '\u0000' to '\uffff' inclusive, that is, from 0 to 65535
	 * 
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		

	}


	static class Point {
	    static int numPoints;   // numPoints is a class variable
	    int x, y;               // x and y are instance variables
	    int[] w = new int[10];  // w[0] is an array component
	    int setX(int x) {       // x is a method parameter
	        int oldx = this.x;  // oldx is a local variable
	        this.x = x;
	        return oldx;
	    }
	}
	
}
