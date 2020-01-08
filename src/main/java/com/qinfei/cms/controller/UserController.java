package com.qinfei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.qinfei.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;
}
