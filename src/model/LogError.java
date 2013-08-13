/**
 * 
 */
package model;

import java.sql.Date;

/**
 * @author Derek Carr
 *
 */
public class LogError {

	private int id;
	private int logQueueId;
	private String testClassname;
	private String testName;
	
	private double time;
	private String errorType;
	private String errorMessage;
	
	private Date createdDate;
	
	/**
	 * 
	 */
	public LogError() {
	}

	/**
	 * @param id
	 * @param logQueueId
	 * @param testClassname
	 * @param testName
	 * @param time
	 * @param errorType
	 * @param errorMessage
	 * @param createdDate
	 */
	public LogError(int id, int logQueueId, String testClassname,
			String testName, double time, String errorType, String errorMessage,
			Date createdDate) {
		super();
		this.id = id;
		this.logQueueId = logQueueId;
		this.testClassname = testClassname;
		this.testName = testName;
		this.time = time;
		this.errorType = errorType;
		this.errorMessage = errorMessage;
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
	 * @return the errorType
	 */
	public String getErrorType() {
		return errorType;
	}

	/**
	 * @param errorType the errorType to set
	 */
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LogError [id=" + id + ", logQueueId=" + logQueueId
				+ ", testClassname=" + testClassname + ", testName=" + testName
				+ ", time=" + time + ", errorType=" + errorType + ", errorMessage="
				+ errorMessage + ", createdDate=" + createdDate + "]";
	}

}
