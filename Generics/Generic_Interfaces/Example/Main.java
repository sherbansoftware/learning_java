package Generics.Generic_Interfaces.Example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IData<String> d1 = new Data<>("This is a Generic interface implementation of type String");
        // System.out.println(d1.getData());
        // System.out.println(d1.getClass());

        IData<Integer> d2 = new Data<>(564);

      //  IData[] ids = new IData[]{d1, d2};

        List.of(new IData[]{d1, d2}).forEach(e -> System.out.println(e));
    }
}
