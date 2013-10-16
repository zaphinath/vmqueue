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

import server.VMQueue;

import model.Browser;

/**
 * @author Derek Carr
 *
 */
public class BrowserDB {
	
	private Database db;
	private static Logger logger;
	
	static {
		logger = Logger.getLogger(VMQueue.class.getName());
	}
	
	public BrowserDB(Database db) {
		this.db = db;
	}

	/**
	 * Returns a list of browsers.
	 * @return
	 */
	public List<Browser> getAllBrowsers() {
		ArrayList<Browser> browserList = new ArrayList<Browser>();
		PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
    	String sql = "SELECT * FROM vm_browsers";
    	stmt = db.getConnection().prepareStatement(sql);
    	
    	rs = stmt.executeQuery();
    	while (rs.next()) {
    		int id = rs.getInt(1);
    		String name = rs.getString(2);
    		String version = rs.getString(3);
    		Timestamp createdDate = rs.getTimestamp(4);
    		Timestamp modifiedDate = rs.getTimestamp(5);
    		Browser browser = new Browser(id, name, version, createdDate, modifiedDate);
    		
    		browserList.add(browser);
    	}
    } catch (SQLException e) {
    	
    } finally {
				try {
					if (rs != null) rs.close();
					if (stmt != null) stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
    }
		return browserList;
	}
	public HashMap<Integer, Browser> getBrowsersMap() {
		HashMap<Integer, Browser> browserList = new HashMap<Integer, Browser>();
		PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
    	String sql = "SELECT * FROM vm_browsers";
    	stmt = db.getConnection().prepareStatement(sql);
    	
    	rs = stmt.executeQuery();
    	while (rs.next()) {
    		int id = rs.getInt(1);
    		String name = rs.getString(2);
    		String version = rs.getString(3);
    		Timestamp createdDate = rs.getTimestamp(4);
    		Timestamp modifiedDate = rs.getTimestamp(5);
    		Browser browser = new Browser(id, name, version, createdDate, modifiedDate);
    		
    		browserList.put(id, browser);
    	}
    } catch (SQLException e) {
    	
    } finally {
				try {
					if (rs != null) rs.close();
					if (stmt != null) stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
    }
		return browserList;
	}
	
	/**
	 * 
	 * @param browserId
	 * @return
	 */
	public Browser getBrowser(int browserId) {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Browser browser = null;
		try {
			String sql = "SELECT * FROM vm_browsers WHERE id = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setInt(1, browserId);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String version = rs.getString(3);
				Timestamp createdDate = rs.getTimestamp(4);
				Timestamp modifiedDate = rs.getTimestamp(5);
				browser = new Browser(id, name, version, createdDate, modifiedDate);
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
					e.printStackTrace();
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
			}
		} 
		return browser;
	}
	
	/**
	 * 
	 * @param VMId
	 * @param browser
	 * @return
	 */
	public Browser getBrowserVersionById(int VMId, String browser) {
		assert VMId != 0;
		assert browser != null;
		PreparedStatement stmt = null;
	  ResultSet rs = null;
	  Browser returnBrowser = null;
	  try {
	  	String sql = "SELECT * FROM vm_browsers a " +
	  							 "INNER JOIN vm_cloud2browser b ON a.id = b.vm_browser_id " +
	  							 "INNER JOIN vm_cloud c ON c.id = b.vm_cloud_id " +
	  							 "WHERE c.id = ? AND a.name = ?";
	  	stmt = db.getConnection().prepareStatement(sql);
	  	stmt.setInt(1, VMId);
	  	stmt.setString(2, browser);
	  	rs = stmt.executeQuery();

	  	while (rs.next()) {
	  		int id = rs.getInt(1);
	  		String name = rs.getString(2);
	  		String version = rs.getString(3);
	  		Timestamp createdDate = rs.getTimestamp(4);
	  		Timestamp modifiedDate = rs.getTimestamp(5);
	  		returnBrowser = new Browser(id, name, version, createdDate, modifiedDate);
	   	}
	  } catch (SQLException e) {
	  	logger.log(Level.SEVERE, e.getMessage(), e);
	  } finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
			} catch (SQLException e) {
				logger.log(Level.SEVERE, e.getMessage(), e);
			}
		}
		return returnBrowser;
	}
	
	public int getBrowserID(String browser, String version) {
		assert browser != null;
		assert version != null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int id = 0;
		try {
			String sql = "SELECT id FROM vm_browsers WHERE name = ? AND version = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setString(1, browser);
			stmt.setString(2, version);
			
			rs = stmt.executeQuery();
			while (rs.next()) {
				id = rs.getInt("id");
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
					e.printStackTrace();
					logger.log(Level.SEVERE, e.getMessage(), e);
				}
			}
		}
		return id;
	}
	
}
