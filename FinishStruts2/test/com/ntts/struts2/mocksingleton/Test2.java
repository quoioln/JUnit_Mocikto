/**
 * 
 */
package com.ntts.struts2.mocksingleton;

import org.junit.Assert;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.reflect.Whitebox;

/**
 * @author vpquoi
 *
 */
public class Test2 {
	@Test
	public void doStubTest() {
		try {
			MockSingleton mockSingleton = PowerMockito.mock(MockSingleton.class);
			Whitebox.setInternalState(MockSingleton.class, "instance", mockSingleton);
			PowerMockito.when(MockSingleton.getInstance().superService()).thenReturn("abc");
			System.out.println(mockSingleton.getA());
			MockSingletonAction action = new MockSingletonAction();
			Assert.assertNotNull(action.doStuff());
			Assert.assertEquals("abc", action.doStuff());
		} catch (Exception e) {
			System.out.println("FAIL");
			Assert.fail("has exception");	
		}
	}
}
