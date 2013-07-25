package model;

import java.sql.Timestamp;


public class Browser {

	private int id;
  private String browserName;
  private String browserVersion;
  private Timestamp createdDate;
  private Timestamp modifiedDate;
  
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
  public Browser(int id, String browserName, String browserVersion, Timestamp createdDate, Timestamp modifiedDate) {
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
		return "Browser [id=" + id + ", browserName=" + browserName
				+ ", browserVersion=" + browserVersion + ", createdDate=" + createdDate
				+ ", modifiedDate=" + modifiedDate + "]";
	}
  
  
  
}
