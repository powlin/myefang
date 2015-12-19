package com.yaoyan.user.dao;

import java.util.List;

import com.yaoyan.user.domain.Menu;

public interface MenuDao {

	List<Menu> getMenuByUsername(String username);

}
