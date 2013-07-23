/**
 * 
 */
package server.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Browser;

/**
 * @author Derek Carr
 *
 */
public class BrowserDB {
	
	private Database db;
	
	public BrowserDB(Database db) {
		this.db = db;
	}

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
    		Date createdDate = rs.getDate(4);
    		Date modifiedDate = rs.getDate(5);
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
				}
    }
		return browserList;
	}
	
}
