package References.Immutable_List;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Escaping reference

public class CustomerRecords implements Iterable<Customer> {
    private Map<String, Customer> records;

    public CustomerRecords() {
        this.records = new HashMap<> ();
    }

    public void addCustomer(Customer c) {
        this.records.put (c.getName (), c);
    }


    // we shouldn't can access and modify original map

    // creating a new map is not elegant
//    public Map<String, Customer> getCustomers() {
//        return new HashMap<> (this.records);
//    }

    // this copy of the map is not editable will throw an exception UnsupportedOperationException
    public Map<String, Customer> getCustomers() {
        return Collections.unmodifiableMap (this.records);
    }

    @Override
    public Iterator<Customer> iterator() {
        return records.values ().iterator ();
    }

    //use copy constructor to create a new Costumer

    public Customer getCustomerByName(String name) {
        return new Customer(this.records.get (name));
    }
}
