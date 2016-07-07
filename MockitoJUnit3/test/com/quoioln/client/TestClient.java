/**
 * 
 */
package com.quoioln.client;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author vpquoi
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class TestClient {
	private Client client;// = Mockito.mock(Client.class);
	
	@Before
	public void before() {
		client = new Client();
	}
	@Test
	public void testHasMobiles() {
		Phone phone1 = Mockito.mock(Phone.class);
		Phone phone2 = Mockito.mock(Phone.class);
		Phone phone3 = Mockito.mock(Phone.class, "phone3");
		
		Mockito.when(phone1.isMobile()).thenReturn(false);
		Mockito.when(phone2.isMobile()).thenReturn(true);
		
		client.addPhone(phone1);
		client.addPhone(phone2);
		
		Assert.assertTrue(client.hasMobiles());
//		Mockito.verify(client, Mockito.times(2)).addPhone(Mockito.any(Phone.class));
		Mockito.verify(phone1, Mockito.times(1)).isMobile();
		Mockito.verify(phone3, Mockito.never()).isMobile();
//		Mockito.
	}
}
