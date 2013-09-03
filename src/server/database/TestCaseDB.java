/**
 * 
 */
package server.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import model.TestCase;

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
	
	public TestCase getTestCase(int testCaseId) {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		TestCase testCase = null;
		try {
			String sql = "SELECT * FROM vm_testcases WHERE id = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setInt(1, testCaseId);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String platform = rs.getString(3);
				Timestamp createdDate = rs.getTimestamp(4);
				Timestamp modifiedDate = rs.getTimestamp(5);
				
				testCase = new TestCase(id, name, platform, createdDate, modifiedDate);
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
		return testCase;
	}
	
	/**
	 * 
	 * @param testCase
	 * @return
	 */
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
