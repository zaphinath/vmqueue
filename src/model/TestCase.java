/**
 * 
 */
package model;

import java.sql.Date;

/**
 * @author Derek Carr
 *
 */
public class TestCase {
	
	private int id;
	private String name;
	private String platform;
	private Date createdDate;
	private Date modifiedDate;
	
	/**
	 * 
	 */
	public TestCase() {

	}

	/**
	 * @param id
	 * @param name
	 * @param platform
	 * @param createdDate
	 * @param modifiedDate
	 */
	public TestCase(int id, String name, String platform, Date createdDate,
			Date modifiedDate) {
		super();
		this.id = id;
		this.name = name;
		this.platform = platform;
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
	 * @return the platform
	 */
	public String getPlatform() {
		return platform;
	}

	/**
	 * @param platform the platform to set
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
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
