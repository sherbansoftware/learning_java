package JNDI.Example;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// https://knpcode.com/java/apache-dbcp-connection-pooling-java-example/

public class Apache_DBCP_Connection_Pooling {

    public static void main(String[] args) {
        Apache_DBCP_Connection_Pooling dsDemo = new Apache_DBCP_Connection_Pooling();
        dsDemo.displayEmployeeById(16);
    }

    private void displayEmployeeById(int id) {
        Connection connection = null;
        String selectSQL = "SELECT * FROM EMPLOYEE WHERE id = ?";
        PreparedStatement prepStmt = null;
        try {
            DataSource ds = DSCreator.getDataSource();
            connection = ds.getConnection();
            prepStmt = connection.prepareStatement(selectSQL);
            prepStmt.setInt(1, id);
            ResultSet rs = prepStmt.executeQuery();
            while (rs.next()) {
                System.out.println("id: " + rs.getInt("id"));
                System.out.println("First Name: " + rs.getString("FIRST_NAME"));
                System.out.println("Last Name: " + rs.getString("LAST_NAME"));
                System.out.println("Department: " + rs.getString("DEPARTMENT"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}

