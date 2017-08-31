package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.User;
import com.services.ContactService;

public class Contact {
	@Autowired
	ContactService contactService;
@RequestMapping(method = RequestMethod.POST, value = "/contacts")

public void saveAllContacts(@RequestBody User user) {
	ContactService.addAllContacts("");
}
@RequestMapping("/UserContact")
private void publi() {
	// TODO Auto-generated method stub
contactService.getAllUsers();
}
}
