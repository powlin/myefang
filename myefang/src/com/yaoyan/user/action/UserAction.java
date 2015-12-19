package com.yaoyan.user.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.yaoyan.base.action.BaseAction;
import com.yaoyan.user.domain.Menu;
import com.yaoyan.user.domain.User;
import com.yaoyan.user.service.MenuService;
import com.yaoyan.user.service.UserService;
import com.yaoyan.user.util.JsonUtil;
import com.yaoyan.user.util.MD5Util;

@Controller
public class UserAction extends BaseAction{

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String usernameR;
	private String passwordR;
	private String passwordRA;
	private String result;
	private List<Menu> menuList;
	private UserService userService;
	private MenuService menuService;
	
	private static HttpServletResponse response;
	private static PrintWriter writer;
	
	public String getUsername() {
		if(username==null){
			username="";
		}
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		if(password==null){
			password="";
		}
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getUsernameR() {
		if(usernameR==null){
			usernameR="";
		}
		return usernameR;
	}
	public void setUsernameR(String usernameR) {
		this.usernameR = usernameR;
	}
	public String getPasswordR() {
		if(passwordR==null){
			passwordR="";
		}
		return passwordR;
	}
	public void setPasswordR(String passwordR) {
		this.passwordR = passwordR;
	}
	public String getPasswordRA() {
		if(passwordRA==null){
			passwordRA="";
		}
		return passwordRA;
	}
	public void setPasswordRA(String passwordRA) {
		this.passwordRA = passwordRA;
	}
	public List<Menu> getMenuList() {
		return menuList;
	}
	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}

	static{
		try {
			response = ServletActionContext.getResponse();
			response.setContentType("text/html; charset=UTF-8");
			writer = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String login() throws Exception{
		User user = userService.getUsernameAndPassword(getUsername(),MD5Util.getMD5(getPassword()));
		if(user!=null){
			getSession().put("username", getUsername());
			setResult("loginSuccess");
			setMenuList(menuService.getMenuByUsername(getUsername()));
			return SUCCESS;
		}
		result = JsonUtil.returnFail();
		writer.print(result);//向客户端写数据
		return ERROR;
	}

	public String logout() throws Exception{
		getSession().clear();
		return LOGIN;
	}
	
	public String register() throws Exception{
		User user = userService.getUsername(getUsernameR());
		if(user==null){
			long num = userService.insertNewUser(getUsernameR(),MD5Util.getMD5(getPasswordR()));
			if(num!=-1){
				getSession().put("username", getUsernameR());
				setResult("loginSuccess");
//				result = JsonUtil.stringToJson(result);
//				writer.print(result);//向客户端写数据
				return SUCCESS;
			}
		}
		result = JsonUtil.returnFail();
		writer.print(result);//向客户端写数据
		return ERROR;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public MenuService getMenuService() {
		return menuService;
	}
	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}
	
}
