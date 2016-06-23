/**
 * 
 */
package com.quoioln.user;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author vpquoi
 *
 */
public class UserServiceTest {
	private final String password = "123456";
	private final String passwordMd5 = "aas45a4s4a4sa4s4a4a3sawsa7sasahsasas7asa8sq78s123e232";
	
	private UserDAO userDAO;
	private SecurityService securityService;
	private UserServiceImpl userServiceImpl;
	@Before
	public void before() {
		userDAO = Mockito.mock(UserDAO.class);
		securityService = Mockito.mock(SecurityService.class);
		userServiceImpl = new UserServiceImpl(userDAO, securityService);
	}
	
	@Test
	public void testAssignPassword() {
		User user = Mockito.mock(User.class);
//		User userSpy = Mockito.spy(user);
		Mockito.when(user.getPassword()).thenReturn(password);
		
		Mockito.when(securityService.md5(password)).thenReturn(passwordMd5);
		
		userServiceImpl.assignPassword(user);
		
		Mockito.verify(userDAO, Mockito.times(1)).updateUser(user);
		Assert.assertEquals(passwordMd5, user.getPassword());

		
	}
}
