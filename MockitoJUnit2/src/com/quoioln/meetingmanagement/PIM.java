/**
 * 
 */
package com.quoioln.meetingmanagement;

import java.util.Date;

/**
 * @author vpquoi
 *
 */
public class PIM {
	private static int MILLIS_IN_MINUTE = 60 * 1000;
	private Calendar calendar;
	
	public PIM(Calendar calendar)  {
		this.calendar = calendar;
	}
	
	public void addMeeting(Date startDate, int durationInMinute){
		Date endDate = new Date(startDate.getTime() + durationInMinute * MILLIS_IN_MINUTE);
		Meeting meeting = new Meeting(startDate, endDate);
		calendar.addEvent(meeting);
	}
}
