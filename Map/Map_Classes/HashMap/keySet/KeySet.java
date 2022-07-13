package Map.Map_Classes.HashMap.keySet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeySet {

    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Science", 90);
        marks.put("Maths", 80);
        marks.put("English", 80);
        //insertion order is not preserved

      Set<String> keySet = marks.keySet();

        System.out.println(keySet);
    }
}
