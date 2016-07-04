/**
 * 
 */
package singleton;

import java.sql.Connection;

import org.junit.Test;
//import org.mockito.MockitoAnnotations.Mock;
//import org.mockito.internal.util.reflection.Whitebox;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.reflect.Whitebox;

/**
 * @author vpquoi
 *
 */
public class SingletonTest {
	@Test
	public void testGetUser() {
		 Connection connection = PowerMockito.mock(Connection.class);
//		 Whitebox.setInternalState(DBService.class, "connection", connection);
		 Whitebox.setInternalState(UserDAO.class, "connection", connection);
//		 PowerMockito.mockStatic(DBService.class);
//		 PowerMockito.when(methodCall)
	}
}
