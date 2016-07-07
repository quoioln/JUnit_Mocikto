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
		Class[] parameterTypes = new Class[1];
		parameterTypes[0] = java.lang.Long.class;
		Method m = sut.getClass().getDeclaredMethod("privateMethod", parameterTypes);
		m.setAccessible(true);
		Object[] parameters = new Object[1];
		parameters[0] = 5569L;
		Boolean result = (Boolean) m.invoke(sut, parameters);
		Assert.assertTrue(result);
	}
}
