package com.java.rms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class RestaurantDaoImpl implements RestaurantDAO{

	SessionFactory sf;
	Session session;
	
	@Override
	public List<Restaurant> showRestaurantsDao() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(Restaurant.class);
		List<Restaurant> restaurantsList = criteria.list();
		return restaurantsList;
	}

}
