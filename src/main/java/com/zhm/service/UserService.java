package com.zhm.service;

import com.zhm.entity.User;

/**
 * 服务接口,包括添加用户、删除用户、用户登录
 * 
 * @author ZhangHuanmeng
 *
 * 2017年8月31日
 */
public interface UserService {

	User userLogin(User u);
	
	boolean userAdd(User u);
	
	boolean userDelete(User user);
}
