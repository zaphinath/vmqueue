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

import model.Browser;
import model.OperatingSystem;

/**
 * @author Bryce
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
	
}
