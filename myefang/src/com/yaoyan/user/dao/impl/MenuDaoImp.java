package com.yaoyan.user.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yaoyan.base.dao.BaseDao;
import com.yaoyan.user.dao.MenuDao;
import com.yaoyan.user.domain.Menu;

public class MenuDaoImp extends BaseDao implements MenuDao{

	@SuppressWarnings("unchecked")
	public List<Menu> getMenuByUsername(String username) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", username);
		map.put("symbol", "Y");
		List<Menu> list = getSqlMapClientTemplate().queryForList("menu.getMenuByUsername", map);
		return list;
	}


}
