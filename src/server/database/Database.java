/**
 * 
 */
package server.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Derek Carr
 *
 */
public class Database {

	private BrowserDB browser;
	private JobDB job;
	private VirtualMachineDB virtualMachine;
	
	private Connection connection;
	
	private String dbFile;
	private String dbName;
	private String connectionURL;
	private static String driver = "com.mysql.jdbc.Driver";
	
	public Database(String env) {
		if (env.equalsIgnoreCase("test")) {
			this.dbFile = null;
			this.dbName = null;
			this.connectionURL = null;
		} else if (env.equalsIgnoreCase("prod")) {
			
		} else {
			
		}
	}
	
	public static void initialize() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
  /**
   * Gets the database connection
   * @return this.connection
   */
  public Connection getConnection(){
  	return this.connection;
  }
  
  public void startTransaction() throws SQLException {
  	connection = DriverManager.getConnection(connectionURL);
		connection.setAutoCommit(false);
  }
  
  public void endTransaction(boolean commit) throws SQLException {
  	try {
			if (commit == true) {
				connection.commit();
			} else {
				connection.rollback();
			}
		} 
		catch (SQLException e) { e.printStackTrace(); }
		finally { connection.close();}
		
		connection = null;
  }
  
}
