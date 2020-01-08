package com.qinfei.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qinfei.dao.UserDao;
import com.qinfei.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;
}
