package Collections_.Algorithms_Polymorphic.Searching.Searching_Example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Looping_Search {

    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList (new Customer (24, "Jojn"), new Customer (32,"Elan"),
                new Customer (50, "Jack"));

        System.out.println (findUsingEnhancedForLoop("Jack",customers).getName ());
    }


    // traverse list using enhanced for loop-----------------------------------------------------------------------------------------
    public static Customer findUsingEnhancedForLoop(String name, List<Customer> customers) {

        for (Customer customer : customers) {
            if (customer.getName ().equals (name)) {
                return customer;
            }
        }
        return null;
    }

    // Looping with an iterator ---------------------------------------------------------------------------------------
    public Customer findUsingIterator(
            String name, List<Customer> customers) {
        Iterator<Customer> iterator = customers.iterator ();
        while (iterator.hasNext ()) {
            Customer customer = iterator.next ();
            if (customer.getName ().equals (name)) {
                return customer;
            }
        }
        return null;
    }
}

class Customer {

    private int id;
    private String name;

    public Customer(int id, String name) {
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