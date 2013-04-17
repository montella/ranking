package com.dc.ranking.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dc.ranking.dao.UserDao;
import com.dc.ranking.model.UserBean;

@Component
public class UserDaoImpl implements UserDao
{	
	/**
	 * Creates a new user.
	 */
	public void create(UserBean user)
	{
		
	}

	/**
	 * Returns a list of all users
	 */
	public List<UserBean> findAll()
	{
		return null;
	}
}
