package com.dc.ranking.dao;

import java.util.List;

import com.dc.ranking.model.UserBean;

public interface UserDao 
{
	/**
	 * Creates a new user.
	 */
	public void create(UserBean user);

	/**
	 * Returns a list of all users
	 */
	public List<UserBean> findAll();
}
