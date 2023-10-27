package com.java.ejb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ValueChangeEvent;

public class HmsDaoImpl implements HmsDAO{
	PreparedStatement pst;
	Connection connection;
	
	
private String localCode;
	
	
	
	public String getLocalCode() {
		return localCode;
	}

	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}
	
	public void employLocalCodeChanged(ValueChangeEvent e) {
		this.localCode=e.getNewValue().toString();
	}
	
	public List<Doctor> showDoctorDao() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from doctor_master";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Doctor> doctList = new ArrayList<Doctor>();
		Doctor doct = null;
		while(rs.next()) {
			doct = new Doctor();
			doct.setDoctId(rs.getString("doctor_Id"));
			doct.setDoctName(rs.getString("doctor_name"));
			doct.setDept(rs.getString("dept"));
			
			doctList.add(doct);
		}
		return doctList;
	}
	
	
	public List<Room> showRoomDao() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from room_master";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Room> roomList = new ArrayList<Room>();
		Room room = null;
		while(rs.next()) {
			room = new Room();
			room.setRoomNo(rs.getString("room_no"));
			room.setRoomType(rs.getString("room_Type"));
			room.setStatus(rs.getString("status"));
			
			roomList.add(room);
		}
		return roomList;
	}
	
	
	public String addPatientDao(Patient patient) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
        String cmd = "Insert into patient_master(pid,name,age,Weight,Gender,Address,PhoneNo,Disease,Doctor_id) "
         		+ " values(?,?,?,?,?,?,?,?,?)";
         PreparedStatement pst = connection.prepareStatement(cmd);
         pst.setString(1, patient.getPid());
         pst.setString(2, patient.getName());
         pst.setInt(3, patient.getAge());
         pst.setDouble(4, patient.getWeight());
         pst.setString(5, patient.getGender().toString());
         pst.setString(6, patient.getAddress());
         pst.setString(7, patient.getPhoneNo());
         pst.setString(8, patient.getDisease());
         pst.setString(9, patient.getDoctId());
         pst.executeUpdate();
         return "Employ Record Inserted...";
	}
	
	
	public List<Patient> showPatientDao() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from patient_master";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Patient> patientList = new ArrayList<Patient>();
		Patient pt = null;
		while(rs.next()) {
			pt = new Patient();
			pt.setPid(rs.getString("pid"));
			pt.setName(rs.getString("name"));
			pt.setAge(rs.getInt("age"));
			pt.setWeight(rs.getDouble("weight"));
			pt.setGender(Gender.valueOf(rs.getString("gender")));
			pt.setAddress(rs.getString("Address"));
			pt.setPhoneNo(rs.getString("PhoneNo"));
			pt.setDisease(rs.getString("Disease"));
			pt.setDoctId(rs.getString("Doctor_id"));
			
			patientList.add(pt);
		}
		return patientList;
	}


	public List<String>getRoomType() throws ClassNotFoundException, SQLException{
		connection = ConnectionHelper.getConnection();
		String cmd = "select DISTINCT room_Type from room_master";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<String> roomList = new ArrayList<String>();
		Room room = null;
		while(rs.next()) {
			room = new Room();
			room.setRoomType(rs.getString("room_Type"));
			String room1=room.toString();
			roomList.add(room1);
			
		}
		return roomList;
	}

}
