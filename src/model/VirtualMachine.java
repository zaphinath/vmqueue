/**
 * 
 */
package model;

import java.sql.Timestamp;
import java.util.HashMap;

/**
 * @author Derek Carr
 *
 */
public class VirtualMachine {
	
	private int id;
	private String hostname;
	private int osId;
	private String IP;
	private boolean available;
	private boolean inQueue;
	private double currentQueueTime;
	private int numberQueueJobs;
	private String currentJob;
	private HashMap<String, String> browsers;
	private Timestamp modifiedDate;
	private Timestamp createdDate;
	
	/**
	 * Class Constructor
	 */
	public VirtualMachine(){
		this.id = -1;
		this.hostname = null;
		this.osId = -1;
		this.IP = null;
		this.available = false;
		this.inQueue = false;
		this.currentQueueTime = 0;
		this.numberQueueJobs = 0;
		this.browsers = null;
		this.modifiedDate = null;
		this.createdDate = null;
		this.currentJob = null;
	}
	
	/**
	 * Class Constructor with params
	 * @param id
	 * @param hostname
	 * @param os
	 * @param IP
	 * @param availabe
	 * @param inQueue
	 */
	public VirtualMachine(int id, String hostname, String IP, int osId, boolean available, boolean inQueue,
			double curTime, int numJobs, String currentJob, Timestamp modifiedDate, Timestamp createdDate) {
		this.id = id;
		this.hostname = hostname;
		this.osId = osId;
		this.IP = IP;
		this.available = available;
		this.inQueue = inQueue;
		this.currentQueueTime = curTime;
		this.numberQueueJobs = numJobs;
		this.currentJob = currentJob;
		this.modifiedDate = modifiedDate;
		this.createdDate = createdDate;
	}
	

	/**
	 * @param id
	 * @param hostname
	 * @param osId
	 * @param iP
	 * @param available
	 * @param inQueue
	 * @param currentQueueTime
	 * @param numberQueueJobs
	 * @param currentJob
	 * @param browsers
	 * @param modifiedDate
	 * @param createdDate
	 */
	public VirtualMachine(int id, String hostname, int osId, String iP,
			boolean available, boolean inQueue,
			double currentQueueTime, int numberQueueJobs, String currentJob,
			HashMap<String, String> browsers, Timestamp modifiedDate,
			Timestamp createdDate) {
		super();
		this.id = id;
		this.hostname = hostname;
		this.osId = osId;
		IP = iP;
		this.available = available;
		this.inQueue = inQueue;
		this.currentQueueTime = currentQueueTime;
		this.numberQueueJobs = numberQueueJobs;
		this.currentJob = currentJob;
		this.browsers = browsers;
		this.modifiedDate = modifiedDate;
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
	 * @return the currentQueueTime
	 */
	public double getCurrentQueueTime() {
		return currentQueueTime;
	}

	/**
	 * @param currentQueueTime the currentQueueTime to set
	 */
	public void setCurrentQueueTime(double currentQueueTime) {
		this.currentQueueTime = currentQueueTime;
	}

	/**
	 * @return the numberQueueJobs
	 */
	public int getNumberQueueJobs() {
		return numberQueueJobs;
	}

	/**
	 * @param numberQueueJobs the numberQueueJobs to set
	 */
	public void setNumberQueueJobs(int numberQueueJobs) {
		this.numberQueueJobs = numberQueueJobs;
	}

	/**
	 * @return the browsers
	 */
	public HashMap<String, String> getBrowsers() {
		return browsers;
	}

	/**
	 * @param browsers the browsers to set
	 */
	public void setBrowsers(HashMap<String, String> browsers) {
		this.browsers = browsers;
	}

	/**
	 * @return the currentJob
	 */
	public String getCurrentJob() {
		return currentJob;
	}

	/**
	 * @param currentJob the currentJob to set
	 */
	public void setCurrentJob(String currentJob) {
		this.currentJob = currentJob;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VirtualMachine [id=" + id + ", hostname=" + hostname
				+ ", osId=" + osId + ", IP=" + IP + ", available=" + available
				+ ", inQueue=" + inQueue + ", currentQueueTime="
				+ currentQueueTime + ", numberQueueJobs=" + numberQueueJobs
				+ ", currentJob=" + currentJob + ", browsers=" + browsers
				+ ", modifiedDate=" + modifiedDate + ", createdDate="
				+ createdDate + "]";
	}

	
}
