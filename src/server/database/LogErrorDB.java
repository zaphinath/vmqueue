/**
 * 
 */
package server.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

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

	
	public ArrayList<LogError> getLogErrorsByBatch(int batchId) {
		ArrayList<LogError> logErrors = new ArrayList<LogError>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT * FROM log_errors a INNER JOIN log_queue b ON a.log_queue_id = b.id WHERE b.vm_batch_id = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setInt(1, batchId);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				int queueId = rs.getInt(2);
				String classname = rs.getString(3);
				String name = rs.getString(4);
				double time = rs.getDouble(5);
				String type = rs.getString(6);
				String message = rs.getString(7);
				Timestamp stamp = rs.getTimestamp(8);
				
				LogError error = new LogError(id, queueId, classname, name, time, type, message, stamp);
				logErrors.add(error);
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return logErrors;
	}
	
	
	/**
	 * 
	 * @param logError
	 */
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
