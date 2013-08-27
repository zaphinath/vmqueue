/**
 * 
 */
package server.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;


/**
 * @author Derek Carr
 *
 */
public class SubTestDB {

	private Database db;
	
	/**
	 * 
	 */
	public SubTestDB(Database db) {
		this.db = db;
	}
	
	public int getSubTestId(String subTest) {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int id = 0;
		try {
			String sql = "SELECT id FROM vm_subtests WHERE name = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setString(1, subTest);
			
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
	
	public void updateNumTestCases(int numberCases, int sTestId) {
		PreparedStatement stmt = null;
		try { 
			String sql = "UPDATE vm_subtests SET num_testcases = ? WHERE id = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setInt(1, numberCases);
			stmt.setInt(2, sTestId);
			stmt.executeUpdate();
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
		}
	}

}
