package Map.Concurent_Map_Class.ConcurentHashMap.Example;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();
        map.put(0, "Basics");
        map.put(1, "Strong");
        map.put(0, "Tech");
        System.out.println(map);
        //map.remove(1);

        // Methods of Concurrent Map

        // V putIfAbsent(K key, V value);
        map.putIfAbsent(0, "Hello");
        System.out.println(map);

        // boolean remove(Object key, Object value);
        map.remove(1, "Strong");
        System.out.println(map);

        // boolean replace(K key, V oldValue, V newValue);
        map.replace(0, "Wrong", "Know");
        System.out.println(map);

        // V replace(K key, V value);
        map.replace(0, "BasicsStrong");
        //System.out.println(map.replace(0,"BasicsStrong"));
        System.out.println(map);
        //System.out.println(map.replace(3,"BasicsStrong"));

    }

}

