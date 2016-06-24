package com.ntts.struts2.login;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.ntts.struts2.dao.ConnectDAO;
import com.ntts.struts2.dao.LoginDao;
import com.opensymphony.xwork2.interceptor.annotations.After;
import com.opensymphony.xwork2.interceptor.annotations.Before;

@RunWith(PowerMockRunner.class)
@PrepareForTest(LoginDao.class)
public class LoginActionTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
	}

	@Before
	public void setUp() throws Exception {

		MockitoAnnotations.initMocks(this);
		System.out.println("@Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("@After");
	}

	@Test
	public void testLoginExecute_succress() {
		try {

			PowerMockito.mockStatic(LoginDao.class);
			Mockito.when(
					ConnectDAO.logindao(Mockito.anyString(), Mockito.anyString()))
					.thenReturn(true);

			String result = new LoginAction().execute();

			Assert.assertEquals("success", result);
		} catch (Exception e) {
			System.out.println("FAIL");
			Assert.fail("has exception");
		}

	}
			
			
	
	@Test
	public void tesLogintExecute_error() {
		

		try {
			PowerMockito.mockStatic(LoginDao.class);
			Mockito.when(
					ConnectDAO.logindao(Mockito.anyString(), Mockito.anyString()))
					.thenReturn(false);

			String result = new LoginAction().execute();

			Assert.assertEquals("error", result);
		} catch (Exception e) {
			System.out.println("FAIL");
			Assert.fail("has exception");
		}
	}
}
