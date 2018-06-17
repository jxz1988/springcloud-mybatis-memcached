package com.jxz.service;

import com.github.pagehelper.Page;
import com.jxz.domain.PageInfo;
import com.jxz.domain.User;
import com.jxz.domain.example.UserExample;

public interface IUserService {
	
	User getById(Integer id);
	
	PageInfo<User> pageByExample(int pageNum,int pageSize);

}
