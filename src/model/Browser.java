package model;

import java.util.Date;


public class Browser {

	private int id;
  private String browserName;
  private String browserVersion;
  private Date createdDate;
  private Date modifiedDate;
  
  /**
   * Class Constructor
   */
  public Browser() {
  	this.id = -1;
  	this.browserName = null;
  	this.browserVersion = null;
  	this.createdDate = null;
  	this.modifiedDate = null;
  }
  
  /**
   * Class Constructor with params
   * @param id
   * @param browserName
   * @param browserVersion
   * @param createdDate
   * @param modifiedDate
   */
  public Browser(int id, String browserName, String browserVersion, Date createdDate, Date modifiedDate) {
  	this.id = id;
  	this.browserName = browserName;
  	this.browserVersion = browserVersion;
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
	 * @return the browserName
	 */
	public String getBrowserName() {
		return browserName;
	}

	/**
	 * @param browserName the browserName to set
	 */
	public void setBrowserName(String browserName) {
		this.browserName = browserName;
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
