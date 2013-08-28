/**
 * 
 */
package server.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import model.Job;

/**
 * @author Derek Carr
 *
 */
public class JobDB {
	private Database db;
	/**
	 * @param database
	 */
	public JobDB(Database database) {
		this.db = database;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Job getJob(int id) {
		PreparedStatement stmt = null;
    ResultSet rs = null;
    Job job = null;
    try {
    	String sql = "SELECT * FROM vm_job where id = ?";
    	stmt = db.getConnection().prepareStatement(sql);
    	stmt.setInt(1, id);
    	rs = stmt.executeQuery();
    	while (rs.next()) {
    		int jid = rs.getInt(1);
    		int vmBatchId = rs.getInt(2);
    		String message = rs.getString(3);
    		double time = rs.getDouble(4);
    		int queueNum = rs.getInt(5);
    		String ipAddress = rs.getString(6);
    		boolean completed = rs.getBoolean(7);
    		Timestamp createdDate = rs.getTimestamp(8);
    		Timestamp modifiedDate = rs.getTimestamp(9);
    		
    		job = new Job(jid, vmBatchId, message, time,queueNum,ipAddress, completed, createdDate, modifiedDate);
    	}
    } catch (SQLException e) {
    	
    }
    return job;
	}
	
	public int insertJob(Job job) {
		PreparedStatement stmt = null;
		Statement keyStmt = null;
		ResultSet rs = null;
		int id = 0;
		try {
			String sql = "INSERT INTO vm_job(vm_batch_id, message, time, queue_number, ip_address, modified_date)" +
						"VALUES(?, ?, ?, ?, ?, now())";
			stmt = db.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setInt(1, job.getBatchId());
			stmt.setString(2, job.getMessage());
			stmt.setDouble(3, job.getTime());
			stmt.setInt(4, job.getQueue());
			stmt.setString(5, job.getHostIP());
			
			stmt.executeUpdate();
			rs = stmt.getGeneratedKeys();
			if (rs.next()) {
				id = rs.getInt(1); 
			} else {
				System.out.println("ERROR GETTING ID");
			}
		} catch(SQLException e) { 
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
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
	
	
	/**
	 * 
	 * @param job
	 */
	public void updateJob(Job job) {
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE vm_job SET time = ?, queue_number = ?, ip_address = ?, " +
									 "completed = ?, modified_date = now() WHERE id = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setDouble(1, job.getTime());
			stmt.setInt(2, job.getQueue());
			stmt.setString(3, job.getHostIP());
			stmt.setBoolean(4, job.isCompleted());
			stmt.setInt(5, job.getId());
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
