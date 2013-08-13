/**
 * 
 */
package server.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.LogQueue;

/**
 * @author Derek Carr
 *
 */
public class LogQueueDB {
	private Database db;
	/**
	 * 
	 */
	public LogQueueDB(Database db) {
		this.db = db;
	}

	/**
	 * 
	 * @param logQueue
	 * @return int of log_queue id just inserted
	 */
	public int insertLogQueue(LogQueue logQueue) {
		PreparedStatement stmt = null;
		Statement keyStmt = null;
		ResultSet rs = null;
		int id = 0;
		try {
			String sql = "INSERT INTO log_queue(testcase_id, subtest_id, " +
          "cloud_id, browser_id, os_id, " +
          "hostname, num_tests, " +
          "num_errors, num_failures, "+
          "username, url, environment, git_commit_version,"+
          "time) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; 
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setInt(1, logQueue.getTestCaseId());
			stmt.setInt(2, logQueue.getSubTestId());
			stmt.setInt(3, logQueue.getVmCloudId());
			stmt.setInt(4, logQueue.getBrowserId());
			stmt.setInt(5, logQueue.getOsId());
			stmt.setString(6, logQueue.getHostname());
			stmt.setInt(7, logQueue.getNumTests());
			stmt.setInt(8, logQueue.getNumErrors());
			stmt.setInt(9, logQueue.getNumFailures());
			stmt.setString(10, logQueue.getUsername());
			stmt.setString(11, logQueue.getUrl());
			stmt.setString(12, logQueue.getEnvironment());
			stmt.setString(13, logQueue.getGitBranch());
			stmt.setString(14, logQueue.getGitCommitVersion());
			stmt.setDouble(15, logQueue.getTime());
			if (stmt.executeUpdate() == 1) {
				keyStmt = db.getConnection().createStatement();
				rs = keyStmt.executeQuery("select last_insert_rowid()");
				rs.next();
				id = rs.getInt(1); 
			} else {
				System.out.println("ERROR GETTING ID");
			}
		} catch (SQLException e) {
			System.out.println("Insert LogQueue Failed");
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
			if (keyStmt != null) {
				try {
					keyStmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return id; 
	}
	
	
}
