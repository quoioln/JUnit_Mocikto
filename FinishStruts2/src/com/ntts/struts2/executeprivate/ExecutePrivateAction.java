package com.ntts.struts2.executeprivate;

public class ExecutePrivateAction {
	
	private String privateMethod(String s){
		return s;
	}


	public String doIt() {
		
		// do any
		
		privateMethod("");
		
		//do any
		
		return "";
	}
	
}
