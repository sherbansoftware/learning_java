package lang.classes.String.String_Formatting;


/*                                                      Java String format()


    ○ The java string format() method returns the formatted string by given

                   * locale,

                   * format

                   * and arguments.

    ○ If you don't specify the locale in String.format() method,

                  * it uses default locale by calling Locale.getDefault() method.

    ○ The format() method of java language is like

                  * sprintf() function in c language

                  * and printf() method of java language.


                                                        Signature


    ○ There are two type of string format() method:


                   * public static String format(String format, Object... args)


                   * public static String format(Locale locale, String format, Object... args)


                                                       Parameters


    locale : specifies the locale to be applied on the format() method.

    format : format of the string.

    args : arguments for the format string. It may be zero or more.


                                                         Returns


    ○ formatted string


                                                         Throws


    NullPointerException : if format is null.

    IllegalFormatException : if format is illegal or incompatible.


    Format Specifier	                     Data Type	                                      Output


         %a	                           floating point (except BigDecimal)	       Returns Hex output of floating point number.

         %b	                                 Any type	                            "true" if non-null, "false" if null

         %c	                                 character	                                    Unicode character

         %d	                         integer (incl. byte, short, int, long, bigint)	          Decimal Integer

         %e	                                 floating point	                            decimal number in scientific notation

         %f	                                  floating point	                                    decimal number

         %g	                                  floating point	                                     decimal number,
                                                                                           possibly in scientific notation depending
                                                                                           on the precision and value.

         %h	                                   any type	                                    Hex String of value from hashCode() method.

         %n                                      none	                                      Platform-specific line separator.

         %o	                        integer (incl. byte, short, int, long, bigint)	                         Octal number

         %s	                                     any type	                                                  String value

         %t	                                Date/Time (incl. long, Calendar, Date and
                                            TemporalAccessor)	                                               %t is the prefix for
                                                                                              Date/Time conversions. More formatting flags
                                                                                              are needed after this. See Date/Time
                                                                                              conversion below.

         %x	                              integer (incl. byte, short, int,
                                              long, bigint)	                                                  Hex string.

 */

public class String_formatting_ {

    public static void main(String args[]) {

        String str1 = String.format("%d", 101);          // Integer value
        String str2 = String.format("%s", "Amar Singh"); // String value
        String str3 = String.format("%f", 101.00);       // Float value
        String str4 = String.format("%x", 101);          // Hexadecimal value
        String str5 = String.format("%c", 'c');          // Char value
        String sf2 = String.format("value is %f", 32.33434); // Floating point value
        String sf3 = String.format("value is %32.12f", 32.33434);//returns 12 char fractional part filling with 0
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(sf2);
        System.out.println(sf3);

        //Apart from formatting, we can set width, padding etc. of any value. Let us see an example where we are setting
        // width and padding for an integer value.

        String str6 = String.format("%d", 101);
        String str7 = String.format("|%10d|", 101);  // Specifying length of integer
        String str8 = String.format("|%-10d|", 101); // Left-justifying within the specified width
        String str9 = String.format("|% d|", 101);
        String str10 = String.format("|%010d|", 101); // Filling with zeroes
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);
        System.out.println(str9);
        System.out.println(str10);

        System.out.println("===================================================================================");

        //  using  \t (tab)  and \n (new line)

        System.out.print("Some text\tThat was a tab.\n This is new line");


                        //  using System.out.printf();  method

        System.out.printf("\nTotal cost is %d", 6);  // integer value
        System.out.printf("\nTotal cost is %d; quantity is %d ; %d ", 8, 99, 66);  // multiple integer value

        for (int i = 0; i < 20; i++) {

             // System.out.println(i + " is first number");
            System.out.printf("\n %2d  is the number", i); // there is better alignment
        }

                                        // string formatting

        System.out.printf("\n-- %2s --", "some text");

                                       // floating point formatting values  (very usefull)

        System.out.printf("\nThis is nice number: %.2f", 0.3647651984 );


    }
}
