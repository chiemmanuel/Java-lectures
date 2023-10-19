package datamodel;
import java.util.*; 

public class Enrollement {
	
	private String enrollementStatus;
	private String details;
	private Date date;
	public String getEnrollementStatus() {
		return enrollementStatus;
	}
	public void setEnrollementStatus(String enrollementStatus) {
		this.enrollementStatus = enrollementStatus;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
