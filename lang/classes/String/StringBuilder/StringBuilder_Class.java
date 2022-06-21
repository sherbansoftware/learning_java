package lang.classes.String.StringBuilder;


/*                                                 StringBuilder

    ○ The StringBuilder in Java represents a mutable sequence of characters.

       Since the String Class in Java creates an immutable sequence of characters,

                   * the StringBuilder class provides an alternative to String Class,

           as it creates a mutable sequence of characters.

    ○ The function of StringBuilder is very much SIMILAR to the StringBuffer class,

                   * as both of them provide an alternative to String Class by making a MUTABLE sequence of characters.

    ○ However, the StringBuilder class differs from the StringBuffer class on the basis of synchronization.

                  * The StringBuilder class provides NO GUARANTEE of SYNCHRONIZATION

          whereas the StringBuffer class does.

      Therefore, this class is designed for use as a drop-in replacement for StringBuffer in places where the StringBuffer
          was being used by a single thread (as is generally the case).

    ○ Where possible,

                 * it is recommended that this class be used in preference to StringBuffer

                 * as it will be faster under most implementations.

          Instance of StringBuilder are not safe for use by multiple threads.
              If such synchronization is required then it is recommended that StringBuffer be used.

 */

    public class StringBuilder_Class {

        public static void main(String[] argv)throws Exception {

            // create a StringBuilder object
            // using StringBuilder() constructor
            StringBuilder str
                    = new StringBuilder();

            str.append("GFG");

            // print string
            System.out.println("String = "
                    + str.toString());

            // create a StringBuilder object
            // using StringBuilder(CharSequence) constructor
            StringBuilder str1
                    = new StringBuilder("AAAABBBCCCC");

            // print string
            System.out.println("String1 = "
                    + str1.toString());

            // create a StringBuilder object
            // using StringBuilder(capacity) constructor
            StringBuilder str2
                    = new StringBuilder(10);

            // print string
            System.out.println("String2 capacity = "
                    + str2.capacity());

            // create a StringBuilder object
            // using StringBuilder(String) constructor
            StringBuilder str3
                    = new StringBuilder(str1.toString());

            // print string
            System.out.println("String3 = "
                    + str3.toString());
            System.out.println("=====================================================================================");

            // inefficient
//        String info = "";
//
//        info += "My name is Bob.";
//        info += "";
//        info += "I am a builder";
//        System.out.println(info);

            // use StringBuilder
            StringBuilder sb = new StringBuilder();
            sb.append("My name is Chris.")
                    .append(" ")
                    .append("I'm a lion tamer");

            System.out.println(sb);

        }
    }

