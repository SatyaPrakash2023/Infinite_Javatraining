package com.java.comp;

import java.util.Date;

public class Complaint {
	private String ComplaintId;
	private String ComplaintType;
	private String CDescription;
	private Date ComplaintDate;
	private String severity;
	private String Status;
	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Complaint(String complaintId, String complaintType, String cDescription, Date complaintDate, String severity,
			String status) {
		super();
		ComplaintId = complaintId;
		ComplaintType = complaintType;
		CDescription = cDescription;
		ComplaintDate = complaintDate;
		this.severity = severity;
		Status = status;
	}
	public String getComplaintId() {
		return ComplaintId;
	}
	public void setComplaintId(String complaintId) {
		ComplaintId = complaintId;
	}
	public String getComplaintType() {
		return ComplaintType;
	}
	public void setComplaintType(String complaintType) {
		ComplaintType = complaintType;
	}
	public String getCDescription() {
		return CDescription;
	}
	public void setCDescription(String cDescription) {
		CDescription = cDescription;
	}
	public Date getComplaintDate() {
		return ComplaintDate;
	}
	public void setComplaintDate(Date complaintDate) {
		ComplaintDate = complaintDate;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "Complaint [ComplaintId=" + ComplaintId + ", ComplaintType=" + ComplaintType + ", CDescription="
				+ CDescription + ", ComplaintDate=" + ComplaintDate + ", severity=" + severity + ", Status=" + Status
				+ "]";
	}
	
	
	
	
	

}
