package com.main;

import com.contactdetials.UserContact;

public class UserContactMain {
	public static void main(String[] args) {

		UserContact user = new UserContact();

		user.addUserIntoSet();
		try {
			user.showContactMap();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
