/**
 * 
 */
package com.quoioln.publicmethod;

/**
 * @author vpquoi
 *
 */
public class PublicMethod {
	public int publicMethod () {
		return 0;
	}
	
	public int myMythod() {
		int result = publicMethod() + 2;
		return result;
	}
}
