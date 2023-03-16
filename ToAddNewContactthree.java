package com.streamaddressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ToAddNewContactthree {
	Scanner scannerObject = new Scanner(System.in);
	public Map<String, ContactInfo> contactList = new HashMap<String, ContactInfo>();
	boolean isPresent = true;
	public ArrayList<ContactInfo> getContact() {
		return new ArrayList<ContactInfo>(contactList.values());
	}
	public void addContact() {

		ContactInfo person = new ContactInfo();
		System.out.println("Enter First Name: ");
		String firstName = scannerObject.next();

		contactList.entrySet().stream().forEach(entry -> {
			if(entry.getKey().equals(firstName.toLowerCase())) {
				System.out.println("Contact Already Exists");
				isPresent = true;
				return;
			}
		});

		if(isPresent == false) {

			System.out.println("Enter Last Name: ");
			String lastName = scannerObject.next();

			System.out.println("Enter Phone Number: ");
			long phoneNumber = scannerObject.nextLong();

			System.out.println("Enter Email: ");
			String email = scannerObject.next();

			System.out.println("Enter City: ");
			String city = scannerObject.next();

			System.out.println("Enter State: ");
			String state = scannerObject.next();

			System.out.println("Enter Zip Code: ");
			long zipCode = scannerObject.nextLong();

			person.setFirstName(firstName);
			person.setLastName(lastName);
			person.setPhoneNumber(phoneNumber);
			person.setEmail(email);
			contactList.put(firstName.toLowerCase(), person);
		}

	}


}