package String.WW_Doc;

// https://docs.oracle.com/javase/8/docs/api/java/lang/String.html

class String_RT {
    String str;
}


/*     public final class String extends Object implements Serializable, Comparable<String>, CharSequence


    The String class represents character strings. All string literals in Java programs, such as "abc", are implemented
        as instances of this class.
    Strings are constant; their values cannot be changed after they are created. String buffers support mutable strings.
        Because String objects are immutable they can be shared. For example:

            String str = "abc";

              is equivalent to:

           char data[] = {'a', 'b', 'c'};
           String str = new String(data);

    Here are some more examples of how strings can be used:

          System.out.println("abc");
          String cde = "cde";
          System.out.println("abc" + cde);
          String c = "abc".substring(2,3);
          String d = cde.substring(1, 2);

    The class String includes methods

        for examining individual characters of the sequence,
        for comparing strings, for searching strings,
        for extracting substrings, and
        for creating a copy of a string with all characters translated to uppercase or to lowercase.

    Case mapping is based on the Unicode Standard version specified by the Character class.

    The Java language provides special support for the string concatenation operator ( + ), and for conversion of other
        objects to strings. String concatenation is implemented through the StringBuilder(or StringBuffer) class and its
        append method. String conversions are implemented through the method toString, defined by Object and inherited
        by all classes in Java. For additional information on string concatenation and conversion, see Gosling, Joy, and
        Steele, The Java Language Specification.

    Unless otherwise noted, passing a null argument to a constructor or method in this class will cause a NullPointerException
        to be thrown.

    A String represents a string in the UTF-16 format in which supplementary characters are represented by surrogate pairs
        (see the section Unicode Character Representations in the Character class for more information).
    Index values refer to char code units, so a supplementary character uses two positions in a String.

    The String class provides methods for dealing with Unicode code points (i.e., characters), in addition to those for
        dealing with Unicode code units (i.e., char values).

    Since:
        JDK1.0

    See Also:
        Object.toString(), StringBuffer, StringBuilder, Charset, Serialized Form


               String(immutable class)

    Value of a String lang.classes.Object once created cannot be	modified.
    Any	modification on	a String object	creates	a new String object

                                  Where	are	string values stored in	memory?

    Approach 1:

    In the example	below we are directly referencing a	String	literal.

        String	str1 =	"value";

    This value will be stored	in a:

    	"String	constant pool"	– which	is inside the Heap memory. --------------------------------------------------

    If compiler finds a String literal,it checks if	it	exists	in	the	pool. If it	exists,	it is reused.
          String str5 =	"value";

        In	above example, when	str5 is	created	- the	existing	value	from	String	Constant Pool is reused.

    Approach 2:

        However, if	new	operator is	used to	create	string	object,	the	new	object is created on the heap. There
        will not	be	any	reuse	of	values.
    String lang.classes.Object	- created	on	the	heap

        String val = "value one";
        String val1 = "value one";
            System.out.println (val == val1); //true because val1 reuse val 2
            System.out.println (val.equals (val1)); // true same reason

        String fo = new String("Different object");
        String fo1 = new String("Different object");

            System.out.println (fo == fo1);  // false

            System.out.println (fo.equals (fo1));  // true

             Compares this string to the specified object.  The result is {@code
             true} if and only if the argument is not {@code null} and is a {@code
             String} object that represents the same sequence of characters as this
             object.

                               What	are	differences	between	String and StringBuffer?

     String are immutable.
       
     StringBuffer
         is used to represent values that can be modified.
         In situations where values	are	modified a number to times, StringBuffer yields	significant performance	benefits.
     Both
     	 String	and	StringBuffer are thread-safe.
    StringBuffer is	implemented	by using synchronized keyword on all methods.

                              What are differences between StringBuilder and StringBuffer?

    StringBuilder
    	is	not	thread	safe.
    	So,	it	performs better	in	situations	where thread safety	is	not	required.

    RELATED

*/