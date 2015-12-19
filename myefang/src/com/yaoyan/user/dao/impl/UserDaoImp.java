package com.yaoyan.user.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.yaoyan.base.dao.BaseDao;
import com.yaoyan.user.dao.UserDao;
import com.yaoyan.user.domain.User;

public class UserDaoImp extends BaseDao implements UserDao{

	@Transactional
	public User getUsernameAndPassword(String username, String password) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("username", username);
		params.put("password", password);
		User user = (User) getSqlMapClientTemplate().queryForObject("user.getUsernameAndPassword", params);
		if(user!=null){
			return user;
		}
		return null;
	}

	public long insertNewUser(String username, String password) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("username", username);
		params.put("password", password);
		long num = (Long) getSqlMapClientTemplate().insert("user.insertNewUser", params);
		return num;
	}

	public User getUsername(String username) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("username", username);
		User user = (User) getSqlMapClientTemplate().queryForObject("user.getUsername", params);
		if(user!=null){
			return user;
		}
		return null;
	}

}
