/**
 * 
 */
package com.quoioln.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author vpquoi
 *
 */
public class PersonTest {
	@Test public void testGetName() {
		Person person = new Person("vpquoi", 22);
		String expected = "vpquoi"; 
		String actual = person.getName();
		Assert.assertEquals(expected , actual);
	} 
}
