package com.quoioln.powermockito;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.quoioln.power.MyCollaborator;
import com.quoioln.powermockito.MySut;

/**
 * @author vpquoi
 *
 */

@PrepareForTest(MySut.class)
@RunWith(PowerMockRunner.class)
public class MySutTest {
	@Test
	public void testMyMethod() throws Exception {
		MySut sut = new MySut();
		MyCollaborator collaborator = mock(MyCollaborator.class);
		PowerMockito.whenNew(MyCollaborator.class).
		withNoArguments().thenReturn(collaborator);
		// normal test using Mockito's syntax
		// e.g. Mockito.when(collaborator.someMethod()).thenReturn(...)
	}
}