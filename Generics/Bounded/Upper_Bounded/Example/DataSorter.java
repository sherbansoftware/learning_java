package Generics.Bounded.Upper_Bounded.Example;

import java.util.List;

public class DataSorter<T extends Number> {
    private List<T> list;

    public DataSorter(List<T> list) {
        this.list = list;
    }

    public static <T extends Number> void getSorted(List<T> list) {
        // natural order sorting
        list.sort(null);
        list.forEach(e -> System.out.println(e));
    }
}
