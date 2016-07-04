/**
 * 
 */
package com.quoioln.publicstaticmethod;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.quoioln.calculator.Calculator;

/**
 * @author vpquoi
 *
 */
//@RunWith(PowerMockRunner.class)
@RunWith(PowerMockRunner.class)
@PrepareForTest(Integer.class)
public class PublicStaticMethodTest {
	
	@Test
	public void testPublicStaticMethod() {
		String input = "20";
		PowerMockito.mockStatic(Integer.class);
		PowerMockito.when(Integer.parseInt(input)).thenReturn(20);
		int actual = Integer.parseInt(input);
		Assert.assertEquals(20, actual);
	}
}
