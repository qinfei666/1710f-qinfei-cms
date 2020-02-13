package com.qinfei.cms.Demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qinfei.cms.dao.UserDao;
import com.qinfei.cms.pojo.User;
import com.qinfei.common.utils.FileUtil;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class Demo {
	
	@Autowired
	UserDao userDao;
	

	//查询
	@Test
	public void UserList(){
		User user = new User();
		userDao.select(user);
	}
	
	//根据ID查询
	@Test
	public void UserListById(){
		
		User userListById = userDao.selectById(180);
		
		System.out.println(userListById);
	}
	
	//添加
	@Test
	public void UserInsert(){
		User user = new User();
		
		user.setUsername("qinfei");
		user.setPassword("qwe123");
		
		userDao.insert(user);
		
	}
	
	//删除
		@Test
		public void UserDelete(){
			User user = new User();
			
			userDao.delete("153,177");
			
		}
		
		//修改
		@Test
		public void UserUpdate(){
			User user = new User();
			user.setId(201);
			user.setUsername("qinfei666");
			user.setPassword("qwe123123");
			userDao.update(user);
			
		}
		
	
}
