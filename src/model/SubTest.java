/**
 * 
 */
package model;

import java.sql.Timestamp;

/**
 * @author Derek Carr
 *
 */
public class SubTest {

	private int id;
	private int vmTestCaseId;
	private String name;
	
	private double timeDevFirefox;
	private double timeMasterFirefox;
	private double timeBetaFirefox;
	private double timeProdFirefox;
	
	private double timeDevChrome;
	private double timeMasterChrome;
	private double timeBetaChrome;
	private double timeProdChrome;
	
	private double timeDevIE;
	private double timeMasterIE;
	private double timeBetaIE;
	private double timeProdIE;
	
	private int numErrorDevFirefox;
	private int numErrorMasterFirefox;
	private int numErrorBetaFirefox;
	private int numErrorProdFirefox;
	
	private int numErrorDevChrome;
	private int numErrorMasterChrome;
	private int numErrorBetaChrome;
	private int numErrorProdChrome;
	
	private int numErrorDevIE;
	private int numErrorMasterIE;
	private int numErrorBetaIE;
	private int numErrorProdIE;
	
	private int numFailureDevFirefox;
	private int numFailureMasterFirefox;
	private int numFailureBetaFirefox;
	private int numFailureProdFirefox;
	
	private int numFailureDevChrome;
	private int numFailureMasterChrome;
	private int numFailureBetaChrome;
	private int numFailureProdChrome;
	
	private int numFailureDevIE;
	private int numFailureMasterIE;
	private int numFailureBetaIE;
	private int numFailureProdIE;
	
	private int numberTests;
	private Timestamp createdDate;
	private Timestamp modifiedDate;
	
	/**
	 * Class Constructor 
	 */
	public SubTest() {

	}

	
	
