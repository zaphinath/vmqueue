/**
 * 
 */
package model;

import java.net.URL;
import java.sql.Timestamp;

/**
 * @author Derek Carr
 *
 */
public class Queue {

	private int id;
	private int testCaseId;
	private int subTestId;
	private int cloudId;
	private int browserId;
	private int osId;
	private int batchId;
	
	private String hostname;
	
	private int numTests;
	private int numFailures;
	private int numErrors;
	
	private String username;
	private URL url;
	private String environment;
	private double gitCommitVersion;
	
	private double time;
	private Timestamp createdDate;
	
	/**
	 * 
	 */
	public Queue() {
	}

	/**
	 * @param id
	 * @param testCaseId
	 * @param subTestId
	 * @param cloudId
	 * @param browserId
	 * @param osId
	 * @param batchId
	 * @param hostname
	 * @param numTests
	 * @param numFailures
	 * @param numErrors
	 * @param username
	 * @param url
	 * @param environment
	 * @param gitCommitVersion
	 * @param time
	 * @param createdDate
	 */
	public Queue(int id, int testCaseId, int subTestId, int cloudId,
			int browserId, int osId, int batchId, String hostname, int numTests,
			int numFailures, int numErrors, String username, URL url,
			String environment, double gitCommitVersion, double time, Timestamp createdDate) {
		super();
		this.id = id;
		this.testCaseId = testCaseId;
		this.subTestId = subTestId;
		this.cloudId = cloudId;
		this.browserId = browserId;
		this.osId = osId;
		this.batchId = batchId;
		this.hostname = hostname;
		this.numTests = numTests;
		this.numFailures = numFailures;
		this.numErrors = numErrors;
		this.username = username;
		this.url = url;
		this.environment = environment;
		this.gitCommitVersion = gitCommitVersion;
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
	 * @return the testCaseId
	 */
	public int getTestCaseId() {
		return testCaseId;
	}

	/**
	 * @param testCaseId the testCaseId to set
	 */
	public void setTestCaseId(int testCaseId) {
		this.testCaseId = testCaseId;
	}

	/**
	 * @return the subTestId
	 */
	public int getSubTestId() {
		return subTestId;
	}

	/**
	 * @param subTestId the subTestId to set
	 */
	public void setSubTestId(int subTestId) {
		this.subTestId = subTestId;
	}

	/**
	 * @return the cloudId
	 */
	public int getCloudId() {
		return cloudId;
	}

	/**
	 * @param cloudId the cloudId to set
	 */
	public void setCloudId(int cloudId) {
		this.cloudId = cloudId;
	}

	/**
	 * @return the browserId
	 */
	public int getBrowserId() {
		return browserId;
	}

	/**
	 * @param browserId the browserId to set
	 */
	public void setBrowserId(int browserId) {
		this.browserId = browserId;
	}

	/**
	 * @return the osId
	 */
	public int getOsId() {
		return osId;
	}

	/**
	 * @param osId the osId to set
	 */
	public void setOsId(int osId) {
		this.osId = osId;
	}

	/**
	 * @return the batchId
	 */
	public int getBatchId() {
		return batchId;
	}

	/**
	 * @param batchId the batchId to set
	 */
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	/**
	 * @return the hostname
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * @param hostname the hostname to set
	 */
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	/**
	 * @return the numTests
	 */
	public int getNumTests() {
		return numTests;
	}

	/**
	 * @param numTests the numTests to set
	 */
	public void setNumTests(int numTests) {
		this.numTests = numTests;
	}

	/**
	 * @return the numFailures
	 */
	public int getNumFailures() {
		return numFailures;
	}

	/**
	 * @param numFailures the numFailures to set
	 */
	public void setNumFailures(int numFailures) {
		this.numFailures = numFailures;
	}

	/**
	 * @return the numErrors
	 */
	public int getNumErrors() {
		return numErrors;
	}

	/**
	 * @param numErrors the numErrors to set
	 */
	public void setNumErrors(int numErrors) {
		this.numErrors = numErrors;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the url
	 */
	public URL getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(URL url) {
		this.url = url;
	}

	/**
	 * @return the environment
	 */
	public String getEnvironment() {
		return environment;
	}

	/**
	 * @param environment the environment to set
	 */
	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	/**
	 * @return the gitCommitVersion
	 */
	public double getGitCommitVersion() {
		return gitCommitVersion;
	}

	/**
	 * @param gitCommitVersion the gitCommitVersion to set
	 */
	public void setGitCommitVersion(double gitCommitVersion) {
		this.gitCommitVersion = gitCommitVersion;
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
	public Timestamp	 getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	

}
