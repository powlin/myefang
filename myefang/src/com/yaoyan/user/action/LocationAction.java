package com.yaoyan.user.action;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.yaoyan.base.action.BaseAction;

@Controller
public class LocationAction extends BaseAction{

	private static final long serialVersionUID = 1L;
	private String menulink;
	
	private static HttpServletResponse response;
//	private static PrintWriter writer;
	public String getMenulink() {
		return menulink;
	}
	public void setMenulink(String menulink) {
		this.menulink = menulink;
	}
	static{
		try {
			response = ServletActionContext.getResponse();
			response.setContentType("text/html; charset=UTF-8");
//			writer = response.getWriter();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String firstPage(){
		return "firstPage";
	}
	public String houseRefresh(){
		return "houseRefresh";
	}
	public String houseMove(){
		return "houseMove";
	}
	public String applyVIP(){
		return "applyVIP";
	}
	public String friendlyLink(){
		return "friendlyLink";
	}
	
}
