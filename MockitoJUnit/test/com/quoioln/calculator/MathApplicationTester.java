package com.quoioln.calculator;

import static org.mockito.Mockito.doThrow;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.runners.MockitoJUnitRunner;

import junit.framework.Assert;

import static org.mockito.Mockito.*;

/**
 * @author vpquoi
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {
	@InjectMocks
	MathApplication mathApplication = new MathApplication();
	
	@Mock
	CalculatorService calculatorService;
	
	@Test
	public void testdivide() {
		doThrow(new RuntimeException("Divide operation not implemented")).when(calculatorService).divide(20, 2);
		Assert.assertEquals(calculatorService.divide(20, 2), 0);
	}
}
