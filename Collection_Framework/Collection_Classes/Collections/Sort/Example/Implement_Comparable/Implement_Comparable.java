package Collection_Framework.Collection_Classes.Collections.Sort.Example.Implement_Comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Implement_Comparable {
    public static void main(String[] args) {

        // sort an Integer object list which Implement Comparable and sort list using natural sort order
        List<Integer> li = Arrays.asList(33, 14, 2, 666, 877);

        Collections.sort(li);
        System.out.println(li);

    }

}
