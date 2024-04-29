package com.java.ejb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor_master")
public class Doctor implements Serializable {
	
	@Id
	@Column(name="Dr_id")
	private String doctorId;
	@Column(name="Dr_name")
	private String doctorName;
	@Column(name="Dept")
	private String dept;
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Doctor(String doctorId, String doctorName, String dept) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.dept = dept;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", dept=" + dept + "]";
	}
	
	

}
