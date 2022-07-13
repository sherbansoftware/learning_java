package Collection_Framework.Concurrent_Collection_Classes.CopyOnWriteArrayList.Example;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    //static ArrayList<String> list = new ArrayList<String>();
    static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();

    public static void main(String[] args) {

        list.add("John");
        list.add(null);
        list.add("Rohn");
        list.add("Harry");
        list.add("Potter");


        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String name = (String) itr.next();
            if ((name).equals("Harry")) {                 // java.lang.NullPointerException if name is first
                System.out.println(name);
               // itr.remove();  // java.lang.UnsupportedOperationException
            }
        }
        System.out.println(list);
    }

}
