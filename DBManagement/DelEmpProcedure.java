package DBManagement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class DelEmpProcedure {

	public static void del_emp(int e) throws SQLException {
		Connection conn = null;

		conn = new ConnectToDB().getDbCon();
		CallableStatement cst = conn.prepareCall("{CALL del_dep(?)}");
		cst.setInt(1, e);
		cst.execute();
		cst.close();
		conn.close();
	}
}
