package com.qinfei.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qinfei.cms.dao.UserDao;
import com.qinfei.cms.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;
}
