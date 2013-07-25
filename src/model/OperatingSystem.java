/**
 * 
 */
package model;

import java.sql.Timestamp;

/**
 * @author Derek Carr
 *
 */
public class OperatingSystem {
	
	private int id;
	private String name;
	private String arch;
	private Timestamp createdDate;
	private Timestamp modifiedDate;
	
	public OperatingSystem() {
		this.id = -1;
		this.name = null;
		this.arch = null;
		this.createdDate = null;
		this.modifiedDate = null;
		
	}
	
	/**
	 * @param id
	 * @param name
	 * @param arch
	 * @param createdDate
	 * @param modifiedDate
	 */
	public OperatingSystem(int id, String name, String arch,
			Timestamp createdDate, Timestamp modifiedDate) {
		super();
		this.id = id;
		this.name = name;
		this.arch = arch;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the arch
	 */
	public String getArch() {
		return arch;
	}
	/**
	 * @param arch the arch to set
	 */
	public void setArch(String arch) {
		this.arch = arch;
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
		return "OperatingSystem [id=" + id + ", name=" + name + ", arch=" + arch
				+ ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate
				+ "]";
	}
	
	
	
}
