/**
 * 
 */
package com.quoioln.stringramdom;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

import com.quoioln.user.User;

/**
 * @author vpquoi
 *
 */
public class UserToPersonConverterTest {
	@Test
	public void shouldConvertUserNamesIntoPersonNick() {
		String name = RandomStringUtils.randomAlphabetic(8);
		String surname = RandomStringUtils.randomAlphabetic(12);
		User user = new User(name, surname);
		Person person = UserToPersonConverter.convert(user);
		assertEquals(name + " " + surname, person.getNick());
	}
}
