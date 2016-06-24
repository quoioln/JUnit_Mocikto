package com.ntts.struts2.login;

import com.ntts.struts2.dao.ConnectDAO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;

public class LoginAction extends ActionSupport {

	private String fullname, password;
	SessionMap<String, String> sessionMap;
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute(){
		//fullname += "123";
		
		if(ConnectDAO.logindao(fullname, password)){
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	public void setSession(Map map) {
		sessionMap=(SessionMap)map;
		sessionMap.put("login","true");
	}

	public String logout(){
		sessionMap.invalidate();
		return "success";
	}
	
}
