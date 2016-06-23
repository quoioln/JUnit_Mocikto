package com.quoioln.calculator;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collection;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.InOrder;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author vpquoi
 *
 */
//@RunWith(MockitoJUnitRunner.class)
@RunWith(value = Parameterized.class)
public class CalculatorTestWithParam {
	
//	private Calculator calc = mock(Calculator.class);
	private Calculator calc = new Calculator();
	
	private double a, b, c;
	
	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public CalculatorTestWithParam(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Parameters(name = "{index}: testAdd({0}+{1}) = {2}")
	public static  Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{{1.0, 2.0, 4.0}, {2.0, 5.0, 7.0}, {0.0, 2.0, 2.0}}); 
	};
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	@Before
	public void before() {
		System.out.println("Before method");
//		calc = new Calculator();
//		calc = mock(Calculator.class);
//		calc = 
		System.out.println("Create calc");
	}

	@After
	public void after() {
		System.out.println("After method");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Afer class");
	}
	
	@Test
	
	public void testAdd(){
//		Calculator calc = mock(Calculator.class);
//		when(calc.add(a, b)).thenReturn(c);
		System.out.println(a + " + " + b + " = " + c);
		
		Assert.assertEquals(c, calc.add(a, b), 0);
	}
	
}
