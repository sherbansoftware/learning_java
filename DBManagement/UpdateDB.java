package DBManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDB {

	public static void UpdateData(String name, int in) throws SQLException {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = new ConnectToDB().getDbCon();
			pstmt = conn.prepareStatement("UPDATE DEPARTMENTS " + "SET DEPARTMENT_NAME = ? " 
					+ "WHERE DEPARTMENT_ID = ? ");

			pstmt.setString(1, name);
			pstmt.setInt(2, in);
			pstmt.executeUpdate();

		} finally {
			if (pstmt != null)
				pstmt.close();
		}
	}

}
