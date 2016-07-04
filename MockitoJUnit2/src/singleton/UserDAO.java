/**
 * 
 */
package singleton;

import java.sql.Connection;

/**
 * @author vpquoi
 *
 */
public class UserDAO {
	private Connection connection;
	public UserDAO (Connection connection) {
		this.connection = connection;
	}
	
	public User getUser() {
		return null;
	}
}
