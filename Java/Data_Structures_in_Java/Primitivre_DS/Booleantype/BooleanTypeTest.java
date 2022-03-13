package Java.Data_Structures_in_Java.Primitivre_DS.Booleantype;

/*
The boolean type represents a logical quantity with two possible values, indicated
by the literals true and false (�3.10.3).
The boolean operators are:
� The relational operators == and != (�15.21.2)
� The logical complement operator ! (�15.15.6)
� The logical operators &, ^, and | (�15.22.2)
� The conditional-and and conditional-or operators && (�15.23) and || (�15.24)
� The conditional operator ? : (�15.25)
� The string concatenation operator + (�15.18.1), which, when given a String
operand and a boolean operand, will convert the boolean operand to a String
(either "true" or "false"), and then produce a newly created String that is the
concatenation of the two strings
Boolean expressions determine the control flow in several kinds of statements:
� The if statement (�14.9)
� The while statement (�14.12)
� The do statement (�14.13)
� The for statement (�14.14)
ATest.A boolean expression also determines which subexpression is evaluated in the
conditional ? : operator (�15.25).
Only boolean and Boolean expressions can be used in control flow statements and
as the first operand of the conditional operator ? :.
An integer or floating-point expression x can be converted to a boolean value,
following the C language convention that any nonzero value is true, by the
expression x!=0.

An object reference obj can be converted to a boolean value, following the C
language convention that any reference other than null is true, by the expression
obj!=null.
ATest.A boolean value can be converted to a String by string conversion (�5.4).
ATest.A boolean value may be cast to type boolean, Boolean, or lang.classes.Object (�5.5). No other
casts on type boolean are allowed
*/

public class BooleanTypeTest {

	private static boolean state;
	public static void main(String[] args) {
     //state = false;
     String concatString ="This is " + state;
     System.out.println(concatString);

	}

}
