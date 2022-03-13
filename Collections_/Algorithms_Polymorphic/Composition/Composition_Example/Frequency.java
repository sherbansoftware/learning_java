package Collections_.Algorithms_Polymorphic.Composition.Composition_Example;

/*
     * Returns the number of elements in the specified collection equal to the  specified object.
     *  More formally, returns the number of elements e in the collection such that
     * <tt>(o == null ? e == null : o.equals(e))</tt>.
     *
     * @param c the collection in which to determine the frequency of o.
     * @param o the object whose frequency is to be determined
     * @return the number of elements in {@code c} equal to {@code o}
     * @throws NullPointerException if c is null
     * @since 1.5

public static int frequency(Collection<?> c, lang.classes.Object o) {
        int result = 0;
        if (o == null) {
        for (lang.classes.Object e : c)
        if (e == null)
        result++;
        } else {
        for (lang.classes.Object e : c)
        if (o.equals(e))
        result++;
        }
        return result;
        }
*/

import java.util.ArrayList;
import java.util.Collections;

public class Frequency {
    public static void main(String[] args)
    {
        // Let us create a list with 4 items
        ArrayList<String> list =   new ArrayList<String>();
        list.add("code");
        list.add("code");
        list.add("quiz");
        list.add("code");

        // count the frequency of the word "code"
        System.out.println("The frequency of the word code is: "+
                Collections.frequency(list, "code"));
    }
}
