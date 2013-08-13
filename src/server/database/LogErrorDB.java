/**
 * 
 */
package server.database;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.LogError;

/**
 * @author Derek Carr
 *
 */
public class LogErrorDB {

	private Database db;
	
	/**
	 * 
	 */
	public LogErrorDB(Database db) {
		this.db = db;
	}

	public void insertLogError(LogError logError) {
		PreparedStatement stmt = null;
		try {
			String sql = "INSERT INTO log_failures(log_queue_id, test_classname, test_name," +
									 "test_time, failure_type, failure_message) values(?, ?, ?, ?, ? ,?)";
			stmt = db.getConnection().prepareStatement(sql);
			
			stmt.setInt(1, logError.getLogQueueId());
			stmt.setString(2, logError.getTestClassname());
			stmt.setString(3, logError.getTestName());
			stmt.setDouble(4, logError.getTime());
			stmt.setString(5, logError.getErrorType());
			stmt.setString(6, logError.getErrorMessage());
			
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
