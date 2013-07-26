/**
 * 
 */
package server.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import model.OperatingSystem;

/**
 * @author Derek Carr
 *
 */
public class Database {

	private BrowserDB browser;
	private JobDB job;
	private VirtualMachineDB virtualMachine;
	private OperatingSystemDB os;
	
	private Connection connection;
	
	private String dbFile;
	private String dbName;
	private String connectionURL;
	private String dbUser = "root";
	private String dbPass = "plopper2";
  private String serverName;
  private String databaseName;
	private static String driver = "com.mysql.jdbc.Driver";
	
	public Database(String env) {
		this.browser = new BrowserDB(this);
		this.virtualMachine = new VirtualMachineDB(this);
		this.os = new OperatingSystemDB(this);
		
		if (env.equalsIgnoreCase("test")) {
			this.dbFile = null;
			this.dbName = null;
			this.connectionURL = null;
		} else if (env.equalsIgnoreCase("prod")) {
      this.serverName = "qa.test.lan";
      this.databaseName = "insidesales";
			this.connectionURL = "jdbc:mysql://"+serverName+"/"+databaseName;
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
  	assert this.connection != null;
  	return this.connection;
  }
  
  /**
   * 
   * @return
   */
  public BrowserDB getBrowserDB() {
  	return this.browser;
  }
  
  /**
   * 
   * @return
   */
  public VirtualMachineDB getVirtualMachineDB() {
  	return this.virtualMachine;
  }
  
  /**
   * 
   * @return
   */
  public OperatingSystemDB getOSDB() {
  	return this.os;
  }
  
  /**
   * 
   * @throws SQLException
   */
  public void startTransaction() {
  	try {
	    connection = DriverManager.getConnection(connectionURL, dbUser, dbPass);
			connection.setAutoCommit(false);
  	} catch(SQLException e) {
  		e.printStackTrace();
  	}
  }
  
  /**
   * 
   * @param commit
   * @throws SQLException
   */
  public void endTransaction(boolean commit) {
  	try {
			if (commit == true) {
				connection.commit();
			} else {
				connection.rollback();
			}
		} 
		catch (SQLException e) { e.printStackTrace(); }
		finally { try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		
		connection = null;
  }
  
}
