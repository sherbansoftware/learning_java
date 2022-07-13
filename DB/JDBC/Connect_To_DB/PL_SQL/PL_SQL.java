package DB.JDBC.Connect_To_DB.PL_SQL;

// https://www.javatpoint.com/steps-to-connect-to-the-database-in-java



/*                       5 steps to connect any java application with the database using JDBC.


            * Register the Driver class

            * Create connection

            * Create statement

            * Execute queries

            * Close connection


                                                NOTE


            * Since Java 7, JDBC has ability to use

                  try-with-resources statement to automatically close resources of type

                              * Connection,

                              * ResultSet,

                              * and Statement.

 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PL_SQL {
    public static void main(String args[]) {
        try {
//step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

//step2 create  the connection object
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

//step3 create the statement object
            Statement stmt = con.createStatement();

//step4 execute query
            ResultSet rs = stmt.executeQuery("select * from emp");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

//step5 close the connection object
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
