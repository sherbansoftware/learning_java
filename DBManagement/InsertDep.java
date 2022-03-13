package DBManagement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class InsertDep {
	public static void insertDep(Integer id, String dep_name, int mgr_id, int loc_id) throws SQLException {
		Connection conn = null;

		conn = new ConnectToDB().getDbCon();
		CallableStatement cst = conn.prepareCall("{CALL add_dep(?,?,?,?)}");
		cst.setInt(1, id);
		cst.setString(2, dep_name);
		cst.setInt(3, mgr_id);
		cst.setInt(4, loc_id);

		cst.execute();
		cst.close();
		conn.close();
	}
}
