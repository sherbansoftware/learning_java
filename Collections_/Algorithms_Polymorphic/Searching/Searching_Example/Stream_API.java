package Collections_.Algorithms_Polymorphic.Searching.Searching_Example;

import java.util.Arrays;
import java.util.List;

public class Stream_API {

    public static void main(String[] args) {

        List<NCustomer> customers = Arrays.asList (new NCustomer (24, "Jojn"), new NCustomer (32,"Elan"),
                new NCustomer (50, "Jack"));

//        invoke stream() on the list
//        call the filter() method with a proper Predicate
//        call the findAny() construct, which returns the first element that matches the filter

        NCustomer Jack = customers.stream()
                .filter(customer -> "Jack".equals(customer.getName()))
                .findAny()
                .orElse(null);
        System.out.println (Jack.getName ());
    }


   static class NCustomer {

        private int id;
        private String name;

        public NCustomer(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int hashCode() {
            return super.hashCode ();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals (obj);
        }
    }
}
