package lang.classes.StringBuffer;

// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StringBuffer.html



/*                                            StringBuffer


    ○ A thread-safe, mutable sequence of characters.
      A string buffer is like a  String, but can be modified. At any point in time it contains some particular sequence
         of characters, but the length and content of the sequence can be changed through certain method calls.
 
    ○ String buffers are safe for use by multiple threads. The methods are synchronized where necessary so that all the
         operations on any particular instance behave as if they occur in some serial order that is consistent with the 
         order of the method calls made by each of the individual threads involved.
 
    ○ The principal operations on a  StringBuffer are the

                   * append
                   * insert


    methods, which are overloaded so as to accept data of any type. Each effectively  converts a given datum to a string
    and then appends or inserts the characters of that string to the string buffer. The append method always adds these
    characters at the end of the buffer; the  insert method adds the characters at a specified point.
 
     For example, if  z refers to a string buffer object
         whose current contents are  "start", then
         the method call  z.append("le") would cause the string
         buffer to contain  "startle", whereas
          z.insert(4, "le") would alter the string buffer to
         contain  "starlet".
 
     In general, if sb refers to an instance of a  StringBuffer,
         then  sb.append(x) has the same effect as
          sb.insert(sb.length(), x).
 
    Whenever an operation occurs involving a source sequence (such as
        appending or inserting from a source sequence), this class synchronizes
        only on the string buffer performing the operation, not on the source.
     Note that while  StringBuffer is designed to be safe to use
        concurrently from multiple threads, if the constructor or the
         append or  insert operation is passed a source sequence
        that is shared across threads, the calling code must ensure
        that the operation has a consistent and unchanging view of the source
        sequence for the duration of the operation.
     This could be satisfied by the caller holding a lock during the
         operation's call, by using an immutable source sequence, or by not
         sharing the source sequence across threads.
 
     Every string buffer has a capacity. As long as the length of the
         character sequence contained in the string buffer does not exceed
         the capacity, it is not necessary to allocate a new internal
         buffer array. If the internal buffer overflows, it is
         automatically made larger.
 
     Unless otherwise noted, passing a  null argument to a constructor
         or method in this class will cause a {@link NullPointerException to be
         thrown.
 
     As of  release JDK 5, this class has been supplemented with an equivalent
         class designed for use by a single thread, {@link StringBuilder.  The
          StringBuilder class should generally be used in preference to
         this one, as it supports all of the same operations but it is faster, as
         it performs no synchronization.


                                         What are differences between StringBuilder and StringBuffer?

    StringBuilder
    	is	not	thread	safe.
    	So,	it	performs better	in	situations	where thread safety	is	not	required.



*/

public class StringBuffer_ {
    public static void main(String[] argv)
            throws Exception
    {

        // create a StringBuffer object using StringBuffer() constructor
        StringBuffer str = new StringBuffer();
        str.append("GFG");

        // print string
        System.out.println("String = "  + str.toString());

        // create a StringBuffer object using StringBuffer(CharSequence) constructor
        StringBuffer str1 = new StringBuffer("AAAABBBCCCC");

        // print string
        System.out.println("String1 = "  + str1.toString());

        // create a StringBuffer object using StringBuffer(capacity) constructor
        StringBuffer str2 = new StringBuffer(10);

        // print string
        System.out.println("String2 capacity = " + str2.capacity());

        // create a StringBuffer object using StringBuffer(String) constructor
        StringBuffer str3  = new StringBuffer(str1);

        // print string
        System.out.println("String3 = " + str3);

        System.out.println("=====================================================================================");

        // inefficient
//        String info = "";
//
//        info += "My name is Bob.";
//        info += "";
//        info += "I am a builder";
//        System.out.println(info);

        // use StringBuffer
        StringBuffer sb = new StringBuffer();
        sb.append("My name is Chris.")
        .append(" ")
        .append("I'm a lion tamer");

        System.out.println(sb);

    }
}
