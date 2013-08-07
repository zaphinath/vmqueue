/**
 * 
 */
package model;

import java.sql.Timestamp;

/**
 * @author Derek Carr
 *
 */
public class Error {
	private int id;
	private int resultId;
	private String testClassname;
	private String testName;
	private Double time;
	private String errorType;
	private String errorMessage;
	private Timestamp createdDate;
	
	/**
	 * 
	 */
	public Error() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param jobId
	 * @param testClassname
	 * @param testName
	 * @param errorType
	 * @param errorMessage
	 * @param createdDate
	 */
	public Error(int id, int resultId, String testClassname, String testName,
			String errorType, String errorMessage, Timestamp createdDate) {
		super();
		this.id = id;
		this.resultId = resultId;
		this.testClassname = testClassname;
		this.testName = testName;
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
	 * @return the jobId
	 */
	public int getResultId() {
		return resultId;
	}

	/**
	 * @param jobId the jobId to set
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
	public Double getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(Double time) {
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
