package com.ntts.struts2.mocksingleton;

public class MockSingletonAction {
	
	public String doStuff(){
		return MockSingleton.getInstance().superService();
	}

}
