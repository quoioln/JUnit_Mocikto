/**
 * 
 */
package com.quoioln.client;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author vpquoi
 *
 */
public class TestClient {
	private Client client;
	
	@Before
	public void before() {
		client = new Client();
	}
	@Test
	public void testHasMobiles() {
		Phone phone1 = Mockito.mock(Phone.class, "phone1");
		Phone phone2 = Mockito.mock(Phone.class, "phone2");
		Phone phone3 = Mockito.mock(Phone.class, "phone3");
		
//		phone1.setMobileFlag(false);
//		System.out.println("mobileFlag: " + phone1.getMobileFlag());
		Mockito.when(phone1.isMobile()).thenReturn(false);
		Mockito.when(phone2.isMobile()).thenReturn(false);
		client.addPhone(phone1);
		client.addPhone(phone2);
		Assert.assertTrue(client.hasMobiles());
	}
}
