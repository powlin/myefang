package com.yaoyan.user.service.impl;

import com.yaoyan.user.dao.UserDao;
import com.yaoyan.user.domain.User;
import com.yaoyan.user.service.UserService;

public class UserServiceImp implements UserService{

	private UserDao userDao;
	public UserDao getLoginDao() {
		return userDao;
	}
	public void setLoginDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public User getUsernameAndPassword(String username, String password) {
		User user = userDao.getUsernameAndPassword(username, password);
		return user;
	}
	public long insertNewUser(String username, String password) {
		long num = userDao.insertNewUser(username, password);
		return num;
	}
	public User getUsername(String username) {
		User user = userDao.getUsername(username);
		return user;
	}
}
