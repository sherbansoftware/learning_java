package DBManagement;

import java.sql.SQLException;

public class TestDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ConnectToDB cdb = new ConnectToDB();

		cdb.getDepName();
		// UpdateDB.UpdateData("Financial",65);
		// DeleteFromDB.delFromDB(5);
		// InsertIntoDB.insData("Financial", 5);
		// DelEmpProcedure.del_emp(11);
		int i = 0;
		 InsertDep.insertDep(i, "bbbbb", 1, 1);
	}

}
