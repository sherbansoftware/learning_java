package Collections_.miscelanous;


import org.junit.Test;

import java.util.*;


public class Collection_Class {

    private final int INITIAL_CAPACITY = 5;

    @Test
    public void shouldDemArrayList() {
        Collection<String> el = new ArrayList<>(INITIAL_CAPACITY);
        el.add("Platinum");
        el.add("Gold");
        Collection<Integer> collection = new HashSet<>(INITIAL_CAPACITY);
        Collection<Integer> coll = new LinkedHashSet<>(INITIAL_CAPACITY);
        Collection<Integer> vc = new Vector<>(INITIAL_CAPACITY);
        Collection<Integer> co = new TreeSet<>();
        co.add(5);
        co.add(69);
        co.add(597);
        co.add(0);
        // System.out.println(co);
        Collection<Integer> elm = new ArrayList<>();

        for (int i = 0; i < 1e6; i++) {
            elm.add(i);

        }

        Collection<Integer> elements = new LinkedList<>();

        for (int i = 0; i < 1e6; i++) {
            elements.add(i);

        }

        int size = elements.size();

        Object[] objects = elements.toArray();

        for (Object obj : objects) {
            // System.out.println(objects);
        }
        // elements.clear();
        // boolean containsAll=elements.containsAll(el);
        // boolean exist=elements.contains("Platinum");
        // System.out.println(elements);
        // boolean newCol=elements.removeAll(el);
        // System.out.println(elements);
        getColllection("ArrayList_", elm);
        getColllection("LinketList", elements);

    }

    Collection<?> getColllection(String type, Collection<?> c) {

        long startTime = System.currentTimeMillis();
        c.remove(c.size() - 100);

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);

        System.out.println("Type: " + type + " duration: " + duration);
        return c;
    }

}
