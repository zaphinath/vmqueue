/**
 * 
 */
package server.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
