/**
 * 
 */
package model;

import java.util.Date;

/**
 * @author Bryce
 *
 */
public class VMQueueTime {
	private int id;
	private long time;
	private int numberJobs;
	private Date createdDate;
	private Date modifiedDate;
	
	/**
	 * Class Constructor 
	 */
	public VMQueueTime() {
		
	}
	
	/**
	 * Class Constructor with parameters 
	 * @param id
	 * @param time
	 * @param numJobs
	 * @param created
	 * @param modified
	 */
	public VMQueueTime(int id, long time, int numJobs, Date created, Date modified) {
		this.id = id;
		this.time = time;
		this.numberJobs = numJobs;
		this.createdDate = created;
		this.modifiedDate = modified;
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
	 * @return the time
	 */
	public long getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(long time) {
		this.time = time;
	}
	/**
	 * @return the numberJobs
	 */
	public int getNumberJobs() {
		return numberJobs;
	}
	/**
	 * @param numberJobs the numberJobs to set
	 */
	public void setNumberJobs(int numberJobs) {
		this.numberJobs = numberJobs;
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
	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}
	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	
}
