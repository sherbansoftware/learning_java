package DBManagement;

import java.sql.*;

public class ConnectToDB {

	String username = "c##sps1";
	String password = "1364";

	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

	public void getDepName() throws SQLException, ClassNotFoundException {

		Class.forName(JDBC_DRIVER);
		Statement stm = (Statement) getDbCon().createStatement();

		ResultSet rs = stm.executeQuery("SELECT  DEPARTMENT_ID,DEPARTMENT_NAME FROM DEPARTMENTS order by 1");

		while (rs.next()) {
			Integer nd = rs.getInt("DEPARTMENT_ID");
			String s = rs.getString("DEPARTMENT_NAME");
			System.out.println(nd + " Dep Name: " + s);
		}
	}

	public Connection getDbCon() throws SQLException {
		Connection conn = DriverManager.getConnection(DB_URL, username, password);
		return conn;
	}
}
