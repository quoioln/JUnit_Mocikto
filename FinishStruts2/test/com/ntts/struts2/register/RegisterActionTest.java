package com.ntts.struts2.register;

import java.sql.Connection;

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
import com.ntts.struts2.dao.RegisterDao;
import com.opensymphony.xwork2.interceptor.annotations.After;
import com.opensymphony.xwork2.interceptor.annotations.Before;

@RunWith(PowerMockRunner.class)
@PrepareForTest(RegisterDao.class)
public class RegisterActionTest {

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
	public void testPlus_2_3_True() {
		try {
			// prepare
			int a = 2, b = 3;

			// execute
			int result = new RegisterAction().plus(a, b);

			// verify
			Assert.assertEquals(5, result);
		} catch (Exception e) {
			System.out.println("FAIL");
			Assert.fail("has exception");
		}
	}
	
	@Test
	public void testExecute_succress() {
		
		PowerMockito.mockStatic(RegisterDao.class);
		Mockito.when(RegisterDao.save(Mockito.any(Connection.class), Mockito.any(RegisterAction.class))).thenReturn(1);
		
		String result = new RegisterAction().execute();
		
		Assert.assertEquals("success", result);
		
	}
	
	@Test
	public void testExecute_error() {
		
		PowerMockito.mockStatic(RegisterDao.class);
		Mockito.when(RegisterDao.save(Mockito.any(Connection.class), Mockito.any(RegisterAction.class))).thenReturn(0);
		
		String result = new RegisterAction().execute();
		
		Assert.assertEquals("error", result);
		
	}
}
