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

}
