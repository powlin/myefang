package com.yaoyan.base.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	Map<String, Object> request;
	Map<String, Object> session;
	public String msg;
	@SuppressWarnings("unchecked")
	public Map<String, Object> getRequest() {
		if(request==null){
			request = (Map<String, Object>) ActionContext.getContext().get("request");
		}
		return request;
	}
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	public Map<String, Object> getSession() {
		if(session==null){
			session = ActionContext.getContext().getSession();
		}
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
