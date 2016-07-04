/**
 * 
 */
package com.quoioln.meetingmanagement;

import java.util.Date;

/**
 * @author vpquoi
 *
 */
public class Meeting implements Event {
	private Date startDate;
	private Date endDate;
	
	public Meeting() {
		startDate = new Date();
		endDate = new Date();
	}
	
	public Meeting(Date startDate, Date endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}

	/**
	 * @return the startDate
	 */
	public final Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public final void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public final Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public final void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
}
