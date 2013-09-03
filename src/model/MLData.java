/**
 * 
 */
package model;

/**
 * @author Derek Carr
 *
 */
public class MLData {

	private int browser; // number representing browser type
	private int browserMajorVersion;
	
	private int testCaseId;
	private int subTestId;
	
	private int osName; // number representing os type
	private int arch; // 0 - 32 bit, 1 - 64 bit etc
	
	private int dayOfWeekRan;
	private int daysAgoRan;
	private int hourOfDayRan; // 24 hour clock starting at time 0
	private int secondsRan; // Time in seconds to run this test
	
	private boolean lastRanSameOSPass;
	private boolean lastRanSameBrowserPass;
	private boolean lastRanSameMachineIDPass;
	private boolean lastRanAnyPass;
	
	private int environmentRan; // Numerical value of dev, test, beta, prod, etc
	private int numTestsSubThisBatch;
	private int requestHour; //24 hour clock
		
	/**
	 * 
	 */
	public MLData() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the browser
	 */
	public int getBrowser() {
		return browser;
	}

	/**
	 * @param browser the browser to set
	 */
	public void setBrowser(int browser) {
		this.browser = browser;
	}

	/**
	 * @return the browserMajorVersion
	 */
	public int getBrowserMajorVersion() {
		return browserMajorVersion;
	}

	/**
	 * @param browserMajorVersion the browserMajorVersion to set
	 */
	public void setBrowserMajorVersion(int browserMajorVersion) {
		this.browserMajorVersion = browserMajorVersion;
	}

	/**
	 * @return the testCaseId
	 */
	public int getTestCaseId() {
		return testCaseId;
	}

	/**
	 * @param testCaseId the testCaseId to set
	 */
	public void setTestCaseId(int testCaseId) {
		this.testCaseId = testCaseId;
	}

	/**
	 * @return the subTestId
	 */
	public int getSubTestId() {
		return subTestId;
	}

	/**
	 * @param subTestId the subTestId to set
	 */
	public void setSubTestId(int subTestId) {
		this.subTestId = subTestId;
	}

	/**
	 * @return the osName
	 */
	public int getOsName() {
		return osName;
	}

	/**
	 * @param osName the osName to set
	 */
	public void setOsName(int osName) {
		this.osName = osName;
	}

	/**
	 * @return the arch
	 */
	public int getArch() {
		return arch;
	}

	/**
	 * @param arch the arch to set
	 */
	public void setArch(int arch) {
		this.arch = arch;
	}

	/**
	 * @return the dayOfWeekRan
	 */
	public int getDayOfWeekRan() {
		return dayOfWeekRan;
	}

	/**
	 * @param dayOfWeekRan the dayOfWeekRan to set
	 */
	public void setDayOfWeekRan(int dayOfWeekRan) {
		this.dayOfWeekRan = dayOfWeekRan;
	}

	/**
	 * @return the daysAgoRan
	 */
	public int getDaysAgoRan() {
		return daysAgoRan;
	}

	/**
	 * @param daysAgoRan the daysAgoRan to set
	 */
	public void setDaysAgoRan(int daysAgoRan) {
		this.daysAgoRan = daysAgoRan;
	}

	/**
	 * @return the hourOfDayRan
	 */
	public int getHourOfDayRan() {
		return hourOfDayRan;
	}

	/**
	 * @param hourOfDayRan the hourOfDayRan to set
	 */
	public void setHourOfDayRan(int hourOfDayRan) {
		this.hourOfDayRan = hourOfDayRan;
	}

	/**
	 * @return the secondsRan
	 */
	public int getSecondsRan() {
		return secondsRan;
	}

	/**
	 * @param secondsRan the secondsRan to set
	 */
	public void setSecondsRan(int secondsRan) {
		this.secondsRan = secondsRan;
	}

	/**
	 * @return the lastRanSameOSPass
	 */
	public boolean isLastRanSameOSPass() {
		return lastRanSameOSPass;
	}

	/**
	 * @param lastRanSameOSPass the lastRanSameOSPass to set
	 */
	public void setLastRanSameOSPass(boolean lastRanSameOSPass) {
		this.lastRanSameOSPass = lastRanSameOSPass;
	}

	/**
	 * @return the lastRanSameBrowserPass
	 */
	public boolean isLastRanSameBrowserPass() {
		return lastRanSameBrowserPass;
	}

	/**
	 * @param lastRanSameBrowserPass the lastRanSameBrowserPass to set
	 */
	public void setLastRanSameBrowserPass(boolean lastRanSameBrowserPass) {
		this.lastRanSameBrowserPass = lastRanSameBrowserPass;
	}

	/**
	 * @return the lastRanSameMachineIDPass
	 */
	public boolean isLastRanSameMachineIDPass() {
		return lastRanSameMachineIDPass;
	}

	/**
	 * @param lastRanSameMachineIDPass the lastRanSameMachineIDPass to set
	 */
	public void setLastRanSameMachineIDPass(boolean lastRanSameMachineIDPass) {
		this.lastRanSameMachineIDPass = lastRanSameMachineIDPass;
	}

	/**
	 * @return the lastRanAnyPass
	 */
	public boolean isLastRanAnyPass() {
		return lastRanAnyPass;
	}

	/**
	 * @param lastRanAnyPass the lastRanAnyPass to set
	 */
	public void setLastRanAnyPass(boolean lastRanAnyPass) {
		this.lastRanAnyPass = lastRanAnyPass;
	}

	/**
	 * @return the environmentRan
	 */
	public int getEnvironmentRan() {
		return environmentRan;
	}

	/**
	 * @param environmentRan the environmentRan to set
	 */
	public void setEnvironmentRan(int environmentRan) {
		this.environmentRan = environmentRan;
	}

	/**
	 * @return the numTestsSubThisBatch
	 */
	public int getNumTestsSubThisBatch() {
		return numTestsSubThisBatch;
	}

	/**
	 * @param numTestsSubThisBatch the numTestsSubThisBatch to set
	 */
	public void setNumTestsSubThisBatch(int numTestsSubThisBatch) {
		this.numTestsSubThisBatch = numTestsSubThisBatch;
	}

	/**
	 * @return the requestHour
	 */
	public int getRequestHour() {
		return requestHour;
	}

	/**
	 * @param requestHour the requestHour to set
	 */
	public void setRequestHour(int requestHour) {
		this.requestHour = requestHour;
	}

}
