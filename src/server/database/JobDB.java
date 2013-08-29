/**
 * 
 */
package server.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import model.Job;
import model.SocketString;

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
	
	public List<Job> getJobByBatchId(int batchId) {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Job> list = new ArrayList<Job>();
		Gson gson = new Gson();
		try {
			String sql = "SELECT * FROM vm_job WHERE vm_batch_id = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setInt(1, batchId);
			
			rs = stmt.executeQuery();
			while (rs.next()) {
				int jobId = rs.getInt(1);
				int vmBatchId = rs.getInt(2);
				SocketString socketString = gson.fromJson(rs.getString(3), SocketString.class);
				double time = rs.getDouble(4);
    		int queueNum = rs.getInt(5);
    		String ipAddress = rs.getString(6);
    		boolean completed = rs.getBoolean(7);
    		Timestamp createdDate = rs.getTimestamp(8);
    		Timestamp modifiedDate = rs.getTimestamp(9);
    		
    		Job job = new Job(jobId, vmBatchId, socketString, time,queueNum,ipAddress, completed, createdDate, modifiedDate);
    		list.add(job);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		return list;
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
    SocketString socketString = null;
    Gson gson = new Gson();
    try {
    	String sql = "SELECT * FROM vm_job where id = ?";
    	stmt = db.getConnection().prepareStatement(sql);
    	stmt.setInt(1, id);
    	rs = stmt.executeQuery();
    	while (rs.next()) {
    		int jid = rs.getInt(1);
    		int vmBatchId = rs.getInt(2);
    		String message = rs.getString(3);
    		socketString = gson.fromJson(message, SocketString.class);
    		double time = rs.getDouble(4);
    		int queueNum = rs.getInt(5);
    		String ipAddress = rs.getString(6);
    		boolean completed = rs.getBoolean(7);
    		Timestamp createdDate = rs.getTimestamp(8);
    		Timestamp modifiedDate = rs.getTimestamp(9);
    		
    		job = new Job(jid, vmBatchId, socketString, time,queueNum,ipAddress, completed, createdDate, modifiedDate);
    	}
    } catch (SQLException e) {
    	
    }
    return job;
	}
	
	public int insertJob(Job job) {
		PreparedStatement stmt = null;
		Statement keyStmt = null;
		ResultSet rs = null;
		Gson gson = new Gson();
		int id = 0;
		try {
			String sql = "INSERT INTO vm_job(vm_batch_id, message, time, queue_number, ip_address, modified_date)" +
						"VALUES(?, ?, ?, ?, ?, now())";
			stmt = db.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setInt(1, job.getBatchId());
			stmt.setString(2, gson.toJson(job.getMessage()));
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
		Gson gson = new Gson();
		try {
			String sql = "UPDATE vm_job SET message = ?, time = ?, queue_number = ?, ip_address = ?, " +
									 "completed = ?, modified_date = now() WHERE id = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setString(1, gson.toJson(job.getMessage()));
			stmt.setDouble(2, job.getTime());
			stmt.setInt(3, job.getQueue());
			stmt.setString(4, job.getHostIP());
			stmt.setBoolean(5, job.isCompleted());
			stmt.setInt(6, job.getId());
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
	
	
	public int getBatchId(int jobId) {
  	PreparedStatement stmt = null;
  	ResultSet rs = null;
  	int batchId = 0;
  	try {
			String sql = "SELECT vm_batch_id FROM vm_job WHERE id = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setInt(1, jobId);
			
			rs = stmt.executeQuery();
			while (rs.next()) {
				batchId = rs.getInt("vm_batch_id");
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
  	return batchId;
  }
	
	public void updateCompleted(int jobId) {
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE vm_job SET completed = 1 WHERE id = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setInt(1, jobId);
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
	
	public boolean isBatchCompleted(int batchId) {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		boolean result = true;
		try {
			String sql = "SELECT completed FROM vm_job WHERE vm_batch_id = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setInt(1, batchId);
			rs = stmt.executeQuery();
			while (rs.next()) {
				if (!rs.getBoolean("completed")) {
					result = false;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
		return result;
	}

}
