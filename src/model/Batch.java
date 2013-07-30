/**
 * 
 */
package model;

import java.sql.Timestamp;

/**
 * @author Derek Carr
 *
 */
public class Batch {
	private int id;
	private int numberJobs;
	private String email;
	private double timeEstimate;
	private double timeActual;
	private boolean completed;
	private Timestamp createdDate;
	private Timestamp modifiedDate;
	
	/**
	 * @param id
	 * @param numberJobs
	 * @param email
	 * @param timeEstimate
	 * @param timeActual
	 * @param completed
	 * @param createdDate
	 * @param modifiedDate
	 */
	public Batch(int id, int numberJobs, String email, double timeEstimate,
			double timeActual, boolean completed, Timestamp createdDate,
			Timestamp modifiedDate) {
		super();
		this.id = id;
		this.numberJobs = numberJobs;
		this.email = email;
		this.timeEstimate = timeEstimate;
		this.timeActual = timeActual;
		this.completed = completed;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the timeEstimate
	 */
	public double getTimeEstimate() {
		return timeEstimate;
	}

	/**
	 * @param timeEstimate the timeEstimate to set
	 */
	public void setTimeEstimate(double timeEstimate) {
		this.timeEstimate = timeEstimate;
	}

	/**
	 * @return the timeActual
	 */
	public double getTimeActual() {
		return timeActual;
	}

	/**
	 * @param timeActual the timeActual to set
	 */
	public void setTimeActual(double timeActual) {
		this.timeActual = timeActual;
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
	
	
}
