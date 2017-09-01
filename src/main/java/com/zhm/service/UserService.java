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

	public boolean userLogin(User u);
	
	public boolean userAdd(User u);
	
	public boolean userDelete(int id);
}
