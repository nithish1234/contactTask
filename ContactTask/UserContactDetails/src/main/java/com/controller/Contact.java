package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jparepository.ContactRepository;
import com.model.User;

@RestController
public class Contact {
	@Autowired
	ContactRepository contactRepository;

	@RequestMapping(method = RequestMethod.POST, value = "/contacts")
	public void saveAllContacts(@RequestBody User user) {
		contactRepository.save(user);

	}
}
