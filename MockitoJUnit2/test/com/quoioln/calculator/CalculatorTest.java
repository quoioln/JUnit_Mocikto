package com.quoioln.calculator;

import static org.mockito.Mockito.*;//doThrow;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author vpquoi
 *
 */
@RunWith(MockitoJUnitRunner.class)
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
	
	@Test (expected = RuntimeException.class)
	public void testDivide_2_0_0 (){
		doThrow(new RuntimeException("Divide operation not excute")).when(calc).add(2, 0);
		Assert.assertEquals(0, calc.add(2, 0), 0);
		verify(calc).add(2, 0);
	}
}
