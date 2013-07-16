/**
 * 
 */
package model;

/**
 * @author Derek Carr
 *
 */
public class NamedPipeStream {
	private String testCase;
	private String subTest;
	private String os;
	private String browser;
	private String browserVersion;
	private String url;
	private String lmpUsername;
	private String lmpPassword;
	private String sfUsername;
	private String sfPassword;
	private String email;
	private long time;
	
	/**
	 * Class Constructor
	 */
	public NamedPipeStream() {
		
	}
	
	/**
	 * Class Constructor with input array
	 * 
	 * @param input
	 */
	public NamedPipeStream(String[] input) {
		this.testCase = input[0];
		this.subTest = input[1];
		this.os = input[2];
		this.browser = input[3];
		this.browserVersion = input[4];
		this.url = input[5];
		this.lmpUsername = input[6];
		this.lmpPassword = input[7];
		this.sfUsername = input[8];
		this.sfPassword = input[9];
		this.email = input[10];
		this.time = Long.parseLong(input[11]);
	}

	/**
	 * @return the testCase
	 */
	public String getTestCase() {
		return testCase;
	}

	/**
	 * @param testCase the testCase to set
	 */
	public void setTestCase(String testCase) {
		this.testCase = testCase;
	}

	/**
	 * @return the subTest
	 */
	public String getSubTest() {
		return subTest;
	}

	/**
	 * @param subTest the subTest to set
	 */
	public void setSubTest(String subTest) {
		this.subTest = subTest;
	}

	/**
	 * @return the os
	 */
	public String getOs() {
		return os;
	}

	/**
	 * @param os the os to set
	 */
	public void setOs(String os) {
		this.os = os;
	}

	/**
	 * @return the browser
	 */
	public String getBrowser() {
		return browser;
	}

	/**
	 * @param browser the browser to set
	 */
	public void setBrowser(String browser) {
		this.browser = browser;
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
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the lmpUsername
	 */
	public String getLmpUsername() {
		return lmpUsername;
	}

	/**
	 * @param lmpUsername the lmpUsername to set
	 */
	public void setLmpUsername(String lmpUsername) {
		this.lmpUsername = lmpUsername;
	}

	/**
	 * @return the lmpPassword
	 */
	public String getLmpPassword() {
		return lmpPassword;
	}

	/**
	 * @param lmpPassword the lmpPassword to set
	 */
	public void setLmpPassword(String lmpPassword) {
		this.lmpPassword = lmpPassword;
	}

	/**
	 * @return the sfUsername
	 */
	public String getSfUsername() {
		return sfUsername;
	}

	/**
	 * @param sfUsername the sfUsername to set
	 */
	public void setSfUsername(String sfUsername) {
		this.sfUsername = sfUsername;
	}

	/**
	 * @return the sfPassword
	 */
	public String getSfPassword() {
		return sfPassword;
	}

	/**
	 * @param sfPassword the sfPassword to set
	 */
	public void setSfPassword(String sfPassword) {
		this.sfPassword = sfPassword;
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
	 * @return the time
	 */
	public long getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(long time) {
		this.time = time;
	}
	
}
