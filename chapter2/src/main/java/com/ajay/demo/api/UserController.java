package com.ajay.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ajay.demo.mapper.UserMapper;
import com.ajay.demo.model.User;

@Controller
public class UserController {

	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/saveUser")
	@ResponseBody
	public void save() {
		userMapper.save("ajay", "123456");
	}
	
	@RequestMapping("/findByName")
	@ResponseBody
	public User findByName(String name) {
		return userMapper.findByName(name);
	}
	
	@RequestMapping("/userList")
	public String getUserList(Model model){
		model.addAttribute("users", userMapper.findAll());
		return "user/list";
	}
	
}
