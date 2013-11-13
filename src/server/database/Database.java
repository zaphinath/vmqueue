/**
 * 
 */
package server.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author Derek Carr
 *
 */
public class Database {
	
	private static Logger logger;
	
	private BrowserDB browser;
	private JobDB job;
	private VirtualMachineDB virtualMachine;
	private OperatingSystemDB os;
	private BatchDB batch;
	private LogQueueDB logQueue;
	private LogFailureDB logFailure;
	private LogErrorDB logError;
	private TestCaseDB testCase;
	private SubTestDB subTest;
	private LogTestsDB logTest;
	
	private Connection connection;
	
	private String connectionURL;
	private String dbUser = "root";
	private String dbPass = "plopper2";
  private String serverName;
  private String databaseName;
	private static String driver = "com.mysql.jdbc.Driver";
	
	static {
		logger = Logger.getLogger(Database.class.getName());
	}
	
	public Database(String env) {
		this.browser = new BrowserDB(this);
		this.virtualMachine = new VirtualMachineDB(this);
		this.job = new JobDB(this);
		this.batch = new BatchDB(this);
		this.os = new OperatingSystemDB(this);
		this.logQueue = new LogQueueDB(this);
		this.logFailure = new LogFailureDB(this);
		this.logError = new LogErrorDB(this);
		this.testCase = new TestCaseDB(this);
		this.subTest = new SubTestDB(this);
		this.logTest = new LogTestsDB(this);
		
		this.serverName = "qa.test.lan";
		if (env.equalsIgnoreCase("dev")) {
			this.databaseName = "square_dev";
		} else if (env.equalsIgnoreCase("master")) {
			this.databaseName = "square_master";
		} else if (env.equalsIgnoreCase("omega")) {
      this.databaseName = "insidesales";
		} 
		this.connectionURL = "jdbc:mysql://"+serverName+"/"+databaseName + "?useUnicode=true&characterEncoding=utf8";
	}
	
	public static void initialize() {
		logger.entering("server.database.Database", "initialize");
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			logger.log(Level.SEVERE, e.getMessage(), e);
		}
		logger.exiting("server.database.Database", "initialize");
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
   * 
   * @return
   */
  public LogFailureDB getLogFailureDB() {
  	return this.logFailure;
  }
  
  /**
   * 
   * @return Returns ErrorDB object
   */
  public LogErrorDB getLogErrorDB() {
  	return this.logError;
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
   * @return
   */
  public TestCaseDB getTestCaseDB() {
  	return this.testCase;
  }
  
  public SubTestDB getSubTestDB() {
  	return this.subTest;
  }
  public LogTestsDB getLogTestsDB() {
  	return this.logTest;
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
  		logger.log(Level.SEVERE, e.getMessage(), e);
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
		finally {	 
			try {
			connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
				logger.log(Level.SEVERE, e.getMessage(), e);
			}
		}
		
		connection = null;
  }
  
}
