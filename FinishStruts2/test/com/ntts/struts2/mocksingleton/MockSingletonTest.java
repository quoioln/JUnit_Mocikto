package com.ntts.struts2.mocksingleton;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import com.ntts.struts2.mocksingleton.MockSingleton;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MockSingleton.class)
public class MockSingletonTest {

	@Test
	public void test_MockSingleton() {
		try {
			MockSingleton mockSingleton = PowerMockito
					.mock(MockSingleton.class);
			Whitebox.setInternalState(MockSingleton.class, "instance",
					mockSingleton);

			PowerMockito.when(MockSingleton.getInstance().superService())
					.thenReturn("abc");

			MockSingletonAction action = new MockSingletonAction();
			Assert.assertNotNull(action.doStuff());
			Assert.assertEquals("abc", action.doStuff());
		} catch (Exception e) {
			System.out.println("FAIL");
			Assert.fail("has exception");	
		}
	}

}
