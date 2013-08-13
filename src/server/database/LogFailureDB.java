/**
 * 
 */
package server.database;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.LogFailure;

/**
 * @author Derek Carr
 *
 */
public class LogFailureDB {
	private Database db;
	
	/**
	 * 
	 */
	public LogFailureDB(Database db) {
		this.db = db;
	}

	public void insertLogFailure(LogFailure logFailure) {
		PreparedStatement stmt = null;
		try {
			String sql = "INSERT INTO log_failures(log_queue_id, test_classname, test_name," +
									 "test_time, failure_type, failure_message) values(?, ?, ?, ?, ? ,?)";
			stmt = db.getConnection().prepareStatement(sql);
			
			stmt.setInt(1, logFailure.getLogQueueId());
			stmt.setString(2, logFailure.getClassName());
			stmt.setString(3, logFailure.getTestName());
			stmt.setDouble(4, logFailure.getTime());
			stmt.setString(5, logFailure.getFailureType());
			stmt.setString(6, logFailure.getFailureMessage());
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
