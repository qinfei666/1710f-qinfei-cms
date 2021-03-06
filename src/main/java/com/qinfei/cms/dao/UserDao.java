package com.qinfei.cms.dao;

import org.apache.ibatis.annotations.Select;

import com.qinfei.cms.pojo.User;

public interface UserDao extends BaseDao<User>{
	/**
	 * @Title: selectByUsername   
	 * @Description: 根据用户名查找用户   
	 * @param: @param userName
	 * @param: @return      
	 * @return: User      
	 * @throws
	 */
	@Select("select * from cms_user where username=#{userName}")
	User selectByUsername(String userName);

}
