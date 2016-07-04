/**
 * 
 */
package com.quoioln.privatemethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author vpquoi
 *
 */
public class PrivateMethodReflectionTest {
	@Test
	public void testingPrivateMethodWithReflection()
		throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		
		SomeClass sut = new SomeClass();
		Method m = sut.getClass().getDeclaredMethod("privateMethod", java.lang.Long.class);
		m.setAccessible(true);

		Boolean result = (Boolean) m.invoke(sut, 5569L);
		Assert.assertTrue(result);
	}
}
