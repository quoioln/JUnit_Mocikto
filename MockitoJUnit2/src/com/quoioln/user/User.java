/**
 * 
 */
package com.quoioln.user;

/**
 * @author vpquoi
 *
 */
public class User {
	private String name;
	private String surname;
	private String password;
	public String getPassword() {
		return password;
	};
	
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param name
	 * @param surname
	 */
	public User(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public final String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public final void setSurname(String surname) {
		this.surname = surname;
	};
	
	
}
