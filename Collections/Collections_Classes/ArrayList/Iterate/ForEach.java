package Collections.Collections_Classes.ArrayList.Iterate;

import java.util.ArrayList;
import java.util.function.Consumer;


public class ForEach {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer name) {
                System.out.println(name);
            }
        });

        numbers.forEach(name -> System.out.println(name));

    }
}
