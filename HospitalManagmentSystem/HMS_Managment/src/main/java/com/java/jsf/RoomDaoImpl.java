package com.java.jsf;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class RoomDaoImpl {
	
	public List<Room>showRoomDao(){
		SessionFactory sf=SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr=session.createCriteria(Room.class);
		List<Room>roomList=cr.list();
		return roomList;
	}

}
