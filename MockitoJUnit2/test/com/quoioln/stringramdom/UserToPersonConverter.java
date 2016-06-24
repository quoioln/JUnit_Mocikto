package com.quoioln.stringramdom;

import com.quoioln.user.User;

public class UserToPersonConverter {
	public static Person convert(User user) {
		return new Person(user.getName() + " " + user.getSurname());
	}
}
