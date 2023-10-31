package datamodel;

public class Instructors extends Students {

	private int instructorId;
	private String instructorName;
	private String subject;
	private String phoneNumber;
	private String targetYear;
	private String instructorEmail;
	public String getTargetYear() {
		return targetYear;
	}
	public void setTargetYear(String targetYear) {
		this.targetYear = targetYear;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public String getInstructorEmail() {
		return instructorEmail;
	}
	public void setInstructorEmail(String instructorEmail) {
		this.instructorEmail = instructorEmail;
	}
	@Override
	public String toString() {
		return "Instructors [instructorId=" + instructorId + ", instructorName=" + instructorName + ", subject="					+ subject + ", phoneNumber=" + phoneNumber + ", targetYear=" + targetYear + ", instructorEmail="
					+ instructorEmail + "]";
		}

	
}
	