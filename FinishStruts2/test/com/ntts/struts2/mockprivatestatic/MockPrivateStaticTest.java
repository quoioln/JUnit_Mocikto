package com.ntts.struts2.mockprivatestatic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.ntts.struts2.mockprivatestatic.MockPrivateStaticAction;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MockPrivateStaticAction.class)
public class MockPrivateStaticTest {

	@Test
	public void test_MockPrivateStatic() {
		PowerMockito.spy(MockPrivateStaticAction.class);
		try {
			PowerMockito.doReturn("abc").when(MockPrivateStaticAction.class,
					"anotherMethod");
			String result = MockPrivateStaticAction.method();
			Assert.assertNotNull(result);
			Assert.assertEquals(result, "abc");
		} catch (Exception e) {
			System.out.println("FAIL");
			Assert.fail("has exception");
			
		}
	}
}
