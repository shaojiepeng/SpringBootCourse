package com.ajay.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.demo.mapper.UserMapper;
import com.ajay.demo.model.User;

@RestController
public class UserController {

	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/saveUser")
	public void save() {
		userMapper.save("ajay", "123456");
	}
	
	@RequestMapping("/findByName")
	public User findByName(String name) {
		return userMapper.findByName(name);
	}
	
}
