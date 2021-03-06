/**
 * 
 */
package server.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.VirtualMachine;

/**
 * @author Derek Carr
 *
 */
public class VirtualMachineDB {

	private Database db;
	private static Logger logger;

	static {
		logger = Logger.getLogger(VirtualMachineDB.class.getName());
	}

	/**
	 * Class Constructor
	 * @param db
	 */
	public VirtualMachineDB(Database db) {
		this.db = db;
	}

	/**
	 * Returns a complete list of all VM's 
	 * @return
	 */
	public List<VirtualMachine> getAll() {
		ArrayList<VirtualMachine> VMList = new ArrayList<VirtualMachine>();
		PreparedStatement stmt = null;
		PreparedStatement stmt2 = null;
		ResultSet rs = null;
		ResultSet rs2 = null;

		try {
			String sql = "SELECT * FROM vm_cloud";
			stmt = db.getConnection().prepareStatement(sql);

			rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String hostname = rs.getString(2);
				String ip = rs.getString(3);
				int osId = rs.getInt(4);
				boolean available = rs.getBoolean(5);
				boolean inQueue = rs.getBoolean(6);
				double qTime = rs.getDouble(7);
				int numJobs = rs.getInt(8);
				String currentJob = rs.getString(9);
				Timestamp createdDate = rs.getTimestamp(10);
				Timestamp modifiedDate = rs.getTimestamp(11);
				VirtualMachine vm = new VirtualMachine(id, hostname, ip, osId, available, inQueue, qTime, numJobs, currentJob, modifiedDate, createdDate);

				HashMap<String, String> browsers = new HashMap<String,String>(); 
				String sql2 = "SELECT a.name, a.version FROM vm_browsers a INNER JOIN vm_cloud2browser b " +
						"ON a.id = b.vm_browser_id WHERE b.vm_cloud_id = ?";
				stmt2 = db.getConnection().prepareStatement(sql2);
				stmt2.setInt(1, id);
				rs2 = stmt2.executeQuery();

				while (rs2.next()) {
					String browser = rs2.getString(1);
					String version = rs2.getString(2);
					browsers.put(browser, version);
				}
				vm.setBrowsers(browsers);
				VMList.add(vm);
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
					e.printStackTrace();
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
					e.printStackTrace();
				}
		}
		return VMList;
	}


	/**
	 * Returns a map <VM id, VM Object>
	 * @return
	 */
	public HashMap<Integer, VirtualMachine> getMap() {
		HashMap<Integer, VirtualMachine> VMMap = new HashMap<Integer, VirtualMachine>();
		PreparedStatement stmt = null;
		PreparedStatement stmt2 = null;
		ResultSet rs = null;
		ResultSet rs2 = null;

		try {
			String sql = "SELECT * FROM vm_cloud";
			stmt = db.getConnection().prepareStatement(sql);

			rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String hostname = rs.getString(2);
				String ip = rs.getString(3);
				int osId = rs.getInt(4);
				boolean available = rs.getBoolean(5);
				boolean inQueue = rs.getBoolean(6);
				double qTime = rs.getDouble(7);
				int numJobs = rs.getInt(8);
				String currentJob = rs.getString(9);
				Timestamp createdDate = rs.getTimestamp(10);
				Timestamp modifiedDate = rs.getTimestamp(11);
				VirtualMachine vm = new VirtualMachine(id, hostname, ip, osId, available, inQueue, qTime, numJobs, currentJob, modifiedDate, createdDate);

				HashMap<String, String> browsers = new HashMap<String,String>(); 
				String sql2 = "SELECT a.name, a.version FROM vm_browsers a INNER JOIN vm_cloud2browser b " +
						"ON a.id = b.vm_browser_id WHERE b.vm_cloud_id = ?";
				stmt2 = db.getConnection().prepareStatement(sql2);
				stmt2.setInt(1, id);
				rs2 = stmt2.executeQuery();

				while (rs2.next()) {
					String browser = rs2.getString(1);
					String version = rs2.getString(2);
					browsers.put(browser, version);
				}
				vm.setBrowsers(browsers);
				VMMap.put(id, vm);
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
					e.printStackTrace();
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
					e.printStackTrace();
				}
		}
		return VMMap;
	}

	/**
	 * Gets ArrayList of all VM's with a certain browser and in queue
	 * @param browser
	 * @param isInQueue
	 * @return
	 */
	public List<VirtualMachine> getByBrowser(String browser, boolean isInQueue) {
		assert browser != null;
		ArrayList<VirtualMachine> VMList = new ArrayList<VirtualMachine>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT * FROM vm_cloud a " +
					"INNER JOIN vm_cloud2browser b ON b.vm_cloud_id = a.id " +
					"INNER JOIN vm_browsers c ON b.vm_browser_id = c.id " +
					"WHERE c.name = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setString(1, browser);

			rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String hostname = rs.getString(2);
				String ip = rs.getString(3);
				int osId = rs.getInt(4);
				boolean available = rs.getBoolean(5);
				boolean inQueue = rs.getBoolean(6);
				double qTime = rs.getDouble(7);
				int numJobs = rs.getInt(8);
				String currentJob = rs.getString(9);
				Timestamp createdDate = rs.getTimestamp(10);
				Timestamp modifiedDate = rs.getTimestamp(11);

				VirtualMachine vm = new VirtualMachine(id, hostname, ip, osId, available, inQueue,
						qTime, numJobs, currentJob, modifiedDate, createdDate);
				if (isInQueue) {
					if (inQueue) {
						VMList.add(vm);
					}
				} else {
					VMList.add(vm);
				}
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
					e.printStackTrace();
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
					e.printStackTrace();
				}
		}
		return VMList;
	}

	public List<VirtualMachine> getByBrowserAndVersion(String browser, String version, boolean isInQueue) {
		assert browser!=null && version!=null;
		ArrayList<VirtualMachine> VMList = new ArrayList<VirtualMachine>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT * FROM vm_cloud a " +
					"INNER JOIN vm_cloud2browser b ON b.vm_cloud_id = a.id " +
					"INNER JOIN vm_browsers c ON b.vm_browser_id = c.id " +
					"WHERE c.name = ? and c.version = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setString(1, browser);
			stmt.setString(2, version);

			rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String hostname = rs.getString(2);
				String ip = rs.getString(3);
				int osId = rs.getInt(4);
				boolean available = rs.getBoolean(5);
				boolean inQueue = rs.getBoolean(6);
				double qTime = rs.getDouble(7);
				int numJobs = rs.getInt(8);
				String currentJob = rs.getString(9);
				Timestamp createdDate = rs.getTimestamp(10);
				Timestamp modifiedDate = rs.getTimestamp(11);

				VirtualMachine vm = new VirtualMachine(id, hostname, ip, osId, available, inQueue, 
						qTime, numJobs, currentJob, modifiedDate, createdDate);
				if (isInQueue) {
					if (inQueue) {
						VMList.add(vm);
					}
				} else {
					VMList.add(vm);
				}
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
					e.printStackTrace();
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
					logger.log(Level.SEVERE, e.getMessage(), e);
					e.printStackTrace();
				}
		}
		return VMList;
	}

	public VirtualMachine getVirtualMachine(int id) {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		VirtualMachine vm = null;
		try {
			String sql = "SELECT * FROM vm_cloud where id = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int vid = rs.getInt(1);
				String hostname = rs.getString(2);
				String ip = rs.getString(3);
				int osId = rs.getInt(4);
				boolean available = rs.getBoolean(5);
				boolean inQueue = rs.getBoolean(6);
				double qTime = rs.getDouble(7);
				int numJobs = rs.getInt(8);
				String currentJob = rs.getString(9);
				Timestamp createdDate = rs.getTimestamp(10);
				Timestamp modifiedDate = rs.getTimestamp(11);

				vm = new VirtualMachine(vid, hostname, ip, osId, available, inQueue, 
						qTime, numJobs, currentJob, modifiedDate, createdDate);
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		} finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vm;
	}

	public boolean getVMAvailable(int id) throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		boolean available = false;
		try {
			String sql = "SELECT * FROM vm_cloud where id = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			while (rs.next())	{
				available = rs.getBoolean(5);
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		} finally {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close();
		}
		return available;
	}

	public boolean getInQueue(int id) throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		boolean inQueue = false;
		try {
			String sql = "SELECT * FROM vm_cloud where id = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			while (rs.next())	{
				inQueue = rs.getBoolean(6);
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
		} finally {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close();
		}
		return inQueue;
	}

	/**
	 * 
	 * @param id
	 */
	public void updateVM(VirtualMachine vm) {
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE vm_cloud SET hostname = ?, ip_address = ?, vm_os_id = ?, " +
					"available = ?, inQueue = ?, time = ?, num_jobs = ?, current_job = ?, modified_date = now() " +
					"WHERE id = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setString(1, vm.getHostname());
			stmt.setString(2, vm.getIP());
			stmt.setInt(3, vm.getOsId());
			stmt.setBoolean(4, vm.isAvailable());
			stmt.setBoolean(5, vm.isInQueue());
			stmt.setDouble(6, vm.getCurrentQueueTime());
			stmt.setInt(7, vm.getNumberQueueJobs());
			stmt.setString(8, vm.getCurrentJob());
			stmt.setInt(9, vm.getId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			logger.log(Level.SEVERE, e.getMessage(), e);
		} finally {
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
		}
	}

	/**
	 * We want to be able to initialize all vm's in queue in case of weird stops, and 
	 * remove from the queue of available if they are offline for any reason.
	 */
	public void updateAvailable() {
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE vm_cloud SET available=1, time=0.00, num_jobs=0 WHERE inQueue=1";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.executeUpdate(); 
			sql = "UPDATE vm_cloud SET available=0, time=0.00, num_jobs=0 WHERE inQueue=0";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.executeUpdate(); 
		} catch (SQLException e) {
			e.printStackTrace();
			logger.log(Level.SEVERE, e.getMessage(), e);
		} finally {
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
		}
	}


	/**
	 * Sets the vm as unavailble for the queue
	 * @param id
	 */
	public void setUnavailable(int id) {
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE vm_cloud SET available=0 WHERE id = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.executeUpdate(); 
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
		}
	}


	/**
	 * Adds time to queue run, increments number jobs ran
	 * @param time
	 * @param queueNumber
	 */
	public void incrementQueue(double time, int queueNumber) {
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE vm_cloud SET TIME = time + ?, num_jobs = num_jobs + 1  WHERE id = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setDouble(1, time);
			stmt.setInt(2, queueNumber);
			stmt.executeUpdate();
		} catch (SQLException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
			}
		}
	}

	/**
	 * Sets a vm to available and ready to take another job
	 * @param queueNumber
	 */
	public void setAvailable(int queueNumber) {
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE vm_cloud SET available = 1 WHERE id = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setInt(1, queueNumber);
			stmt.executeUpdate();
		} catch (SQLException e) {
			logger.log(Level.SEVERE, e.getMessage(), e);
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
			}
		}
	}
}
