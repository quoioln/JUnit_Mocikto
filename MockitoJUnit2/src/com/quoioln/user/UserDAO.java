package com.quoioln.user;
/**
 * @author vpquoi
 *
 */
public class UserDAO {
	private User user;
	public void updateUser(User user) {
		this.user = user;
	}
	
	public User getUser() {
		return user;
	}
}
