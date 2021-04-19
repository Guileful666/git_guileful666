package Jejuwifi.model;

public class WifiItem {
	
	private String baseDate= null;
	private String apGroupName = null;
	private String uploadBytes = null;
	private String downloadBytes = null;
	private String sessionTime = null;
	private String userCount = null;
	public WifiItem(String baseDate, String apGroupName, String uploadBytes, String downloadBytes, String sessionTime,
			String userCount) {
		super();
		this.baseDate = baseDate;
		this.apGroupName = apGroupName;
		this.uploadBytes = uploadBytes;
		this.downloadBytes = downloadBytes;
		this.sessionTime = sessionTime;
		this.userCount = userCount;
	}
	public String getBaseDate() {
		return baseDate;
	}
	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;
	}
	public String getApGroupName() {
		return apGroupName;
	}
	public void setApGroupName(String apGroupName) {
		this.apGroupName = apGroupName;
	}
	public String getUploadBytes() {
		return uploadBytes;
	}
	public void setUploadBytes(String uploadBytes) {
		this.uploadBytes = uploadBytes;
	}
	public String getDownloadBytes() {
		return downloadBytes;
	}
	public void setDownloadBytes(String downloadBytes) {
		this.downloadBytes = downloadBytes;
	}
	public String getSessionTime() {
		return sessionTime;
	}
	public void setSessionTime(String sessionTime) {
		this.sessionTime = sessionTime;
	}
	public String getUserCount() {
		return userCount;
	}
	public void setUserCount(String userCount) {
		this.userCount = userCount;
	}
	@Override
	public String toString() {
		return "WifiItem [baseDate=" + baseDate + ", apGroupName=" + apGroupName + ", uploadBytes=" + uploadBytes
				+ ", downloadBytes=" + downloadBytes + ", sessionTime=" + sessionTime + ", userCount=" + userCount
				+ "]";
	}
	
	

	}
	

