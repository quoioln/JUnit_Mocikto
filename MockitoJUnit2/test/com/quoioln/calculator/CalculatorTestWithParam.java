package com.quoioln.calculator;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations.Mock;

/**
 * @author vpquoi
 *
 */
//@RunWith(MockitoJUnitRunner.class)
@RunWith(value = Parameterized.class)
public class CalculatorTestWithParam {
	private Calculator calc =  new Calculator();
	
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
//		Mockito.when(calc.add(1.0, 2.0)).thenReturn(10.0); //.add(a, b).thenReturn(10);
//		System.out.println(a + " + " + b + " = " + c);
		
		Assert.assertEquals(c, Calculator.add(a, b), 0);
	}
	
}
