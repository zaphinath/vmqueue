/**
 * 
 */
package server.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import model.SubTest;


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
	
	/**
	 * 
	 * @param testCaseId
	 * @return
	 */
	public SubTest getTestCase(int subTestId) {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		SubTest subTest = null;
		try {
			String sql = "SELECT * FROM vm_subtests WHERE id = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setInt(1, subTestId);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				int vmTestCaseId = rs.getInt(2);
				String name = rs.getString(3);
				double timeDevFirefox = rs.getDouble(4);
				double timeMasterFirefox = rs.getDouble(5);
				double timeBetaFirefox = rs.getDouble(6);
				double timeProdFirefox = rs.getDouble(7);
				
				double timeDevChrome = rs.getDouble(8);
				double timeMasterChrome = rs.getDouble(9);
				double timeBetaChrome = rs.getDouble(10);
				double timeProdChrome = rs.getDouble(11);
				
				double timeDevIE = rs.getDouble(12);
				double timeMasterIE = rs.getDouble(13);
				double timeBetaIE = rs.getDouble(14);
				double timeProdIE = rs.getDouble(15); 
				
				int numErrorDevFirefox = rs.getInt(16);
				int numErrorMasterFirefox = rs.getInt(17);
				int numErrorBetaFirefox = rs.getInt(18);
				int numErrorProdFirefox = rs.getInt(19);
				
				int numErrorDevChrome = rs.getInt(20);
				int numErrorMasterChrome = rs.getInt(21);
				int numErrorBetaChrome = rs.getInt(21);
				int numErrorProdChrome = rs.getInt(22);
				
				int numErrorDevIE = rs.getInt(23);
				int numErrorMasterIE = rs.getInt(24);
				int numErrorBetaIE = rs.getInt(25);
				int numErrorProdIE = rs.getInt(26);
				
				int numFailureDevFirefox = rs.getInt(27);
				int numFailureMasterFirefox = rs.getInt(28);
				int numFailureBetaFirefox = rs.getInt(29);
				int numFailureProdFirefox = rs.getInt(30);
				
				int numFailureDevChrome = rs.getInt(31);
				int numFailureMasterChrome = rs.getInt(32);
				int numFailureBetaChrome = rs.getInt(33);
				int numFailureProdChrome = rs.getInt(34);
				
				int numFailureDevIE = rs.getInt(35);
				int numFailureMasterIE = rs.getInt(36);
				int numFailureBetaIE = rs.getInt(37);
				int numFailureProdIE = rs.getInt(38);
				
				int numberTests = rs.getInt(39);
				Timestamp createdDate = rs.getTimestamp(40);
				Timestamp modifiedDate = rs.getTimestamp(41);
				
				subTest = new SubTest(id, vmTestCaseId, name, timeDevFirefox, timeMasterFirefox, timeBetaFirefox, timeProdFirefox,
						timeDevChrome, timeMasterChrome, timeBetaChrome, timeProdChrome, timeDevIE, timeMasterIE, timeBetaIE, timeProdIE,
						numErrorDevFirefox, numErrorMasterFirefox, numErrorBetaFirefox, numErrorProdFirefox, numErrorDevChrome, numErrorMasterChrome,
						numErrorBetaChrome, numErrorProdChrome, numErrorDevIE, numErrorMasterIE, numErrorBetaIE, numErrorProdIE, numFailureDevFirefox,
						numFailureMasterFirefox, numFailureBetaFirefox, numFailureProdFirefox, numFailureDevChrome, numFailureMasterChrome, 
						numFailureBetaChrome, numFailureProdChrome, numFailureDevIE, numFailureMasterIE, numFailureBetaIE, numFailureProdIE,
						numberTests, createdDate, modifiedDate);
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
		return subTest;
	}
	
	/**
	 * 
	 * @param subTest
	 * @return
	 */
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
