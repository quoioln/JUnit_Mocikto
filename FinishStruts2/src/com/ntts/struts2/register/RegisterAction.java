package com.ntts.struts2.register;

import com.ntts.struts2.dao.ConnectDAO;
import com.ntts.struts2.dao.RegisterDao;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	private String fullname, password, gender, email, country;
	private RegisterAction r;
	public String execute(){
		int i = ConnectDAO.registerdao(this);
		if(i > 0){
			return SUCCESS; 
		}else{
			return ERROR;
		}
	}
	public int plus(int a, int b) {
		return a+ b;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
