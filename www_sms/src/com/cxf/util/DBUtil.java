package com.cxf.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static String url;
	private static String username;
	private static String password;
	private static String driver;
	
	static{
		url = JDBCPropertiesUtil.returnParam("url");
		username = JDBCPropertiesUtil.returnParam("username");
		password = JDBCPropertiesUtil.returnParam("password");
		driver = JDBCPropertiesUtil.returnParam("driver");
	}
	
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			System.out.println("加载驱动失败");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("MySQL操作错误");
			e.printStackTrace();
		}
		return conn;
	}
}
