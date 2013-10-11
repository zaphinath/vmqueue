/**
 * 
 */
package model;

import java.sql.Timestamp;

/**
 * @author Derek Carr
 *
 */
public class LogQueue {
	private int id;
	private int vmBatchId;
	private int vmJobId;
	private int testCaseId;
	private int subTestId;
	private int vmCloudId;
	private int browserId;
	private int osId;
	
	private String hostname;
	private int numTests;
	private int numFailures;
	private int numErrors;
	private String username;
	
	private String url; 
	private String environment;
	private String gitBranch;
	private String gitCommitVersion;
	
	private double time;
	private Timestamp date;
	
	/**
	 * 
	 */
	public LogQueue() {
	}


	/**
	 * @param id
	 * @param vmBatchId
	 * @param vmJobId
	 * @param testCaseId
	 * @param subTestId
	 * @param vmCloudId
	 * @param browserId
	 * @param osId
	 * @param hostname
	 * @param numTests
	 * @param numFailures
	 * @param numErrors
	 * @param username
	 * @param url
	 * @param environment
	 * @param gitBranch
	 * @param gitCommitVersion
	 * @param time
	 * @param date
	 */
	public LogQueue(int id, int vmBatchId, int vmJobId, int testCaseId,
			int subTestId, int vmCloudId, int browserId, int osId, String hostname,
			int numTests, int numFailures, int numErrors, String username,
			String url, String environment, String gitBranch,
			String gitCommitVersion, double time, Timestamp date) {
		super();
		this.id = id;
		this.vmBatchId = vmBatchId;
		this.vmJobId = vmJobId;
		this.testCaseId = testCaseId;
		this.subTestId = subTestId;
		this.vmCloudId = vmCloudId;
		this.browserId = browserId;
		this.osId = osId;
		this.hostname = hostname;
		this.numTests = numTests;
		this.numFailures = numFailures;
		this.numErrors = numErrors;
		this.username = username;
		this.url = url;
		this.environment = environment;
		this.gitBranch = gitBranch;
		this.gitCommitVersion = gitCommitVersion;
		this.time = time;
		this.date = date;
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
	 * @return the vmCloudId
	 */
	public int getVmCloudId() {
		return vmCloudId;
	}

	/**
	 * @param vmCloudId the vmCloudId to set
	 */
	public void setVmCloudId(int vmCloudId) {
		this.vmCloudId = vmCloudId;
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
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
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
	 * @return the gitBranch
	 */
	public String getGitBranch() {
		return gitBranch;
	}

	/**
	 * @param gitBranch the gitBranch to set
	 */
	public void setGitBranch(String gitBranch) {
		this.gitBranch = gitBranch;
	}

	/**
	 * @return the gitCommitVersion
	 */
	public String getGitCommitVersion() {
		return gitCommitVersion;
	}

	/**
	 * @param gitCommitVersion the gitCommitVersion to set
	 */
	public void setGitCommitVersion(String gitCommitVersion) {
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
	 * @return the date
	 */
	public Timestamp getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Timestamp date) {
		this.date = date;
	}

	/**
	 * @return the vmBatchId
	 */
	public int getVmBatchId() {
		return vmBatchId;
	}

	/**
	 * @param vmBatchId the vmBatchId to set
	 */
	public void setVmBatchId(int vmBatchId) {
		this.vmBatchId = vmBatchId;
	}

	/**
	 * @return the vmJobId
	 */
	public int getVmJobId() {
		return vmJobId;
	}

	/**
	 * @param vmJobId the vmJobId to set
	 */
	public void setVmJobId(int vmJobId) {
		this.vmJobId = vmJobId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LogQueue [id=" + id + ", vmBatchId=" + vmBatchId + ", vmJobId="
				+ vmJobId + ", testCaseId=" + testCaseId + ", subTestId=" + subTestId
				+ ", vmCloudId=" + vmCloudId + ", browserId=" + browserId + ", osId="
				+ osId + ", hostname=" + hostname + ", numTests=" + numTests
				+ ", numFailures=" + numFailures + ", numErrors=" + numErrors
				+ ", username=" + username + ", url=" + url + ", environment="
				+ environment + ", gitBranch=" + gitBranch + ", gitCommitVersion="
				+ gitCommitVersion + ", time=" + time + ", date=" + date + "]";
	}


}
