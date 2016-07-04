/**
 * 
 */
package com.quoioln.privatemethod;

import org.junit.Assert;
import org.junit.Test;
import org.powermock.reflect.Whitebox;

/**
 * @author vpquoi
 *
 */
public class PrivateMethodPowermockTest {
	@Test
	public void testingPrivateMethodWithReflection() throws Exception {
		SomeClass sut = new SomeClass();
		
		Boolean result = Whitebox.invokeMethod(sut, "privateMethod", 302483L);
		Assert.assertTrue(result);
	}
}
