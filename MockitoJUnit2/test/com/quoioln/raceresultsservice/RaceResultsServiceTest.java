/**
 * 
 */
package com.quoioln.raceresultsservice;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author vpquoi
 *
 */
public class RaceResultsServiceTest {
	private RaceResultsService raceResultsService;
	private Message message;
	
	@Before
	public void before() {
		raceResultsService = new RaceResultsService();
		message = Mockito.mock(Message.class);
		
	}
	
	@Test
	public void testSendAndReiceve() {
		Client clientA = Mockito.mock(Client.class, "clientA");
		Client clientB = Mockito.mock(Client.class, "clientB");
		Client clientC = Mockito.mock(Client.class, "clientC");
		Client clientD = Mockito.mock(Client.class, "clientD");
		Client clientE = Mockito.mock(Client.class, "clientE");
		Client clientF = Mockito.mock(Client.class, "clientF");
		Client clientG = Mockito.mock(Client.class, "clientG");
		
		raceResultsService.addSubscriber(clientA);
		raceResultsService.addSubscriber(clientB);
		raceResultsService.addSubscriber(clientC);
		raceResultsService.addSubscriber(clientD);
		raceResultsService.addSubscriber(clientE);
		raceResultsService.addSubscriber(clientF);
		// Send all 
		raceResultsService.send(message);
		// verify client A, B
		Mockito.verify(clientA).receive(message);
		Mockito.verify(clientB).receive(message);
		
		// unsubcribe client F
		raceResultsService.removeSubscriber(clientF);
		// resend message
		raceResultsService.send(message);
		
		//client E receives two message.
		Mockito.verify(clientE, Mockito.times(2)).receive(message);
		
		// client F receives one message.
		Mockito.verify(clientF, Mockito.times(1)).receive(message);
		
		// client G never receive message.
		Mockito.verify(clientG, Mockito.never()).receive(message);
		
//		Mockito.when(raceResultsService.removeSubscriber(clientA))
	}
}
