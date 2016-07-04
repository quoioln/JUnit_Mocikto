package com.quoioln.client;

import java.util.ArrayList;

public class Client {
	private ArrayList<Phone> phoneList;
	
	public Client() {
		phoneList = new ArrayList<Phone>();
	}
	
	public void addPhone(Phone phone) {
		phoneList.add(phone);
	}
	
	public boolean hasMobiles() {
		for (Phone phone : phoneList) {
			if (phone.isMobile())
				return true;
		}
		return false;
	}
}
