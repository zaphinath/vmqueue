/**
 * 
 */
package model;

import java.sql.Date;

/**
 * @author Bryce
 *
 */
public class LogFailure {
	
	private int id;
	private int logQueueId;
	private String className;
	private String testName;
	private double time;
	
	private String failureType;
	private String failureMessage;
	
	private Date createdDate;
	
	/**
	 * 
	 */
	public LogFailure() {
	}

	/**
	 * @param id
	 * @param logQueueId
	 * @param className
	 * @param testName
	 * @param time
	 * @param failureType
	 * @param failureMessage
	 * @param createdDate
	 */
	public LogFailure(int id, int logQueueId, String className, String testName,
			double time, String failureType, String failureMessage, Date createdDate) {
		super();
		this.id = id;
		this.logQueueId = logQueueId;
		this.className = className;
		this.testName = testName;
		this.time = time;
		this.failureType = failureType;
		this.failureMessage = failureMessage;
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
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
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
	 * @return the failureType
	 */
	public String getFailureType() {
		return failureType;
	}

	/**
	 * @param failureType the failureType to set
	 */
	public void setFailureType(String failureType) {
		this.failureType = failureType;
	}

	/**
	 * @return the failureMessage
	 */
	public String getFailureMessage() {
		return failureMessage;
	}

	/**
	 * @param failureMessage the failureMessage to set
	 */
	public void setFailureMessage(String failureMessage) {
		this.failureMessage = failureMessage;
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
		return "LogFailure [id=" + id + ", logQueueId=" + logQueueId
				+ ", className=" + className + ", testName=" + testName + ", time="
				+ time + ", failureType=" + failureType + ", failureMessage="
				+ failureMessage + ", createdDate=" + createdDate + "]";
	}

}
