/**
 * 
 */
package com.quoioln.stringramdom;

/**
 * @author vpquoi
 *
 */
public class Person {
	private String nick;
	
	public Person() {
		nick = "";
	}
	/**
	 * @param 
	 * @param sur
	 */
	public Person(String nick) {
		this.nick = nick;
	}
	/**
	 * @return the nick
	 */
	public final String getNick() {
		return nick;
	}
	/**
	 * @param nick the nick to set
	 */
	public final void setNick(String nick) {
		this.nick = nick;
	}
	
}
