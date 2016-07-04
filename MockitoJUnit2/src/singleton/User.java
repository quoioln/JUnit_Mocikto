/**
 * 
 */
package singleton;

/**
 * @author vpquoi
 *
 */
public class User {
	private String userName;
	private String password;
	
	/**
	 * @param userName
	 * @param password
	 */
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	/**
	 * @return the userName
	 */
	public final String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public final void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public final String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public final void setPassword(String password) {
		this.password = password;
	}
	
	
}
