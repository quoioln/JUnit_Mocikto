/**
 * 
 */
package com.quoioln.power;

import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

/**
 * @author vpquoi
 *
 */
public class MySutPartialTest {
	@Test
	public void testMyMethod() {
		MyPartialSut sut = PowerMockito.spy(new MyPartialSut());
		MyCollaborator collaborator = PowerMockito.mock(MyCollaborator.class);
		PowerMockito.doReturn(collaborator).when(sut).createCollaborator();
		// normal Mockito stubbing/test spying test
	}
}