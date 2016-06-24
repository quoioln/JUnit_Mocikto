/**
 * 
 */
package com.quoioln.privatemethod;

import org.junit.Test;

/**
 * @author vpquoi
 *
 */
public class PrivateMethodPowermockTest {
	@Test
	public void testingPrivateMethodWithReflection() throws Exception {
		SomeClass sut = new SomeClass();
		
//		Boolean result = Whitebox.(sut, "privateMethod", 302483L);
//		Assert.assertTrue(result);
	}
}
