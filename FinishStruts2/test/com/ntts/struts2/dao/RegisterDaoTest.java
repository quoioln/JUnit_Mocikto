package com.ntts.struts2.dao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.ntts.struts2.h2db.H2dbDAO;
import com.ntts.struts2.register.RegisterAction;

public class RegisterDaoTest {
	static Connection conn;

	@Before
	public void setUp() {
		try {
			Class.forName("org.h2.Driver");
			 conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			new H2dbDAO().createTable(conn);
//			String sql = "INSERT INTO registration"
//					+ "(fullname, password, gender, email, country)"
//					+ "VALUES ('hop','123','male','hop@gmail.com','VIETNAM')";
//			//PreparedStatement pstm = conn.prepareStatement(sql);
//			Statement stmt = conn.createStatement(); 
//			stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@After
	public void tearDown() {
		try {
			Class.forName("org.h2.Driver");
			 conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			new H2dbDAO().deleteTable(conn);
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test_RegisterDao(){
//		try{
			RegisterAction action = new RegisterAction();
			
			action.setFullname("test123");
			action.setPassword("123");
			action.setGender("123");
			action.setEmail("123");
			action.setCountry("123");
			
			//getDeclareMethod just use for private method
//			Method m = RegisterDao.class.getDeclaredMethod("save", Connection.class, RegisterAction.class);
//			m.setAccessible(true);
//			int result = (int)m.invoke(new RegisterDao(), conn, action);
			int result = RegisterDao.save(conn, action);
			
			Assert.assertEquals(1, result);
//		}catch(Exception e){
//			System.out.println("FAIL" );
//			Assert.fail("has exception");
//		}

		

	}
}

