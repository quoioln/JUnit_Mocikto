package com.ntts.struts2.mockprivate;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.api.support.membermodification.MemberMatcher.method;

import com.ntts.struts2.mockprivate.MockPrivateAction;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MockPrivateAction.class)

public class MockPrivateTest {

	@Test(expected = RuntimeException.class)
	public void test_MockPrivate() {
		MockPrivateAction action = PowerMockito.spy(new MockPrivateAction());

		try {
			when(action, method(MockPrivateAction.class, "doTheGamble", String.class, int.class)).withArguments(anyString(),anyInt()).thenReturn(true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("FAIL");
			Assert.fail("has exception");
		}

		action.meaningfulPublicApi();
	}
}