	/**
	 * @param id
	 * @param vmTestCaseId
	 * @param name
	 * @param timeDevFirefox
	 * @param timeMasterFirefox
	 * @param timeBetaFirefox
	 * @param timeProdFirefox
	 * @param timeDevChrome
	 * @param timeMasterChrome
	 * @param timeBetaChrome
	 * @param timeProdChrome
	 * @param timeDevIE
	 * @param timeMasterIE
	 * @param timeBetaIE
	 * @param timeProdIE
	 * @param numErrorDevFirefox
	 * @param numErrorMasterFirefox
	 * @param numErrorBetaFirefox
	 * @param numErrorProdFirefox
	 * @param numErrorDevChrome
	 * @param numErrorMasterChrome
	 * @param numErrorBetaChrome
	 * @param numErrorProdChrome
	 * @param numErrorDevIE
	 * @param numErrorMasterIE
	 * @param numErrorBetaIE
	 * @param numErrorProdIE
	 * @param numFailureDevFirefox
	 * @param numFailureMasterFirefox
	 * @param numFailureBetaFirefox
	 * @param numFailureProdFirefox
	 * @param numFailureDevChrome
	 * @param numFailureMasterChrome
	 * @param numFailureBetaChrome
	 * @param numFailureProdChrome
	 * @param numFailureDevIE
	 * @param numFailureMasterIE
	 * @param numFailureBetaIE
	 * @param numFailureProdIE
	 * @param numberTests
	 * @param createdDate
	 * @param modifiedDate
	 */
	public SubTest(int id, int vmTestCaseId, String name, double timeDevFirefox,
			double timeMasterFirefox, double timeBetaFirefox, double timeProdFirefox,
			double timeDevChrome, double timeMasterChrome, double timeBetaChrome,
			double timeProdChrome, double timeDevIE, double timeMasterIE,
			double timeBetaIE, double timeProdIE, int numErrorDevFirefox,
			int numErrorMasterFirefox, int numErrorBetaFirefox,
			int numErrorProdFirefox, int numErrorDevChrome, int numErrorMasterChrome,
			int numErrorBetaChrome, int numErrorProdChrome, int numErrorDevIE,
			int numErrorMasterIE, int numErrorBetaIE, int numErrorProdIE,
			int numFailureDevFirefox, int numFailureMasterFirefox,
			int numFailureBetaFirefox, int numFailureProdFirefox,
			int numFailureDevChrome, int numFailureMasterChrome,
			int numFailureBetaChrome, int numFailureProdChrome, int numFailureDevIE,
			int numFailureMasterIE, int numFailureBetaIE, int numFailureProdIE,
			int numberTests, Timestamp createdDate, Timestamp modifiedDate) {
		super();
		this.id = id;
		this.vmTestCaseId = vmTestCaseId;
		this.name = name;
		this.timeDevFirefox = timeDevFirefox;
		this.timeMasterFirefox = timeMasterFirefox;
		this.timeBetaFirefox = timeBetaFirefox;
		this.timeProdFirefox = timeProdFirefox;
		this.timeDevChrome = timeDevChrome;
		this.timeMasterChrome = timeMasterChrome;
		this.timeBetaChrome = timeBetaChrome;
		this.timeProdChrome = timeProdChrome;
		this.timeDevIE = timeDevIE;
		this.timeMasterIE = timeMasterIE;
		this.timeBetaIE = timeBetaIE;
		this.timeProdIE = timeProdIE;
		this.numErrorDevFirefox = numErrorDevFirefox;
		this.numErrorMasterFirefox = numErrorMasterFirefox;
		this.numErrorBetaFirefox = numErrorBetaFirefox;
		this.numErrorProdFirefox = numErrorProdFirefox;
		this.numErrorDevChrome = numErrorDevChrome;
		this.numErrorMasterChrome = numErrorMasterChrome;
		this.numErrorBetaChrome = numErrorBetaChrome;
		this.numErrorProdChrome = numErrorProdChrome;
		this.numErrorDevIE = numErrorDevIE;
		this.numErrorMasterIE = numErrorMasterIE;
		this.numErrorBetaIE = numErrorBetaIE;
		this.numErrorProdIE = numErrorProdIE;
		this.numFailureDevFirefox = numFailureDevFirefox;
		this.numFailureMasterFirefox = numFailureMasterFirefox;
		this.numFailureBetaFirefox = numFailureBetaFirefox;
		this.numFailureProdFirefox = numFailureProdFirefox;
		this.numFailureDevChrome = numFailureDevChrome;
		this.numFailureMasterChrome = numFailureMasterChrome;
		this.numFailureBetaChrome = numFailureBetaChrome;
		this.numFailureProdChrome = numFailureProdChrome;
		this.numFailureDevIE = numFailureDevIE;
		this.numFailureMasterIE = numFailureMasterIE;
		this.numFailureBetaIE = numFailureBetaIE;
		this.numFailureProdIE = numFailureProdIE;
		this.numberTests = numberTests;
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
	 * @return the vmTestCaseId
	 */
	public int getVmTestCaseId() {
		return vmTestCaseId;
	}

	/**
	 * @param vmTestCaseId the vmTestCaseId to set
	 */
	public void setVmTestCaseId(int vmTestCaseId) {
		this.vmTestCaseId = vmTestCaseId;
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
	 * @return the timeDevFirefox
	 */
	public double getTimeDevFirefox() {
		return timeDevFirefox;
	}

	/**
	 * @param timeDevFirefox the timeDevFirefox to set
	 */
	public void setTimeDevFirefox(double timeDevFirefox) {
		this.timeDevFirefox = timeDevFirefox;
	}

	/**
	 * @return the timeMasterFirefox
	 */
	public double getTimeMasterFirefox() {
		return timeMasterFirefox;
	}

	/**
	 * @param timeMasterFirefox the timeMasterFirefox to set
	 */
	public void setTimeMasterFirefox(double timeMasterFirefox) {
		this.timeMasterFirefox = timeMasterFirefox;
	}

	/**
	 * @return the timeBetaFirefox
	 */
	public double getTimeBetaFirefox() {
		return timeBetaFirefox;
	}

	/**
	 * @param timeBetaFirefox the timeBetaFirefox to set
	 */
	public void setTimeBetaFirefox(double timeBetaFirefox) {
		this.timeBetaFirefox = timeBetaFirefox;
	}

	/**
	 * @return the timeProdFirefox
	 */
	public double getTimeProdFirefox() {
		return timeProdFirefox;
	}

	/**
	 * @param timeProdFirefox the timeProdFirefox to set
	 */
	public void setTimeProdFirefox(double timeProdFirefox) {
		this.timeProdFirefox = timeProdFirefox;
	}

	/**
	 * @return the timeDevChrome
	 */
	public double getTimeDevChrome() {
		return timeDevChrome;
	}

	/**
	 * @param timeDevChrome the timeDevChrome to set
	 */
	public void setTimeDevChrome(double timeDevChrome) {
		this.timeDevChrome = timeDevChrome;
	}

	/**
	 * @return the timeMasterChrome
	 */
	public double getTimeMasterChrome() {
		return timeMasterChrome;
	}

	/**
	 * @param timeMasterChrome the timeMasterChrome to set
	 */
	public void setTimeMasterChrome(double timeMasterChrome) {
		this.timeMasterChrome = timeMasterChrome;
	}

	/**
	 * @return the timeBetaChrome
	 */
	public double getTimeBetaChrome() {
		return timeBetaChrome;
	}

	/**
	 * @param timeBetaChrome the timeBetaChrome to set
	 */
	public void setTimeBetaChrome(double timeBetaChrome) {
		this.timeBetaChrome = timeBetaChrome;
	}

	/**
	 * @return the timeProdChrome
	 */
	public double getTimeProdChrome() {
		return timeProdChrome;
	}

	/**
	 * @param timeProdChrome the timeProdChrome to set
	 */
	public void setTimeProdChrome(double timeProdChrome) {
		this.timeProdChrome = timeProdChrome;
	}

	/**
	 * @return the timeDevIE
	 */
	public double getTimeDevIE() {
		return timeDevIE;
	}

	/**
	 * @param timeDevIE the timeDevIE to set
	 */
	public void setTimeDevIE(double timeDevIE) {
		this.timeDevIE = timeDevIE;
	}

	/**
	 * @return the timeMasterIE
	 */
	public double getTimeMasterIE() {
		return timeMasterIE;
	}

	/**
	 * @param timeMasterIE the timeMasterIE to set
	 */
	public void setTimeMasterIE(double timeMasterIE) {
		this.timeMasterIE = timeMasterIE;
	}

	/**
	 * @return the timeBetaIE
	 */
	public double getTimeBetaIE() {
		return timeBetaIE;
	}

	/**
	 * @param timeBetaIE the timeBetaIE to set
	 */
	public void setTimeBetaIE(double timeBetaIE) {
		this.timeBetaIE = timeBetaIE;
	}

	/**
	 * @return the timeProdIE
	 */
	public double getTimeProdIE() {
		return timeProdIE;
	}

	/**
	 * @param timeProdIE the timeProdIE to set
	 */
	public void setTimeProdIE(double timeProdIE) {
		this.timeProdIE = timeProdIE;
	}

	/**
	 * @return the numErrorDevFirefox
	 */
	public int getNumErrorDevFirefox() {
		return numErrorDevFirefox;
	}

	/**
	 * @param numErrorDevFirefox the numErrorDevFirefox to set
	 */
	public void setNumErrorDevFirefox(int numErrorDevFirefox) {
		this.numErrorDevFirefox = numErrorDevFirefox;
	}

	/**
	 * @return the numErrorMasterFirefox
	 */
	public int getNumErrorMasterFirefox() {
		return numErrorMasterFirefox;
	}

	/**
	 * @param numErrorMasterFirefox the numErrorMasterFirefox to set
	 */
	public void setNumErrorMasterFirefox(int numErrorMasterFirefox) {
		this.numErrorMasterFirefox = numErrorMasterFirefox;
	}

	/**
	 * @return the numErrorBetaFirefox
	 */
	public int getNumErrorBetaFirefox() {
		return numErrorBetaFirefox;
	}

	/**
	 * @param numErrorBetaFirefox the numErrorBetaFirefox to set
	 */
	public void setNumErrorBetaFirefox(int numErrorBetaFirefox) {
		this.numErrorBetaFirefox = numErrorBetaFirefox;
	}

	/**
	 * @return the numErrorProdFirefox
	 */
	public int getNumErrorProdFirefox() {
		return numErrorProdFirefox;
	}

	/**
	 * @param numErrorProdFirefox the numErrorProdFirefox to set
	 */
	public void setNumErrorProdFirefox(int numErrorProdFirefox) {
		this.numErrorProdFirefox = numErrorProdFirefox;
	}

	/**
	 * @return the numErrorDevChrome
	 */
	public int getNumErrorDevChrome() {
		return numErrorDevChrome;
	}

	/**
	 * @param numErrorDevChrome the numErrorDevChrome to set
	 */
	public void setNumErrorDevChrome(int numErrorDevChrome) {
		this.numErrorDevChrome = numErrorDevChrome;
	}

	/**
	 * @return the numErrorMasterChrome
	 */
	public int getNumErrorMasterChrome() {
		return numErrorMasterChrome;
	}

	/**
	 * @param numErrorMasterChrome the numErrorMasterChrome to set
	 */
	public void setNumErrorMasterChrome(int numErrorMasterChrome) {
		this.numErrorMasterChrome = numErrorMasterChrome;
	}

	/**
	 * @return the numErrorBetaChrome
	 */
	public int getNumErrorBetaChrome() {
		return numErrorBetaChrome;
	}

	/**
	 * @param numErrorBetaChrome the numErrorBetaChrome to set
	 */
	public void setNumErrorBetaChrome(int numErrorBetaChrome) {
		this.numErrorBetaChrome = numErrorBetaChrome;
	}

	/**
	 * @return the numErrorProdChrome
	 */
	public int getNumErrorProdChrome() {
		return numErrorProdChrome;
	}

	/**
	 * @param numErrorProdChrome the numErrorProdChrome to set
	 */
	public void setNumErrorProdChrome(int numErrorProdChrome) {
		this.numErrorProdChrome = numErrorProdChrome;
	}

	/**
	 * @return the numErrorDevIE
	 */
	public int getNumErrorDevIE() {
		return numErrorDevIE;
	}

	/**
	 * @param numErrorDevIE the numErrorDevIE to set
	 */
	public void setNumErrorDevIE(int numErrorDevIE) {
		this.numErrorDevIE = numErrorDevIE;
	}

	/**
	 * @return the numErrorMasterIE
	 */
	public int getNumErrorMasterIE() {
		return numErrorMasterIE;
	}

	/**
	 * @param numErrorMasterIE the numErrorMasterIE to set
	 */
	public void setNumErrorMasterIE(int numErrorMasterIE) {
		this.numErrorMasterIE = numErrorMasterIE;
	}

	/**
	 * @return the numErrorBetaIE
	 */
	public int getNumErrorBetaIE() {
		return numErrorBetaIE;
	}

	/**
	 * @param numErrorBetaIE the numErrorBetaIE to set
	 */
	public void setNumErrorBetaIE(int numErrorBetaIE) {
		this.numErrorBetaIE = numErrorBetaIE;
	}

	/**
	 * @return the numErrorProdIE
	 */
	public int getNumErrorProdIE() {
		return numErrorProdIE;
	}

	/**
	 * @param numErrorProdIE the numErrorProdIE to set
	 */
	public void setNumErrorProdIE(int numErrorProdIE) {
		this.numErrorProdIE = numErrorProdIE;
	}

	/**
	 * @return the numFailureDevFirefox
	 */
	public int getNumFailureDevFirefox() {
		return numFailureDevFirefox;
	}

	/**
	 * @param numFailureDevFirefox the numFailureDevFirefox to set
	 */
	public void setNumFailureDevFirefox(int numFailureDevFirefox) {
		this.numFailureDevFirefox = numFailureDevFirefox;
	}

	/**
	 * @return the numFailureMasterFirefox
	 */
	public int getNumFailureMasterFirefox() {
		return numFailureMasterFirefox;
	}

	/**
	 * @param numFailureMasterFirefox the numFailureMasterFirefox to set
	 */
	public void setNumFailureMasterFirefox(int numFailureMasterFirefox) {
		this.numFailureMasterFirefox = numFailureMasterFirefox;
	}

	/**
	 * @return the numFailureBetaFirefox
	 */
	public int getNumFailureBetaFirefox() {
		return numFailureBetaFirefox;
	}

	/**
	 * @param numFailureBetaFirefox the numFailureBetaFirefox to set
	 */
	public void setNumFailureBetaFirefox(int numFailureBetaFirefox) {
		this.numFailureBetaFirefox = numFailureBetaFirefox;
	}

	/**
	 * @return the numFailureProdFirefox
	 */
	public int getNumFailureProdFirefox() {
		return numFailureProdFirefox;
	}

	/**
	 * @param numFailureProdFirefox the numFailureProdFirefox to set
	 */
	public void setNumFailureProdFirefox(int numFailureProdFirefox) {
		this.numFailureProdFirefox = numFailureProdFirefox;
	}

	/**
	 * @return the numFailureDevChrome
	 */
	public int getNumFailureDevChrome() {
		return numFailureDevChrome;
	}

	/**
	 * @param numFailureDevChrome the numFailureDevChrome to set
	 */
	public void setNumFailureDevChrome(int numFailureDevChrome) {
		this.numFailureDevChrome = numFailureDevChrome;
	}

	/**
	 * @return the numFailureMasterChrome
	 */
	public int getNumFailureMasterChrome() {
		return numFailureMasterChrome;
	}

	/**
	 * @param numFailureMasterChrome the numFailureMasterChrome to set
	 */
	public void setNumFailureMasterChrome(int numFailureMasterChrome) {
		this.numFailureMasterChrome = numFailureMasterChrome;
	}

	/**
	 * @return the numFailureBetaChrome
	 */
	public int getNumFailureBetaChrome() {
		return numFailureBetaChrome;
	}

	/**
	 * @param numFailureBetaChrome the numFailureBetaChrome to set
	 */
	public void setNumFailureBetaChrome(int numFailureBetaChrome) {
		this.numFailureBetaChrome = numFailureBetaChrome;
	}

	/**
	 * @return the numFailureProdChrome
	 */
	public int getNumFailureProdChrome() {
		return numFailureProdChrome;
	}

	/**
	 * @param numFailureProdChrome the numFailureProdChrome to set
	 */
	public void setNumFailureProdChrome(int numFailureProdChrome) {
		this.numFailureProdChrome = numFailureProdChrome;
	}

	/**
	 * @return the numFailureDevIE
	 */
	public int getNumFailureDevIE() {
		return numFailureDevIE;
	}

	/**
	 * @param numFailureDevIE the numFailureDevIE to set
	 */
	public void setNumFailureDevIE(int numFailureDevIE) {
		this.numFailureDevIE = numFailureDevIE;
	}

	/**
	 * @return the numFailureMasterIE
	 */
	public int getNumFailureMasterIE() {
		return numFailureMasterIE;
	}

	/**
	 * @param numFailureMasterIE the numFailureMasterIE to set
	 */
	public void setNumFailureMasterIE(int numFailureMasterIE) {
		this.numFailureMasterIE = numFailureMasterIE;
	}

	/**
	 * @return the numFailureBetaIE
	 */
	public int getNumFailureBetaIE() {
		return numFailureBetaIE;
	}

	/**
	 * @param numFailureBetaIE the numFailureBetaIE to set
	 */
	public void setNumFailureBetaIE(int numFailureBetaIE) {
		this.numFailureBetaIE = numFailureBetaIE;
	}

	/**
	 * @return the numFailureProdIE
	 */
	public int getNumFailureProdIE() {
		return numFailureProdIE;
	}

	/**
	 * @param numFailureProdIE the numFailureProdIE to set
	 */
	public void setNumFailureProdIE(int numFailureProdIE) {
		this.numFailureProdIE = numFailureProdIE;
	}

	/**
	 * @return the numberTests
	 */
	public int getNumberTests() {
		return numberTests;
	}

	/**
	 * @param numberTests the numberTests to set
	 */
	public void setNumberTests(int numberTests) {
		this.numberTests = numberTests;
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
