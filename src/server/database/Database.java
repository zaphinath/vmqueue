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
	private OperatingSystemDB os;
	private BatchDB batch;
	private ResultDB result;
	private FailureDB failure;
	private ErrorDB error;
	private LogQueueDB logQueue;
	
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
		this.job = new JobDB(this);
		this.batch = new BatchDB(this);
		this.os = new OperatingSystemDB(this);
		this.result = new ResultDB(this);
		this.failure = new FailureDB(this);
		this.error = new ErrorDB(this);
		this.logQueue = new LogQueueDB(this);
		
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
   * @return
   */
  public BatchDB getBatchDB() {
  	return this.batch;
  }
  
  /**
   * 
   * @return
   */
  public JobDB getJobDB() {
  	return this.job;
  }
  
  /**
   * Returns the ResultDB Object created
   * @return 
   */
  public ResultDB getResultDB() {
  	return this.result;
  }
  
  /**
   * 
   * @return
   */
  public FailureDB getFailureDB() {
  	return this.failure;
  }
  
  /**
   * 
   * @return Returns ErrorDB object
   */
  public ErrorDB getErrorDB() {
  	return this.error;
  }
  
  /**
   * 
   * @return Return LogQueueDB object
   */
  public LogQueueDB getLogQueueDB() {
  	return this.logQueue;
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
