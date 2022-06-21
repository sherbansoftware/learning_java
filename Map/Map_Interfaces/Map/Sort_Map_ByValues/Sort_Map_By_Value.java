package Map.Map_Interfaces.Map.Sort_Map_ByValues;

import java.util.*;

public class Sort_Map_By_Value {

    public static void main(String[] args) {

        Map<String,Category> categories = new HashMap<>();

        categories.put("D", new Category(4,"Muffler"));
        categories.put("B", new Category(2,"Pants"));
        categories.put("C", new Category(3,"Shoes"));
        categories.put("A", new Category(1,"Hat"));

        sortByValue(categories);

    }


    // sort map by values
    public static Map<String, Category> sortByValue(Map<String, Category> map) {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Category>> list = new LinkedList<>(map.entrySet());

        System.out.println(list);
        // Sort the list
        Collections.sort(list, Comparator.comparing(o -> (o.getValue().getCategoryID())));

        // put data from sorted list to hashmap
        HashMap<String, Category> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Category> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        for( Map.Entry<String,Category> entry: temp.entrySet() ) {

            System.out.println(entry.getKey() +" :" +entry.getValue());

        }

        return temp;
    }
}