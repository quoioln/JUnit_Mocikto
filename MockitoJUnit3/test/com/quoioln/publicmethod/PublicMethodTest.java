/**
 * 
 */
package com.quoioln.publicmethod;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author vpquoi
 *
 */
public class PublicMethodTest {
	@Test
	public void testPublicMethod() {
		PublicMethod publicMethodTest = new PublicMethod();
		PublicMethod publicMethod = Mockito.spy(publicMethodTest);
		Mockito.when(publicMethod.publicMethod()).thenReturn(5);
		int actual= publicMethod.myMythod();
		int expected = 8;
		Assert.assertEquals(expected, actual);
	}
}
