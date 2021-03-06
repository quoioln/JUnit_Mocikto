package com.quoioln.calculator;

import static com.googlecode.catchexception.CatchException.catchException;
import static com.googlecode.catchexception.CatchException.caughtException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author vpquoi
 *
 */
//@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {
//	@Mock
	private Calculator calc;
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	@Before
	public void before() {
		System.out.println("Before method");
		calc = new Calculator();
//		calc = mock(Calculator.class);
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
	
//	@Test (expected = ArithmeticException.class)
	@Test
	public void testDivide_2_0_0 (){
//		doThrow(new ArithmeticException("Divide operation not excute")).when(calc).add(2, 0);
//		Assert.assertEquals(0, calc.divide(2, 0), 0);
		catchException(calc).divide(2, 0);
		Assert.assertTrue(caughtException() instanceof ArithmeticException);
//		verify(calc).divide(2, 0);
	}
}
