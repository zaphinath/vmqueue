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

import model.VirtualMachine;

/**
 * @author Derek Carr
 *
 */
public class VirtualMachineDB {
	
	private Database db;
	
	
	public VirtualMachineDB(Database db) {
		this.db = db;
	}
	
	public List<VirtualMachine> getAll() throws SQLException{
		ArrayList<VirtualMachine> VMList = new ArrayList<VirtualMachine>();
		PreparedStatement stmt = null;
    ResultSet rs = null;
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
    		Date createdDate = rs.getDate(7);
    		Date modifiedDate = rs.getDate(8);
    		
    		VirtualMachine vm = new VirtualMachine(id, hostname, ip, osId, available, inQueue, modifiedDate, createdDate);
    		VMList.add(vm);
    	}
    } catch (SQLException e) {
    	
    } finally {
    	if (rs != null) rs.close();
    	if (stmt != null) stmt.close();
    }
		return VMList;
	}

}
