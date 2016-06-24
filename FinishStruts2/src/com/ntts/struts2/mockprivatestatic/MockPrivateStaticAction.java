package com.ntts.struts2.mockprivatestatic;

public class MockPrivateStaticAction {
	public static String method(){
		return anotherMethod();
	}
	
	private static String anotherMethod(){
		throw new RuntimeException();
	}
}
