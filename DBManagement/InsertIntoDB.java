package DBManagement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertIntoDB {

	public static void insData(String dname, int dnr) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = new ConnectToDB().getDbCon();
			stmt = conn.createStatement();
			String dep = "INSERT INTO DEPARTMENTS" + "(DEPARTMENT_NAME,DEPARTMENT_ID)" + "VALUES" + "('" + dname
					+ "', '" + dnr + "')";
			stmt.executeUpdate(dep);
		} finally {
			if (stmt != null)
				stmt.close();
		}
	}
}
