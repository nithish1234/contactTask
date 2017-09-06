package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jparepository.ContactRepository;
import com.model.User;
import com.moodelVo.UserVO;

@RestController
public class ContactController {
	@Autowired
	ContactRepository contactRepository;

	@RequestMapping(method = RequestMethod.POST, value = "/contacts")
	public String saveAllContacts(@RequestBody UserVO userVO) {
		User user = new User();
		if (userVO != null) {
			user.setContactName(userVO.getName());
			user.setContactNumber(userVO.getNumber());
			contactRepository.save(user);
		}
           return "Registered Successfully";
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/contacts/{id}")
	public void deleteUserCOntacts(@PathVariable String id) {

		contactRepository.delete(id);
	}

}
