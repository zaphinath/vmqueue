/**
 * 
 */
package server.database;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import model.OperatingSystem;

/**
 * @author Derek Carr
 *
 */
public class OperatingSystemDB {
	
	private Database db;
	
	public OperatingSystemDB(Database db) {
		this.db = db;
	}

	public List<OperatingSystem> getAllOS() {
		ArrayList<OperatingSystem> osList = new ArrayList<OperatingSystem>();
		PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
    	String sql = "SELECT * FROM vm_os";
    	stmt = db.getConnection().prepareStatement(sql);
    	
    	rs = stmt.executeQuery();
    	while (rs.next()) {
    		int id = rs.getInt(1);
    		String name = rs.getString(2);
    		String arch = rs.getString(3);
    		Timestamp createdDate = rs.getTimestamp(4);
    		Timestamp modifiedDate = rs.getTimestamp(5);

    		OperatingSystem os = new OperatingSystem(id, name, arch, createdDate, modifiedDate);
    		osList.add(os);
    	}
    } catch (SQLException e) {
    	
    } finally {
				try {
					if (rs != null) rs.close();
					if (stmt != null) stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
    }
		return osList;
	}
	
	public OperatingSystem getOSById(int id) {
		assert id > 0;
		OperatingSystem os = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT * FROM vm_os WHERE id = ?";
			stmt = db.getConnection().prepareStatement(sql);
			stmt.setInt(1, id);
			
			rs = stmt.executeQuery();
			while(rs.next()) {
				int osid = rs.getInt(1);
    		String name = rs.getString(2);
    		String arch = rs.getString(3);
    		Timestamp createdDate = rs.getTimestamp(4);
    		Timestamp modifiedDate = rs.getTimestamp(5);

    		os = new OperatingSystem(osid, name, arch, createdDate, modifiedDate);
			}
    } catch (SQLException e) {
    	
    } finally {
				try {
					if (rs != null) rs.close();
					if (stmt != null) stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
    }
		return os;
	}
	
	public int getOSID(String os) {
    PreparedStatement stmt = null;
    int OSID = 0;
    try {
    	String sql = "SELECT id FROM vm_os WHERE name = ?";
    	stmt = db.getConnection().prepareStatement(sql);
    	stmt.setString(1, os);
    
      ResultSet rs = stmt.executeQuery();
      while(rs.next()) {
        OSID = rs.getInt("id");
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
    }
    return OSID;
  }
}
