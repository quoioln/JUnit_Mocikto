package com.quoioln.raceresultsservice;

import java.util.ArrayList;

public class RaceResultsService {
	private ArrayList<Client> clientList;
	
	public RaceResultsService() {
		clientList = new ArrayList<Client>();
	}
	
	public void addSubscriber(Client client) {
		clientList.add(client);
	}
	public void send(Message message) {
		for (Client client : clientList) {
			client.receive(message);
		}
	}
	public boolean removeSubscriber(Client client)  {
		return clientList.remove(client);
	}
}
