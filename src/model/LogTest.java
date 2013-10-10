/**
 * 
 */
package model;

import java.sql.Timestamp;

/**
 * @author Derek Carr
 *
 */
public class LogTest {

	private int id;
	private int logQueueId;
	private String testClassname;
	private String testName;
	private double time;
	private Timestamp createdDate;
	
	/**
	 * Class Constructer
	 */
	public LogTest() {
		
	}

	/**
	 * @param id
	 * @param logQueueId
	 * @param testClassname
	 * @param testName
	 * @param time
	 * @param createdDate
	 */
	public LogTest(int id, int logQueueId, String testClassname,
			String testName, double time, Timestamp createdDate) {
		super();
		this.id = id;
		this.logQueueId = logQueueId;
		this.testClassname = testClassname;
		this.testName = testName;
		this.time = time;
		this.createdDate = createdDate;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the logQueueId
	 */
	public int getLogQueueId() {
		return logQueueId;
	}

	/**
	 * @param logQueueId the logQueueId to set
	 */
	public void setLogQueueId(int logQueueId) {
		this.logQueueId = logQueueId;
	}

	/**
	 * @return the testClassname
	 */
	public String getTestClassname() {
		return testClassname;
	}

	/**
	 * @param testClassname the testClassname to set
	 */
	public void setTestClassname(String testClassname) {
		this.testClassname = testClassname;
	}

	/**
	 * @return the testName
	 */
	public String getTestName() {
		return testName;
	}

	/**
	 * @param testName the testName to set
	 */
	public void setTestName(String testName) {
		this.testName = testName;
	}

	/**
	 * @return the time
	 */
	public double getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(double time) {
		this.time = time;
	}

	/**
	 * @return the createdDate
	 */
	public Timestamp getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LogTests [id=" + id + ", logQueueId=" + logQueueId
				+ ", testClassname=" + testClassname + ", testName=" + testName
				+ ", time=" + time + ", createdDate=" + createdDate + "]";
	}
	
	
}
