package com.jxz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jxz.domain.PageInfo;
import com.jxz.domain.User;
import com.jxz.domain.example.UserExample;
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

	@Override
	public PageInfo<User> pageByExample(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		UserExample	userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		criteria.andNameEqualTo("9999");
		return new PageInfo<>(PageHelper.startPage(pageNum, pageSize).doSelectPage(()->userMapper.selectByExample(userExample)));
	}

}
