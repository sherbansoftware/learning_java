package References.Immutable_List;

public class Main {
    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords ();
        records.addCustomer (new Customer ("John"));
        records.addCustomer (new Customer ("Simon"));
        // records.getCustomers ().clear ();

        for (Customer customer : records.getCustomers ().values ()) {
            System.out.println (customer.getName ());
        }

        Customer cust = records.getCustomerByName ("John");
        cust.setCustomer ("Derek");
        System.out.println ("-----------------------------------");

        for (Customer customer : records.getCustomers ().values ()) {
            System.out.println (customer.getName ());
        }

    }
}
