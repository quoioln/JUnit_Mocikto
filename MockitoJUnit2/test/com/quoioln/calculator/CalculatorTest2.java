package com.quoioln.calculator;
import static org.mockito.Mockito.when;
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
import org.mockito.InOrder;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author vpquoi
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest2 {
	private Calculator calc;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	@Before
	public void before() {
		System.out.println("Before method");
//		calc = new Calculator();
		calc = mock(Calculator.class);
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
	
//	@Test
//	public void testAdd_2_3_5(){
//		Assert.assertEquals(5, calc.add(2, 3), 0);
//	}
	
	@Test (expected = ArithmeticException.class)
	public void testDivide_2_0_0 (){
//		doThrow(new ArithmeticException("Divide operation not excute")).when(calc).divide(2, 0);
//		Calculator c = new Calculator();
		Assert.assertEquals(0, calc.divide(2, 0), 0);
	}
	
	@Test
	public void testAddAndSubtract_2_3(){
		System.out.println("TEST");
		

		// add the behavior to add numbers
		when(calc.add(2.0, 3.0)).thenReturn(5.0);
		// subtract the behavior to subtract numbers
		when(calc.subtract(2.0, 3.0)).thenReturn(-1.0);
		
		// Test the add functionality
		Assert.assertEquals(5, calc.add(2.0, 3.0), 0.0);
		// Test the subtract functionality
		Assert.assertEquals(-1, calc.subtract(2.0, 3.0), 0.0);
		
		InOrder inOrder = inOrder(calc);

		inOrder.verify(calc).add(2.0, 3.0);
		inOrder.verify(calc).subtract(2.0, 3.0);
	}
}
