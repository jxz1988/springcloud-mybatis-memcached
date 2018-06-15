package com.jxz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jxz.domain.User;
import com.jxz.mapper.UserMapper;
import com.jxz.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Resource
    private UserMapper userMapper;

	@Override
	public User getById(Integer id) {
		// TODO Auto-generated method stub
		return this.userMapper.selectByPrimaryKey(id);
	}

}
