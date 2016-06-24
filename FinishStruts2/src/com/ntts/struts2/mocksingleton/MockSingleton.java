package com.ntts.struts2.mocksingleton;


public class MockSingleton {
	
	private static MockSingleton instance;
	
	private MockSingleton(){
		
	}
	
	public static MockSingleton getInstance(){
		if(instance == null){
			instance = new MockSingleton();
		}
		return instance;
	}
	
	public String superService(){
		return "Singleton";
	}
	

}
