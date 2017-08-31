package com.contactdetials;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UserContact {

	Scanner userInput = new Scanner(System.in);

	Set<String> userActive = new HashSet<>();

	public void addUserIntoSet() {
		// TODO Auto-generated method stub
		System.out.println("enter the name to add the user");
		String addUserName = userInput.nextLine();
		userActive.add(addUserName);
		Iterator<String> itr = userActive.iterator();
		while (itr.hasNext()) {
			System.out.println("users active");
			System.out.println(itr.next());

		}
	}

	public void showContactMap() throws Exception {
		try {

			System.out.println("Enter the conatct name");
			String userName = userInput.nextLine();
			System.out.println("Enter the user contact number");
			int userContact = userInput.nextInt();
			Map<String, Integer> map = new HashMap<>();

			map.put(userName, userContact);
			for (Map.Entry m : map.entrySet()) {
				
				System.out.println(m.getKey() + " " + m.getValue());

			}
			System.out.println("map size is " + map.size());
map
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("please enter correct input");
		}
	}

}
