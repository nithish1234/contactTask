package com.contactdetials;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UserContact {

	Scanner userInput = new Scanner(System.in);

	// public void showName() {
	// System.out.println("Enter the user name");
	// String userName = userInput.nextLine();
	// Set<String> contatctName = new HashSet<>();
	// contatctName.add(userName);
	// System.out.println(contatctName);
	//
	//
	// }
	// public void showContact() {
	//
	// System.out.println("Enter the user contact number");
	// String userContact = userInput.nextLine();
	// Set<String> contatctNumber = new HashSet<>();
	// contatctNumber.add(userContact);
	// System.out.println(contatctNumber);
	// }
	Set<String> userActive = new HashSet<>();
	public void showUser() {
		System.out.println("Active users");
		
		userActive.add("Test Name-1");
		userActive.add("Test Name-2");
		userActive.add("Test Name-3");
		 Iterator<String> itr=userActive.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  

	}
private void add() {
	// TODO Auto-generated method stub

}
	public void showContactMap() {
		System.out.println("Enter the conatct name");
		String userName = userInput.nextLine();
		System.out.println("Enter the user contact number");
		int userContact = userInput.nextInt();
		Map<String, Integer> map = new HashMap<>();
		map.put(userName, userContact);

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}
		System.out.println(map.size());
	}

}
