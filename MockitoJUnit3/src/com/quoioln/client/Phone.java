/**
 * 
 */
package com.quoioln.client;

/**
 * @author vpquoi
 *
 */
public class Phone {
	private boolean mobileFlag = true;
	public boolean isMobile() {
		return mobileFlag;
	}
	
	/**
	 * @return the mobileFlag
	 */
	public final boolean getMobileFlag() {
		return mobileFlag;
	}
	
	/**
	 * @param mobileFlag the mobileFlag to set
	 */
	public final void setMobileFlag(boolean mobileFlag) {
		this.mobileFlag = mobileFlag;
	}
}
