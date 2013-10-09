/**
 * 
 */
package model;

import java.sql.Timestamp;

/**
 * @author Derek Carr
 * @email zaphinath@gmail.com
 *
 */
public class Job {

	private int id;
	private int batchId;
	private SocketString message;
	private double time;
	private int queue;
	private String hostIP;
	private boolean completed;
	private String browser;
	private String browserVersion;
	private Timestamp createdDate;
	private Timestamp modifiedDate;
	
	/**
	 * Class Constructor
	 */
	public Job() {
		this.id = -1;
		this.message = null;
		this.time = -1;
		this.queue = -1;
		this.hostIP = null;
	}

	/**
	 * @param id
	 * @param batchId
	 * @param message
	 * @param time
	 * @param queue
	 * @param hostIP
	 * @param completed
	 * @param browser
	 * @param browserVersion
	 * @param createdDate
	 * @param modifiedDate
	 */
	public Job(int id, int batchId, SocketString message, double time, int queue,
			String hostIP, boolean completed, String browser, String browserVersion,
			Timestamp createdDate, Timestamp modifiedDate) {
		super();
		this.id = id;
		this.batchId = batchId;
		this.message = message;
		this.time = time;
		this.queue = queue;
		this.hostIP = hostIP;
		this.completed = completed;
		this.browser = browser;
		this.browserVersion = browserVersion;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
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
	 * @return the message
	 */
	public SocketString getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(SocketString message) {
		this.message = message;
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
	 * @return the queue
	 */
	public int getQueue() {
		return queue;
	}

	/**
	 * @param queue the queue to set
	 */
	public void setQueue(int queue) {
		this.queue = queue;
	}

	/**
	 * @return the hostIP
	 */
	public String getHostIP() {
		return hostIP;
	}

	/**
	 * @param hostIP the hostIP to set
	 */
	public void setHostIP(String hostIP) {
		this.hostIP = hostIP;
	}

	/**
	 * @return the completed
	 */
	public boolean isCompleted() {
		return completed;
	}


	/**
	 * @param completed the completed to set
	 */
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	/**
	 * @return the browser
	 */
	public String getBrowser() {
		return browser;
	}

	/**
	 * @param browser the browser to set
	 */
	public void setBrowser(String browser) {
		this.browser = browser;
	}

	/**
	 * @return the browserVersion
	 */
	public String getBrowserVersion() {
		return browserVersion;
	}

	/**
	 * @param browserVersion the browserVersion to set
	 */
	public void setBrowserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
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


	/**
	 * @return the modifiedDate
	 */
	public Timestamp getModifiedDate() {
		return modifiedDate;
	}


	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Job [id=" + id + ", message=" + message.toString() + ", time=" + time
				+ ", queue=" + queue + ", hostIP=" + hostIP + "]";
	}
	
	
}
