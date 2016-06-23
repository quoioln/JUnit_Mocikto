package com.quoioln.Portfolio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {
	
	@Test
	public void testPlus() {
		Assert.assertEquals(new Calculator().plus(2, 3), 5);
	}
	
	@Test
	public void testPlus_2_3_5() {
		//prepare
		int a  = 2;
		int b =3;
		
		int expected = 5;
		
		// execute
		int result = new Calculator().plus(a, b);
		
		
		// verify
		org.junit.Assert.assertEquals(expected, result); 
	}
	
	@BeforeClass
	public void beforeClass () {
		
	}
	
	@Before
	public void before () {
		
	}
	
	@After
	public void after() {
		
	}
	
	@AfterClass
	public void afterClass () {
		
	}
	
	
	
	@Test
	public void testDoSomeThing_2_3_5() {
		//prepare
		int a  = 2;
		int b =3;
		
		int expected = 5;
		
		// execute
		int result = new Calculator().doSomeThing(a, b);
		
		
		// verify
		org.junit.Assert.assertEquals(expected, result); 
	}
}
