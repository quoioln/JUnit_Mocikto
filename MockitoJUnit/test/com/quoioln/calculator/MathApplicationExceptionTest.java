package com.quoioln.calculator;

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
public class MathApplicationExceptionTest {
	@InjectMocks
	MathApplication mathApplication = new MathApplication();
	
	@Mock
	CalculatorService calculatorService;
	
	@Test
	public void testAdd() {
		when(calculatorService.add(10.0, 20.0)).thenReturn(30.0);
		Assert.assertEquals(mathApplication.add(10.0, 20.0), 30.0);
		
//		calculatorService.add(10.0, 10.0);
		
//		verify(calculatorService, Mockito.never()).add(20.0, 20.0);
//		verify(calculatorService.add(10.0, 20.0));
	}
}
