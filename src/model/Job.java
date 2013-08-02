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
	private String message;
	private double time;
	private int queue;
	private String hostIP;
	private boolean completed;
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
	 * @param createdDate
	 * @param modifiedDate
	 */
	public Job(int id, int batchId, String message, double time, int queue,
			String hostIP, boolean completed, Timestamp createdDate,
			Timestamp modifiedDate) {
		super();
		this.id = id;
		this.batchId = batchId;
		this.message = message;
		this.time = time;
		this.queue = queue;
		this.hostIP = hostIP;
		this.completed = completed;
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
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
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
		return "Job [id=" + id + ", message=" + message + ", time=" + time
				+ ", queue=" + queue + ", hostIP=" + hostIP + "]";
	}
	
	
}
