/**
 * 
 */
package com.quoioln.user;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

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
	@Ignore
	@Test
	public void testAssignPassword() {
		User user = Mockito.mock(User.class);
		Mockito.when(user.getPassword()).thenReturn(password);
		
		Mockito.when(securityService.md5(password)).thenReturn(passwordMd5);
		
		userServiceImpl.assignPassword(user);
		
		Mockito.verify(userDAO, Mockito.times(1)).updateUser(user);
		Assert.assertEquals(passwordMd5, user.getPassword());

		
	}
	
	@Test
	public void testAssignPassword_2() {
		User user = Mockito.mock(User.class);
//		User userSpy = Mockito.spy(user);
		Mockito.when(user.getPassword()).thenReturn(password);
		
		Mockito.when(securityService.md5(password)).thenReturn(passwordMd5);
		Mockito.doNothing().doAnswer(new Answer<User>() {

			@Override
			public User answer(InvocationOnMock invocation) throws Throwable {
				Object[] args = invocation.getArguments();
				System.out.println(passwordMd5);
				user.setPassword((String)args[0]);
//				return null;
//				user.setPassword(passwordMd5);
				return user;
			}
			
		}).when(user).setPassword(Mockito.anyString());
//		Mockito.doCallRealMethod().when(user).setPassword(passwordMd5);
//		Mockito.when(user.getPassword()).thenCallRealMethod().thenReturn(password);
//		Mockito.doCallRealMethod().when(user).setPassword(passwordMd5);
		userServiceImpl.assignPassword(user);
		Mockito.verify(user).setPassword(passwordMd5);
		Mockito.verify(userDAO, Mockito.times(1)).updateUser(user);
//		Assert.assertEquals(passwordMd5, user.getPassword());
//		Assert.assertSame(user.getPassword(), passwordMd5);

		
	}

}
