/**
 * 
 */
package model;

import java.util.Date;

/**
 * @author Derek Carr
 *
 */
public class VMCloud2Browser {

	private int vmId;
	private int browserId;
	private Date createdDate;
	private Date modifiedDate;
	/**
	 * @return the vmId
	 */
	public int getVmId() {
		return vmId;
	}
	/**
	 * @param vmId the vmId to set
	 */
	public void setVmId(int vmId) {
		this.vmId = vmId;
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
