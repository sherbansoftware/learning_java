package DBManagement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteFromDB {

	public static void delFromDB(int in) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = new ConnectToDB().getDbCon();
			stmt = conn.createStatement();
			String sql = "DELETE FROM DEPARTMENTS " + "WHERE DEPARTMENT_ID ='"+ in +"'";
			stmt.executeUpdate(sql);
		
		} finally {
			if (stmt != null)
				stmt.close();
		}
	}
}
