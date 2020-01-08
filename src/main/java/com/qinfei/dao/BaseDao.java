package com.qinfei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qinfei.pojo.User;

public 	interface BaseDao<T> {

	List<T> select(T t);
	
	User selectById(@Param("id")Integer id);
	
	int insert(T t);
	
	int update(T t);
	
	int delete(@Param("ids")String ids);
}
