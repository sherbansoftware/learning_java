package Collection.Collection_Iteration.forEach.Example;

// https://www.baeldung.com/foreach-java

/*                                                             forEach

    Introduced in Java 8, the forEach loop provides programmers with a new, concise and interesting way to iterate over a collection.

                                                                 Basics of forEach

    In Java, the Collection interface has Iterable as its super interface. And this interface has a new API starting with Java 8:

             void forEach(Consumer<? super T> action)

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;


public class forEach {

    public static void main(String[] args) {

        List<String> listNames = new ArrayList<String>();
        listNames.add("John");
        listNames.add("Anne");
        listNames.add("Bob");
        listNames.add("Chris");
        Collections.synchronizedList(listNames);
        // Using the forEach Method
        Consumer<String> printConsumer = new Consumer<String>() {
            public void accept(String name) {
                System.out.println(name);
            }
        };
     //   listNames.forEach(printConsumer);

        // using lambda expressions
        // (argument) -> { //body } if is one parameter is not necessary any parenthesis

//Exception in thread "main" java.util.ConcurrentModificationException
// Must use CopyToWriteArrayList

//        listNames.forEach(name -> {
//            if (name == "John") {
//               listNames.clear();
//            }
//            System.out.println(name);
//        });
//        System.out.println(listNames);

    }
}
