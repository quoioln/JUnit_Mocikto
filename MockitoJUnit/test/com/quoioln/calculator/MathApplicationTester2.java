package com.quoioln.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.runners.MockitoJUnitRunner;

import junit.framework.Assert;

import static org.mockito.Mockito.*;

/**
 * @author vpquoi
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester2 {
	@InjectMocks
	MathApplication mathApplication = new MathApplication();
	
	@Mock
	CalculatorService calculatorService;
	
	@Test
	public void testAdd() {
		// add the behavior of calculator service to add two numbers
		when(calculatorService.add(10.0, 20.0)).thenReturn(30.0);
		// add the behavior of calculator service to subtract two numbers
		when(calculatorService.subtract(30.0, 20.0)).thenReturn(10.0);
			
		Assert.assertEquals(mathApplication.add(10.0, 20.0), 30.0);
		Assert.assertEquals(mathApplication.add(10.0, 20.0), 30.0);
		Assert.assertEquals(mathApplication.add(10.0, 20.0), 30.0);
		
		Assert.assertEquals(mathApplication.subtract(30.0, 20.0), 10.0, 0.0);
		
		//default call count is 1 
		verify(calculatorService).subtract(20.0, 10.0);
	    
		// verify if add function is called tree times
		verify(calculatorService, times(3)).add(10.0, 20.0);
		
		//verify that method was never called on a mock
		verify(calculatorService, never()).multiply(10.0,20.0);
//		verify(calculatorService).add(10.0, 20.0);
	}
}
