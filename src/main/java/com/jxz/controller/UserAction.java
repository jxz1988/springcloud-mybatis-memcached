package com.jxz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.jxz.domain.PageInfo;
import com.jxz.domain.User;
import com.jxz.service.IUserService;

@Controller
public class UserAction {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/user")
	@ResponseBody
	public User user(Integer id) {
		return this.userService.getById(id);
	}
	
	@RequestMapping("/userList")
	@ResponseBody
	public PageInfo<User> userList(Integer id) {
		return this.userService.pageByExample(0, 10);
	}

}
