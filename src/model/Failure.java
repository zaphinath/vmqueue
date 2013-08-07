/**
 * 
 */
package model;

import java.sql.Timestamp;

/**
 * @author Derek Carr
 *
 */
public class Failure {
	private int id;
	private int resultId;
	
	private String testClassname;
	private String testName;
	private double time;
	private String failureType;
	private String failureMessage;
	private Timestamp createdDate;
	/**
	 * 
	 */
	public Failure() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param resultId
	 * @param testClassname
	 * @param testName
	 * @param time
	 * @param failureType
	 * @param failureMessage
	 * @param createdDate
	 */
	public Failure(int id, int resultId, String testClassname, String testName,
			double time, String failureType, String failureMessage,
			Timestamp createdDate) {
		super();
		this.id = id;
		this.resultId = resultId;
		this.testClassname = testClassname;
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
	 * @return the resultId
	 */
	public int getResultId() {
		return resultId;
	}
	/**
	 * @param resultId the resultId to set
	 */
	public void setResultId(int resultId) {
		this.resultId = resultId;
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
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

}
