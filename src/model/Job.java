/**
 * 
 */
package model;

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
	 * Class Constructor with params
	 * @param id
	 * @param message
	 * @param time
	 * @param queue
	 * @param hostIP
	 */
	public Job(int id, int batchId, String message, double time, int queue, String hostIP) {
		this.id = id;
		this.batchId = batchId;
		this.message = message;
		this.time = time;
		this.queue = queue;
		this.hostIP = hostIP;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Job [id=" + id + ", message=" + message + ", time=" + time
				+ ", queue=" + queue + ", hostIP=" + hostIP + "]";
	}
	
	
}
