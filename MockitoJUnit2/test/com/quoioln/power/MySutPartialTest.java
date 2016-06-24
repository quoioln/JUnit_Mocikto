/**
 * 
 */
package com.quoioln.power;

import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;
import com.quoioln.power.MyPartialSut;

/**
 * @author vpquoi
 *
 */
public class MySutPartialTest {
	@Test
	public void testMyMethod() {
		MyPartialSut sut = PowerMockito.spy(new MyPartialSut());
		MyCollaborator collaborator = mock(MyCollaborator.class);
		doReturn(collaborator).when(sut).createCollaborator();
		// normal Mockito stubbing/test spying test
	}
}