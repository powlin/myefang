package com.cxf.dao;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class BaseDao extends JdbcDaoSupport{
	
	@Resource(name = "jdbcTemplate") // 通过bean名称注入
    protected JdbcTemplate jdbcTemplate;

	@PostConstruct // 完成jdbcTemplate初始化工作
    protected void initJdbcTemplate() {
        super.setJdbcTemplate(jdbcTemplate);
    }
	
}
