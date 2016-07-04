/**
 * 
 */
package com.quoioln.calculator;

/**
 * @author vpquoi
 *
 */
public class Test {
	private static Test test;
	private String name;
	private int age;
	
	public Test() {
		this.name = "vpquoi";
		this.age = 22;
	}
	public static Test getInstance() {
		if (test == null) {
			test = new Test();
		}
		return test;
	}
	
	public Test getTest() {
		return test;
	}
	
	public static void main(String[] args) {
		Test a = Test.getInstance();
		System.out.println(a.age + " " + a.name);
		a.age = 23;
		Test b = Test.getInstance();
		System.out.println(b.age + " " + b.name);
	}
}
