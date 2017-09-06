package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jparepository.ContactRepository;
import com.model.User;
import com.moodelVo.UserVO;

@RestController
public class RegistrationController {
	@Autowired
	ContactRepository contactRepository;

	@RequestMapping(method = RequestMethod.POST, value = "/SignUp")
	public void RegiserUser(@RequestBody UserVO userVO) {
		User user = new User();
		user.setContactName(userVO.getName());
		user.setContactNumber(user.getContactNumber());
		contactRepository.save(user);
	}
}
