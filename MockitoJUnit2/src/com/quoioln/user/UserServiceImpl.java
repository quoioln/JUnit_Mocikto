/**
 * 
 */
package com.quoioln.user;

/**
 * @author vpquoi
 *
 */
public class UserServiceImpl {
	private UserDAO userDAO;
	private SecurityService securityService;
	
	public UserServiceImpl(UserDAO userDAO, SecurityService securityService) {
		this.userDAO = userDAO;
		this.securityService = securityService;
	}
	
	public void assignPassword(User user) {
		String passwordMd5 = securityService.md5(user.getPassword());
//		System.out.println(passwordMd5);
		user.setPassword(passwordMd5);
		userDAO.updateUser(user);
	}
}
