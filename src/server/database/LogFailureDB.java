/**
 * 
 */
package server.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import server.VMQueue;

import model.LogFailure;

/**
 * @author Derek Carr
 *
 */
public class LogFailureDB {
	private Database db;
	private static Logger logger;
	
	static {
		logger = Logger.getLogger(VMQueue.class.getName());
	}
	
	/**
	 * 
	 */
	public LogFailureDB(Database db) {
		this.db = db;
	}

	
	public ArrayList<LogFailure> getLogFailuresByBatch(int batchId) {
		ArrayList<LogFailure> logFailures = new ArrayList<LogFailure>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT * FROM log_failures a INNER JOIN log_queue b ON a.log_queue_id = b.id WHERE b.vm_batch_id = ?";
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
				
				LogFailure failure = new LogFailure(id, queueId, classname, name, time, type, message, stamp);
				logFailures.add(failure);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			logger.log(Level.SEVERE, e.getMessage(), e);
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					logger.log(Level.SEVERE, e.getMessage(), e);
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
		return logFailures;
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
