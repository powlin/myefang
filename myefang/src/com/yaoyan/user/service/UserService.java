package com.yaoyan.user.service;

import com.yaoyan.user.domain.User;

public interface UserService {

	User getUsernameAndPassword(String username, String password);

	long insertNewUser(String username, String password);

	User getUsername(String username);

}
