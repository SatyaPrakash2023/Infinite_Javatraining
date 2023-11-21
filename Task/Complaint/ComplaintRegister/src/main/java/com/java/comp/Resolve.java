package com.java.comp;

import java.util.Date;

public class Resolve {
	private String ResolveID;
	private String CompalintId;
	private Date Complaintdate;
	private Date ResolveDate;
	private String ResolvedBy;
	private String Comments;
	public Resolve() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Resolve(String resolveID, String compalintId, Date complaintdate, Date resolveDate, String resolvedBy,
			String comments) {
		super();
		ResolveID = resolveID;
		CompalintId = compalintId;
		Complaintdate = complaintdate;
		ResolveDate = resolveDate;
		ResolvedBy = resolvedBy;
		Comments = comments;
	}
	public String getResolveID() {
		return ResolveID;
	}
	public void setResolveID(String resolveID) {
		ResolveID = resolveID;
	}
	public String getCompalintId() {
		return CompalintId;
	}
	public void setCompalintId(String compalintId) {
		CompalintId = compalintId;
	}
	public Date getComplaintdate() {
		return Complaintdate;
	}
	public void setComplaintdate(Date complaintdate) {
		Complaintdate = complaintdate;
	}
	public Date getResolveDate() {
		return ResolveDate;
	}
	public void setResolveDate(Date resolveDate) {
		ResolveDate = resolveDate;
	}
	public String getResolvedBy() {
		return ResolvedBy;
	}
	public void setResolvedBy(String resolvedBy) {
		ResolvedBy = resolvedBy;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	@Override
	public String toString() {
		return "Resolve [ResolveID=" + ResolveID + ", CompalintId=" + CompalintId + ", Complaintdate=" + Complaintdate
				+ ", ResolveDate=" + ResolveDate + ", ResolvedBy=" + ResolvedBy + ", Comments=" + Comments + "]";
	}
	
	

}
