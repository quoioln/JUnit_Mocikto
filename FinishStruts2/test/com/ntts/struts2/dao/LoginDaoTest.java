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

import com.ntts.struts2.h2db.H2dbDAO;

//@PrepareForTest({DriverManager.class, LoginDao.class})
public class LoginDaoTest {

	static Connection conn;

	@Before
	public void setUp() {
		try {
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			new H2dbDAO().createTable(conn);
			String sql = "INSERT INTO registration"
					+ "(fullname, password, gender, email, country)"
					+ "VALUES ('hop','123','male','hop@gmail.com','VIETNAM')";
			// PreparedStatement pstm = conn.prepareStatement(sql);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
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
	public void test_validate_LoginDao() {

		 boolean result = LoginDao.validate(conn, "hop", "123");
		 Assert.assertTrue(result);
		//getDeclareMethod just use for private method
//		Method m;
//		try {
//			m = LoginDao.class.getDeclaredMethod("validate", Connection.class,
//					String.class, String.class);
//			m.setAccessible(true);
//			boolean result = (boolean) m.invoke(new LoginDao(), conn, "hop",
//					"123");
//
//			Assert.assertTrue(result);
//		} catch (NoSuchMethodException | SecurityException
//				| IllegalAccessException | IllegalArgumentException
//				| InvocationTargetException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}
}
