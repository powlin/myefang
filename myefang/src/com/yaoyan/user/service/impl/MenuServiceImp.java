package com.yaoyan.user.service.impl;

import java.util.List;

import com.yaoyan.user.dao.MenuDao;
import com.yaoyan.user.domain.Menu;
import com.yaoyan.user.service.MenuService;

public class MenuServiceImp implements MenuService{

	private MenuDao menuDao;
	public MenuDao getMenuDao() {
		return menuDao;
	}
	public void setMenuDao(MenuDao menuDao) {
		this.menuDao = menuDao;
	}
	public List<Menu> getMenuByUsername(String username) {
		return menuDao.getMenuByUsername(username);
	}

}
