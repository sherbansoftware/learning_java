package Map.Map_Classes.TreeMap_and_Unmodifiable_Map.SimpleExample;

import java.util.Comparator;

public class MySorting implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }

}
