package DB.JDBC.Connect_To_DB.My_SQL.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Prepared_Statement {
    public static void main(String args[]) {

        int id = 0;
        String firstName = "";
        String lastName = "";
        String email = "";

        Customer customer = new Customer(id, firstName, lastName, email);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC", "springstudent",
                    "springstudent");

            PreparedStatement pst = con.prepareStatement("SELECT * FROM web_customer_tracker.customer where first_name =?");
            pst.setString(1, "Mary");
            ResultSet rs = pst.executeQuery();

            if (rs.next())
            customer.setId(rs.getInt(1));
            customer.setFirstName(rs.getString(2));
            customer.setLastName(rs.getString(3));
            customer.setEmail(rs.getString(4));

            //     System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(customer);
    }

}
