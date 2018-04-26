package com.ajay.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.demo.domain.UserRepository;
import com.ajay.demo.model.User;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userDao;
	
	@RequestMapping("/saveUser")
	public void save(){
		User user = new User();
		user.setName("ajay");
		user.setPass("123456");
		userDao.save(user);
	}
	
	@RequestMapping("/delete")
	public void delete(String name){
		User user = userDao.findByName(name);
		userDao.delete(user);
	}
	
	@RequestMapping("/updateUser")
	public void update(String name){
		User user = userDao.findByName(name);
		user.setPass("123456789");
		userDao.save(user);
	}
	
	@RequestMapping("/findByName")
	public User findByName(String name){
		return userDao.findByName(name);
	}

}
