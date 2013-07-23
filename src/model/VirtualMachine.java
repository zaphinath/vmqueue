/**
 * 
 */
package model;

import java.util.Date;

/**
 * @author Derek Carr
 *
 */
public class VirtualMachine {
	
	private int id;
	private String hostname;
	private int osId;
	private String IP;
	private int height;
	private boolean available;
	private boolean inQueue;
	private Date modifiedDate;
	private Date createdDate;
	
	/**
	 * Class Constructor
	 */
	public VirtualMachine(){
		this.id = -1;
		this.hostname = null;
		this.osId = -1;
		this.IP = null;
		this.height = -1;
		this.available = false;
		this.inQueue = false;
		this.modifiedDate = null;
		this.createdDate = null;
	}
	
	/**
	 * Class Constructor with params
	 * @param id
	 * @param hostname
	 * @param os
	 * @param IP
	 * @param height
	 * @param availabe
	 * @param inQueue
	 */
	public VirtualMachine(int id, String hostname, String IP, int osId, boolean available, boolean inQueue, Date modifiedDate, Date createdDate) {
		this.id = id;
		this.hostname = hostname;
		this.osId = osId;
		this.IP = IP;
		this.height = 0;
		this.available = available;
		this.inQueue = inQueue;
		this.modifiedDate = modifiedDate;
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
	 * @return the os
	 */
	public int getOs() {
		return osId;
	}

	/**
	 * @param os the os to set
	 */
	public void setOs(int osId) {
		this.osId = osId;
	}

	/**
	 * @return the iP
	 */
	public String getIP() {
		return IP;
	}

	/**
	 * @param iP the iP to set
	 */
	public void setIP(String iP) {
		IP = iP;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the available
	 */
	public boolean isAvailable() {
		return available;
	}

	/**
	 * @param available the available to set
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}

	/**
	 * @return the inQueue
	 */
	public boolean isInQueue() {
		return inQueue;
	}

	/**
	 * @param inQueue the inQueue to set
	 */
	public void setInQueue(boolean inQueue) {
		this.inQueue = inQueue;
	}

	
}
