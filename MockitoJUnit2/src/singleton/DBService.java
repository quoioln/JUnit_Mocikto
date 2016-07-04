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
	private DBService dbService;
	private DBService() {
		
	}
	
	public DBService getInstance() {
		if (dbService == null)
			dbService = new DBService();
		return dbService;
	}
	
	public Connection getConnection() {
		return connection; 
	}
}
