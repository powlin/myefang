package com.yaoyan.user.service;

import java.util.List;

import com.yaoyan.user.domain.Menu;

public interface MenuService {

	public List<Menu> getMenuByUsername(String username);

}
