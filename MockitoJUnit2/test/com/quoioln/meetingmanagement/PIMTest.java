/**
 * 
 */
package com.quoioln.meetingmanagement;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
//import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Mockito.*;

/**
 * @author vpquoi
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class PIMTest {
	private static final int ONE_HOUR = 60;
	private static final Date START_DATE = new Date();
	private static final int MILLIS_IN_MINUTE = 60 * 1000;
	private static final Date END_DATE = new Date(START_DATE.getTime() + MILLIS_IN_MINUTE * ONE_HOUR);
	
	@Test
	public void shoudAddEventToCalendar() {
		Calendar calendar = mock(Calendar.class);
		PIM pim = new PIM(calendar);//mock(PIM.class);
		Meeting expectMeeting = new Meeting(START_DATE, END_DATE);
		
		pim.addMeeting(START_DATE, ONE_HOUR);
//		verify(calendar).addEvent(expectMeeting);
		verify(pim).addMeeting(START_DATE, ONE_HOUR);
		
	}
}
