package com.yaoyan.user.dao;

import com.yaoyan.user.domain.User;

public interface UserDao{

	User getUsernameAndPassword(String username, String password);

	long insertNewUser(String username, String password);

	User getUsername(String username);

}
