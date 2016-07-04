/**
 * 
 */
package singleton;

import java.sql.Connection;

/**
 * @author vpquoi
 *
 */
public class DBService {
	private Connection connection;
	private static DBService dbService;
	private DBService() {
		
	}
	
	public static DBService getInstance() {
		if (dbService == null)
			dbService = new DBService();
		return dbService;
	}
	
	public Connection getConnection() {
		return connection; 
	}
	
	public User getUserInfo(int userID) {
	    return new User(null, null);
	}
}
