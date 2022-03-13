package Scanner.WW_Doc;

// https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html


import java.util.Scanner;

class Scanner_RT {
    Scanner input;
}


/*    public final class Scanner
extends Object
implements Iterator_Interface<String>, Closeable
A simple text scanner which can parse primitive types and strings using regular expressions.
A Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace. The resulting tokens may then be converted into values of different types using the various next methods.

For example, this code allows a user to read a number from System.in:


     Scanner sc = new Scanner(System.in);
     int i = sc.nextInt();

As another example, this code allows long types to be assigned from entries in a file myNumbers:


      Scanner sc = new Scanner(new File("myNumbers"));
      while (sc.hasNextLong()) {
          long aLong = sc.nextLong();
      }

The scanner can also use delimiters other than whitespace. This example reads several items in from a string:


     String input = "1 fish 2 fish red fish blue fish";
     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
     System.out.println(s.nextInt());
     System.out.println(s.nextInt());
     System.out.println(s.next());
     System.out.println(s.next());
     s.close();

prints the following output:


     1
     2
     red
     blue

*/