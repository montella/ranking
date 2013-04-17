package com.dc.ranking.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dc.ranking.dao.UserDao;
import com.dc.ranking.model.UserBean;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;

@Component
public class UserDaoImpl implements UserDao
{	
	
	/* ********* */
	/* ATRIBUTOS */
	/* ********* */
	
	@Autowired 
	private ObjectifyFactory objectifyFactory;
	
	/* ******* */
	/* METHODS */
	/* ******* */	
	
	/**
	 * Creates a new user.
	 */
	public void create(UserBean user)
	{
		Objectify ofy = objectifyFactory.begin();
		ofy.save().entity(user).now();
	}

	/**
	 * Returns a list of all users
	 */
	public List<UserBean> findAll()
	{
	    Objectify ofy = objectifyFactory.begin();
	    ofy.load().type(UserBean.class);
	    List<UserBean> persons = ofy.load().type(UserBean.class).list();
	    return persons;
	}
}
