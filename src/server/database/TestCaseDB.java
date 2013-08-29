/**
 * 
 */
package server.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Derek Carr
 *
 */
public class TestCaseDB {

	private Database db;
	/**
	 * 
	 */
	public TestCaseDB(Database db) {
		this.db = db;
	}
	
	
	public int getTestCaseId(String testCase) {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int id = 0;
		try {
			String sql = "SELECT id FROM vm_testcases WHERE name = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setString(1, testCase);
			
			rs = stmt.executeQuery();
			while(rs.next()) {
				id = rs.getInt("id");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return id;
	}

}
