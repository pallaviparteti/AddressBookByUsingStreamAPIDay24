package com.streamaddressbook;

public class ToAddContactsAddress {

	private String city, state;
	private long zip;

	public String toGetCityName() {
		return city;
	}

	public String toGetStateName() {
		return state;
	}

	public long toGetZip() {
		return zip;
	}

	public void toSetCity(String city) {
		this.city = city;
	}

	public void toSetState(String state) {
		this.state = state;
	}

	public void toSetZip(long zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {

		return "\nCity - "+city+"\nState - "+state+"\nZip Code - "+zip;
	}
}