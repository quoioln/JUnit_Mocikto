//package singleton;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//public class CallDBServiceTest {
//
//	@Test
//	public void testGetData_null() {
//		//prepare
//		mock(DBService getUserInfo) return user with username = null;
//		
//		
//		//execute
//		User user = new CallDBService().getData();
//		
//		
//		//expected
//		Assert.assertEquals(null, user);
//	}
//	
//	@Test
//	public void testGetData_PasswordNull() {
//		//prepare
//		mock(DBService getUserInfo) return user with username = "admin";
//		
//		//execute
//		User user = new CallDBService().getData();
//		
//		
//		//expected
//		Assert.assertEquals("passadmin", user.getPassword());
//	}
//	
//	@Test
//	public void testGetData_normal() {
//		//prepare
//		mock(DBService getUserInfo) return user with username khac "admin" va khac null;
//		
//		
//		//execute
//		User user = new CallDBService().getData();
//		
//		
//		//expected
//		Assert.assertNotNull(user);
//	}
//	
//}
