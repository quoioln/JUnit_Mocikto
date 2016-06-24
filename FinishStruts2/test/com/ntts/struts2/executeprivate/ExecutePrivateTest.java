package com.ntts.struts2.executeprivate;

import java.lang.reflect.Method;

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

import com.ntts.struts2.executeprivate.ExecutePrivateAction;;


@RunWith(PowerMockRunner.class)
@PrepareForTest(ExecutePrivateAction.class)

public class ExecutePrivateTest {
	
	private ExecutePrivateAction action = new ExecutePrivateAction();
	
	@Test
	public void test_PrivateAction() throws NoSuchMethodException, SecurityException{
		 
		Method m = ExecutePrivateAction.class.getDeclaredMethod("privateMethod", String.class);
		m.setAccessible(true); //allow to call private method
		
		try {
			String output = (String) m.invoke(action, "abc");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("FAIL");
			Assert.fail("has exception");
		}
	}
	

}
